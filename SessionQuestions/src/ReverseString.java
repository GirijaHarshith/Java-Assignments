
public class ReverseString {
    public static void main(String[] args) {
        String str = "Girija";
        char[] charStr = str.toCharArray();  //string is converted to array
        int low=0, high=charStr.length-1;  //high = str.length()-1

        while(low<high){
            char temp=charStr[low];
            charStr[low]=charStr[high];
            charStr[high]=temp;
            low++;
            high--;
        }
        System.out.println("Reverse String is " + String.valueOf(charStr));   // new String(charStr) or String.valueOf(charStr)
    }
}
