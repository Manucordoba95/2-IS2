package AlojamientoFactory;

import model.Data;
import singleton.Log;
import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class AlojamientoHotelFactoryImpl implements IAlojamientoFactory {

    private Data data = Data.getInstance();
    private Log log = Log.getInstance(this.getClass());

    @Override
    public void create(IPayStrategy payStrategy) {
        System.out.println("Factoria creación de Hotel");
        System.out.println(payStrategy.toString());
    }

    @Override
    public void calculatePrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
