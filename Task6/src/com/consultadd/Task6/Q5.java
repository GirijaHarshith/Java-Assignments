package com.consultadd.Task6;
/*
*5 . Suppose you have a Saving Box with an initial amount of $50 and you have to add some more to it.
*    Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50.
*    Now make two constructors of this class as follows:
*
*   1 - without any parameter - no amount will be added to the Saving Box
*   2 - having a parameter which is the amount that will be added to Saving Box
*   Create object of the 'AddAmount' class and display the final amount in Saving Box.
*   Also, create a method that can display how many transactions are done on the Saving Box.
*
* @author: Girija
*/
public class Q5 {
    public static void main(String[] args) {
        AddAmount a1=new AddAmount();
        a1.display();
        a1.transactions();
        AddAmount a2=new AddAmount(50);
        a2.display();
        a2.transactions();
    }
}

class AddAmount{
    double amount=50;
    static int count=0;
    AddAmount(){
        this.amount+=0;
        count++;
    }
    AddAmount(double amount){
        this.amount+=amount;
        count++;
    }
    public void display(){
        System.out.println("Total Amount "+this.amount);
    }
    public void transactions(){
        System.out.println("No of transactions "+ count);
    }

}