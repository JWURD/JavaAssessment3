package user_management;

import user_management.security.Password;

import java.util.Objects;

public class User {
    private String email;
    private int id;
    private String name;
    private Password password;
    private String thePassword;

    public User(int id, String name, String email, Password password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.thePassword = thePassword;
        this.password = new Password(this.thePassword);
    }

    public User(int id, String name, String email, String password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.thePassword = thePassword;
        this.password = new Password(this.thePassword);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.thePassword = password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Password getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return name + " - " + email;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(email, user.email) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(thePassword, user.thePassword);
    }

    @Override
    public int hashCode() {

        return Objects.hash(email, id, name, password, thePassword);
    }
}
