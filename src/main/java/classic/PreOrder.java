package classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by parkey19 on 2019. 9. 29..
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}

public class PreOrder {
    public static List<Integer> cycle(Node root) {
        List<Integer> ret = new ArrayList<>();
        travalsal(root, ret);
        System.out.println(ret.stream().map(i->i.toString()).collect(Collectors.joining(",")));
        return ret;
    }

    public static void travalsal(Node node, List<Integer> ret) {
        if (node == null) return;
        ret.add(node.val);
        for (Node n: node.children) {
            travalsal(n, ret);
        }

    }

    public static void main(String[] args) {
        Node node5 = new Node(7, new ArrayList<>());
        List<Node> list2 = new ArrayList<>();
        list2.add(node5);
        Node node2 = new Node(2, list2);
        Node node3 = new Node(3, new ArrayList<>());
        Node node4 = new Node(4, new ArrayList<>());
        List<Node> nodes1 = Arrays.asList(node2, node3, node4);
        Node node = new Node(1, nodes1);
        PreOrder.cycle(node);

    }
}
