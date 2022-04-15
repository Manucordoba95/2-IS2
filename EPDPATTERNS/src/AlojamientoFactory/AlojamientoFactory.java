package AlojamientoFactory;

import model.AlojamientoTypeEnum;

/**
 *
 * @author Manuel
 */
public class AlojamientoFactory {
    
    
    public static IAlojamientoFactory getInstance(AlojamientoTypeEnum typeEnum){
        IAlojamientoFactory selector = null;
        switch (typeEnum) {
            case HOTEL:
                selector = new AlojamientoHotelFactoryImpl();
                break;
            case APARTAMENTO:
                selector =  new AlojamientoApartamentoFactoryImpl();
                break;
        }
        return selector;
    }
    
    

}
