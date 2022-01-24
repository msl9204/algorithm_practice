package lecture.L07;

import java.util.LinkedList;
import java.util.Queue;

public class L0710 {
    Node root;

    private int BFS(Node root) {

        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                Node current = Q.poll();

                if (current.lt == null && current.rt == null) {
                    return L;
                } else {
                    if (current.lt != null) {
                        Q.offer(current.lt);
                    }
                    if (current.rt != null) {
                        Q.offer(current.rt);
                    }
                }
            }
            L++;
        }

        return -1;
    }

    public static void main(String[] args) {

        L0710 tree = new L0710();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }


}
