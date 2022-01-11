package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        /*Create a class named Cydeo batches. In Cydeo we have three batch types:
        US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/

        String batchType = "EU";
        String information = "";

        if (batchType == "US morning"){
            information = "Class times are 10-5 EST. M, T, Th, F.";
            }else if (batchType == "US evening") {
            information = "Class times are 7-10 EST. M, T, W, Th, S, S";
            } else if (batchType =="EU"){
            information = "Class times are  10-5 EST. M, T, W, Th, F.";
        }else {
            information = "Invalid Batch";
        }
        System.out.println(information);

        System.out.println("==========================");

        switch (batchType){
            case "US morning":
                information ="Class times are 10-5 EST. M, T, Th, F.";
            break;
            case "US evening" :
                information = "Class times are 7-10 EST. M, T, W, Th, S, S";
            break;
            case "EU":
                information = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                information = "Invalid Batch";
        }
        System.out.println(information);

        System.out.println("--------------------------------");

        if (batchType == "US morning"|| batchType == "US evening" || batchType == "EU"){
            switch (batchType){
                case "US morning":
                  information =  "Class times are 10-5 EST. M, T, Th, F.";
                  break;
                case "US evening":
                    information = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    information = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        }else {
            information = "Invalid Batch";
        }
        System.out.println(information);

    }
}
