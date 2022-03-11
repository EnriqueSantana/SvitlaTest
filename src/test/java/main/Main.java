package main;
import tests.Locators;
import tests.Methods;

public class Main {
    public static void main(String [ ]args) throws InterruptedException {
        Methods myMethods = new Methods();
        myMethods.getURl("https://www.google.com/");
        myMethods.write(Locators.searchField,"Facebook");
        myMethods.click(Locators.facebookOption);
        myMethods.click(Locators.facebookLink);
        myMethods.write(Locators.usernameField,"enrique_0096@hotmail.com");
        myMethods.write(Locators.passwordField,"guners");
        myMethods.clickByName(Locators.loginButton);
        Thread.sleep(3000);
        myMethods.click(Locators.menuButton);
        myMethods.click(Locators.logout);
        myMethods.closeBrowser();
    }
    System.out.println("NOOO");
    System.out.println("NOOO");
    System.out.println("NOOO");

}