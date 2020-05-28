package com.fundamentals.java;

/*This class is a child of House and will be used in
 * different lessons to show how they work */
public class Condo extends House {
    //fields
    private String balcony;

    //constructor
    public Condo() {
        this("yellow");
    }// end constructor

    public Condo(String doorColor){
        this("rail","fiberglass","shingle","blue",40);
    }// end constructor

    public Condo(String balcony,String foundation, String roofType,
                 String doorColor, int windowSize) {
        super(foundation, roofType,doorColor,windowSize);
        this.balcony = balcony;
    }

    //setter / getter properties
    public String getBalcony() {
        return balcony;
    }// property method getBalcony

    public void setBacony(String balcony) {
        this.balcony = balcony;
    }// end property method setBalcony
    //all other methods


    public void maintenance() {
        System.out.println("Will fix condo issues");
    }// end method maintenance

    // This method overrides the parent
    @Override
    public void doorOpenClose() {
        System.out.println("My door is closed");
    }// end method doorOpenClose

}// end class
