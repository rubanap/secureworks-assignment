# secureworks-assignment

## Gaps and Assumptions
* What should be the output when a file has more than one largest words? - assuming the output should be having all largest words
* What should be the output when a file has duplicate largest words - assuming the output should not have duplicates
* File can have empty lines
* Eliminating trailing and leading spaces of a word
* Words can contain spaces in between ( each line can only have a single word )

## Pre-requisties to execute
* Java 8

## How to execute
* open command prompt and navigate to the src folder of the project
* execute the below commands  
  - javac com/secureworks/test/FileProcessTest.java
  - java com.secureworks.test.FileProcessTest

Note: if you are executing it through any IDE please copy paste input folder outside src folder. If you are executing it from command line leave it as it as.

## Explanation

In FileProcessTest.java, there are two methods written 
- findLargestWordAndTranspose : This method is to display the first largest word in the file and its transpose ( this is not used by any test case, just keeping it to show the logic difference between two methods )
- findLargestWordsAndTranspose : This method is to display all the unique largest words in the file and its transpose.
  The logic used here is :
    * initialize variable to store maximum length to 0 and create a empty set to store the largest words
    * read the words in the file
    * discard the empty lines,leading and trailing spaces
    * if the length of the word is greated than the maximum length, clear the set and add word to the set
    * if the length of the word is equals to the maximum length, add the word to the set
    * After end of the file, iterate through the set and print the words and it's reverse using stringBuffer



### List of test cases
Test cases are given in the form of different input files. Input files are located in the "input" folder of the project

* **Test case 1 : FileWithAlphaNumericWords** - This test case is a positive test case which uses a file with words having different combinations of alphabets and numbers
* **Test case 2 : FileWithSpecialCharacterWords** - This test is a positive test case which uses a file with words having special characters in it
* **Test case 3 : EmptyFile** - This test is a negative test which checks for the empty file. If a file is empty, handling the exception by displaying "File is Empty" message.
* **Test case 4 : FileNotPresent** - This test is a negative test which handles the exception where the file given in input is not present in the path. Handling it by displaying the error message " File not found in the path <given input path>"
* **Test case 5: FileWithMoreThanOneLargestWords** - This test is a positive test case which uses a file with more than one largest words. Eg; Largest1,Largest2 (both have same length 8). 
* **Test case 6: FileWithDuplicateLargestWords** - This test is a negative test case which uses a file with duplicate entries of largest words. Eg: large,large ( if this is the largest in the file, then printing only one large )
* **Test case 7 : FileWithLargestWordContainsOnlySpaces** - This test is a negative test case which uses a file having largest number of spaces. Eg. This file has 10 spaces in line number 7. the output should be the 2nd largest word as it contains only spaces in it which is not a valid word. so the output should be "Contains"







