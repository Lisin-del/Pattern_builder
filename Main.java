package pattern_builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setCarColor("black")
                .setCarName("audi")
                .setCountryName("germany")
                .setCarSize(343434)
                .setEngineVal(345)
                .build();

        System.out.println(car.toString());



    }
}
