
//Achitare Plata cursa taxi

import java.util.Scanner;

public class PlataTaxi {

    private double cash=50.0;
    private double rest=0.0;
    private double POS_sold=150.0;
    private double taxa=0.0;
    public double POS_sold_c=0.0;
    public double cash_clinet=0.0;

    //Getteri
    public double getCash(){
        return cash;
    }

    public double getRest(){
        return  rest;
    }

    public double getPOS_sold(){
        return POS_sold;
    }

//Setteri
    public void setCash(double newCash){
        cash=newCash;
    }
    public void setRest(double newRest){
        rest=newRest;
    }
    public void setPOS_sold(double newPOS_sold){
        POS_sold=newPOS_sold;
    }
    public void setTaxa(double newTaxa){ taxa=newTaxa;}

    public void Platat(double cash_clinet){
        if (cash_clinet<=this.cash) {
        this.rest=this.cash-cash_clinet;
        System.out.println(this.rest);
        }
        else System.out.println("Cash taxi insuficient... Incercati sa platiti cu POS...");
    }
// TO DO gaseste de ce nu gaseste taxa
    public void Platapos(double POS_sold_c, double taxa)
    {
        if(POS_sold_c>=this.taxa){
            this.POS_sold+=this.taxa;
            POS_sold_c-=this.taxa;
            System.out.println("Suma POS taxi actuala: "+this.POS_sold);
            System.out.println("Suma POS client actuala: "+POS_sold_c);
        }else {System.out.println("Fonduri insuficiente... Incercati sa platiti cu cash...");
            }
    }
  /*  public void Restf(double cash_clinet){
        this.rest=this.cash-cash_clinet;
        System.out.println(this.rest);
        */

    }
