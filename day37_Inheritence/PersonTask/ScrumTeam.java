package day37_Inheritence.PersonTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {


       public ProductOwner PO;  //= new ProductOwner("aaa", 37, 'M', "A", 12345, 1500000);
       public ScrumMaster SM;
       public BusinessAnalyst BA;

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();


    public ScrumTeam(ProductOwner PO, ScrumMaster SM, BusinessAnalyst BA) {
        this.PO = PO;
        this.SM = SM;
        this.BA = BA;
    }

    public void addTester(Tester tester) {
    testers.add(tester);

    }
    public void addTester(Tester[] testers) {
       this.testers.addAll(Arrays.asList(testers));

    }
    public void removeTester( int id) {
        testers.removeIf(p->p.id==id);

    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);

    }
    public void addDeveloper(Developer[] developers) {
        this.developers.addAll(Arrays.asList(developers));

    }
    public void removeDeveloper( int id) {
        developers.removeIf(p->p.id==id);

    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", SM=" + SM.name +
                ", BA=" + BA.name +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
