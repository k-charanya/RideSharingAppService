public class Client {
    public static void main(String[] args) {
        Location loc1 = new Location(12.647, 17.653);
        Location loc2 = new Location(74.3337, 22.6);
        Location loc3 = new Location(76.6376, 46.9244);

        //Create Vehicles
        Vehicle car = new Car("TG01CP8333");
        Vehicle bike = new Bike("TG01VX0049");

        //Create Drivers
        Driver driver1 = new Driver("Manish", "manish@rideshare.com", loc2, car);
        Driver driver2 = new Driver("Akash", "akash@rideshare.com", loc3, bike);

        //Create Passengers
        Passenger passenger1 = new Passenger("Charanya", "cherry@ridepassenger.com", loc1);
        Passenger passenger2 = new Passenger("Sureka", "sureak@ridepassenger.com", loc3);

        //Ride Sharing test
        RideMatchingSystem ridematch = new RideMatchingSystem();
        ridematch.addDriver(driver1);
        ridematch.addDriver(driver2);
        System.out.println("\n");
        ridematch.requestRide(passenger1, 10, new StandardFareStategy());
        System.out.println("\n");
        ridematch.requestRide(passenger2, 25, new LuxuryFareStrategy());
    }
}
