/**
 * November 2019 CodeChef Long Challenge Problem Problem Statement<a hrep
 * ="https://www.codechef.com/NOV19B/problems/HRDSEQ">Hard Sequence Challenge</a>
 *
 * @author Harsha Prabha E
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HardSequence {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //Store result of test cases
    List<Integer> result = new ArrayList<>();
    // No of test cases
    int T = 0;
    // Map to hold sequence element as key and its latest index as value
    Map<Integer, Integer> indexMap;
    // Array to store sequence value of size N
    int[] A;

    // Read no of test cases
    if (sc.hasNext()) {
      T = Integer.parseInt(sc.nextLine());
    }

    for (int t = 0; t < T; t++) {
      int N = 0;
      //Read no of elements in sequence
      if (sc.hasNext()) {
        N = Integer.parseInt(sc.nextLine());
      }

      indexMap = new HashMap<>();
      A = new int[N];
      //Initialize first element to be zero
      A[0] = 0;

      for (int i = 1; i < N; i++) {
        int x = A[i - 1];
        if (indexMap.containsKey(x)) {
          int value = i - 1 - indexMap.get(x);
          A[i] = value;
        } else {
          A[i] = 0;

        }
        indexMap.put(A[i - 1], i - 1);
      }

      int count = 0;
      //Count no of occurences of element in array
      for (int j = 0; j < N; j++) {

        if (A[j] == A[N - 1]) {
          count++;
        }

      }

      result.add(count);
    }//T

    for (int r : result) {
      System.out.println(r);
    }

  }

}
