package Java_2013.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/3/27 23:12
 */

public class _10大臣的旅费 {
    private static int n;
    private static List<Node>[] g;  //邻接表
    private static long max = -1;
    private static int pnt = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        g = new List[n+1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<Node>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            g[a].add(new Node(b, c));
            g[b].add(new Node(a, c));
        }

        dfs(1,1,0);
        System.out.println(pnt);
        dfs(pnt, pnt, 0);
        System.out.println(pnt);

    }

    static class Node{
        int num;
        int dis;

        public Node(int num, int dis){
            this.num = num;
            this.dis = dis;
        }
    }

    static void dfs(int from, int num, long dis) {
        boolean isLeaf = true;
        List<Node> neighbors = g[num];
        for (int i = 0; i < neighbors.size(); i++) {
            Node neighbor = neighbors.get(i);
            if (neighbor.num == from) continue;
            isLeaf = false;
            dfs(num, neighbor.num, dis+neighbor.dis);
        }
        if (isLeaf && dis > max) {
            max = dis;
            pnt = num;
        }
    }

    static int dis2money(int dis) {
        return 11 * dis + dis * (dis - 1) / 2;
    }


}
