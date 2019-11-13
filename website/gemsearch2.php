<?php

include_once('dependency/db.php');

if($_SERVER['REQUEST_METHOD'] == "GET") {
    
$sql = "
select book_id,book_name,eng_book_name,num_chapter,num_verse,verse,tran_verse,eng_verse from torah_verse a
inner join torah_book b on a.book_id=b.id
where book_id = ? and (num_value=? or a.id in (
select verse_id from torah_verse_word x
inner join torah_verse y on x.verse_id=y.id
where x.num_value=? and y.book_id=?
)) order by book_id,num_chapter,num_verse
";

$sql2 = "
select count(*) as count,word,tran_word from torah_verse_word x
inner join torah_verse y on x.verse_id=y.id
where x.num_value=? and y.book_id=?
group by word,tran_word
order by word
";

$sql3 = "select count(*) as count,verse from torah_verse where num_value=? and book_id=?
group by verse";

$value = $_GET['query'];  
$book = $_GET['book']; 

$error = null;

if(empty($value) || !is_numeric ($value) || empty($book) || !is_numeric ($book)) {
	$error = "query parameter is required and must be an integer
			book parameter is required and must be an integer"; 
}

if ($error == null && $stmt = $mysqli->prepare($sql)) {
     
    $stmt->bind_param("ssss", $book, $value, $value, $book ); 
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
        $result1[] = $c; 
    } 
    
    $stmt->close(); 
	$row = null;
}

if ($error == null && $stmt = $mysqli->prepare($sql2)) {
    
    $stmt->bind_param("ss", $value, $book); 
    $stmt->execute(); 
    
    $meta = $stmt->result_metadata(); 
    while ($field = $meta->fetch_field()) 
    { 
        $params2[] = &$row[$field->name]; 
    } 

    call_user_func_array(array($stmt, 'bind_result'), $params2); 
	
while ($stmt->fetch()) { 
        foreach($row as $key => $val) 
        { 
            $d[$key] = $val; 
        } 
        $result2[] = $d; 
    } 
    
    $stmt->close(); 
	$row = null;
}

if ($error == null && $stmt = $mysqli->prepare($sql3)) {

    $stmt->bind_param("ss", $value, $book); 
    $stmt->execute(); 
    
    $meta = $stmt->result_metadata(); 
    while ($field = $meta->fetch_field()) 
    { 
        $params3[] = &$row[$field->name]; 
    } 

    call_user_func_array(array($stmt, 'bind_result'), $params3); 
	
while ($stmt->fetch()) { 
        foreach($row as $key => $val) 
        { 
            $e[$key] = $val; 
        } 
        $result3[] = $e; 
    } 
    
    $stmt->close(); 
}


}

$mysqli->close(); 

class A {
    public $verseList = null;
	public $word = null;
	public $verse = null;
	public $error = null;
}  

$obj = new A;
$obj->verseList = $result1;
$obj->word = $result2;
$obj->verse = $result3;
$obj->error = $error;

/* Output header */
	header('Content-type: application/json; charset=utf-8');
	echo json_encode($obj);
	
?> 