<?php
session_start();	// this always goes first!!!

session_unset();

session_destroy();

header("Location: index.php");
