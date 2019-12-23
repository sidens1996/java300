package world.zyx.mycollection;

/**
 * @ClassName: Node
 * @Description: LinkedList节点
 * @Author: Achilles
 * @Date: 13/12/2019  13:51
 * @Version: 1.0
 **/

public class Node<E> {
    E ele;
    Node next;
    Node pre;

    public Node() {
    }

    public Node(E ele) {
        this.ele = ele;
    }

    public Node(E ele, Node next, Node pre) {
        this.ele = ele;
        this.next = next;
        this.pre = pre;
    }
}
