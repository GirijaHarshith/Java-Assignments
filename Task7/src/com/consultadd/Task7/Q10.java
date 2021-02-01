package com.consultadd.Task7;
/*
 * 10 . Find all possible combinations of String? (using recursion)
 * @author Girija
 */
public class Q10 {
    public static void main(String[] args) {
        Q10 q10=new Q10();
        String str="abc";
        q10.combination(str,new StringBuffer(), 0);
    }

    public void combination(String instr, StringBuffer outstr, int index)
    {
        if(index==instr.length()){
            return;
        }

        for (int i = index; i < instr.length(); i++)
        {
            outstr.append(instr.charAt(i)); //choose
            System.out.println(outstr);
            combination(instr, outstr, i + 1); //explore
            outstr.deleteCharAt(outstr.length() - 1); //unchoose
        }
    }

}
