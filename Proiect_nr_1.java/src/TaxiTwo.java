
//Comandare Taxi 2

public class TaxiTwo {

    private String sofer="Bob Multch";
    private String masina="Skoda Octavia";
    private String companie="Mere Taxi SRL.";
    private String locatie_statie_taxi="Parc Ciresari (Centru)";
    private double tarif_start=4.8;//lei
    private double tarif_drum=6.7;//lei
    private int    locuri_libere=2;

    public String locatie_comanda="Lama nr.5";

    public boolean rezervare=false;
    public double distanta=0.0;
    public double tarif_total=0.0;



    //Getter-i
    public String getSofer(){
        return sofer;
    }

    public String getMasina(){
        return masina;
    }
    public String getCompanie(){
        return  companie;
    }
    public  String getLocatie_statie_taxi(){
        return  locatie_statie_taxi;
    }

    public double getTarif_start(){
        return tarif_start;
    }

    public double getTarif_drum(){

        return tarif_start;
    }

    public int getLocuri_libere(){
        return locuri_libere;
    }

    //Setter-i

    /* public void setSofer(){
         this.sofer="Marian Flore";
     }
   */
    public  void setRezervare(boolean newRezervare){
        this.rezervare=newRezervare;
    }

    public void setLocatie_comanda(String newLocatie){
        this.locatie_comanda=newLocatie;
    }

    //Distana
    public void DistantaDeParcurs(double newDistanta){
        this.distanta+=newDistanta;
    }

    public void Tarift(double distanta){
        this.tarif_total=this.tarif_drum*distanta+this.tarif_start;
        System.out.println(this.tarif_total);
    }

}


