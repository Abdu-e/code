public class Practical11 {
  
    public static boolean verifyPassword(String password) {
      boolean hasUppercase = false;
      boolean hasLowercase = false;
      boolean hasDigit = false;
      boolean hasSpecialChar = false;
      
      if (password.length() < 8) {
        System.out.println("Password is too short");
        return false;
      }
      
      for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);
        if (Character.isUpperCase(c)) {
          hasUppercase = true;
        }
        if (Character.isLowerCase(c)) {
          hasLowercase = true;
        }
        if (Character.isDigit(c)) {
          hasDigit = true;
        }
        if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
          hasSpecialChar = true;
        }
      }
      
      if (!hasUppercase) {
        System.out.println("Password must contain at least 1 uppercase character");
        return false;
      }
      if (!hasLowercase) {
        System.out.println("Password must contain at least 1 lowercase character");
        return false;
      }
      if (!hasDigit) {
        System.out.println("Password must contain at least 1 digit");
        return false;
      }
      if (!hasSpecialChar) {
        System.out.println("Password must contain at least 1 special character");
        return false;
      }
      
      System.out.println("Password is valid");
      return true;
    }
    
    public static void main(String[] args) {
      verifyPassword("P@ssword123");
    }
    
  }