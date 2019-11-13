<?php

$host = 'localhost'; 
$user = 'nanzopco_torah'; 
$pass = 'AZ4H2wFh8?2B'; 
$data = 'nanzopco_torah'; 

$mysqli = new mysqli($host, $user, $pass, $data); 
/* check connection */ 
if (mysqli_connect_errno()) { 
    printf("Connect failed: %s\n", mysqli_connect_error()); 
    exit(); 
} 

?>