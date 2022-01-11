package day31_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1=new Tester("Irina", 5785,"SDET", 85000);
        Tester tester2=new Tester("Alex", 6686,"QA", 95000);
        Tester tester3=new Tester("Vika", 1218,"Lead", 105000);
        Tester tester4=new Tester("Gloria", 3333,"Unknown", 75000);

       Tester[] testers={tester2,tester3,tester4};

        Developer dev1 = new Developer("Ira", 5875, "Dev", 110000);
        Developer dev2 = new Developer("Xela", 6866, "Programmer", 120000);
        Developer dev3 = new Developer("Akiv", 8121, "Dev", 130000);
        Developer dev4 = new Developer("Aria", 3133, "XZ", 140000);
        Developer dev5 = new Developer("AAA", 1111, "ZZZ", 150000);

        Developer[] developers={dev2,dev3,dev4,dev5};

        ScrumTeam scrumTeam = new ScrumTeam("AAA","BBB","CCC",7);
        scrumTeam.addTester(tester1);
        scrumTeam.addDeveloper(dev1);

        scrumTeam.addTesters(testers);

        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam);

        System.out.println("----------------------");
        for (Tester eachTester : scrumTeam.testersList) {
            System.out.println(eachTester.name + ":" + eachTester.salary);
        }
        System.out.println();

        for (Developer eachDeveloper : scrumTeam.developersList) {
            System.out.println(eachDeveloper.name + ":" + eachDeveloper.salary);
        }

        scrumTeam.removeTester(3333);
        System.out.println(scrumTeam);

        scrumTeam.removeDeveloper(1111);
        scrumTeam.removeDeveloper(3133);
        System.out.println(scrumTeam);
    }

}
