package W2_3DerekTool;

public class paintingApplication {
    public static void main(String[] args) {
        Derek derek=new Derek();
        derek.hangPainting();
        Tool hammer = new Tool("hammer");
        derek.setTool(hammer);
        derek.hangPainting();




    }
}
