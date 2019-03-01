package rocks.zipcode.stringsgalore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTheory {

    public StringTheory() {}

    public static  char getChatAt(String input, int index){
        return input.charAt(index);
    }
    public static  int getCharUniCodeAt(String input, int index){
        if (index < 0 || index > input.length())
            return -1;
        return input.charAt(index);
    }

    public static  int getUniCodeBeforeIndex(String input, int index){

        return getCharUniCodeAt(input, index - 1);
    }
    public static String compare(String str1, String str2){

        int result = str1.compareTo(str2);
        String resultStr = (result <= 0)? " is less than " : " is greater than ";
        if(result == 0){
            resultStr = " is equal to ";
        }

        return (str1 + resultStr + str2);
    }
    public static String concat(String str1, String str2){
        return str1 + str2;
    }
    public static boolean contains(String input, String strToSearch){
        return input.contains(strToSearch);
    }
    public static boolean compareToEqual(String input, String strToCompare){
        return input.compareTo(strToCompare) == 0;
    }
    public static boolean compareToEqual(String input, StringBuffer strToCompare){
        return input.compareTo(strToCompare.toString()) == 0;
    }
    public static String toStringFromCharArray(char[] input){
        return new String(input);
    }
    public static boolean isEndWith(String input, String endsWithCheck){
        return input.endsWith(endsWithCheck);
    }
    public static boolean isSameData(String str1, String str2)
    {
        return str1.equals(str2);
    }
    public static boolean compareIgnoreCase(String str1, String str2)
    {
        return str1.equalsIgnoreCase(str2);
    }
    public static String getCurrentDateAndTime(){
        DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy\n");
        DateFormat timeFormat = new SimpleDateFormat("HH:mm a\n");
        Date date = new Date();
        String result = "Current Date and Time :\n";
        return result + dateFormat.format(date) + timeFormat.format(date);
    }
    // Put your code for all 70 exercises starting here.

}
