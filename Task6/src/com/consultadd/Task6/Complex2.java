package com.consultadd.Task6;
/*
* 1. Print the sum, difference and
*    product of two complex numbers by creating a class named 'Complex' with separate methods
*    for each operation whose real and imaginary parts are entered by user.
*
* @author: Girija
*/

import java.util.Scanner;

public class Complex2 {
    //instance variables of class Complex
    int r1, r2;
    int i1, i2;

    Complex2(){};
    Complex2(int real1, int real2, int imag1, int imag2){
        this.r1=real1;
        this.r2=real2;
        this.i1=imag1;
        this.i2=imag2;
    };
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

        Complex2 q0 = new Complex2();
        Complex2 q1=new Complex2(real1,real2,imag1,imag2);
        q0.r1=real1;
        q1.r1=real2;
        //Complex q1=new Complex(real1,real2,imag1,imag2);
        //Complex q2 = new Complex(1,1,4,3);
        q1.sum();
        q1.difference();
        q1.multiply();
    }


    public void sum(){
        System.out.print("Sum: ");
        System.out.print(this.r1+this.r2);
        System.out.print("+");
        System.out.print(this.i1+this.i2);
        System.out.print("i");
    }

    public void difference(){
        System.out.print("Difference: ");
        System.out.print(r1-r2);
        System.out.print("+");
        System.out.print(i1+i2);
        System.out.print("i");
    }

    public void multiply(){

    }
}
