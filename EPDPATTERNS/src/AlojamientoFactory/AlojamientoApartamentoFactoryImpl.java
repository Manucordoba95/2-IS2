package AlojamientoFactory;

import bo.impl.AlojamientoBOImpl;
import model.Alojamiento;
import model.Apartamento;

import singleton.IOUtility;
import singleton.Log;
import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public class AlojamientoApartamentoFactoryImpl implements IAlojamientoFactory {

    private Log log = Log.getInstance(this.getClass());
    private IOUtility ioUtility = IOUtility.getInstance();

    @Override
    public void create(IPayStrategy payStrategy) {
         log.infoCallMethod("create");
        log.info("Introduzca el nombre del Apartamento: ");
        String name = ioUtility.readString();
        log.info("Introduzca el precio del Apartamento por noche: ");
        double precio = ioUtility.readDouble();
        log.info("Introduzca nº de baños disponibles para el apartamento:");
        int nBanyos = ioUtility.readInt();
        log.info("Introduzca la ubicación del Apartamento: ");
        String ubication = ioUtility.readString();
        Apartamento newApartamento = new Apartamento(name, precio, false, false, payStrategy, ubication, nBanyos);
        
        AlojamientoBOImpl alojamientoBOImpl = new AlojamientoBOImpl();
        alojamientoBOImpl.createOrUpdate(newApartamento);
    }

    @Override
    public void calculatePrice(Alojamiento alojamiento) {
        log.infoCallMethod("calculatePrice");
    }

}
