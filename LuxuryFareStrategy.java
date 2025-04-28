public class LuxuryFareStrategy implements FareStrategy {
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        //additional 50% charged for luxury ride
        return vehicle.getFarePerKm() * distance * 1.50;
    }
}
