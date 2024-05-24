package Uebung5;

public class Main {
    public static void main(String[] args) {
        ConcreteStapel<Integer> stapel = new ConcreteStapel<>();
        for(int i=0;i<10;i++){
            stapel.push(i);
        }
        System.out.println(stapel.toString());
    }
}
