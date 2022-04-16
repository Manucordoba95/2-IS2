package model;

import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class Apartamento extends Alojamiento {

    private String ubication;
    private int nBathrooms;

    public Apartamento(String name, double price, boolean reserved, boolean busy, IPayStrategy payStrategy, String ubication, int nBathrooms) {
        super(name, price, reserved, busy, payStrategy);
        this.ubication = ubication;
        this.nBathrooms = nBathrooms;
    }

    /**
     * @return the ubication
     */
    public String getUbication() {
        return ubication;
    }

    /**
     * @param ubication the ubication to set
     */
    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    /**
     * @return the nBathrooms
     */
    public int getnBathrooms() {
        return nBathrooms;
    }

    /**
     * @param nBathrooms the nBathrooms to set
     */
    public void setnBathrooms(int nBathrooms) {
        this.nBathrooms = nBathrooms;
    }

}
