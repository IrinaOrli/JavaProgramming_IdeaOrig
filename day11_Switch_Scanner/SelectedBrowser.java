package day11_Switch_Scanner;

public class SelectedBrowser {
    public static void main(String[] args) {
        /*write a program that can display the selected browser
            3.1  declear a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names,
            out put should be: Invalid Browser
            Do Not use if statement or ternary*/

        String browserName = "opera";
        String result = "";
        switch (browserName){
            case "chrome":
                result = "Chrome is selected";
                break;
            case "firefox" :
                result = "Firefoxis selected";
                break;
            case "opera":
                result = "Opera is selected";
                break;
            case "safari" :
                result = "Safari is selected";
                break;
            case "edge":
                result = "Edge is selected";
                break;
            default:
                result = "Invalid Browser";
        }
        System.out.println(result);
    }
}
