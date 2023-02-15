public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Work PC");
        GitApp gitApp = new GitApp("GitHub", pc);
        KanbanApp kanbanApp = new KanbanApp("Trello", pc);
        IDE ide = new IDE("IntelliJ", pc);
        TV tv = new TV("My TV");
        PlayStation playStation = new PlayStation("PlayStation 5", tv);

        RoomFacade roomFacade = new RoomFacade(pc, gitApp, kanbanApp, ide, tv, playStation);

        // start working
        roomFacade.prepareWorkStation();
        // finish working
        roomFacade.finishedWork();

        // start playing
        roomFacade.prepareForPlayingGames();
        // finish playing
        roomFacade.closeGames();
    }
}