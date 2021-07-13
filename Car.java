package pattern_builder;

public class Car {
    private String carName;
    private String carColor;
    private int engineVal;
    private int carSize;
    private String countryName;


    public static class Builder {
        private Car newCar;

        public Builder() {
            newCar = new Car();
        }

        public Builder setCarName(String carName) {
            newCar.carName = carName;
            return this;
        }

        public Builder setEngineVal(int engineVal) {
            newCar.engineVal = engineVal;
            return this;
        }

        public Builder setCarColor(String carColor) {
            newCar.carColor = carColor;
            return this;
        }

        public Builder setCarSize(int carSize) {
            newCar.carSize = carSize;
            return this;
        }

        public Builder setCountryName(String countryName) {
            newCar.countryName = countryName;
            return this;
        }

        public Car build() {
            if(newCar.carName == null || newCar.carColor == null || newCar.engineVal == 0 || newCar.carSize == 0 || newCar.countryName == null) {
                return null;
            }
            else {
                return newCar;
            }
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engineVal=" + engineVal +
                ", carSize=" + carSize +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
