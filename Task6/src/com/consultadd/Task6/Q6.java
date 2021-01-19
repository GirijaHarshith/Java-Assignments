package com.consultadd.Task6;
/*
* 6. Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
*  then the message "I love programming languages" should be printed.
* If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
* For example, while creating object if we pass "Java", then "I love Java" should be printed. There can be more than one programming languages.
*
* @author Girija
*/
public class Q6 {
    public static void main(String[] args) {
        Programming p1=new Programming();
        Programming p2=new Programming("Java");
        Programming p3=new Programming("Java,Python");
        p1.print();
        p2.print();
        p3.print();
    }
}

class Programming{
    String str;
    Programming(){
        this.str="I love Programming languages";
    }
    Programming(String str){
        this.str="I love "+str;
    }
    public void print(){
        System.out.println(this.str);
    }
}