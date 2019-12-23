package world.zyx.mycollection;

import java.util.Arrays;

/**
 * @ClassName: ZyxLinkedList
 * @Description: 自己实现LinkedList
 * 第一个节点，最后一个节点，大小，add方法
 * 增加get方法
 * 增加remove方法
 * 插入节点
 * @Author: Achilles
 * @Date: 12/12/2019  21:54
 * @Version: 1.0
 **/

public class ZyxLinkedList<E> {

    private Node first;
    private Node last;

    private int size;

    public void add(E ele) {
        Node<E> node = new Node<>(ele);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            node.pre = last;
            last = node;
        }
        first.pre = last;
        last.next = first;
        size++;
    }

    public void remove(int index) {
        checkIndex(index);
        Node<E> node = getNode(index);
        removeNode(node);
    }

    public void remove(E ele) {
        Node<E> temp = first;
        while (temp.next != first) {
            if (temp.ele == ele) {
                removeNode(temp);
            }
        }
    }

    private void removeNode(Node node) {//包含检查
        if (node.pre != last && node.next != first) {
            Node<E> pre = node.pre;
            pre.next = node.next;
            node.next.pre = pre;
        } else if (node.pre == last && node.next != first) {
            first = node.next;
            last.next = first;
            first.pre = last;
        } else if (node.pre != last && node.next == first) {
            last = node.pre;
            last.next = first;
            first.pre = last;
        } else if (node.pre == node) {
            last = null;
            first = null;
        }
        size--;
    }

    public void add(int index,E ele) {
        Node<E> newNode = new Node<>(ele);
        checkIndex(index);
        if (size == 0) {
            first = newNode;
            last = newNode;
            first.pre = last;
            first.next = last;
        }
        Node<E> node = getNode(index);
        if(node == first && node == last){
            first = newNode;
            last = node;
            first.next = last;
            first.pre = last;
            last.pre = first;
            last.next = first;
        } else if (node == first) {
            first = newNode;
            first.next = node;
            first.pre = last;
            node.pre = first;
            last.next = first;
        } else {// node != first
            node.pre.next = newNode;
            newNode.pre = node.pre;
            newNode.next = node;
            node.pre = newNode;
        }
        size++;
    }

    public Node<E> getNode(int index) {
        Node<E> temp = null;
        if (index > (size >> 1)) {
            int newIndex = size - index - 1;
            temp = last;
            for (int i = 0; i < newIndex; i++) {
                temp = temp.pre;
            }
        }else{
            temp = first;
            for (int i = 0; i < index; i++) {

                temp = temp.next;
            }
        }
        return temp;
    }

    public E get(int index) {//从头找，也可以从尾找，提升效率
        checkIndex(index);
        if (size == 0) {
            return null;
        }
        return getNode(index).ele;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("越界");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node<E> temp = first;
        if (first != null) {
            while (temp.next != first) {
                stringBuilder.append(temp.ele).append(",");
                temp = temp.next;
            }
            stringBuilder.append(last.ele).append(",");
        }
        if (size == 0) {
            stringBuilder.append("]");
        } else {
            stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        }
        if (checkToString(normalToString(),reverseToString())) {//正反遍历，检查是否相同
            return stringBuilder.toString();
        } else {
            return new String("LinkedList创建错误，无法打印");
        }
    }

    private Object[] normalToString() {
        Object[] values = new Object[size];
        Node<E> temp = first;
        int i = 0;
        if (first != null) {
            while (temp.next != first) {
                values[i++] = temp.ele;
                temp = temp.next;
            }
            values[size - 1] = last.ele;
        }
        return values;
    }
    private Object[] reverseToString() {
        Object[] reversedValues = new Object[size];
        Node<E> temp = last;
        int i = 0;
        if (first != null) {
            while (temp.pre != last) {
                reversedValues[size - 1 - i] = temp.ele;
                temp = temp.pre;
                i++;
            }
            reversedValues[0] = first.ele;
        }
        return reversedValues;
    }

    private Boolean checkToString(Object[] values, Object[] reversedValues) {
        return Arrays.equals(values, reversedValues);
    }

    public static void main(String[] args) {
        ZyxLinkedList<String> linkedList = new ZyxLinkedList();
        linkedList.add("zyx");
        linkedList.add("lly");
        linkedList.add("wbq");
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.add(0, "zyx");
        linkedList.add(0, "lly");
        linkedList.add(0, "wbq");
        System.out.println(linkedList);
    }
}


