import java.util.ArrayList;
import java.util.List;

public class RideMatchingSystem {
    private List <Driver> availableDrivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy) {
        if (availableDrivers.isEmpty()) {
            passenger.notify("No Drivers are available.");
            return;
        }
        //find the nearest driver
        Driver nearestDriver = findNearestDriver(passenger.getLocation());

        //mediator
        availableDrivers.remove(nearestDriver);
        // passenger.notify("Ride scheduled successfully. Your Driver is "+nearestDriver);
        Ride ride = new Ride(passenger, nearestDriver, distance, fareStrategy);
        //Calc fare
        ride.calculateFare();

        passenger.notify("Passenger Notification => Ride scheduled with fare of Rs."+ride.getFare()+". Your Driver is "+nearestDriver.getName());
        nearestDriver.notify("Driver Notification => You have a new ride request with Rs."+ride.getFare()+". Your Passenger is "+passenger.getName());

        //Change the status of the ride
        ride.updateStatus(RideStatus.ONGOING);

        //Change the status of the ride after ride is finished
        ride.updateStatus(RideStatus.COMPLETED);
        availableDrivers.add(nearestDriver);
        return;
    }

    private Driver findNearestDriver(Location passengerLocation) {
        Driver assignedDriver = null;
        double minDist = Double.MAX_VALUE;

        for (Driver driver : availableDrivers) {
            double distance = driver.getLocation().calcDistance(passengerLocation);
            if (distance < minDist) {
                minDist = distance;
                assignedDriver = driver;
            }
        }
        return assignedDriver;
    }
}
