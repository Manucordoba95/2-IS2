package model;

import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class Alojamiento extends ModelEntity{
   
    private String name;
    private double price;
    private boolean reserved;
    private boolean busy;
    private IPayStrategy payStrategy;

   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the reserved
     */
    public boolean isReserved() {
        return reserved;
    }

    /**
     * @param reserved the reserved to set
     */
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    /**
     * @return the busy
     */
    public boolean isBusy() {
        return busy;
    }

    /**
     * @param busy the busy to set
     */
    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    /**
     * @return the payStrategy
     */
    public IPayStrategy getPayStrategy() {
        return payStrategy;
    }

    /**
     * @param payStrategy the payStrategy to set
     */
    public void setPayStrategy(IPayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
    
    
   
    
    
    
}
