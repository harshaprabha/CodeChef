
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * December 2019 CodeChef Long Challenge Problem Problem Statement <a hrep
 * ="https://www.codechef.com/DEC19B/problems/WATSCORE">That is My Score!</a>
 *
 * Time Complexity - O(n) Space Complexity - O(8)
 *
 * @author Harsha Prabha E
 */
class ThatIsMyScore {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List<Integer> sumlist = new ArrayList<>();
    Set<Integer> notin = new HashSet<>(Arrays.asList(9, 10, 11));
    HashMap<Integer, Integer> map = new HashMap<>();
    int T = Integer.parseInt(sc.nextLine());
    int sum = 0;
    while (T > 0) {
      int N = Integer.parseInt(sc.nextLine());
      for (int i = 0; i < N; i++) {
        String[] inp = sc.nextLine().split(" ");
        int p = Integer.parseInt(inp[0]);
        int s = Integer.parseInt(inp[1]);
        if (!notin.contains(p)) {
          if (map.containsKey(p)) {
            map.put(p, Math.max(map.get(p), s));
          } else {
            map.put(p, s);
          }
        }

      }

      for (Map.Entry<Integer, Integer> entry : map.entrySet()
      ) {
        sum += entry.getValue();
      }
      sumlist.add(sum);
      sum = 0;
      map.clear();
      T--;
    }

    for (int s : sumlist
    ) {
      System.out.println(s);

    }

  }
}