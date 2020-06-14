package test.dome.sample;

import java.util.LinkedList;
import java.util.function.Function;

public class Train {
    private final LinkedList<Integer> wagons = new LinkedList<>();

    public Train(int wagonCount, Function<Integer, Integer> fillWagon) {
        
        for (int i = 0; i < wagonCount; i++) {
            this.wagons.add(fillWagon.apply(i));
        }
    }

    public int peekWagon(int wagonIndex) {
        return this.wagons.get(wagonIndex);
    }
    
    public static void main(String[] args) {
        Train train = new Train(100, wagonIndex -> wagonIndex);

        for (int i = 0; i < 100; i++) {
            System.out.println("Wagon: " + i + ", cargo: " + train.peekWagon(i));
        }
    }
}
