import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // MENIU sent food pics

        int selectieUtilizator;
        do {
            selectieUtilizator=DataMeniu();
            switch (selectieUtilizator) {
                case 1 -> System.out.println("Optiunea 1");
                case 2 -> System.out.println("Optiunea 2");
                case 3 -> System.out.println("Optiunea 3");
                case 4 -> System.out.println("--Iesire aplicatie--");
                default -> {
                }
            }
        }while (selectieUtilizator>4);


    }

    public static int DataMeniu() {

        int grab;
        Scanner sc=new Scanner(System.in);
        System.out.println("HELLO THERE MON! /n Please select what you want to do!");
        System.out.println("|--------------------------------|");
        System.out.println("    Thing A");
        System.out.println("    Thing B");
        System.out.println("    Thing C");
        System.out.println("    Leave and never come back");
        System.out.println("|_______________________________|");

        System.out.println("|You have selecte Thing: ");
        grab=sc.nextInt();
        return grab;
    }

}