package com.emailApplication;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmailAddress;
    private int defaultPassWordLength=10;

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        //call a method asking for the department -return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call a method that returns a random password
        this.password =randomPassword(defaultPassWordLength);
        System.out.println("your Password: " + this.password);
    }

    //
    //Ask for the department
    private String setDepartment() {
        System.out.println("Enter the department\n1 for sales\n2 for Development\n3 for Accounting\n0 fone one");
        Scanner scanner = new Scanner(System.in);
        int departmentChoices = scanner.nextInt();
        if (departmentChoices == 1) {
            return "Sales";
        } else if (departmentChoices == 2) {
            return "Development";
        } else if (departmentChoices == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGIJKLMNOPRSTUWYZ0123456789!%/$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) ;
        int rand = (int) (Math.random() * passwordSet.length());


    return new String(password);
    }

    //Set the mailbox capacity
    //AlternateEmailAddress;
    //Change the password
}
