package AlojamientoFactory;

import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class AlojamientoHotelFactoryImpl implements IAlojamientoFactory {

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
