package MyTests.ArrStr;

public class AllInStringUnique {

    static boolean isUniqueChars(String str) {
        //sumbols in standart ASCII
        if (str.length() > 256) return false;
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars("А розы все синие"));
    }

}
