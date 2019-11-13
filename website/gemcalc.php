<?php

if($_SERVER['REQUEST_METHOD'] == "POST") {

//$value = $_POST['value'];  

$json = file_get_contents('php://input');

// Converts it into a PHP object
$data = json_decode($json);

$value = $data->value;

if(empty($value)) {
	$error = "query parameter is required and must be an integer"; 
}

$val = array(1,2,3,4,5,6,7,8,9,10,20,30,
			40,40,50,50,60,70,80,80,90,90,
			100,200,300,400 ); 
	
$hebrew = array('א','ב','ג','ד','ה','ו','ז','ח','ט','י','כ','ל',
			'מ','ם','נ','ן','ס','ע','פ','ף','ץ','צ',
			'ק','ר','ש','ת'); 
			
function mb_str_split( $string ) {
 # Split at all position not after the start: ^
 # and not before the end: $
 return preg_split('/(?<!^)(?!$)/u', $string );
 }
 
 $cnt = 0;
 
function findVal($c) {
	$test[] = $c;
	$max = count($hebrew); 
	$test[] = $max;
		$y = $max-1;
		$tot = ($max / 2);
		for ($x = 0; $x < $tot; $x++) {
			
			$test[] = $x;
			$test[] = $y;
			$cnt = $cnt + 1;
			if($hebrew[$x] == $c) {
				return $val[$x];
			}
			if($hebrew[$y] == $c) {
				return $val[$y];
			}
			$y--;
		}
		return $test;
}
 
$sum = 0;
$charvalue = mb_str_split(preg_replace('/[^\w$\x-\x]+/u', '', $value));
foreach($charvalue as $c) {
	//$test[] = $c;
	$max = count($hebrew); 
	//$test[] = $max;
		$y = $max-1;
		$tot = ($max / 2);
		for ($x = 0; $x < $tot; $x++) {
			
			//$test[] = $x;
			//$test[] = $y;
			if($hebrew[$x] == $c) {
				$sum = $sum + $val[$x];
			}
			if($hebrew[$y] == $c) {
				$sum = $sum + $val[$y];
			}
			$y--;
		}
}

} else {
	$error = "invalid request type";
}

class A {
	public $value = null;
    public $gematria = null;
	public $error = null;
}  

$obj = new A;
$obj->gematria = $sum;
$obj->value = $value;
$obj->error = $error;

/* Output header */
	header('Content-type: application/json; charset=utf-8');
	echo json_encode($obj);
	
?> 