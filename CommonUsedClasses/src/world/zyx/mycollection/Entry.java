package world.zyx.mycollection;

/**
 * @ClassName: Entry
 * @Description: 自定义HashMap的节点
 * @Author: Achilles
 * @Date: 14/12/2019  11:25
 * @Version: 1.0
 **/

public class Entry<K,V> {

    int hash;
    K key;
    V value;
    Entry<K, V> next;



}
