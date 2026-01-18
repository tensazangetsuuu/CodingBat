package string2;

public class CatDog {
    public boolean catDog(String str) {
        int catCount = 0, dogCount = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) catCount++;
            if (sub.equals("dog")) dogCount++;
        }
        return catCount == dogCount;
    }

}
