import java.util.Scanner;

public class ETC {
    public static void main(String[] args) {
        // you can see the comment of class documentation here
        // by hovering your mouse on 'Comment'
        Comment foo = new Comment();

        // How to get input in java
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine(); // read a line of string
        Integer integer = scanner.nextInt(); // read an integer
        // always close scanner after you don't need it
        scanner.close();

        // empty array
        Comment[] comments = new Comment[10];

        for (Comment comment : comments) {
            comment = new Comment(); // array elements don't change
        }

        for (Comment comment : comments) {
            System.out.println(comment);
        }

        for (int i = 0; i < comments.length; i++) {
            comments[i] = new Comment(); // array elements change
        }

        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}
