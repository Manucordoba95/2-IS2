package bo.impl;

import singleton.Data;
import model.Reserva;
import singleton.Log;
import bo.IBaseBO;
import model.Alojamiento;

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
                log.infoCallMethod("createOrUpdate");

       Reserva aux = (Reserva) object;
        if (aux.getId() != null) {
            log.info("actualizamos la reserva con id:" + aux.getId());
            int index = data.getReservas().indexOf(data.getReservas().stream().filter(a -> a.getId().equals(aux.getId())).findAny().get());
            data.getReservas().set(index, aux);

        } else {
            log.info("creando una nueva reserva.");
            data.getReservas().add(aux);

        }
    }
    
}
