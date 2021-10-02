import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // MENIU
        TaxiOne tx1=new TaxiOne();
        TaxiTwo tx2=new TaxiTwo();

        Scanner sc= new Scanner(System.in);

        int selectieUtilizator;
        do {
            selectieUtilizator=DataMeniu();
            switch (selectieUtilizator) {
                case 1 -> {
                    System.out.println("Comanda Taxi selectata...\n");

                    System.out.println("Sofer Taxi: "+tx1.getSofer());
                    System.out.println("Model masina Taxi: "+tx1.getMasina());
                    System.out.println("Companie Taxi: "+tx1.getCompanie());
                    System.out.println("Locatia De pornire taxi: "+tx1.getLocatie_statie_taxi());
                    System.out.println("Tariful de pornire: "+tx1.getTarif_start()+" lei ");
                    System.out.println("Numar de locuri disponibile: "+tx1.getLocuri_libere()+" locuri ");
                    System.out.println("Locatie comandaa: ");
                    String str= sc.nextLine();
                    tx1.setLocatie_comanda(str);

                }
                case 2 -> System.out.println("B selectata...");
                case 3 -> System.out.println("Achitare Plata selectata...");
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
            System.out.println("\nMereTaxi ");
        System.out.println("|------------------------------|");
        System.out.println("1)    COMANDA TAXI");
        System.out.println("2)    B");
        System.out.println("3)    ACHITARE PLATA");
        System.out.println("4)    Inchidere");
        System.out.println("|_______________________________|");

        System.out.println("A-ti Selectat: ");
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