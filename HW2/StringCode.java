package oop.HW2;

public class StringCode {
    /**
     * find longest subArr with the same consecutive elements.
     *
     * @param str input String
     * @return max length
     */
    public static int maxRun(String str) {
        int maxRun = 0;
        int n = str.length();
        if (n != 0) maxRun = 1;
        for (int i = 0; i < n; i++) {
            char tmpChar = str.charAt(i);
            int tmpCount = 1;
            for (int j = i + 1; j < n; j++) {
                if (tmpChar != str.charAt(j)) {
                    break;
                }
                tmpCount++;
                maxRun = Math.max(tmpCount, maxRun);
            }
        }
        return maxRun;
    }

    /**
     * create string with given rule.
     *
     * @param str input String
     * @return result string
     */
    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean num = false;
            if (Character.isDigit(str.charAt(i))) {
                num = true;
            }
            if (i == str.length() - 1 && Character.isDigit(str.charAt(i))) {
                continue;
            }
            if (!num) {
                result.append(str.charAt(i));
                continue;
            }
            if ((i + 1) < str.length()) {
                int n = str.charAt(i) - '0';
                while (n > 0) {
                    result.append(str.charAt(i + 1));
                    n -= 1;
                }
            }
        }
        return result.toString();
    }

    /**
     * find if 2 str have the same substr or not.
     *
     * @param a   str1
     * @param b   str2
     * @param len substr len
     * @return true if satisfy and else false
     */
    public static boolean stringIntersect(String a, String b, int len) {
        int n = 0;
        while (n + len - 1 < a.length()) {
            String tmp = a.substring(n, n + len);
            int t = 0;
            while (t + len - 1 < b.length()) {
                String tmp2 = b.substring(t, t + len);
                if (tmp.equals(tmp2)) {
                    return true;
                }
                t++;
            }
            n++;
        }
        return false;
    }
}

