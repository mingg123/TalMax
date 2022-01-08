package minji.트리;

import java.util.*;
import java.io.*;

public class 트리순회 {
    public static void preOrder(Node root) {
        System.out.print(root.data);
        if (root.left != null)
            preOrder(root.left);
        if (root.right != null)
            preOrder(root.right);
    }

    public static void InOrder(Node root) {
        if (root.left != null) {
            InOrder(root.left);
        }
        System.out.print(root.data);
        if (root.right != null) {
            InOrder(root.right);
        }
    }

    public static void postOrder(Node root) {
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.print(root.data);
    }

    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        for (int i = 0; i < N; i++) {
            char[] data;
            data = br.readLine().replaceAll(" ", "").toCharArray();
            tree.AddNode(data[0], data[1], data[2]);
        }

        preOrder(tree.root);
        System.out.println("");
        InOrder(tree.root);
        System.out.println("");
        postOrder(tree.root);
    }
}

class Node {
    char data;
    Node left;
    Node right;

    public Node(char data) {
        this.data = data;
    }
}

class Tree {
    Node root;

    public void AddNode(char data, char leftData, char rightData) {
        if (root == null) {
            root = new Node(data);

            if (leftData != '.') {
                root.left = new Node(leftData);
            }
            if (rightData != '.') {
                root.right = new Node(rightData);
            }
        } else {
            Search(root, data, leftData, rightData);
        }
    }

    public void Search(Node root, char data, char leftData, char rightData) {
        if (root == null) {
            return;
        } else if (root.data == data) {
            if (leftData != '.') {
                root.left = new Node(leftData);
            }
            if (rightData != '.') {
                root.right = new Node(rightData);
            }
        } else {
            Search(root.left, data, leftData, rightData);
            Search(root.right, data, leftData, rightData);
        }
    }
}