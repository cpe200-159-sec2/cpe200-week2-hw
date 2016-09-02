package cpe200.week2;

public class LinkedListTest {

    public static void main(String[] args) {
	    PList l = new PList();

        System.out.println("List Empty?: "+ l.isEmpty());
        l.pushToHead('I');
        l.pushToHead('S');
        l.pushToHead('N');
        l.pushToHead('E');
        l.pushToHead('#');
        l.pushToHead('3');



        System.out.println("List Empty?: "+ l.isEmpty());
        System.out.println("List Size: "+l.getSize());
        System.out.print(" "); l.printForward();
        System.out.print(" "); l.printBackward();

        System.out.println("Found 'I' in list?: "+ l.search('I'));
        System.out.println("Pop head: "+l.popHead());

        System.out.print(" "); l.printBackward();

        System.out.println("Pop tail: "+l.popTail());

        System.out.print(" "); l.printForward();
        System.out.print(" "); l.printBackward();

        System.out.println("Found '3' in list?: "+ l.search('3'));
        System.out.println("List Size: "+l.getSize());
    }
}
