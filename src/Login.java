import java.util.Scanner;

public class Login {

    public boolean isLoggedIn(){
        Scanner scan = new Scanner(System.in);
        String username = "Ramona";
        String password = "parola11";



        System.out.println("Insert username" );
        String givenUsername = scan.next();

        System.out.println("Insert password" );
        String givenPassword = scan.next();


        if (username.equals(givenUsername) && password.equals(givenPassword)){
            System.out.println(Messages.WELCOME_MSG);
            return true;
        }else {
            System.out.println("Not success");
            return false;

        }
    }

    public boolean loginSuccessful(){
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        }while (!repeat && count<3);
        return repeat;
    }


    private void wait(int seconds) {
        System.out.print("Waiting for: ");
        do {
            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds--;
        } while (seconds > 0);
    }
}
