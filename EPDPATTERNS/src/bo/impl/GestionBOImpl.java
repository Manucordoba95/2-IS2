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
        System.out.println("CREACIÓN DE ALOJAMIENTOS:");
        System.out.println("Introduzca nombre del alojamiento: ");
        String name = ioUtility.readString();
        
        AlojamientoFactory.getInstance(obtenerTipoAlojamiento()).create(obtenerTipoStrategyPay());

    }

    private AlojamientoTypeEnum obtenerTipoAlojamiento() {
        int opc = 0;

        while (opc < 1 || opc > 2) {
            System.out.println("¿Que tipo de alojamiento desea crear?");
            System.out.println("1. Hotel");
            System.out.println("2. Apartamento");
            opc = ioUtility.readInt();
        }
        return opc == 1 ? AlojamientoTypeEnum.HOTEL : AlojamientoTypeEnum.APARTAMENTO;
    }

    private IPayStrategy obtenerTipoStrategyPay() {
        int opc = 0;
        IPayStrategy strategySelected;
        while (opc < 1 || opc > 3) {
            System.out.println("Seleccione la estrategia por defecto de pagos del alojamiento:");
            System.out.println("1. Transferencias.");
            System.out.println("2. PayPal.");
            System.out.println("3. Pagos con dispositivos móviles.");
            opc = ioUtility.readInt();
        }
        if(opc == 1){
            strategySelected = new TransferenciaStrategy();
        }else if(opc == 2){
            strategySelected = new PayPalStrategy();
        }else{
            strategySelected = new MobilePayStrategy();
        }
        return strategySelected;
           
    }

}
