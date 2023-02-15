import javax.management.Descriptor;

public class TV {
    private String description;
    private boolean isOn = false;

    public TV(String description) {
        this.description = description;
    }

    public void on() {
        isOn = true;
        System.out.println(description + " is on");
    }

    public void  off() {
        isOn = false;
        System.out.println(description + " is off");
    }

    public boolean isOn() {
        return this.isOn;
    }
}
