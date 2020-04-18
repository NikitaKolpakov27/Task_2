package com.company;

public class List {

private class LinkList {
    public double value;
    public LinkList next;

    public LinkList(double value, LinkList next) {
        this.value = value;
        this.next = next;
    }
}

    protected double[] array;
    protected LinkList head = null;
    protected LinkList tail = null;
    protected int size = 0;


    public boolean checkEmpty() {
        return head == null;
    }

    public void addFirst(double value) {
        head = new LinkList(value, head);
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addLast(double value) {
        LinkList temp = new LinkList(value, null);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void printList() {
        LinkList temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void removeLast() throws Exception {
        checkEmpty();
        if (size == 1) {
            head = tail = null;
        } else {
            for (LinkList curr = head; ; curr = curr.next) {
                if (curr.next.next == null) {
                    tail = curr;
                    tail.next = null;
                    break;
                }
            }
        }
        size--;
    }

    public double get(int index) throws Exception {
        if (index < 0 || index > size - 1) {
            throw new IndexException("Incorrect index");
        }
        LinkList curr = head;
        while (index != 0) {
            index--;
            curr = curr.next;
        }
        return curr.value;
    }

    int size() {
        return size;
    }

    public void removeAt(double key) {
        LinkList curr = head;
        while (curr.next != null) {
            if (curr.next.value == key) {
                if (tail == curr.next) {
                    tail = curr;
                }
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    public void removeFromTo(int index1, int index2) throws Exception {
        int currIndex = index1;
        LinkList curr = head;
        int begin = 0;

        if (index1 < 0 || index1 > size - 1 && index2 < 0 || index2 > size - 1) {
            throw new IndexException("Incorrect index!");
        } else if (index1 > index2) {
            throw new IndexException("Incorrect! First index is bigger than second index!");
        } else if (index1 == index2) {
            throw new IndexException("Incorrect! First index is equal to the second index!");
        }

        while (begin != currIndex) {
            curr = curr.next;
            begin++;
        }

        while (currIndex <= index2) {
            curr.value = 0;
            curr = curr.next;
            currIndex++;
            removeAt(0);
            size--;
        }
    }

    double[] toArray() {
        array = new double[size];
        LinkList list = head;

        for (int i = 0; list != null; i++) {
            array[i] = list.value;
            list = list.next;
        }

        return array;

    }
}



