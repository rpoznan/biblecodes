<?php

include_once('dependency/db.php');

if($_SERVER['REQUEST_METHOD'] == "GET") {
    
$sql = "select word,num_index,num_verse from torah_verse_word a
inner join torah_verse b on b.id=a.verse_id
where book_id=? and num_chapter=? and num_verse between ? and ?
order by num_verse, num_index";


$book = $_GET['book']; 
$chapter = $_GET['chapter']; 
$xverse = $_GET['xverse'];
$yverse = $_GET['yverse'];  

$error = null;

if(empty($book) || !is_numeric ($book) ||
 empty($chapter) || !is_numeric ($chapter) ||
 empty($xverse) || !is_numeric ($xverse)) {
	$error = "book,chapter,xverse parameter is required and must be an integer"; 
}
if(!empty($yverse) && !is_numeric ($yverse)) {
	$error = $error != null ? $error + "y verse must be integer" : "y verse must be integer";
} 
if(empty($yverse)) {
	$yverse = $xverse;
}

if ($error == null && $stmt = $mysqli->prepare($sql)) {
     
    $stmt->bind_param("ssss", $book, $chapter, $xverse, $yverse); 
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
			if($key == "word") {
				$words[] = $val;
			}
        } 
    } 
    
    $stmt->close(); 
	$row = null;
}

}

$mysqli->close(); 


//foreach ($words as &$value) {
//    $chars[] = str_split($value);
//	$payload[] = $chars;
	//foreach ($chars as &$cc) {
	//	$payload[] = $cc;
	// }
//}

function mb_str_split( $string ) {
 # Split at all position not after the start: ^
 # and not before the end: $
 return preg_split('/(?<!^)(?!$)/u', $string );
 }

foreach($words as $item) {
	$test = mb_str_split(preg_replace('/[^\w$\x-\x]+/u', '', $item));
	foreach($test as $x) {
		if(!empty($x)) {
			$payload[] = $x;
		}
	}
}

class A {
	public $words = null;
    public $payload = null;
	public $error = null;
}  

$obj = new A;
$obj->words = $words;
$obj->payload = $payload;
$obj->error = $error;

/* Output header */
	header('Content-type: application/json; charset=utf-8');
	echo json_encode($obj);
	
?> 