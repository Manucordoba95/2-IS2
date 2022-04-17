package AlojamientoFactory;

import model.Alojamiento;
import singleton.Log;
import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class AlojamientoHotelFactoryImpl implements IAlojamientoFactory {

    private Log log = Log.getInstance(this.getClass());
    
    @Override
    public void create(IPayStrategy payStrategy) {
        log.info("CREACIÓN DE HOTEL");
        log.info("Introduzca el nombre del Hotel: ");
    }

    @Override
    public void calculatePrice(Alojamiento alojamiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
