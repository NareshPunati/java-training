package practice;

public class Posts {

    private int postId;
    private String heading;
    private String description;

    public Posts(int postId, String heading, String description) {
        this.postId = postId;
        this.heading = heading;
        this.description = description;
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
}
