package cpe200.week2;

public class PList {

    public PList() { head = tail = null; }

    public void pushToHead(char i) {
        head = new PNode(i, head, null);
        if (tail==null)
            tail = head;
        else
            head.next.prev = head;
        size++;
    }

    public void pushToTail(char i) {
        tail = new PNode(i, tail, null);
        if (head ==null)
            head = tail;
        else
            tail.next.prev = tail;
        size++;
    }

    public char popHead() {
        char i=head.data;
        PNode tmp = head;

        if (head==tail)
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
        char i=tail.data;
        PNode tmp = tail;

        if (head==tail)
            head = tail = null;
        else {
            tail = tail.next;
            tail.prev = null;
            tmp.next = null;
        }

        size--;

        return i;
    }

    public boolean search(char i) {
        PNode H = head;
        for (int j = 0; j <= size; j++) {
            if (H.data == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() { return (head == null); }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        PNode tmp = tail;
        System.out.print(tmp.data);
        tmp = tmp.prev;
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
