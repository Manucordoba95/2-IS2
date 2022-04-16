package strategy.bo.impl;

import model.Alojamiento;
import model.Data;
import singleton.Log;
import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class PayPalStrategy implements IPayStrategy {

    private Log log = Log.getInstance(this.getClass());

    @Override
    public void makePay(Alojamiento alojamiento) {
        log.info("Se va a relalizar la transacción con PayPal");
    }

    @Override
    public String getTypeStrategyPay() {
        return "PayPalStrategy";
    }

    

}
