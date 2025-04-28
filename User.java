public abstract class User {
    protected String name;
    protected Location location;
    protected String email;

    public User (String name, String email, Location location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }

    public void setLocation(Location location) {
        this.location =location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail(){
        return email;
    }

    public abstract void notify(String msg);
}
