public class SharedFareStrategy implements FareStrategy {
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        // 50% off for shared ride
        return vehicle.getFarePerKm() * distance * 0.50;
    }
}
