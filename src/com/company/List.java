package com.company;

public class List {

private class Node {
    public double value;
    public Node next;

    public Node(double value, Node next) {
        this.value = value;
        this.next = next;
    }
}

    private Node head = null;
    private Node tail = null;
    protected int size = 0;


    public boolean checkEmpty() {
        return head == null;
    }

    public void addFirst(double value) {
        head = new Node(value, head);
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void addLast(double value) {
        Node temp = new Node(value, null);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void removeLast() throws Exception {
        checkEmpty();
        if (size == 1) {
            head = tail = null;
        } else {
            for (Node curr = head; ; curr = curr.next) {
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
            throw new IndexException("Incorrect! Index is an invalid range!");
        }
        Node curr = head;
        while (index != 0) {
            index--;
            curr = curr.next;
        }
        return curr.value;
    }

    int size() {
        return size;
    }

    public void removeAt(double key) throws Exception {
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.value == key) {
                if (tail == curr.next) {
                    tail = curr;
                }
                curr.next = curr.next.next;
                size--;
                return;
            }
            curr = curr.next;
        }
        if (curr.value != key) {
            throw new KeyException("You entered a value that isn't in the list! " + "YOU ENTERED: " + key);
        }

    }

    public void removeFromTo(int index1, int index2) throws Exception {
        int currIndex = index1;
        Node curr = head;
        int begin = 0;

        if (index1 < 0 || index1 > size - 1 && index2 < 0 || index2 > size - 1) {
            throw new IndexException("Incorrect! One or both indexes are in an invalid range!");
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
        }
    }

    public double[] toArray() {
        double[] array = new double[size];
        Node list = head;

        for (int i = 0; list != null; i++) {
            array[i] = list.value;
            list = list.next;
        }

        return array;
    }

    Node getHead() {
        return head;
    }

    Node getTail() {
        return tail;
    }

    double getHeadNextValue() {
        return head.next.value;
    }

    double getHeadValue() {
        return head.value;
    }

    double getTailValue() {
        return tail.value;
    }

}



