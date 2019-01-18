package W2_5EditorMagazine;

import W2_1ArticlePrinter.Article;

public class Editor {


    public Magazine writeMagazine(){
        Magazine magazine = new Magazine("First Magazine");

        magazine.add(new Article("Article 1", "Text 1"));
        magazine.add(new Article("Article 2", "Text 2"));
        magazine.add(new Article("Article 3", "Text 3"));

        return magazine;



    }
}
