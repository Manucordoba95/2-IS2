package strategy.bo.impl;

import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class MobilePayStrategy implements IPayStrategy{

    @Override
    public void makePay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTypeStrategyPay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public String toString(){
        return this.getClass().getName();
    }
    
}
