package com.consultadd.Task6;
/*
 * 1. Print the sum, difference and
 *    product of two complex numbers by creating a class named 'Complex' with separate methods
 *    for each operation whose real and imaginary parts are entered by user.
 *
 * @author: Girija
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real value of 1st complex number");
        int real1 = sc.nextInt();
        System.out.println("Enter imaginary value of 1st complex number");
        int imag1 = sc.nextInt();

        System.out.println("Enter real value of 2nd complex number");
        int real2 = sc.nextInt();
        System.out.println("Enter imaginary value of 2nd complex number");
        int imag2 = sc.nextInt();

        Complex c1 = new Complex(real1,imag1);
        Complex c2 = new Complex(real2,imag2);
        Complex res = new Complex();
        res = res.sum(c1,c2);
        if(res.imag >=0)
            System.out.println("Sum : "+ res.real +"+" + res.imag + "i");
        else
            System.out.println("Sum : "+ res.real + res.imag + "i");

        res=res.subtract(c1,c2);
        if(res.imag >=0)
            System.out.println("Difference : "+ res.real +"+" + res.imag + "i");
        else
            System.out.println("Difference : "+ res.real + res.imag + "i");

        res=res.multiply(c1,c2);
        if(res.imag >=0)
            System.out.println("Product : "+ res.real +"+" + res.imag + "i");
        else
            System.out.println("Product : "+ res.real + res.imag + "i");

    }
}

class Complex{
    int real;
    int imag;

    Complex(){};
    Complex(int r,int i){                   //parameterised constructor (it is overloading default constructor)
        this.real=r;
        this.imag=i;
    };

    public Complex sum(Complex c1,Complex c2){
        Complex c3=new Complex();
        c3.real = c1.real+c2.real;
        c3.imag = c1.imag+c2.imag;
        return c3;
    }

    public Complex subtract(Complex c1,Complex c2){
        Complex c3= new Complex();
        c3.real = c1.real-c2.real;
        c3.imag = c1.imag-c2.imag;
        return c3;
    }

    public Complex multiply(Complex c1,Complex c2){
        Complex c3= new Complex();
        c3.real=c1.real*c2.real;
        c3.imag=c1.imag*c2.imag;
        return c3;
    }

}

