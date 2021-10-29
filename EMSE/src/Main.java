import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    static int numberOfRounds=0;
    static String experimentNumber;
    static int a;
    static int b;
    static int k;
    public static void welcome() {
        System.out.println("Hello and Welcome to our Experiment!!" +
                "Please read the Intro.\n");
        System.out.println("So this experiment is all about seeing if code indentation is good or not.\n" +
                "You will get two series of codes you are supposed to calculate with your head and enter the result in the space provided.\n " +
                "Your result will be stores in a file which you can later consult to see how much time you needed for each exercise and if your answer is right or not.\n");

        System.out.println("Please Select: ");
        System.out.println("1- To start the experiment");
        System.out.println("2- To exit the experiment");
    }


    public static void startExperiment(){
        System.out.println("How many Tests would you want to run?\n" +
                "Please note that per round you get two tests, one with indentation and one without.\n" +
                "E.g if you enter 1, you will run two tests.");
        int noOfRounds=scan.nextInt();
        numberOfRounds=noOfRounds;
        SaveExperiment[]experimentsToBeSaved=new SaveExperiment[noOfRounds];
        for (int i = noOfRounds; i>0; i--) {
            experimentNumber="Experiment "+i+" of "+noOfRounds;
            System.out.println("\n");
            System.out.println(experimentNumber);
            System.out.println("\n");
            experimentsToBeSaved[i-1]=Experiment();
        }
        for (int i = experimentsToBeSaved.length-1; i>=0; i--) {
            experimentNumber=experimentsToBeSaved[i].getExperimentNo();
            System.out.println("\n");
            System.out.println(experimentNumber);
            System.out.println("\n");
            Experiment2(experimentsToBeSaved[i]);
        }
        System.out.println("Thanks for your  time you have finished the Experiment");
    }


    public static void collectResults(boolean richtigkeit, String time, String experimentNumber, int userResult,String type, int result){
        try {
            FileWriter myWriter = new FileWriter("guteEinrueckungResults.txt", true);
            myWriter.write("\n");
            myWriter.write(experimentNumber +type +" you spent "+ time +" minutes.\nYour result " + userResult +" is "
                    + richtigkeit +"\n" + " The correct result is "+result );
            myWriter.write("\n");
            myWriter.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static String Time(long milliseconds){
        String seconds= ""+(milliseconds/1000)%60;
        String minutes= ""+(milliseconds/1000)/60;
        if(Integer.valueOf(seconds)<10){
            seconds="0"+seconds;
        }
        if(Integer.valueOf(minutes)<10){
            minutes="0"+ minutes;
        }
        return(minutes+":"+seconds);
    }


    public static SaveExperiment Experiment() {
        Random ran = new Random();
        a = ran.nextInt(47);
        b = ran.nextInt(67);
        k = b - a;
        int codeType = ran.nextInt(2);
        int noOfBlocks = ran.nextInt(6);
        int result = 0;
        if (noOfBlocks==0){
            noOfBlocks=1;
        }
        if (codeType == 1) {
            System.out.println("CODE MIT EINRUECKUNG");
            System.out.println("d=" + a);
            System.out.println("f=" + b);
            System.out.println("k=f-d");
            System.out.println("result=0");
            long start = System.currentTimeMillis();
            GuteEinrueckung.setResult(0);
            for (int i = noOfBlocks; i >=0 ; i--) {
                int exp=ran.nextInt(1000)%5;
                GuteEinrueckung.PrintMitEinrueckung(exp,noOfBlocks);
                result=GuteEinrueckung.Rechnung(a,b,k,exp,noOfBlocks);
                GuteEinrueckung.setResult(result);
            }
            System.out.println("\n");
            System.out.print("Enter your result: ");
            int userResult = scan.nextInt();
            long end = System.currentTimeMillis();
            String time = Time((end - start));
            if (userResult == result) {
                collectResults(true, time, experimentNumber, userResult, " Code with Indentation", result);
            } else {
                collectResults(false, time, experimentNumber, userResult, " Code with Indentation", result);
            }
            System.out.println("\n");
            System.out.println("\n");
        } else {
            System.out.println("CODE OHNE EINRUECKUNG");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("d=" + a);
            System.out.println("f=" + b);
            System.out.println("k=f-d");
            System.out.println("result=0");
            long start = System.currentTimeMillis();
            GuteEinrueckung.setResult(0);
            for (int i = noOfBlocks; i >=0 ; i--) {
                int exp=ran.nextInt(noOfBlocks);
                GuteEinrueckung.PrintOhneEinrueckung(exp,noOfBlocks);
                result=GuteEinrueckung.Rechnung(a,b,k,exp,noOfBlocks);
                GuteEinrueckung.setResult(result);
            }
            System.out.println("\n");
            System.out.print("Enter your result: ");
            int userResult = scan.nextInt();
            long end = System.currentTimeMillis();
            String time = Time((end - start));
            if (userResult == result) {
                collectResults(true, time, experimentNumber, userResult, " Code without Indentation", result);
            } else {
                collectResults(false, time, experimentNumber, userResult, " Code without Indentation", result);
            }
        }
        return new SaveExperiment(codeType,noOfBlocks,result,experimentNumber);
    }

    public static void Experiment2(SaveExperiment experimentToBeSaved){
        Random rand=new Random();
         a=rand.nextInt(47);
         b=rand.nextInt(67);
        int codeType = experimentToBeSaved.getCodeType();
        int noOfBlocks = experimentToBeSaved.getNumberOfBlocks();
        int result =experimentToBeSaved.getResult();
        if (codeType == 0) {
            System.out.println("CODE MIT EINRUECKUNG");
            System.out.println("d=" + a);
            System.out.println("f=" + b);
            System.out.println("k=f-d");
            System.out.println("result=0");
            long start = System.currentTimeMillis();
            GuteEinrueckung.setResult(0);
            for (int i = noOfBlocks; i >=0 ; i--) {
                int exp=rand.nextInt(1000)%5;
                GuteEinrueckung.PrintMitEinrueckung(exp,noOfBlocks);
                result=GuteEinrueckung.Rechnung(a,b,k,exp,noOfBlocks);
                GuteEinrueckung.setResult(result);
            }
            System.out.println("\n");
            System.out.print("Enter your result: ");
            int userResult = scan.nextInt();
            long end = System.currentTimeMillis();
            String time = Time((end - start));
            if (userResult == result) {
                collectResults(true, time, experimentNumber, userResult, " Code with Indentation", result);
            } else {
                collectResults(false, time, experimentNumber, userResult, " Code with Indentation", result);
            }
            System.out.println("\n");
            System.out.println("\n");
        } else {
            System.out.println("CODE OHNE EINRUECKUNG");
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("d=" + a);
            System.out.println("f=" + b);
            System.out.println("k=f-d");
            System.out.println("result=0");
            long start = System.currentTimeMillis();
            GuteEinrueckung.setResult(0);
            for (int i = noOfBlocks; i >=0 ; i--) {
                int exp=rand.nextInt(noOfBlocks);
                GuteEinrueckung.PrintOhneEinrueckung(exp,noOfBlocks);
                result=GuteEinrueckung.Rechnung(a,b,exp,k,noOfBlocks);
                GuteEinrueckung.setResult(result);
            }
            System.out.println("\n");
            System.out.print("Enter your result: ");
            int userResult = scan.nextInt();
            long end = System.currentTimeMillis();
            String time = Time((end - start));
            if (userResult == result) {
                collectResults(true, time, experimentNumber, userResult, " Code without Indentation", result);
            } else {
                collectResults(false, time, experimentNumber, userResult, " Code without Indentation", result);
            }
        }
    }


    public static void main(String[] args) {
        welcome();
        int user_choice;
        user_choice = scan.nextInt();
        if(user_choice == 1){
            startExperiment();
        }else {
            System.out.println("Thanks for your time hope to see you sometime later");
            System.exit(0);
        }
        scan.close();
    }
}
