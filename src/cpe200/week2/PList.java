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
        // implement your code here
        tail = new PNode(i,null,tail);
        if (head==null )
            tail = head;
        else
            tail.prev.next=tail;
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
        // implement your code here
        char i= tail.data;
        if(tail==head){
            head = tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return i;
    }

    public boolean search(char i) {
        // implement your code here
        PNode tmp =head;
        for(int j=0;j<=size;j++) {
            if (i == tmp.data) return true;
            tmp = tmp.next;
        }
        return false;
    }

    public boolean isEmpty() { return (head == null); }

    public void printForward() {
        PNode tmp = head;

        while (tmp != null) {
            // implement your code here
            System.out.print(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        // implement your code here
        PNode tmp = tail;
        while(tmp != null){
            System.out.print(tmp.data);
            tmp=tmp.prev;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
