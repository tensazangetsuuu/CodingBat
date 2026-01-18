package string1;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() > 2) {
            String ss = str.substring(0, 2);
            return ss;
        }
        return str;


    }
}
