package day37_Inheritence.PersonTask;

import java.util.Arrays;

public class AmazonINC {
    public static void main(String[] args) {
        String company = "AmazonINC";
        ProductOwner po = new ProductOwner("Sih", 29, 'M', company, 1, 16000);

        BusinessAnalyst ba=new BusinessAnalyst("Cina", 28, 'F', company, 2, 10000);

        ScrumMaster sm = new ScrumMaster("Alen", 26, 'F', company, 3, 85000);

        Tester tester1=new Tester("Chinara",32,'F',"QA",company, 5,125000);

        Tester tester2=new Tester("Yasaman",31,'F',"Sdet",company,4,120000);

        Tester tester3=new Tester("Irena",29,'F',"Sdet",company,6,110000);

        Tester tester4=new Tester("Cihad",26,'M',"tester",company,7,100000);


        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer = new Developer("Daniela", 30, 'F', "Java Dev", company, 8, 154000);

        ScrumTeam scrumTeam = new ScrumTeam(po, sm, ba);

        scrumTeam.addDeveloper(developer);

        scrumTeam.addTester(testers);

        System.out.println(scrumTeam);

        System.out.println("-----------------------------");

      System.out.println(Arrays.toString(testers));

        for (Tester tester : testers) {
            System.out.println(tester.name);
        }

        for (Developer developer1 : scrumTeam.developers) {
            System.out.println(developer1.salary);
        }





    }
}
