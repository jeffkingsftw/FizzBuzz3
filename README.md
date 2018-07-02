# FizzBuzz3

Intersection version - 925cf7f189d1e404cfd55df6e8398d831df0f45a

- Tested using Intellij Idea
	- 2017.3.5 (Community Edition)

Dependencies
- JRE 1.8.0_152
- Maven 4.0 (1.0-SNAPSHOT)
- junit 4.11

Installation instructions
- Download and extract the .zip file
- Import project (jdk_1.8.0)
- Build the project with the Maven pom.xml file and run FizzBuzz3Test

Program Guide
- The program contains a FizzBuzz3 class which takes in 2 integers with its constructor.  
	- The integers represent the range of the list for which the output is based on.
	
- This program allows you to print the statistics of the list.  
	- To generate the list with statistics, call the toString() method, or call getOutputlist() with getStatistics().  
	- You can still generate the output with just the list using getOutputlist(), or you can also get only the statistics with getStatistics().  
	- If the list has not been processed yet, the getStatistics() method will contain a blank String.
	
- The String replacement values are stored in the StringConstants class.  
	- Updating the values here will update them in the output and the tests.  
	- So you don't have to change the tests if you need to change the output.  
	- This version of the program uses different text if the number in the list contains the digit 3.
