import java.util.Random;
import java.util.Scanner;

public class Chaaban_p1 {

    static Scanner sc=new Scanner(System.in);
    static Random rm=new Random();
    static int count=0, cor=0, incor=0;
    public static void main(String[] args) {
        int retakeQuiz = 1;
        while (retakeQuiz == 1) {
            getQuestion();
            System.out.println("Enter 1 to retake quiz, any other key to exit.");
            retakeQuiz = sc.nextInt();
            count = 0;
        }

    }

    static void getQuestion(){
        System.out.println("Difficulty level");
        System.out.println("Enter Level number (1-4)" );
        int lb = sc.nextInt();
        switch (lb) {
            case 1:
                while (count < 10) {
                    count++;
                    int n1 = rm.nextInt(10);
                    int n2 = rm.nextInt(10);
                    times(n1, n2);
                }
                percen();
                break;
            case 2:
                while (count < 10) {
                    count++;
                    int n1 = rm.nextInt(100);
                    int n2 = rm.nextInt(100);

                    times(n1, n2);
                }
                percen();
                break;
            case 3:
                while (count < 10) {
                    count++;
                    int n1 = rm.nextInt(1000);
                    int n2 = rm.nextInt(1000);

                    times(n1, n2);
                }
                percen();
                break;
            case 4:
                while (count < 10) {
                    count++;
                    int n1 = rm.nextInt(10000);
                    int n2 = rm.nextInt(10000);

                    times(n1, n2);
                }
                percen();
                break;
        }
    }

    static void times(int n1, int n2){

        while(true){
            int multi=n1*n2;
            System.out.println("How much is "+n1+" times "+n2+"?");
            int n3=sc.nextInt();
            if(n3==multi){
                cor++;
                correct();
                break;
            }
            else{
                incor++;
                incorrect();
                break;
            }
        }

    }





    static void correct(){
        int c1=rm.nextInt(4);
        switch(c1){
            case 0: System.out.println("Very Good !");
                break;
            case 1: System.out.println("Excellent !");
                break;
            case 2: System.out.println("Nice Work !");
                break;
            case 3: System.out.println("Keep up the good work !");
                break;
        }
    }
    static void incorrect(){
        int c2=rm.nextInt(4);
        switch(c2){
            case 0: System.out.println("No, please try again!");
                break;
            case 1: System.out.println("wrong, try once more!");
                break;
            case 2: System.out.println("Don't give up!");
                break;
            case 3: System.out.println("No, keep trying!");
                break;
        }

    }
    static void percen(){
        if(cor>= 7.5){
            System.out.println("Congratulation");
            System.out.println("You got "+ cor + " questions correct.");
            System.out.println("You got " + incor + " questions incorrect.");
        }
        else {
            System.out.println("Please ask your teacher for extra help");
            System.out.println("You got "+ cor + " questions correct.");
            System.out.println("You got " + incor + " questions incorrect.");
        }
    }
}






