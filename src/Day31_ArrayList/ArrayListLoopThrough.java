package Day31_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoopThrough {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Portakal");
        meyveler.add("Elma");
        meyveler.add("Armut");

        //Loop through-traverse of an ArrayList

        //1.For loop
        System.out.println("Traversing ArrayList with for...loop");
        for (int i = 0; i < meyveler.size(); i++) {
            System.out.println("meyveler.get(i) = " + meyveler.get(i));
        }
        System.out.println("-------------------------");

        //2.For each loop
        System.out.println("Traversing ArrayList with for each loop");
        for(String meyve: meyveler){
            System.out.println("eleman = " + meyve);
        }
        System.out.println("-------------------------");

        //3.While loop
        System.out.println("Traversing ArrayList with while loop");
        int i = 0;
        while (i < meyveler.size()){
            System.out.println("meyveler.get(i) = " + meyveler.get(i));
            i++;
        }
        System.out.println("-------------------------");

        //while loop- loop through reverse order
        System.out.println("Traversing ArrayList with while loop in reverse order");
        int j = meyveler.size()-1;
        while (j >= 0){
            System.out.println("meyveler.get(i) = " + meyveler.get(j));
            j--;
        }
        System.out.println("-------------------------");

        //4.Iterator
        System.out.println("Traversing ArrayList with Iterator");
        Iterator itr = meyveler.iterator(); // to get the Iterator

        while (itr.hasNext()){
            System.out.println("itr.next() = " + itr.next());
        }
        System.out.println("-------------------------");
    }
}
