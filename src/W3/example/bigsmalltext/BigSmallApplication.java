package W3.example.bigsmalltext;

public class BigSmallApplication {

    public static void main(String[] args) {
        String text = "intake#4 is the best";

        BigSmallLeterChanger changer = new BigSmallLeterChanger();
        String changed = changer.change(text);

        System.out.println(text);
        System.out.println(changed);

        String randomlyChanged = changer.changeRandomly(text);

        System.out.println(text);
        System.out.println(randomlyChanged);
    }

}
