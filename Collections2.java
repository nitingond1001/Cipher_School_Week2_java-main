import java.util.ArrayList;
import java.util.Comparator;

public class Collections2 {

    public static void main(String[] args) {
    ArrayList<String> states = new ArrayList<String>();
       
    states.add("california");
    states.add("Alabama");
    states.add("Alaska");
    states.add("Arkansas");

    System.out.println("ArrayList: "+states);

    String s = states.get(2);
    System.out.println("I got "+s);

    System.out.println("ArrayList Size "+states.size());

    // for(int i = 0; i<states.size(); i++){
    //     System.out.println(states.get(i));

    // }

    states.set(2, "Texas");
    System.out.println("After Updation : "+ states);

    String t = states.remove(3);

    System.out.println("States Removed is "+t);

    System.out.println("ArrayList After Deletion "+states);

    states.sort(Comparator.naturalOrder());

    System.out.println("ArrayList After Sorting "+states);


    System.out.println("Is NewYork There ? "+states.contains("newYork"));

    System.out.println("Texas is at "+states.indexOf("Texas")+" index");

    System.out.println("Is List Empty?" +states.isEmpty());

    states.removeAll(states);

    System.out.println("Is List Empty?" +states.isEmpty());
    }
}

