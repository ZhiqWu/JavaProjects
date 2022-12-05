package com.zwu.collection;

/*
 * 自定义HashMap
 * 实现了put方法增加键值对，并解决了键重复的时候覆盖相应的节点。
 * 重写toString方法，方便查看map中的键值对
 * */

public class MyHashMap02 {
    Node[] table;               //bucket数组
    int size;                   //存放键值对的个数

    public MyHashMap02() {
        table = new Node[16];   //长度一般定义成2的整数幂

    }

    public void put(Object key, Object value) {
        //定义了新的节点对象
        Node newNode = new Node();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.key = key;
        newNode.value = value;

        Node temp = table[newNode.hash];
        Node iterLast = null;           //正在遍历的最后一个元素
        Boolean keyRepeat = false;
        if (temp == null) {
            //此处数组元素为空，则直接将新节点放进去
            table[newNode.hash] = newNode;
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
            }
        }
    }

    @Override
    public String toString() {
        //{10:aa,20:bb}


        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < table.length; ++i) {//遍历bucket数组
            Node temp = table[i];
            while (temp != null) {//遍历链表
                sb.append(temp.key + ":" + temp.value + ",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length() - 1, '}');
        return sb.toString();
    }

    public static int myHash(int v, int length) {
        System.out.println("hash in MyHash: " + (v & (length - 1))); //直接位运算，效率高
        System.out.println("hash in MyHash: " + (v % (length - 1))); //取模运算，效率低
        return v & (length - 1);
    }

    public static void main(String[] args) {
        MyHashMap02 m = new MyHashMap02();
        m.put(10, "qq");
        m.put(20, "ww");
        m.put(30, "ee");
        m.put(30, "ll");
        m.put(53, "老大");
        m.put(69, "老二");
        m.put(83, "老三");

        System.out.println(m);

    }


}

