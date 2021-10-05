import com.sun.source.tree.WhileLoopTree;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;


public class Main {

    public static void main(String[] args)  throws IOException {

        // MENIU
        //constructori
        TaxiOne tx1 = new TaxiOne();
        TaxiTwo tx2 = new TaxiTwo();
        PlataTaxi pltt = new PlataTaxi();
        Stationare stat = new Stationare();
        Scanner sc = new Scanner(System.in);
        File bon=new File("Bon Fiscal.txt");
        FileWriter myWriter = new FileWriter("Bon Fiscal.txt");
        Timer timer = new Timer();

        int selectieUtilizator;
        int selectieUtilizator2;
        int selectieUtilizator3;


        do {selectieUtilizator = DataMeniu();
            switch (selectieUtilizator) {
                /*M1 c1*/
                    case 1 -> {
                        do {
                            selectieUtilizator2 = DataMeniu2();
                            switch (selectieUtilizator2) {

                                /*M2 c1*/
                                case 1 -> {
                                    System.out.println("Comanda Taxi selectata...\n");

                                    System.out.println("Companie Taxi: " + tx1.getCompanie());
                                    System.out.println("Tariful de pornire: " + tx1.getTarif_start() + " lei ");
                                    System.out.println("Tariful de drum: " + tx1.getTarif_drum() + " lei ");
                                    System.out.println("Sofer Taxi: " + tx1.getSofer());
                                    System.out.println("Model masina Taxi: " + tx1.getMasina());
                                    System.out.println("Locatia De pornire taxi: " + tx1.getLocatie_statie_taxi());
                                    System.out.println("Numar de locuri disponibile: " + tx1.getLocuri_libere() + " locuri ");

                                    System.out.println("Locatie comanda: ");
                                    String str = sc.nextLine();
                                    tx1.setLocatie_comanda(str);

                                    System.out.println("Distanta pana la destinatie(Km): ");
                                    double nr = sc.nextDouble();
                                    System.out.println("Tariful drum total (RON): ");
                                    tx1.Tarift(nr);
                                    System.out.println(tx1.getTarif_total());

                                    System.out.println("Doriti sa platiti??(d/n) ");
                                    char c = sc.next().charAt(0);
                                    if (c == 'd') {
                                        System.out.println("Achitare Plata...");
                                        System.out.println("Cash Taxi: " + pltt.getCash());
                                        System.out.println("Sold POS Taxi: " + pltt.getPOS_sold());
                                        do {
                                            selectieUtilizator3 = DataMeniu3();
                                            switch (selectieUtilizator3) {
                                                /*Plata cash*/
                                                case 1 -> {
                                                    System.out.println("Introduceti suma cash: ");
                                                    double nr2 = sc.nextDouble();
                                                    pltt.setCash_clinet(nr2);

                                                    System.out.println("(Taxa cash se actualizeaza) ");

                                                    pltt.setTaxa(tx1.getTarif_total());

                                                    System.out.println("Tranzactie in curs de desfasurare... \n");

                                                    pltt.Platat(pltt.getTaxa());
                                                    break;
                                                }
                                                /*Plata POS*/
                                                //Functioneaza
                                                case 2 -> {

                                                    System.out.println("Introduceti suma POS: ");
                                                    double nr2 = sc.nextDouble();
                                                    pltt.setPOS_sold_c(nr2);

                                                    System.out.println("Taxa POS: ");

                                                    pltt.setTaxa(tx1.getTarif_total());

                                                    System.out.println("Tranzactie in curs de desfasurare... \n");

                                                    pltt.Platapos(nr2, pltt.getTaxa());
                                                    break;
                                                }

                                                /*Split Pay*/
                                                case 3 -> {
                                                    System.out.println("Split Pay selectat...");
                                                    System.out.println("Introduceti suma cash: ");
                                                    double nr4 = sc.nextDouble();
                                                    pltt.setCash_clinet(nr4);
                                                    System.out.println("Introduceti suma POS: ");
                                                    double nr5 = sc.nextDouble();
                                                    pltt.setPOS_sold_c(nr5);
                                                    if(nr4<nr5)
                                                    {
                                                        pltt.setTaxa(tx1.getTarif_total());
                                                        pltt.SplitPay(nr4,nr5);
                                                        System.out.println("Cash client: "+pltt.getCash_clinet());
                                                        System.out.println("Cash Taxi: "+pltt.getCash());
                                                        System.out.println("POS client: "+pltt.getPOS_sold_c());
                                                        System.out.println("POS Taxi: "+pltt.getPOS_sold());
                                                    }

                                                    break;
                                                }

                                                default -> {
                                                    break;
                                                }
                                            }
                                        } while (selectieUtilizator3 >= 3);
                                    } else if (c == 'n')
                                        break;
                                }
                                /*M2 c2*/
                                case 2 -> {
                                    System.out.println("Comanda Taxi selectata...\n");

                                    System.out.println("Companie Taxi: " + tx2.getCompanie());
                                    System.out.println("Tariful de pornire: " + tx2.getTarif_start() + " lei ");
                                    System.out.println("Tariful de drum: " + tx2.getTarif_drum() + " lei ");
                                    System.out.println("Sofer Taxi: " + tx2.getSofer());
                                    System.out.println("Model masina Taxi: " + tx2.getMasina());
                                    System.out.println("Locatia De pornire taxi: " + tx2.getLocatie_statie_taxi());
                                    System.out.println("Numar de locuri disponibile: " + tx2.getLocuri_libere() + " locuri ");

                                    System.out.println("Locatie comanda: ");
                                    String str = sc.nextLine();
                                    tx2.setLocatie_comanda(str);

                                    System.out.println("Distanta pana la destinatie(Km): ");
                                    double nr = sc.nextDouble();
                                    System.out.println("Tariful drum total (RON): ");
                                    tx2.Tarift(nr);
                                    System.out.println(tx2.getTarif_total());

                                    System.out.println("Doriti sa platiti??(d/n) ");
                                    char c = sc.next().charAt(0);
                                    if (c == 'd') {
                                        System.out.println("Achitare Plata...");
                                        System.out.println("Cash Taxi: " + pltt.getCash());
                                        System.out.println("Sold POS Taxi: " + pltt.getPOS_sold());
                                        do {
                                            selectieUtilizator3 = DataMeniu3();
                                            switch (selectieUtilizator3) {
                                                /*Plata cash*/
                                                case 1 -> {
                                                    System.out.println("Introduceti suma cash: ");
                                                    double nr2 = sc.nextDouble();
                                                    pltt.setCash_clinet(nr2);

                                                    System.out.println("(Taxa cash se actualizeaza) ");

                                                    pltt.setTaxa(tx2.getTarif_total());

                                                    System.out.println("Tranzactie in curs de desfasurare... \n");

                                                    pltt.Platat(pltt.getTaxa());
                                                    break;
                                                }
                                                /*Plata POS*/
                                                //Functioneaza
                                                case 2 -> {

                                                    System.out.println("Introduceti suma POS: ");
                                                    double nr2 = sc.nextDouble();
                                                    pltt.setPOS_sold_c(nr2);

                                                    System.out.println("Taxa POS: ");

                                                    pltt.setTaxa(tx2.getTarif_total());

                                                    System.out.println("Tranzactie in curs de desfasurare... \n");

                                                    pltt.Platapos(nr2, pltt.getTaxa());
                                                    break;
                                                }

                                                /*Split Pay*/
                                                case 3 -> {
                                                    System.out.println("Split Pay selectat...");
                                                    System.out.println("Introduceti suma cash: ");
                                                    double nr4 = sc.nextDouble();
                                                    pltt.setCash_clinet(nr4);
                                                    System.out.println("Introduceti suma POS: ");
                                                    double nr5 = sc.nextDouble();
                                                    pltt.setPOS_sold_c(nr5);
                                                    if(nr4<nr5)
                                                    {
                                                        pltt.setTaxa(tx2.getTarif_total());
                                                        pltt.SplitPay(nr4,nr5);
                                                        System.out.println("Cash client: "+pltt.getCash_clinet());
                                                        System.out.println("Cash Taxi: "+pltt.getCash());
                                                        System.out.println("POS client: "+pltt.getPOS_sold_c());
                                                        System.out.println("POS Taxi: "+pltt.getPOS_sold());
                                                    }

                                                    break;
                                                }

                                                default -> {
                                                    break;
                                                }
                                            }
                                        } while (selectieUtilizator3 >= 3);
                                    } else if (c == 'n')
                                        break;
                                }
                                default -> {
                                    System.out.println("Alegerea trebuie sa fie intre 1-3");
                                }
                                }

                            }
                        while (selectieUtilizator2 >= 3) ;
                    }
//M1 c2
                        case 2 -> {
                            System.out.println("Asteptare stationara selectata...");
                            System.out.println("Tarif de start asteptare: " + stat.getTarifstart());
                            System.out.println("Tarif pe minut: " + stat.getTaxastationare());
                            System.out.println("Durata de stationare(min): ");
                            double nr = sc.nextDouble();

                            stat.setTariftotal(nr);
                            System.out.println("Taxa totala pt stationat(RON): " + stat.getTariftotal());
                            break;
                        }
//M1 c3
                        case 3 -> {
                            //tx1.getLocatie_comanda();
                            System.out.println("Tiparire Bon selectata...");
                            //Creare bon
                            try {
                                if (bon.createNewFile()) {
                                    System.out.println("Bon fiscal: " + bon.getName());
                                } else {
                                    System.out.println("Bonul deja exista...");
                                }

                            } catch (IOException e) {
                                System.out.println("Eroare...");
                                e.printStackTrace();
                            }

                            //Scrie date in bon

                            if (DataMeniu2() == 1)
                            {
                                try {
                                    myWriter.write("Companie Taxi: " + tx1.getCompanie());
                                    myWriter.write("Tariful de pornire: " + tx1.getTarif_start() + " lei ");
                                    myWriter.write("Tariful de drum: " + tx1.getTarif_drum() + " lei ");
                                    myWriter.write("Tariful de drum: " + tx1.getTarif_drum() + " lei ");
                                    myWriter.write("Locatie comanda: "+tx1.getLocatie_comanda());
                                    myWriter.write("Distanta parcursa: "+tx1.distanta);
                                    myWriter.write("Total: "+tx1.getTarif_total());
                                    myWriter.close();
                                    System.out.println("Bonul a fost tiparit! O zi buna!");
                                } catch (IOException e) {
                                    System.out.println("An error occurred.");
                                    e.printStackTrace();
                                }

                            }else if (DataMeniu2() == 2)
                            {
                                    /*
                                    try {
                                    myWriter.write("Companie Taxi: " + tx1.getCompanie());
                                    myWriter.write("Tariful de pornire: " + tx1.getTarif_start() + " lei ");
                                    myWriter.write("Tariful de drum: " + tx1.getTarif_drum() + " lei ");
                                    myWriter.write("Tariful de drum: " + tx1.getTarif_drum() + " lei ");
                                    myWriter.write("Locatie comanda: "+tx1.getLocatie_comanda());
                                    myWriter.write("Distanta parcursa: "+tx1.distanta);
                                    myWriter.write("Total: "+tx1.getTarif_total());
                                    myWriter.close();
                                    System.out.println("Bonul a fost tiparit! O zi buna!");
                                } catch (IOException e) {
                                    System.out.println("An error occurred.");
                                    e.printStackTrace();
                                     */
                            }


                        }


                        case 4 -> {
                            System.out.println("Inchidere program...");
                            System.exit(0);
                            break;
                        }
                        default -> {
                            System.out.println("Alegerea trebuie sa fie intre 1-4");
                        }
                    }
                }while (selectieUtilizator >= 4) ;
            }
            public static int DataMeniu() {
                int grab;
                Scanner sc = new Scanner(System.in);
                System.out.println("\nMereTaxi ");
                System.out.println("|------------------------------|");
                System.out.println("1)    COMANDA TAXI");
                System.out.println("2)    STATIONARE IN ASTEPTARE");
                System.out.println("3)    TIPARIRE BON FISCAL ");
                System.out.println("4)    INCHIDERE MENIU");
                System.out.println("|_______________________________|");

                System.out.println("A-ti Selectat: ");
                grab = sc.nextInt();
                return grab;
            }
            public static int DataMeniu2 () {

                int grab;
                Scanner sc = new Scanner(System.in);
                System.out.println("\n Unitati Taxi ");
                System.out.println("|------------------------------|");
                System.out.println("Unitatile disponibile: ");
                System.out.println("1)    Unitatea taxi 43");
                System.out.println("2)    Unitatea taxi 64");
                System.out.println("|_______________________________|");

                System.out.println("A-ti Selectat: ");
                grab = sc.nextInt();
                return grab;
            }
            public static int DataMeniu3 () {

                int grab;
                Scanner sc = new Scanner(System.in);
                System.out.println("\n Metode de plata ");
                System.out.println("|------------------------------|");
                System.out.println("1)    Cash numerar");
                System.out.println("2)    POS");
                System.out.println("3)    Split Pay");
                System.out.println("|_______________________________|");

                System.out.println("A-ti Selectat: ");
                grab = sc.nextInt();
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