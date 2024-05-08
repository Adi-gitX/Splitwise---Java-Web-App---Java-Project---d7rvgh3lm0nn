package co.newtonschool.splitwise.model;

import java.util.Objects;

public class User {
    private static int id = 1;
    private int userId;
    private String firstName;
    private String lastName;
    private String username;

    public User(String firstName, String lastName) {
        this.userId = id++;
        this.firstName = firstName;
        this.lastName = lastName;
        setUsername();
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        int randomNumber = (int) ((Math.random() + 1) * 10000);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstName.toLowerCase())
                .append("_")
                .append(lastName.toLowerCase())
                .append("_")
                .append(randomNumber);

        this.username = stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
