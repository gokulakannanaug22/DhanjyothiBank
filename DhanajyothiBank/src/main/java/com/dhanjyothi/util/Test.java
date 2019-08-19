
 package com.dhanjyothi.util; 
 //import java.io.File;
 
 class Test{
	 
	 public static void main(String args[]) throws Exception {
 System.out.println("Program to add two digits");
 System.out.println("==========================");

 int i = 5; int j = 7; int total = i + j;
 System.out.println(">>>>>>>> Printing value of i : " + i);
 System.out.println(">>>>>>>> Printing value of j : " + j);
 System.out.println(">>>>>>>> Sum of i + j >> Total :" + total);
 
 String str1 = "hello";
 
 String str2 = "1";
 
 if(str1.equalsIgnoreCase(str2)){
	 
	 System.out.println(">>>>>>>> verify string :   both are equal str1 - " + str1 +"      str2 :"+str2.concat("12345678").length());
 }else {
	 System.out.println(">>>>>>>> failed"+"      str2 :"+str2.concat("12sdfadsfasdfafasdfasdfafasfdfasdfasfasdfasdfasdfasdfasdfasdfasdfasdfasdfasfasjfasklfjasdkfjaskfjaklfjakfjafjasdkdfjasdkfjasfjasfjafj345678").length());
 }
  } }
 
 
 
