package W2_5EditorMagazine;

import W2_1ArticlePrinter.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String name;
    private List<Article> articles = new ArrayList<>();

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Article article) {
        articles.add(article);
    }

    public List<Article> getArticles() {

        return articles;
    }

    public static void printMagazine(Magazine magazine) {
        System.out.println(magazine.getName());
        // define list of articles and print every single one out .getArticles()
        for (Article article : magazine.getArticles()) {
            System.out.println(article.getGetTitle() + " " + article.getGetText());

        }
    }
}



