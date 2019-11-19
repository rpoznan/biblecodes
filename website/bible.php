<?php

include_once('dependency/db.php');

if($_SERVER['REQUEST_METHOD'] == "POST") {

$json = file_get_contents('php://input');

// Converts it into a PHP object
$data = json_decode($json);

$book = $data->book;
$chapter = $data->chapter;
$versex = $data->versex;
$versey = $data->versey;

if(empty($book) || !is_numeric ($chapter)) {
	$error = "book name and chapter is required"; 
}

$sql1 = "
select book_id,book_name,eng_book_name,num_chapter,num_verse,verse,tran_verse,eng_verse from torah_verse a
inner join torah_book b on a.book_id=b.id
where b.eng_book_name LIKE ?
and a.num_chapter=?
";

$cnt = 2;
if(!empty($versex) && !empty($versey)) {
    $sql1 = $sql1." and a.num_verse between ? and ? ";
	$cnt = 4;
}
if(!empty($versex) && empty($versey)) {
    $sql1 = $sql1." and a.num_verse= ? ";
	$cnt = 3;
}
$sql1 = $sql1." order by num_verse";

$book = $book."%";

if ($error == null && $stmt = $mysqli->prepare($sql1)) {
     if($cnt == 2)
		$stmt->bind_param("ss", $book, $chapter );
	if($cnt == 3)
		$stmt->bind_param("sss", $book, $chapter,  $versex);
    if($cnt == 4)
		$stmt->bind_param("ssss", $book, $chapter,  $versex, $versey);
		
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

}

$mysqli->close(); 



$item = sizeof($result1) > 0 ? $result1[0] : null;
if($item != null) {
    if(empty($versex) && empty($versey)) {
		$verses[] = $item['book_name']." ".$item['eng_book_name']." ".strval($item['num_chapter']);
	}
	if(!empty($versex) && empty($versey)) {
		$verses[] = $item['book_name']." ".$item['eng_book_name']." ".strval($item['num_chapter']).":".$versex;
	}
	if(!empty($versex) && !empty($versey)) {
		$verses[] = $item['book_name']." ".$item['eng_book_name']." ".strval($item['num_chapter']).":".$versex."-".$versey;
	}
}


class A {
    public $verseList = null;
	public $verses = null;
	public $error = null;
}  

$obj = new A;
$obj->verses = $verses;
$obj->verseList = $result1;
$obj->error = $error;

/* Output header */
	header('Content-type: application/json; charset=utf-8');
	echo json_encode($obj);
	
?> 
