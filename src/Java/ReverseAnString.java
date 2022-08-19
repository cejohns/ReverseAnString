package Java;
import  java.util.Scanner;

public class ReverseAnString{

    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        byte[] stringByteArray = str.getBytes();
        byte[] reverseStringByteArray = new byte[str.length()] ;
        String reversedString;

        for(int i = 0;  i<=stringByteArray.length-1; i++) {
            reverseStringByteArray [i] = stringByteArray[stringByteArray.length-i-1];
        }

        reversedString = new String(reverseStringByteArray);
        return reversedString;
    }

    public void main(String[] args){
        String input = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Word");
        System.out.println(solution(sc.next()));
        solution(input);
        sc.close();
    }
}
