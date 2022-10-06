package task3;

public class Distance {
    private static double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        Distance.distance = distance;
    }

    public void print () {
        System.out.println("Method print");
    }

    //nested class
    static class Converter {

        public double convertFromMeterToKilometer () {
        return distance/1000;
        }

        public double convertFromKilometerToMile () {
            return distance/1000*0.6214;
        }

        public double convertFromKilometerToYard () {
            return distance/1000*1094;
        }

    }
}
