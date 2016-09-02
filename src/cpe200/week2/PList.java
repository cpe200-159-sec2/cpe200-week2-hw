package cpe200.week2;

public class PList {

    public PList() {
        head = tail = null;
    }

    public void pushToHead(char i) {
        head = new PNode(i, head, null);
        if (null == tail) {
            tail = head;
        } else {
            head.next.prev = head;
        }
        size += 1;
    }

    public void pushToTail(char i) {
        tail = new PNode(i, null, tail);
        if (null == head) {
            head = tail;
        } else {
            tail.prev.next = tail;
        }
        size += 1;
    }

    public char popHead() {
        char i = head.data;
        PNode tmp = head;

        if (tail == head) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
            tmp.next = null;
        }

        size -= 1;

        return i;
    }

    public char popTail() {
        char i = tail.data;
        PNode tmp = tail;

        if (head == tail) {
            tail = head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            tmp.prev = null;
        }

        size -= 1;

        return i;
    }

    public boolean search(char i) {
        PNode node = head;
        while(null != node) {
            if (i == node.data) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return (null == head);
    }

    public void printForward() {
        PNode tmp = head;

        while (null != tmp) {
            System.out.print(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        PNode tmp = tail;

        while (null != tmp) {
            System.out.print(tmp.data);
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
