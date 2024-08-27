package PatternSearching.BoyerMooreAlgorithm;

public class BoyerMooreAlgorithm {

    public static int NO_OF_CHARS = 256;

    private static void badCharHeuristic(char[] str, int size, int[] badchar) {
        for (int i = 0; i < NO_OF_CHARS; i++)
            badchar[i] = -1;

        for (int i = 0; i < size; i++)
            badchar[(int) str[i]] = i;
    }

    public static void search(String txt, String pat) {
        char[] txtArr = txt.toCharArray();
        char[] patArr = pat.toCharArray();
        int m = pat.length();
        int n = txt.length();

        int[] badchar = new int[NO_OF_CHARS];

        badCharHeuristic(patArr, m, badchar);

        int s = 0;
        while (s <= (n - m)) {
            int j = m - 1;

            while (j >= 0 && patArr[j] == txtArr[s + j])
                j--;

            if (j < 0) {
                System.out.println("Pattern found at index " + s);
                s += (s + m < n) ? m - badchar[txtArr[s + m]] : 1;
            } else
                s += Math.max(1, j - badchar[txtArr[s + j]]);
        }
    }

    public static void main(String[] args) {
        String txt = "ABAAABCD";
        String pat = "ABC";
        search(txt, pat);
    }
}

