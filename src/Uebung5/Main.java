package Uebung5;


import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MengeDynArray<Integer> dynArray = new MengeDynArray<>();
        SchlangeMitDynArray<Integer> schlange = new SchlangeMitDynArray<>();

        for(int i = 0; i < 10; i++) {
            dynArray.insert(i);
            schlange.enQ(i);
        }
        System.out.println(dynArray.toString());
        System.out.println(dynArray.get());
        System.out.println(dynArray.size());
        System.out.println("--------------------");
        System.out.println(schlange.toString());
        schlange.deQ();
        schlange.deQ();
        System.out.println(schlange.toString());
    }
}
