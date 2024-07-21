import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList {
    public static void main(String[] args) {

        LinkedList myll = new LinkedList();

        myll.add("Itonman");
        myll.add("THor");
        myll.add("Hulk");
        myll.add("Loki");

        // System.out.println(myll.get(1));

        myll.addLast("Gamora");
        myll.addFirst("Antman");

        myll.add(2, "Natasha");

        Iterator it = myll.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
       
        System.out.println("----------------");
        System.out.println("who at the top "+myll.peek());
        System.out.println("hey first one got out "+myll.poll());
        System.out.println("whos their standing at the last :"+myll.pop());
        System.out.println("----------------");

        Iterator it = myll.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}
