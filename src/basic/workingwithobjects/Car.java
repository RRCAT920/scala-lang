package basic.workingwithobjects;

/**
 * @author huzihao
 * @since 2020/12/10 20:20
 */
public class Car {
    private final int year;
    private int miles;

    public Car(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public void drive(int distance) {
        miles += Math.abs(distance);
    }
}
