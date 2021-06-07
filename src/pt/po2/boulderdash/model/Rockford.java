package pt.po2.boulderdash.model;

public class Rockford {
    private static Rockford instance = null;

    protected Rockford(){

    }
    public static Rockford getInstance() {
       if (instance == null) {
           instance = new Rockford();
       }
        return instance;
    }


}
