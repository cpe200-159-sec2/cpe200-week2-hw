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
        
        tail = new PNode(i, null, tail);
        if( head == null )
            head = tail;
        else
            tail.prev.next = tail;
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


        if (head==tail)
            tail = head = null;
        else {

            tail.prev.next = null;
            tail = tail.prev;

        }
        size--;


        return i;


    }

    public boolean search(char i) {

        PNode tmp = head;
        while(true){
            if(tmp.data == i) return true;

            if(tmp.next == null) return false;
            tmp = tmp.next;
        }

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
        while( tmp!= null){
            System.out.print(tmp.data);
            tmp = tmp.prev;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    private PNode head, tail;
    private int size=0;
}
