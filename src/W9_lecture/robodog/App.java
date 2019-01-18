package W9_lecture.robodog;

import java.util.List;

public class App {


    private static Summarizer summarizer = new Summarizer();
    public static void main(String[] args) {
        String filePath = "W9_lecture/robodog/robodog.txt";
        List<String> tricks = summarizer.findUniqueTricks(filePath);
        System.out.println(tricks);
    }


}
