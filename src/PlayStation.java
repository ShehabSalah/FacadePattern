public class PlayStation {
    private final String description;
    private final TV tv;
    private boolean isOn = false;

    public PlayStation(String description, TV tv) {
        this.description = description;
        this.tv = tv;
    }

    public void on() {
        if(tv != null && !tv.isOn())
            tv.on();

        this.isOn = true;
        System.out.println(description + " is on");
    }

    public void off() {
        this.isOn = false;
        System.out.println(description + " is off");
    }

    public boolean isOn() {
        return this.isOn;
    }
}
