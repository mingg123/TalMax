package minji.트리;

import java.util.*;
import java.io.*;

public class 트리의높이와넓이 {
    public static Node[] tree;
    public static int[] min, max;
    public static int nodeIdx = 1;

    public static void inorder(int root, int level) {
        if (tree[root].left != -1) {
            inorder(tree[root].left, level + 1);
        }

        min[level] = Math.min(min[level], nodeIdx);
        max[level] = Math.max(max[level], nodeIdx);
        nodeIdx++;
        if (tree[root].right != -1) {
            inorder(tree[root].right, level + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int root = 0;
        tree = new Node[N + 1];
        min = new int[N + 1];
        max = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new Node(i, -1, -1);
            max[i] = 0;
            min[i] = N;
        }

        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();
            tree[num].left = left;
            tree[num].right = right;

            // 부모랑 연결
            if (left != -1) {
                tree[left].parent = num;
            }
            if (right != -1) {
                tree[right].parent = num;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (tree[i].parent == -1) {
                root = i;
                break;
            }
        }
        inorder(root, 1);
        int level = 1;
        int width = 0;
        for (int i = 0; i <= N; i++) {
            int temp = max[i] - min[i];
            if (width < temp) {
                level = i;
                width = temp;
            }
        }
        System.out.println(level + " " + (width + 1));
    }
}

class Node {
    int num;
    int parent;
    int left;
    int right;

    public Node(int num, int left, int right) {
        this.num = num;
        this.left = left;
        this.right = right;
        this.parent = -1;
    }
}