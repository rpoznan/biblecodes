<?php

include_once('dependency/db.php');

if($_SERVER['REQUEST_METHOD'] == "GET") {
    
$sql = "SELECT b.id as book_id,b.book_name,b.eng_book_name,chapter,verse_x,verse_y FROM nanzopco_torah.jps_tanakh a
inner join torah_book b on a.book_name=b.eng_book_name
where page = ?";

$sql3 = "select book_id,book_name,eng_book_name,num_chapter,num_verse,verse,tran_verse,eng_verse from torah_verse a
inner join torah_book b on a.book_id=b.id
where a.book_id=? and num_chapter=? and num_verse between ? and ?
order by num_verse";

$sql2 = "select book_id,book_name,eng_book_name,num_chapter,num_verse,verse,tran_verse,eng_verse from torah_verse a
inner join torah_book b on a.book_id=b.id
where a.book_id=? and num_chapter=? and num_verse=?
order by num_verse";


$page = $_GET['page']; 

$error = null;

if(empty($page) || !is_numeric ($page)) {
	$error = "page parameter is required and must be an integer"; 
}

if ($error == null && $stmt = $mysqli->prepare($sql)) {
     
    $stmt->bind_param("s", $page); 
    $stmt->execute(); 
    
    $meta = $stmt->result_metadata(); 
    while ($field = $meta->fetch_field()) 
    { 
        $params1[] = &$row[$field->name]; 
    } 

    call_user_func_array(array($stmt, 'bind_result'), $params1); 
	
while ($stmt->fetch()) { 
        foreach($row as $key => $val) 
        { 
			$c[$key] = $val; 
        } 
        $result[] = $c; 
    } 
    
    $stmt->close(); 
}
}



function lookup_verse($mysqlix, $sqlx, $book_name, $chapter, $versex ) {
	if ($stmt = $mysqlix->prepare($sqlx)) {
	$stmt->bind_param("sss", $book_name, $chapter, $versex); 
    $stmt->execute(); 
    
    $meta = $stmt->result_metadata(); 
    while ($field = $meta->fetch_field()) 
    { 
        $params1[] = &$row[$field->name]; 
    } 

    call_user_func_array(array($stmt, 'bind_result'), $params1); 
	
while ($stmt->fetch()) { 
        foreach($row as $key => $val) 
        { 
			$c[$key] = $val; 
        } 
        $result[] = $c; 
    } 
    
    $stmt->close(); 
	}
	
	return $result;
}

function lookup_verse2( $mysqlix, $sqlx, $book_name, $chapter, $versex, $versey ) {
	if ($stmt = $mysqlix->prepare($sqlx)) {
	$stmt->bind_param("ssss", $book_name, $chapter, $versex, $versey); 
    $stmt->execute(); 
    
    $meta = $stmt->result_metadata(); 
    while ($field = $meta->fetch_field()) 
    { 
        $params1[] = &$row[$field->name]; 
    } 

    call_user_func_array(array($stmt, 'bind_result'), $params1); 
	
while ($stmt->fetch()) { 
        foreach($row as $key => $val) 
        { 
			$c[$key] = $val; 
        } 
        $result[] = $c; 
    } 
    
    $stmt->close(); 
	}
	
	return $result;
}

foreach($result as $item) {
	if($item['verse_y'] == 0) {
		$verses[] = $item['eng_book_name'].strval($item['chapter']).":".strval($item['verse_x']);
		$passages[] = lookup_verse( $mysqli, $sql2, $item['book_id'], $item['chapter'], $item['verse_x'] );
	}
	if($item['verse_y'] > 0) {
		$verses[] = $item['eng_book_name']." ".strval($item['chapter']).":".strval($item['verse_x'])."-".strval($item['verse_y']);
		$passages[] = lookup_verse2( $mysqli, $sql3, $item['book_id'], $item['chapter'], $item['verse_x'], $item['verse_y']);
	}
}

$mysqli->close(); 

class A {
    public $verses = null;
	public $passages = null;
	public $error = null;
}  

$obj = new A;
$obj->verses = $verses;
$obj->passages = $passages;
$obj->error = $error;

/* Output header */
	header('Content-type: application/json; charset=utf-8');
	echo json_encode($obj);
	
?> 