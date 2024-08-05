package com.driver;

public class Group {
   // private String name;
//    private int numberOfParticipants;

     private List<User> users;
    private User admin;

    // Constructor
    public Group(List<User> users, User admin) {
        this.users = users;
        this.admin = admin;
    }

    // Getters and Setters
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    // Methods for group management
    public void sendMessage(Message message, User sender) {
        // Implementation here
    }

    public void changeAdmin(User approver, User newAdmin) {
        // Implementation here
    }

    public void removeUser(User user) {
        // Implementation here
    }

    public List<Message> findMessages(Date startDate, Date endDate, int k) {
        // Implementation here
        return new ArrayList<>();
    }

}
