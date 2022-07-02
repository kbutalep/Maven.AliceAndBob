import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner askName = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = askName.next();
        if(userName.toLowerCase().equals("alice")){
            System.out.println("Hello Alice!");
        }
         else if (userName.toLowerCase().equals("bob")){
            System.out.println("Hello Bob!");
        } else {
            System.out.println("");

    }
}}
