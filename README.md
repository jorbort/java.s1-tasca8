# java.s1-task8
eigth task  of the first sprint of the java bootcamp.

# Java Lambdas and Streams Exercises  

## Introduction  
This project contains a series of exercises designed to practice Java 8+ Lambdas and Streams. The exercises are divided into three levels of increasing complexity.  

## Requirements  
- Java 8 or later  
- Basic knowledge of Java Streams and Functional Interfaces  

---

## Level 1  

### Exercise 1  
Write a method that, given a list of strings, returns a list of all strings containing the letter 'o'. Print the result.  

### Exercise 2  
Modify the previous method to return a list of strings that contain the letter 'o' and have more than 5 characters. Print the result.  

### Exercise 3  
Create a list of the months of the year. Print all elements using a lambda expression.  

### Exercise 4  
Repeat the previous exercise but use a method reference instead of a lambda expression.  

### Exercise 5  
Create a `Functional Interface` with a method `getPiValue()` that returns a `double`. Instantiate this interface in the `main()` method and assign it the value `3.1415`. Invoke `getPiValue()` and print the result.  

### Exercise 6  
Create a list containing numbers and text strings. Sort the list from shortest to longest string.  

### Exercise 7  
Modify the previous exercise to sort the list in reverse order (longest to shortest string).  

### Exercise 8  
Create a `Functional Interface` with a method `reverse()` that receives and returns a `String`. Implement this interface in `main()` using a lambda expression that reverses the input string. Test the method with a sample string and verify the result.  

---

## Level 2  

### Exercise 1  
Create a list of proper names. Write a method that returns a list of all names starting with 'A' (uppercase) and containing exactly three letters. Print the result.  

### Exercise 2  
Write a method that converts a list of `Integers` into a comma-separated string. Each element should be preceded by "e" if it's even and "o" if it's odd.  

Example: Given the list `(3, 55, 44)`, the output should be:  
o3, o55, e44

sql
Copy
Edit
Print the result.  

### Exercise 3  
Create a `Functional Interface` with a method `operacio()` that returns a `float`. Implement this interface using a lambda expression to allow switching between addition, subtraction, multiplication, and division.  

### Exercise 4  
Create a list containing text strings and numbers. Perform the following operations using lambdas:  
- Sort alphabetically by the first character. (`charAt(0)`)  
- Prioritize strings that contain the letter 'e'.  
- Replace all occurrences of 'a' with '4'.  
- Display only numeric values, even if stored as strings.  

---

## Level 3  

### Exercise 1  
1. Create a class `Alumne` with attributes: `name`, `age`, `course`, and `grade`.  
2. Populate a list with 10 students.  
3. Display the name and age of each student.  
4. Filter students whose names start with 'A' and store them in a new list. Print the list.  
5. Filter and display students with a grade of 5 or higher.  
6. Filter and display students with a grade of 5 or higher who are not enrolled in PHP.  
7. Display students enrolled in Java who are also adults (18+).  

---

## How to Run the Project  
1. Clone this repository:  
2. open it in your favourite ide.
3. compile and run. 
