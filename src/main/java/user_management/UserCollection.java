package user_management;


import user_management.security.UserAuthenticationFailedException;
import user_management.validation.EmailNotAvailableException;
import user_management.validation.InvalidEmailException;
import user_management.validation.PasswordTooSimpleException;

import java.util.ArrayList;

public class UserCollection extends ArrayList<User> {

    public User findById(int id) {
        while (super.listIterator().hasNext()) {
            User e = super.listIterator().next();
            if (e.getId() == id) {
                return e;
            }
        }
        return null;

    }

    public User findByEmail(String email) {
        while (super.listIterator().hasNext()) {
            User e = super.listIterator().next();
            if (e.getEmail().equals(email)) {
                return e;
            }
        }
        return null;

    }

    public User attemptLogin(String email, String password) throws UserAuthenticationFailedException {
        return null;
    }

    public int createUser(String name, String email, String password) throws PasswordTooSimpleException, EmailNotAvailableException, InvalidEmailException {
        if (findByEmail(email) != null) {
          throw  new EmailNotAvailableException("The supplied email is taken by another user");
        } else if (!email.matches("^([a-z|A-Z|])+\\w")) {
           throw new InvalidEmailException();
        } else if (!email.matches("(@)")) {
           throw new InvalidEmailException();
        } else if (!email.matches("@\\w+")) {
           throw new InvalidEmailException();
        } else if (!email.matches("[.]\\w+")) {
          throw  new InvalidEmailException();
        }
        add(new User(super.size() + 1, name, email, password));
        return super.size() + 1;
    }


}
