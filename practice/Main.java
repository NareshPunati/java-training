package practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Customer> customers = new ArrayList<>();
        Customer customers1 = new Customer("Satya", "satya@gmail.com");
        Customer customers2 = new Customer("Sam", "sam@gmail.com");
        Customer customers3 = new Customer("Ram", "ram@gmail.com");
        Customer customers4 = new Customer("Naresh", "naresh@gmail.com");
        Customer customers5 = new Customer("Praveen", "praveen@gmail.com");

        customers.add(customers1);
        customers.add(customers2);
        customers.add(customers3);
        customers.add(customers4);
        customers.add(customers5);

        List<Posts> post = new ArrayList<>();
        Posts post1 = new Posts(1205,"Heading One", "I'm playing a game");
        Posts post2 = new Posts(1523, "Heading Two", "we are in a office");
        Posts post3 = new Posts(3562, "Heading Three", "Reading Book");
        Posts post4 = new Posts(2847, "Heading Four", "Traveling");

        post.add(post1);
        post.add(post2);
        post.add(post3);
        post.add(post4);

        List<Comments> comment = new ArrayList<>();
        Comments comment1 = new Comments(customers1,post1,"Keep playing");
        Comments comment2 = new Comments(customers2,post2,"Drink");
        Comments comment3 = new Comments(customers3,post3,"Keep reading and growing");
        Comments comment4 = new Comments(customers4,post1,null);
        Comments comment5 = new Comments(customers5,post4,"Read More Books");

        comment.add(comment1);
        comment.add(comment2);
        comment.add(comment3);
        comment.add(comment4);
        comment.add(comment5);

//     <------------------------- Printing customer name and emailId----------------------------->

//        for (Comments c: comment){
//            System.out.println("\nName " + c.getCustomer().getName() + " : " + c.getCustomer().getEmail());
//        }

/*     <--------------------------Customer name, Heading, Description---------------------------->
//        for (Comments c: comment){
//            System.out.println(c.getCustomer().getName() + " : " + c.getPost().getHeading()
//                    + " : " + c.getPost().getDescription());
        }     */

//      <---------------Customer name, Heading, Description, Comment, Commented customer name---------->
/*        for (Comments c : comment){
            System.out.println(c.getCustomer().getName() + " : " + c.getPost().getHeading() +" : " + c.getPost().
                    getDescription() + " : " + c.getComment());
        }     */

    }
}
