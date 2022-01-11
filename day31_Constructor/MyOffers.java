package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("Charlotte","ABC","SDET",85000,true, false,true,true);
        Offer offer2 = new Offer();
        offer2.setInfo("Raleigh","BofAm","QA",90000,false, false,false,true);
        Offer offer3 = new Offer();
        offer3.setInfo("New York","Wells","Developer",110000,true, true,false,true);
        Offer offer4 = new Offer();
        offer4.setInfo("Washington","Apple","SDET",75000,true, true,true,true);
        Offer offer5 = new Offer();
        offer5.setInfo("Boston","Google","DevOp",150000,false, true,false,true);
        Offer offer6 = new Offer();
        offer6.setInfo("Chicago","Walmart","PO",90000,true, false,false,false);
        Offer offer7 = new Offer();
        offer7.setInfo("Atlanta","Rock","SDET",50000,false, false,true,false);

        Offer []myOffers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList <Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
            fullTimeOffers.removeIf(p ->p.isFullTime!=true);
        System.out.println("fullTimeOffers = " + fullTimeOffers);


         ArrayList <Offer> localOffers  = new ArrayList<>(Arrays.asList(myOffers));
           localOffers.removeIf(p-> !(p.location.equals("Charlotte")|| p.location.equals("Raleigh")));
        System.out.println("localOffers = " + localOffers.size());

        ArrayList <Offer> offersWithBenefits  = new ArrayList<>(Arrays.asList(myOffers));
            offersWithBenefits.removeIf(p-> !p.hasBenefit&&!p.hasPTO); // OR (p-> !(p.hasBenefit&&p.hasPTO)) - both will have to be matching!!!!
        System.out.println("offersWithBenefits = " + offersWithBenefits);

        ArrayList <Offer> sdetOffers   = new ArrayList<>(Arrays.asList(myOffers));
            sdetOffers.removeIf(p->p.jobTitle!="SDET");
        System.out.println("sdetOffers = " + sdetOffers);

        ArrayList <Offer> offersWith100K    = new ArrayList<>(Arrays.asList(myOffers));
            offersWith100K.removeIf(p->p.salary<100000);
        System.out.println("offersWith100K = " + offersWith100K);

            }
        }







