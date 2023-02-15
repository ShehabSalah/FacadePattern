public class PC {
    private final String description;
    private KanbanApp kanbanApp;
    private GitApp gitApp;
    private IDE ide;
    private boolean isOn = false;

    public PC(String description) {
        this.description = description;
    }

    public void on() {
        this.isOn = true;
        System.out.println(description + " on");
    }

    public void off() {
        if (kanbanApp != null && kanbanApp.isOpen())
            kanbanApp.close();

        if (gitApp != null && gitApp.isOpen())
            gitApp.close();

        if (ide != null && ide.isOpen())
            ide.close();

        this.isOn = false;
        System.out.println(description + " off");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setKanbanApp(KanbanApp kanbanApp) {
        this.kanbanApp = kanbanApp;
    }

    public void setGitApp(GitApp gitApp) {
        this.gitApp = gitApp;
    }

    public void setIde(IDE ide) {
        this.ide = ide;
    }

    public void openKanbanApp() {
        this.kanbanApp.open();
    }

    public void openGitApp() {
        this.gitApp.open();
    }

    public void openIDEApp() {
        this.ide.open();
    }

    public void closeKanbanApp() {
        this.kanbanApp.close();
    }

    public void closeGitApp() {
        this.gitApp.close();
    }

    public void closeIDEApp() {
        this.ide.close();
    }
}
