package bo.impl;

import bo.IGestionBO;
import model.Alojamiento;
import model.ClientUser;
import model.Data;
import model.OwnerUser;
import model.Reserva;
import singleton.IOUtility;
import singleton.Log;

/**
 *
 * @author Manuel
 */
public class GestionBOImpl implements IGestionBO{
    AlojamientoBOImpl alojamientoBOImpl = new AlojamientoBOImpl(); 
    private Log log = Log.getInstance(this.getClass());
    private IOUtility ioUtility = IOUtility.getInstance();
    @Override
    public void makeBook(ClientUser clientUser, Alojamiento alojamiento) {
       log.infoCallMethod("makeBook");
       alojamientoBOImpl.createOrUpdate(new Reserva(null, alojamiento, clientUser));
    }
     @Override
    public void makeBookApartament(OwnerUser ownerUsers, Alojamiento alojamiento,ClientUser clientUser) {
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
        System.out.println(name);
    }

   
    
}
