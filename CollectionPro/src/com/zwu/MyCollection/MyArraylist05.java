package com.zwu.MyCollection;

/*
 * 自定义实现一个ArrayList，体会底层原理
 * 增加数组扩容
 * 增加set和get方法
 * 增加数组边界检查
 * */

public class MyArraylist05<E> {
    private Object[] elementData;
    private int size;

    private static int DEFAULT_CAPACITY = 10;

    public MyArraylist05() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArraylist05(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("容器容量不能为负数");
        } else if (capacity == 0) {
            capacity = DEFAULT_CAPACITY;
        }
        elementData = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public void add(E element) {
        //什么时候扩容？
        if (size == elementData.length) {
            //扩容操作
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];//10-->10+10/2
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
        elementData[size++] = element;
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    public void set(E element, int index) {
        checkRange(index);
        elementData[index] = element;
    }

    public void checkRange(int index) {
        //索引合法判断[0,size)
        if (index < 0 || index > size - 1) {
            //不合法
            throw new RuntimeException();
        }
    }

    public void remove(E element) {
        //element，将它和所有元素挨个比较，获得第一个比较为true的，返回
        for (int i = 0; i < size; ++i) {
            if (element.equals(get(i))) {//容器中所有的比较操作都是用equals
                //将该元素移除
                remove(i);
            }
        }
    }

    public void remove(int index) {
        //a,b,c ---> a,c
        int numMoved = elementData.length - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
            elementData[size - 1] = null;
        }
        elementData[--size] = null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; ++i) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArraylist05<String> s1 = new MyArraylist05<>();
        s1.add("aa");
        s1.add("bb");
        for (int i = 0; i < 10; ++i) {
            s1.add("zz" + i);
        }
        System.out.println(s1);
        s1.set("dddd", 10);
        System.out.println(s1.get(10));
        s1.remove(3);
        System.out.println(s1);
        System.out.println(s1.isEmpty());
    }

}
