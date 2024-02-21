package com.develhope.spring;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Users {
    private final Scanner scanner = new Scanner(System.in);


    /*Legge la scelta inserita dall'utente*/
    private void readChoiseInputFromUser(){
        int choice;
        try{
            choice = scanner.nextInt();
            UsersChoice usersChoice = checkInputChoice(choice);
            doTheChoice(usersChoice);
        } catch (InputMismatchException e ) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextInt();
        }
    }

    private void doTheChoice(UsersChoice usersChoice) {
    }

    private UsersChoice checkInputChoice(int choice) {
        return null;
    }
}
