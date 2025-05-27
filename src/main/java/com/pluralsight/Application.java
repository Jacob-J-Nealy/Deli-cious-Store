package com.pluralsight;

import com.pluralsight.UserInterface;

import java.util.Scanner;
import static com.pluralsight.UserInterface.scanner;


public class Application {

    UserInterface userInterface = new UserInterface();
    Scanner scanner1 = new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface.uiHomeScreenSplitCase();
    }
}
