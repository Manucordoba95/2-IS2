package bo.impl;

import AlojamientoFactory.AlojamientoFactory;
import AlojamientoFactory.IAlojamientoFactory;
import bo.IGestionBO;
import model.Alojamiento;
import model.AlojamientoTypeEnum;
import model.ClientUser;
import model.OwnerUser;
import model.Reserva;
import singleton.IOUtility;
import singleton.Log;
import strategy.bo.IPayStrategy;
import strategy.bo.impl.MobilePayStrategy;
import strategy.bo.impl.PayPalStrategy;
import strategy.bo.impl.TransferenciaStrategy;

/**
 *
 * @author Manuel
 */
public class GestionBOImpl implements IGestionBO {

    AlojamientoBOImpl alojamientoBOImpl = new AlojamientoBOImpl();
    private Log log = Log.getInstance(this.getClass());
    private IOUtility ioUtility = IOUtility.getInstance();

    @Override
    public void makeBook(ClientUser clientUser, Alojamiento alojamiento) {
        log.infoCallMethod("makeBook");
        alojamientoBOImpl.createOrUpdate(new Reserva(null, alojamiento, clientUser));
    }

    @Override
    public void makeBookApartament(OwnerUser ownerUsers, Alojamiento alojamiento, ClientUser clientUser) {
        log.infoCallMethod("makeBookApartament");
        alojamientoBOImpl.createOrUpdate(new Reserva(ownerUsers, alojamiento, clientUser));
    }

    @Override
    public void cancelBook(Long idBook) {
        log.infoCallMethod("cancelBook");
        alojamientoBOImpl.removeById(idBook);
    }

    @Override
    public void showBooks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void createAlojamiento() {
        log.info("CREACIÓN DE ALOJAMIENTOS:");
        AlojamientoFactory.getInstance(obtenerTipoAlojamiento()).create(obtenerTipoStrategyPay());

    }

    private AlojamientoTypeEnum obtenerTipoAlojamiento() {
        int opc = 0;

        while (opc < 1 || opc > 2) {
            log.info("¿Que tipo de alojamiento desea crear?");
            log.info("1. Hotel");
            log.info("2. Apartamento");
            opc = ioUtility.readInt();
        }
        return opc == 1 ? AlojamientoTypeEnum.HOTEL : AlojamientoTypeEnum.APARTAMENTO;
    }

    private IPayStrategy obtenerTipoStrategyPay() {
        int opc = 0;
        IPayStrategy strategySelected;
        while (opc < 1 || opc > 3) {
            log.info("Seleccione la estrategia por defecto de pagos del alojamiento:");
            log.info("1. Transferencias.");
            log.info("2. PayPal.");
            log.info("3. Pagos con dispositivos móviles.");
            opc = ioUtility.readInt();
        }
        if (opc == 1) {
            strategySelected = new TransferenciaStrategy();
        } else if (opc == 2) {
            strategySelected = new PayPalStrategy();
        } else {
            strategySelected = new MobilePayStrategy();
        }
        return strategySelected;

    }

}
