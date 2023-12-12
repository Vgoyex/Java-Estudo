import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date moment = new Date();
        String content = "I`m going to visit this wonderful country!";
        String title = "Traveling to New Zeland";
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that`s awesome!");
        Post post = new Post(moment,title,content,12);
        post.addComment(c1);
        post.addComment(c2);
        System.out.println("\n"+post);
    }
}