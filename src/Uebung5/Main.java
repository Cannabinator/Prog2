package Uebung5;

public class Main {
    public static void main(String[] args) {
        Integer[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        // ungerade aufsteigend
        // gerade absteigend
        SnakeIterator<Integer> snakeIterator = new SnakeIterator<>(a);
        System.out.println("xxxxxxxxxxxxxxxx");
        while(snakeIterator.hasNext()){
            System.out.println(snakeIterator.next()+" ");
        }
    }
}
