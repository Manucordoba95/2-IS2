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
        System.out.println("Factoría de creación de Apartamentos");
        System.out.println(payStrategy.toString());
    }

    @Override
    public void calculatePrice() {
    }

}
