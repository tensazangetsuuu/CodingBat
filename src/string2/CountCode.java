package string2;

public class CountCode {
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("code")) return count += 1;
        }
        return count;

    }

}
