package W2_1ArticlePrinter;

public class PrintAplication {

    public static void main(String[] args) {
              Article article = new Article("Badi's Life","Badi is the best in logistics.");
        Printer printer=new Printer();
        printer.print(article);
    }
}
