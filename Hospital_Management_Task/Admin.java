package com.wipro.hospital_management;

public class Admin extends Base {
    private Base[] users = new Base[20];
    private int userCount = 0;

    public Admin(String name, String att_name, String phone) {
        super(name, att_name, phone);
    }

    public void addUser(Base user) {
        if (userCount < users.length) {
            users[userCount++] = user;
            System.out.println(user.getName() + " added to the system.");
        } else {
            System.out.println("Cannot add more users.");
        }
    }

    public void generateReport() {
        System.out.println("Generating system report:");
        if (userCount == 0) {
            System.out.println("No users in the system.");
        } else {
            for (int i = 0; i < userCount; i++) {
                System.out.println("- " + users[i].getName() + " (" + users[i].getClass().getSimpleName() + ")");
            }
        }
    }
}
