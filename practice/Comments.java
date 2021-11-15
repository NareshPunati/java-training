package practice;

public class Comments {

    private Customer customer;
    //    private String name;
//    private int postId;
    private Posts post;
    //    private String email;
    private String comment;

    public Comments(Customer customer, Posts post, String comment) {
        this.customer = customer;
        this.post = post;
        this.comment = comment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Posts getPost() {
        return post;
    }

    public void setPost(Posts post) {
        this.post = post;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
