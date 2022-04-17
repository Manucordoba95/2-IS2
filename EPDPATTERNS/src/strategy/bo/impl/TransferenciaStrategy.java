package strategy.bo.impl;

import model.Alojamiento;
import singleton.Data;
import singleton.Log;
import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class TransferenciaStrategy implements IPayStrategy {

    private Log log = Log.getInstance(this.getClass());

    @Override
    public void makePay(Alojamiento alojamiento) {
        log.info("Se va a realizar la transacción mediante Transferencia bancaria.");
    }

    @Override
    public String getTypeStrategyPay() {
        return "TransferenciaStrategy";
    }

}
