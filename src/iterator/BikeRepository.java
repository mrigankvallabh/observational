package iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {
    private String[] bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new String[10];
        this.index = 0;
    }

    public void addBike(String bike) {
        if(index == bike.length()) {
            String[] largerBikeArray = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikeArray, 0, bikes.length);
            bikes = largerBikeArray;
            largerBikeArray = null;
        }
        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove() not supported!");
            }
        };
    }

}
