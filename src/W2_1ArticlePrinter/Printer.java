package W2_1ArticlePrinter;

//import W2_5EditorMagazine.Magazine;

public class Printer {

    public void print(Article article){

        System.out.println("the title is "+article.getGetTitle());
        System.out.println("the text is "+article.getGetText());
    }

//    public void printMagazine(Magazine magazine) {
//        //System.out.println(magazine.getName());
//        // define list of articles and print every single one out .getArticles()
//        for (Article article : magazine.getArticles()) {
//            System.out.println(article.getGetTitle() + " " + article.getGetText());

       // }
    }



