import java.util.Iterator;

import iterator.BikeRepository;

public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository bikeRepo = new BikeRepository();

        bikeRepo.addBike("Royal Enfield Bullet 350");
        bikeRepo.addBike("Hero Honda Splendor");
        bikeRepo.addBike("Yamaha RX100");

        Iterator<String> bikeIterator = bikeRepo.iterator();

        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
            // bikeIterator.remove();
        }

        for (String bike : bikeRepo) {
            System.out.println(bike);
        }
    }
}
