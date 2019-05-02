package MyTests.ArrStr;

import java.util.Arrays;

public class Permutation {

    String sort (String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    boolean isPermutation (String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return sort(s1).equals(sort(s2));
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        System.out.println(permutation.isPermutation("good", "dog"));
    }


}

