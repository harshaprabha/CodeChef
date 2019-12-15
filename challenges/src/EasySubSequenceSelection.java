import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * December 2019 CodeChef Long Challenge Problem Problem Statement <a hrep
 * ="https://www.codechef.com/DEC19B/problems/SUBSPLAY/">Easy Subsequence Selection</a>
 *
 * Time Complexity - O(26*n) Space Complexity - O(26)
 *
 * @author Harsha Prabha E
 */
class EasySubSequenceSelection {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = Integer.parseInt(sc.nextLine());
    int[] out = new int[T];
    int t = 0;
    while (t < T) {
      int n = Integer.parseInt(sc.nextLine());
      out[t] = computeMaxLength(n, sc.nextLine());
      t++;
    }

    for (int p = 0; p < T; p++) {
      System.out.println(out[p]);
    }
  }

  public static int computeMaxLength(int n, String s) {
    Map<Character, Integer> gapCount = new HashMap<>();
    Character ch = 'a';
    for (int i = 0; i < 26; i++) {
      int prev = -1;
      int diff = Integer.MAX_VALUE;
      for (int j = 0; j < n; j++) {
        if (s.charAt(j) == ch) {
          if (prev != -1) {
            diff = Math.min(diff, j - prev);
          }
          prev = j;
        }
      }//n for

      if (diff < Integer.MAX_VALUE) {
        gapCount.put(ch, diff);
      }
      ch++;

    }//for

    int min = Integer.MAX_VALUE;
    for (Map.Entry<Character, Integer> entry : gapCount.entrySet()) {
      min = Math.min(min, entry.getValue());
    }
    return min < n ? n - min : 0;


  }


}
