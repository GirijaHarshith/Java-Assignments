package com.consultadd.Task6;
/*
* 4.Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth'.
* The class has three constructors which are :
* 1 - having no parameter - values of both length and breadth are assigned zero.
* 2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
* 3 - having one number as parameter - both length and breadth are assigned that number.
* Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
* @author Girija
*/


public class Q4 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(2);
        Rectangle r3=new Rectangle(2,5);
        r1.area();
        r2.area();
        r3.area();
    }
}
class Rectangle{
    int length;
    int breadth;
    Rectangle(){}
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(int length_breadth){
        this.length=length_breadth;
        this.breadth=length_breadth;
    }
    public void area(){
        int area=this.length*this.breadth;
        System.out.println("Area : "+ area);
    }
}

