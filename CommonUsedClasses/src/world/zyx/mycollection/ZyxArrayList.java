package world.zyx.mycollection;

/**
 * @ClassName: ZyzArrayList
 * @Description: 自定义ArrayList
 * add方法
 * 数组扩容
 * set和get方法
 * 增加remove方法
 * @Author: Achilles
 * @Date: 12/12/2019  18:03
 * @Version: 1.0
 **/

public class ZyxArrayList<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ZyxArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ZyxArrayList(int capacity) {
        capacityAdd(capacity);
        elementData = new Object[capacity];
    }

    public void add(E ele) {
        capacityAdd(size + 1);
        elementData[size++] = ele;
    }

    public void set(int index, E ele) {
        capacityCheck(index);
        elementData[index] = ele;
    }

    public E get(int index) {
        capacityCheck(index);
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        capacityCheck(index);
        int movedNum = size - index - 1;
        if (movedNum > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        }
        elementData[--size] = null;
    }

    public void remove(E element) {
        for (int i = 0; i < size; i++) {//只比较第一个
            if (elementData[i].equals(element)) {
                remove(i);
                return;
            }
        }
        return;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i].toString()).append(",");
        }
        if (size == 0) {
            stringBuilder.append("]");
        } else {
            stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        }
        return stringBuilder.toString();
    }

    private void capacityAdd(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("数组下标错误" + capacity);
        } else if (capacity > elementData.length) {
            int newCapacity = elementData.length + (elementData.length >> 1);
            Object[] newElementData = new Object[newCapacity];
            System.arraycopy(elementData, 0, newElementData, 0, elementData.length);
            elementData = newElementData;
        }
    }

    public void capacityCheck(int capacity) {
        if (capacity < 0 || capacity > size) {
            throw new RuntimeException("数组下标错误" + capacity);
        }
    }

    public static void main(String[] args) {
        ZyxArrayList<String> list = new ZyxArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("zyx love wbq for the " + i + " time");
        }
        System.out.println(list);
        list.set(0, "测试");
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);
        list.remove("zyx love wbq for the 0 time");
        System.out.println(list);
        list.remove("zyx love wbq for the 99 time");
        System.out.println(list);
    }
}
