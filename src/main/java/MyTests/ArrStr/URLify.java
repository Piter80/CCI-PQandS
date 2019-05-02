package MyTests.ArrStr;

public class URLify {
    static String replaceSpaces (char[] str, int trueLength) {
        char[] newStr;
        int spaceCount = 0, i = 0, index;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') { spaceCount++; }
        }

        index = trueLength+spaceCount*2;
        newStr = new char[index];
        if (trueLength < str.length) str[trueLength] = '\0';
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                newStr[index - 3] = '%';
                newStr[index - 2] = '2';
                newStr[index - 1] = '0';
                index = index - 3;
            } else {
                newStr[index - 1] = str[i];
                index--;
            }
        }
        return new String(newStr);
    }

    public static void main(String[] args) {
        String s = "Замена пробелов на что-то!";
        System.out.println(replaceSpaces(s.toCharArray(), s.length()));
    }
}
