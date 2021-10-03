
public class Stationare {
    private double taxastationare=3.5;//3.5 lei pe minut
    private double tarifstart=3.0;//3 lei cand incepe stationarea
    private double tariftotal=0.0;

    public double getTarifstart() {
        return tarifstart;
    }

    public double getTariftotal() {
        return tariftotal;
    }

    public double getTaxastationare() {
        return taxastationare;
    }

    public void setTariftotal(double nr) {
        this.tariftotal += this.tarifstart+nr*this.taxastationare;
    }

}