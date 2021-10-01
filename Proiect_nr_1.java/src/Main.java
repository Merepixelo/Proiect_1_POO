import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // MENIU sent food pics

        int selectieUtilizator;
        do {
            selectieUtilizator=DataMeniu();
            switch (selectieUtilizator) {
                case 1 -> System.out.println("Spalare selectata...");
                case 2 -> System.out.println("Clatire selectata...");
                case 3 -> System.out.println("Stoarcere selectata...");
                case 4 -> {
                    System.out.println("Finalizare...");
                    System.exit(0);
                }
                default -> {
                }
            }
        }while (selectieUtilizator>4);

    }

    public static int DataMeniu() {

        int grab;
        Scanner sc=new Scanner(System.in);
            System.out.println("\nMasina de spalat");
        System.out.println("|------------------------------|");
        System.out.println("1)    Spalare");
        System.out.println("2)    Clatire");
        System.out.println("3)    Stoarcere");
        System.out.println("4)    Oprire");
        System.out.println("|_______________________________|");

        System.out.println("Selected: ");
        grab=sc.nextInt();
        return grab;
    }

}



/*


Cerinte:

Deadline: 6.10.2021
Proiect:
Aplicatie in consola
                                                                                /
Aplicatia trebuie sa contina un meniu in consola cu minim 3 optiuni         _ _/

Un numar de 3-4 clase ce incapsuleaza un concept/set de concepte la alegere

Competente:
Folosirea corecta a claselor, constructorilor, membrii/campuri, modificatori de acces
Instantiere, incapsulare
Metoda main()

https://beginnersbook.com/2013/05/encapsulation-in-java/

https://beginnersbook.com/2013/05/encapsulation-in-java/
 */