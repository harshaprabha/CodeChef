/**
 * November 2019 CodeChef Long Challenge Problem Problem Statement<a hrep
 * ="https://www.codechef.com/NOV19B/problems/SC31">Weapon Value</a>
 *
 * @author Harsha Prabha E
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class MaximumWeaponValue {

  public static void main(String[] args) {

    List<String> str;
    int[] count = {};
    int l = 0;
    int T = 0;
    Scanner sc = new Scanner(System.in);
    //Read no of test cases
    if (sc.hasNext()) {
      T = Integer.parseInt(sc.nextLine());
    }
    // Array to hold result count for all test cases
    count = new int[T];

    for (int t = 0; t < T; t++) {
      int n = 0;
      if (sc.hasNext()) {
        n = Integer.parseInt(sc.nextLine());
      }

      str = new LinkedList<>();

      //Store the input strings
      for (int i = 0; i < n; i++) {
        if (sc.hasNext()) {
          str.add(sc.nextLine());
        }
      }

      // If N=1, add all ones
      if (n == 1) {
        int c = 0;
        String ele = str.get(0);
        for (int k = 0; k < ele.length(); k++) {
          if (ele.charAt(k) == '1') {
            c++;
          }
        }
        count[l] = c;
        l++;

        continue;

      } else {
        // If N>1, then run battles in pairs and eliminate one at the end of each battle so there is one winner
        while (str.size() > 1) {

          // find max value
          int first = Integer.parseInt(str.get(0), 2);

          int second = Integer.parseInt(str.get(1), 2);

          int result = first ^ second;

          String out = Integer.toBinaryString(result);
          ((LinkedList<String>) str).removeFirst();
          ((LinkedList<String>) str).removeFirst();
          str.add(out);

        }
        int size = str.get(0).length();

        String result = str.get(0);
        int ones = 0;

        // Add all ones to calculate the maximum weapons
        for (int k = 0; k < size; k++) {
          if (result.charAt(k) == '1') {
            ones++;
          }
        }
        count[l] = ones;
        l++;

      }//else

    }//T

    for (int c = 0; c < count.length; c++) {
      System.out.println(count[c]);
    }

  }

}
