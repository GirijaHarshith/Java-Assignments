package com.consultadd.Task6;
/*
* 2.Write a program that would print the information (name, year of joining, salary, address)
*  of three employees by creating a class named 'Employee'.
* The output should be as follows:

Name        Year of joining        Address

Robert            1994                64C- Walls Streat

Sam                2000                68D- Walls Streat

John                1999                26B- Walls Streat
*
* @author Girija
 */
public class Q2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert",1994,3000,"64C-Walls Street");
        Employee e2 = new Employee("Sam ",2000,5000,"68D-Walls Street");
        Employee e3 = new Employee("John",1999,8000,"26B-Walls Street");
        System.out.println("Name\t"+ "Year\t"+"Salary\t"+"Address");
        e1.print();
        e2.print();
        e3.print();
    }
}
class Employee{    //Encapsulation--data hiding + Abstraction(hiding internal implementation). Also, having Employee instance variable and its methods together is called Encapsulation.
    private String name; //private - data hiding,these instance variables are exposed through public getter methods
    private int year;
    private double salary;
    private String address;

    Employee(){}
    Employee(String name,int year,double salary,String address){               //Constructor is to initialise instance variables
        this.name=name;       //even inside we can add verification which replaces setter methods
        this.year=year;
        this.salary=salary;
        this.address=address;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public double getSalary(){
        //we can do verification here before sending salary details- this is abstraction
        return this.salary;
    }
    public String getAddress(){
        return this.address;
    }
    public void print(){
        System.out.println(this.getName()+"\t"+ this.getYear()+"\t"+ this.getSalary()+"\t"+this.getAddress());
    }
}