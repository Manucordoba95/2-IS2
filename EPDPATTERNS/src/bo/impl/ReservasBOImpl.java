package bo.impl;

import model.Data;
import model.Reserva;
import singleton.Log;
import bo.IBaseBO;

/**
 *
 * @author Manuel
 */
public class ReservasBOImpl implements IBaseBO<Reserva>{
 private Data data = Data.getInstance();
    private Log log = Log.getInstance(this.getClass());
    @Override
    public Object findById(Long id) {
         log.infoCallMethod("findById");
        return data.getUsuarios().stream().filter(a -> a.getId().equals(id)).findFirst().get();
    }

    @Override
    public void removeById(Long id) {
        log.infoCallMethod("removeById");
        Reserva aux  = (Reserva) findById(id);
        if(aux!=null){
            data.getReservas().remove(aux);
        }else{
            log.error("Se ha producido un error al intentar eliminar la Reserva con Id: "+id+" no existe una Reserva en los datos de la aplicación con ese Id.");
        }
    }

    @Override
    public void createOrUpdate(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
