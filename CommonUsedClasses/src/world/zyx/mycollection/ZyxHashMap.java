package world.zyx.mycollection;

/**
 * @ClassName: ZyxHashMap
 * @Description: 自己实现HashMap
 * hash函数,泛型
 * put方法增加键值对，解决键重复的问题
 * 重写toString方法
 * 增加get方法
 * @Author: Achilles
 * @Date: 14/12/2019  11:23
 * @Version: 1.0
 **/

public class ZyxHashMap<K, V> {

    Entry<K,V>[] table;           //位桶数组，bucket
    int size;

    public ZyxHashMap() {
        table = new Entry[16];  //长度一般定义为2的整数次幂
    }

    public void put(K key, V value) {//还需要考虑数组扩容问题
        Entry<K,V> newNode = new Entry<>();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Entry<K, V> temp = table[newNode.hash];
        if (temp == null) {
            table[newNode.hash] = newNode;
        } else {
            //如果不为空，则遍历链表，还要考虑是否有重复的键
            while (temp.next != null) {
                if (temp.key.equals(newNode.key)) {
                    //temp = newNode;这种写法是有问题的，因为newNode在函数执行完就会被释放
                    temp.value = newNode.value;
                    return;
                } else {
                    temp = temp.next;
                }
            }
            temp.next = newNode;
        }
        size++;
    }

    private int myHash(int v, int length) { //数组长度为2的整数次幂
        return v & (length - 1);
    }

    public V get(K key) {
        int hash = myHash(key.hashCode(), table.length);
        Entry<K, V> temp = table[hash];
        if (temp == null) {
            return null;
        } else {
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        if (size != 0){
            Entry<K, V> temp = table[0];
            if (temp != null) {
                for (int i = 0; i < table.length; i++) {
                    temp = table[i];
                    while (temp != null) {
                        stringBuilder.append("(k=").append(temp.key).append(",v=").append(temp.value).append("),");
                        temp = temp.next;
                    }
                }
            }
            stringBuilder.setCharAt(stringBuilder.length() - 1, '}');
        }else {
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ZyxHashMap<Integer, String> hashMap = new ZyxHashMap<>();
        for (int i = 0; i < 50; i++) {
            hashMap.put(i, i + "zyx");
        }
        hashMap.put(20, "wbq");
        System.out.println(hashMap.toString());
        System.out.println(hashMap.get(20));
    }
}
