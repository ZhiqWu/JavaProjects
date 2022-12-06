package com.zwu.collection;

/*
 * 自定义HashMap
 * 实现了put方法增加键值对，并解决了键重复的时候覆盖相应的节点。
 * 重写toString方法，方便查看map中的键值对
 * 实现get方法，根据key值得到value
 * 增加size++
 * 增加泛型
 * */

public class MyHashMap04<K, V> {
    Node2[] table;               //bucket数组
    int size;                   //存放键值对的个数

    public MyHashMap04() {
        table = new Node2[16];   //长度一般定义成2的整数幂

    }

    public V get(K key) {
        int hash = myHash(key.hashCode(), table.length);
        Object value = null;
        if (table[hash] != null) {
            Node2 temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {//如果相等，则说明找到了键值对
                    value = (V) temp.value;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
        return (V) value;
    }

    public void put(K key, V value) {
        //如果要完善还要考虑数组扩容
        //定义了新的节点对象
        Node2 newNode = new Node2();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.key = key;
        newNode.value = value;

        Node2 temp = table[newNode.hash];
        Node2 iterLast = null;           //正在遍历的最后一个元素
        Boolean keyRepeat = false;
        if (temp == null) {
            //此处数组元素为空，则直接将新节点放进去
            table[newNode.hash] = newNode;
            size++;
        } else {
            //此处元素不为空，则遍历链表
            while (temp != null) {
                //判断key如果重复，则覆盖
                if (temp.key.equals(key)) {
                    keyRepeat = true;
                    System.out.println("key重复了！");
                    temp.value = value;//只是覆盖value即可，其他的值保持不变。
                    break;
                } else {
                    //key不重复，则遍历下一个。
                    iterLast = temp;
                    temp = temp.next;
                }
            }
            if (keyRepeat == false) {//没有发生key重复的情况，则添加到链表最后
                iterLast.next = newNode;
                size++;
            }
        }
    }

    @Override
    public String toString() {
        //{10:aa,20:bb}


        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < table.length; ++i) {//遍历bucket数组
            Node2 temp = table[i];
            while (temp != null) {//遍历链表
                sb.append(temp.key + ":" + temp.value + ",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length() - 1, '}');
        return sb.toString();
    }

    public static int myHash(int v, int length) {
        //System.out.println("hash in MyHash: " + (v & (length - 1))); //直接位运算，效率高
        //System.out.println("hash in MyHash: " + (v % (length - 1))); //取模运算，效率低
        return v & (length - 1);
    }

    public static void main(String[] args) {
        MyHashMap04<Integer, String> m = new MyHashMap04<>();
        m.put(10, "qq");
        m.put(2000, "nihao");
        m.put(30, "ee");
        m.put(30, "ll");
        m.put(53, "老大");
        m.put(69, "老二");
        m.put(83, "老三");
        System.out.println(m.get(83));

        System.out.println(m);

    }


}

