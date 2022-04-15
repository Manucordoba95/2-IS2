package model;

/**
 *
 * @author Manuel
 */
public class Hotel extends Alojamiento{
    private int nRooms;
    private String ubication;

    /**
     * @return the nRooms
     */
    public int getnRooms() {
        return nRooms;
    }

    /**
     * @param nRooms the nRooms to set
     */
    public void setnRooms(int nRooms) {
        this.nRooms = nRooms;
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
    
    
}
