public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(getName() + " takes off in the sky.");
    }

    @Override
    public int ascend(int meters) {
        altitude += meters;
        System.out.println(getName() + " flies upward, altitude: " + altitude);
        return altitude;
    }

    @Override
    public int descend(int meters) {
        altitude -= meters;
        if (altitude > 10) {
            System.out.println(getName() + " flies downward, altitude: " + altitude);
        } else if (altitude <= 10 && altitude > 0) {
            System.out.println(getName() + " is too high, it can't land.");
        } else {
            System.out.println(getName() + " lands on the ground.");
            altitude = 0;
        }
        return altitude;
    }

    @Override
    public void land() {
        if (altitude == 0) {
            System.out.println(getName() + " is already on the ground.");
        } else {
            System.out.println(getName() + " lands on the ground.");
            altitude = 0;
        }
    }

    @Override
    public void glide() {
        System.out.println(getName() + " glides into the air.");
    }
}
