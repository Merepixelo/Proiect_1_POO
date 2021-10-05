
//Achitare Plata cursa taxi

import java.util.Scanner;

public class PlataTaxi {

    private double taxa=0.0;
    private double cash=500.0;
    private double rest=0.0;
    private double POS_sold=150.0;
    public double POS_sold_c=0.0;
    private double cash_client=0.0;
    public double r=0.0;

    //Getteri
    public double getCash(){
        return cash;
    }

    public double getRest(){
        return  rest;
    }

    public double getPOS_sold(){return POS_sold;}

    public double getTaxa(){return  taxa;}

    public double getCash_clinet() {
        return cash_client;
    }

    //Setteri
    public void setCash(double newCash){
        cash=newCash;
    }

    public void setRest(double newRest){rest=newRest;}

    public void setPOS_sold(double newPOS_sold){
        POS_sold=newPOS_sold;
    }

    public void setCash_clinet(double Newcash_clinet) {cash_client = Newcash_clinet;}

    public void setTaxa(double newTaxa){ taxa=newTaxa;}

    void setPOS_sold_c(double newPOS_sold_c){POS_sold_c=newPOS_sold_c;};




    public void Platat(double taxa){

        if (this.taxa==this.cash_client){
                  System.out.println("Plata achitata fix... O zi buna!...");
                  System.out.println("(Cash taxi: "+this.cash+")");
        }else if (this.taxa<this.cash_client){
                    rest=this.cash-this.taxa;
                    this.cash=this.cash+this.taxa-rest;
                    this.cash_client=this.cash_client-this.taxa;
                    System.out.println("Plata achitata... restul dvs: "+rest);
                    System.out.println("(Cash taxi: "+this.cash+")");
            }else{
                    System.out.println("Cash insuficient... Va rugam sa incercati cu POS sau SplitPay...");
                    System.out.println("(Cash taxi: "+this.cash+")");
                 }


    }
// TO DO gaseste de ce nu gaseste taxa
    public void Platapos(double POS_sold_c, double taxa)
    {
        if(POS_sold_c>=this.taxa){
            this.POS_sold=this.POS_sold+this.taxa;
            POS_sold_c-=this.taxa;
            System.out.println("Suma POS taxi actuala: "+this.POS_sold);
            System.out.println("Suma POS client actuala: "+POS_sold_c);
        }else {System.out.println("Fonduri insuficiente... Incercati sa platiti cu cash...");
            }
    }

    public void Platestsisi(double POS_sold_c,double cash_clinet,double taxa){
    }

    }
