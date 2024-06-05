package LeetCode;

import java.util.HashMap;

public class romanToInt {
    public String intToRoman(int num) {

        if(num<1 || num>3999){
            return "Invalid Number";
        }

        String roman ="";
        int digit=0;
        HashMap<Integer,Character> values = new HashMap<>();
        values.put(1,'I');
        values.put(5,'V');
        values.put(10,'X');
        values.put(50,'L');
        values.put(100,'C');
        values.put(500,'D');
        values.put(1000,'M');


        return "";
    }
}
