package strategy.bo.impl;

import model.Alojamiento;
import singleton.Log;
import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class MobilePayStrategy implements IPayStrategy {

    private Log log = Log.getInstance(this.getClass());
    @Override
    public void makePay(Alojamiento alojamiento) {
        log.info("Se va a realizar la transacción con pago de tipo móvil.");
        
    }

    @Override
    public String getTypeStrategyPay() {
        return "MobilePayStrategy";
    }

   

}
