import java.util.Scanner;

public class Practical11 
{

    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter your password: ");
            String password = scanner.nextLine();

            boolean isValidPassword = verifyPassword(password);
            if(isValidPassword) 
            {
                System.out.println("Your password is valid.");
            } else 
            {
                System.out.println("Your password is invalid.");
            }
        }
    }
    
    public static boolean verifyPassword(String pass) 
    {
        int passLen = 8;
        boolean hasLeng = pass.length() >= passLen;
        boolean hasSpec = pass.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        boolean hasUpper = pass.matches(".*[A-Z].*");
        boolean hasLower = pass.matches(".*[a-z].*");
        boolean hasDig = pass.matches(".*\\d.*");

        boolean isValidPassword = hasLeng && hasSpec && hasUpper && hasLower && hasDig;

        if(!isValidPassword) 
        {
            System.out.print("Invalid password. ");
            if(!hasLeng) 
            {
                System.out.print("Password must be 8 digits/letters or longer. ");
            }
            if(!hasSpec) 
            {
                System.out.print("Password requires at least one special key. ");
            }
            if(!hasUpper) 
            {
                System.out.print("Password requires at least one uppercase letter. ");
            }
            if(!hasLower) 
            {
                System.out.print("Password requires at least one lowercase letter. ");
            }
            if(!hasDig) 
            {
                System.out.print("Password requires at least one number. ");
            }
            
            
            System.out.println(pass);
        }
        return isValidPassword;

        
    }
}
