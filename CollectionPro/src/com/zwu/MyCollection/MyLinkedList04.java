package com.zwu.MyCollection;


/*
 * 定义一个链表
 * 增加remove
 * 增加插入节点
 * 增加小的封装和泛型
 * */
public class MyLinkedList04<E> {
    private Node first;
    private Node last;
    private int size;


    public void remove(int index) {
        checkRange(index);
        Node temp = getNode(index);
        if (temp != null) {
            Node up = temp.previous;
            Node down = temp.next;
            if (up != null) {
                up.next = down;
            }
            if (down != null) {
                down.previous = up;
            }

            if (index == 0) {//被删除的是第一个节点
                first = down;
            }
            if (index == size - 1) {//被删除的是最后一个节点
                last = up;
            }
            size--;
        }

    }

    //[]
    //["a","b","c"]
    public void add(E element) {
        Node node = new Node(element);
        if (first == null) {
//            node.previous = null;
//            node.next=null;
            first = node;
            last = node;
        } else {
            node.previous = last;
            node.next = null;
            last.next = node;
            last = node;
        }
        size++;
    }

    public void add(int index, E element) {
        checkRange(index);
        Node newNode = new Node(element);
        Node temp = getNode(index);
        if (temp != null) {
            Node up = temp.previous;
            up.next = newNode;
            newNode.previous = up;
            newNode.next = temp;
            temp.previous = newNode;
        }

    }

    //[a,b,c,d,e,f] c 2
    public Object get(int index) {

        checkRange(index);
        Node temp = getNode(index);
        return temp != null ? temp.element : null;
    }

    private void checkRange(int index){
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引数字不合法：" + index);
        }
    }

    public Node getNode(int index) {
        Node temp;
        if (index < (size >> 1)) {
            temp = first;
            for (int i = 0; i < index; ++i) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size - 1; i > index; --i) {
                temp = temp.previous;
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        //[a,b,c] first=a,last=c
        //a,b,c
        Node temp = first;
        while (temp != null) {
            sb.append(temp.element + ",");
            temp = temp.next;
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        MyLinkedList04<String> list = new MyLinkedList04<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
        list.add(3, "小刘");
        System.out.println(list);
    }

}
