package cpe200.week2;

public class PList {

    public PList() {
        head = tail = null;
    }

    public void pushToHead(char i) {
        head = new PNode(i, head, null);
        if (tail == null)
            tail = head;
        else
            head.next.prev = head;
        size++;
    }

    public void pushToTail(char i) {
        if (head == null) {
            head = new PNode(i, null, tail);
            head = tail;
        } else {
            tail = new PNode(i, null, tail);
            tail.prev.next = tail;
        }
        size++;
    }

    public char popHead() {
        char i = head.data;
        PNode tmp = head;

        if (head == tail)
            head = tail = null;
        else {
            head = head.next;
            head.prev = null;
            tmp.next = null;
        }

        size--;

        return i;
    }

    public char popTail() {

    }

    public boolean search(char i) {
        PNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
            char i = tmp.data;
            tmp.prev.next = null;
            size--;
            return i;
        }

    public boolean isEmpty() {
        return (head == null);
    }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        PNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        System.out.print(tmp.data);
        while (tmp != head) {
            System.out.print(tmp.prev.data);
            tmp = tmp.prev;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size = 0;
}
