
//Comandare Taxi 1

public class TaxiOne {

    private String sofer="Marin Flore ";
    private String masina="Dacia Duster ";
    private String companie="Maxi Taxi Inc. ";
    private String locatie_statie_taxi="Parcul Eroilor ";
    private double tarif_start=2.5; //lei
    private int    locuri_libere=4;

    private double tarif_total=0.0;

    public String locatie_comanda;
    public boolean rezervare= true;
    public double distanta=0.0;



    //Getter-i
    public String getSofer(){
        return sofer;
    }

    public void setSofer(){
        this.sofer="Marian Flore";
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
    public int getLocuri_libere(){
        return locuri_libere;
    }

    //Setter-i
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

    public void Tarift(){
        this.tarif_total=(this.tarif_start)*(distanta);
    }

}


// Main myObj = new FirstOption();  Create an object of class Main (This will call the constructor)