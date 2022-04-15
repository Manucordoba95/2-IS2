package AlojamientoFactory;

import singleton.Log;
import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class AlojamientoApartamentoFactoryImpl implements IAlojamientoFactory {

    private Log log = Log.getInstance(this.getClass());

    @Override
    public void create(IPayStrategy payStrategy) {
    }

    @Override
    public void calculatePrice() {
    }

}
