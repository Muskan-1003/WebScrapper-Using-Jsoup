import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.imdb.com/chart/top").timeout(6000).get();
//        Elements body = doc.getElementsByTag("li"); // No need for casting
//        System.out.println(body.size());//for extracting size

//        Elements posters = doc.select("img.ipc-image");//for extracting image
//
//        for (Element poster : posters) {
//            String img = poster.attr("src");
//            System.out.println(img);
//        }
//        Elements titles=doc.select("h3.ipc-title__text");
//        for(Element title:titles){
//            String titleText=title.text();
//            System.out.println(titleText);
//        }//for extracting title

        Elements ratings=doc.select("span.ipc-rating-star");
        for(Element Star:ratings){
            String StarText= Star.text();
            System.out.println(StarText);//for extracting rating
        }

    }
}
