package com.consultadd.Task7;
/*
 * 8. Print all permutations of the String
 * @author Girija
 */
public class Q8 {
    public static void main(String[] args) {
        Q8 q8=new Q8();
        String str="abc";
        q8.permutationString(str,0,str.length()-1);
    }

    private void permutationString(String str,int l,int r) {
        if(l==r){
            System.out.println(str);
            return;
        }
        for(int i=l;i<=r;i++){
            str=swap(str,l,i); //choose
            permutationString(str, l+1, r); //explore
            str=swap(str, l, i); //unchoose
        }
    }
    public String swap(String str, int l,int r){
        char[] s=str.toCharArray();
        char temp = s[l];
        s[l] =s[r];
        s[r]=temp;
        return String.valueOf(s);
    }
}


