import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList<Integer> linked = new LinkedList<Integer>();

        long startime;
        long elapsedtime;
        long endtime;

        for (int i = 0; i < 1000000; i++) {
            array.add(i);
            linked.add(i);
        }
        // A R R A Y  L I S T
        startime = System.nanoTime();

        //array.get(0); 13500ns
        //array.get(500000); 13300ns
        //array.get(999999); 14100ns
        //array.remove(0); 933200ns
        //array.remove(500000); 450200ns
        //array.remove(999999); 20400ns

        endtime = System.nanoTime();

        elapsedtime = endtime - startime;
        System.out.println("[ARRAYLIST]    Elapsed time:\t" + elapsedtime + "ns");

        // L I N K E D  L I S T
        startime = System.nanoTime();

        //linked.get(0); 16800ns
        //linked.get(500000); 5854900ns
        //linked.get(999999); 14400ns
        //linked.remove(0); 19300ns
        //linked.remove(500000); 5925900ns
        //linked.remove(999999); 14500ns

        endtime = System.nanoTime();

        elapsedtime = endtime - startime;
        System.out.println("[LINKEDLIST]   Elapsed time:\t" + elapsedtime + "ns");
    }
}
