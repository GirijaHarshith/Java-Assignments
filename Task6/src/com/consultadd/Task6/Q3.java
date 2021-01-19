package com.consultadd.Task6;
/*
* 3. Write a program to print the names of students by creating a Student class.
* If no name is passed while creating an object of Student class, then the name should be "Unknown",
* otherwise the name should be equal to the String value passed while creating object of Student class.
* (Hint: Overloading concept)
*
* @author Girija
*/

public class Q3 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2 = new Student("Girija S");
        System.out.println("Student_Name");
        s1.print();
        s2.print();
    }
}
class Student{
    private String name;
    Student(){
        this.name="Unknown";
    }

    Student(String name){
        this.name=name;
    }
    public String getName(){
       return this.name;
    }
    public void print(){
        System.out.println(this.getName());
    }
}
