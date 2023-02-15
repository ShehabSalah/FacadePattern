public class RoomFacade {
    private PC pc;
    private GitApp gitApp;
    private KanbanApp kanbanApp;
    private IDE ide;
    private TV tv;
    private PlayStation playStation;

    public RoomFacade(PC pc, GitApp gitApp, KanbanApp kanbanApp, IDE ide, TV tv, PlayStation playStation) {
        this.pc = pc;
        this.gitApp = gitApp;
        this.kanbanApp = kanbanApp;
        this.ide = ide;
        this.tv = tv;
        this.playStation = playStation;
    }

    public void prepareWorkStation() {
        this.pc.on();
        this.kanbanApp.open();
        this.gitApp.open();
        this.ide.open();
    }

    public void finishedWork() {
        this.ide.close();
        this.gitApp.close();
        this.kanbanApp.close();
        this.pc.off();
    }

    public void prepareForPlayingGames() {
        this.tv.on();
        this.playStation.on();
    }

    public void closeGames() {
        this.playStation.off();
        this.tv.off();
    }
}
