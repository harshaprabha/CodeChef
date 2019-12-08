import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * December 2019 CodeChef Long Challenge Problem Problem Statement <a hrep
 * ="https://www.codechef.com/DEC19B/problems/PLMU">Plus Multiply</a>
 *
 * Time Complexity - O(n) Space Complexity - O(1)
 *
 * @author Harsha Prabha E
 */
class PlusMultiply {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = Integer.parseInt(sc.nextLine());
    List<Integer> result = new ArrayList<>();
    while (T > 0) {

      int N = Integer.parseInt(sc.nextLine());
      String[] inp = sc.nextLine().split(" ");
      int[] arr = Arrays.stream(inp).mapToInt(Integer::parseInt).toArray();
      int twoCount = 0;
      int zeroCount = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 2) {
          twoCount++;
        }
        if (arr[i] == 0) {
          zeroCount++;
        }

      }
      result.add(((twoCount * (twoCount - 1)) / 2 + (zeroCount * (zeroCount - 1)) / 2));

      T--;
    }

    for (int r : result
    ) {
      System.out.println(r);
    }


  }

}
