package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Comments> com = new ArrayList<>();
        Comments comment1 = new Comments("Keep playing");
        Comments comment2 = new Comments("Drink");
        Comments comment3 = new Comments("Keep reading and growing");
        Comments comment4 = new Comments(null);
        Comments comment5 = new Comments("Read More Books");

        List<Comments> com1 = Arrays.asList(comment1, comment5,comment4);
        List<Comments> com2 = Arrays.asList(comment2, comment3);
        List<Comments> com3 = Arrays.asList();
        List<Comments> com4 = Arrays.asList(comment4, comment5);
        List<Comments> com5 = Arrays.asList(comment5, comment1);

        List<Posts> po = new ArrayList<>();
        Posts post1 = new Posts(1205, "Heading One", "I'm playing a game", com1);
        Posts post2 = new Posts(1523, "Heading Two", "we are in a office", com2);
        Posts post3 = new Posts(3562, "Heading Three", "Reading Book", com3);
        Posts post4 = new Posts(2847, "Heading Four", "Traveling", com4);

        po.add(post1);
        po.add(post2);
        po.add(post3);
        po.add(post4);

        List<Customer> customers = new ArrayList<>();
        Customer customers1 = new Customer("Satya", "satya@gmail.com", post1);
        Customer customers2 = new Customer("Sam", "sam@gmail.com", post2);
        Customer customers3 = new Customer("Ram", "ram@gmail.com", post3);
        Customer customers4 = new Customer("Naresh", "naresh@gmail.com", post4);
        Customer customers5 = new Customer("Praveen", "praveen@gmail.com", post2);

        customers.add(customers1);
        customers.add(customers2);
        customers.add(customers3);
        customers.add(customers4);
        customers.add(customers5);

        // <-------------------Customer Name and EmailId-------------------->
//        customers.stream().forEach(c -> System.out.println("Customer Name : " + c.getName() + "\nEmail : " +
//                c.getEmail() + "\n" ));

        // <----------------Customer Name , Heading & Description----------------->
//        customers.forEach(c -> System.out.println("Customer Name : " + c.getName() + "\nEmailId :" + c.getEmail()
//                + "\nHeading : " + c.getPosts().getHeading() + "\nDescription : " + c.getPosts().getDescription() +
//                "\n"));

        //<------------Customer name, Heading, Description, Comment, Commented customer name----------->//
//        customers.forEach(c -> System.out.println("Customer Name : " + c.getName() + "\nHeading : " +
//                c.getPosts().getHeading() + "\nDescription : " + c.getPosts().getDescription() + "\n" + c.getPosts()
//                .getCom() + " \n "));

        //<--------------------Using Streams for getting Customer's profile------------------------>
//        customers.stream().forEach(c -> System.out.println("\nCustomer Name : " +c.getName() +"\nEmail : " + c.getEmail()
//                +"\nHeading : "+c.getPosts().getHeading() +"\nDescription : " + c.getPosts().getDescription() +
//                "\n"+c.getPosts().getCom()));

    }

    }

