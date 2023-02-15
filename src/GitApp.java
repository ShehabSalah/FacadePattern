public class GitApp {
    private final String description;
    private final PC pc;
    private boolean isOpen = false;

    public GitApp(String description, PC pc) {
        this.description = description;
        this.pc = pc;
    }

    public void open() {
        if (!pc.isOn())
            pc.on();

        isOpen = true;
        System.out.println(description + " opened");
    }

    public void close() {
        isOpen = false;
        System.out.println(description + " closed!");
    }

    public boolean isOpen() {
        return this.isOpen;
    }
}
