import java.util.Arrays;

class pre1 {
    public static boolean areAnagram(String s1, String s2) {
        if (s1.length()!= s2.length()) {
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String args[]) {
        String s1 = "listen";
        String s2 = "silent";
        if (areAnagram(s1, s2)) {
            System.out.println("string is anagrams.");
        } else {
            System.out.println("string are not anagrams.");
        }
    }
}