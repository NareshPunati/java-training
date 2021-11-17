package practice2;

import java.util.List;

public class Posts {

    private int postId;
    private String heading;
    private String description;
    private List<Comments> com;

    public Posts(int postId, String heading, String description, List<Comments> com) {
        this.postId = postId;
        this.heading = heading;
        this.description = description;
        this.com = com;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Comments> getCom() {
        return com;
    }

    public void setCom(List<Comments> com) {
        this.com = com;
    }
}
