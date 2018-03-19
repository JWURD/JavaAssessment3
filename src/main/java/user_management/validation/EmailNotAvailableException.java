package user_management.validation;

public class EmailNotAvailableException extends Exception {
   public String email;
    public EmailNotAvailableException(String emailInvaild){
         this.email = emailInvaild;
     }
}
