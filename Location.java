public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double calcDistance(Location two){
        //Euclidean Distance
        double dx = this.getLatitude() - two.getLatitude();
        double dy = this.getLongitude() - two.getLongitude();
        dx = dx * dx;
        dy = dy * dy;
        return Math.sqrt(dx + dy);
    }
}
