package org.example.models;

public class User {
    private String fullName;
    private int age;
    private Gender gender;
    private long id;
    private String phoneNumber;
    private String username;
    private String password;
    public User(){}
    public User(String fullName, int age, Gender gender, long id, String phoneNumber, String username, String password) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
