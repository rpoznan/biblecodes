<?php

include_once('dependency/db.php');

if($_SERVER['REQUEST_METHOD'] == "GET") {
    
$sql = "
select count(*) as cnt,book_name,eng_book_name,book_id from torah_book a
inner join torah_verse b on b.book_id=a.id
where b.num_value=? or b.id in (
select verse_id from torah_verse_word b where b.num_value=?)
group by book_name,eng_book_name
order by book_id
";

$value = $_GET['query'];  

$error = null;

if(empty($value) || !is_numeric ($value)) {
	$error = "query parameter is required and must be an integer"; 
}

if ($error == null && $stmt = $mysqli->prepare($sql)) {
     
    $stmt->bind_param("ss", $value, $value); 
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

class A {
    public $report = null;
	public $error = null;
}  

$obj = new A;
$obj->report = $result1;
$obj->error = $error;

/* Output header */
	header('Content-type: application/json; charset=utf-8');
	echo json_encode($obj);
	
?> 