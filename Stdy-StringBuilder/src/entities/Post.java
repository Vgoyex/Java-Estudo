package entities;

import entities.Comment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<Comment>();
    SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " Likes - ");
        sb.append(formatData.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for(Comment data : comments){
            sb.append(data.getText()+"\n");
        }
        return sb.toString();

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Post() {
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
