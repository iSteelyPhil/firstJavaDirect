package org.example;

public class Temperature {
    private double farenheight;

    public double getFarenheight() {
        return farenheight;
    }
    public void setFarenheight(double farenheight){
        double absoulteZeroFarenheight = -459.67;

        if(farenheight < absoulteZeroFarenheight){
            System.out.println("BELOW FREEZEING ERROR");
        }
        this.farenheight  = farenheight;
    }
}
