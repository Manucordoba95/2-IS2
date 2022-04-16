package strategy.bo;

import model.Alojamiento;

/**
 *
 * @author Manuel
 */
public interface IPayStrategy {
    void makePay(Alojamiento alojamiento);
    String getTypeStrategyPay();
    
}
