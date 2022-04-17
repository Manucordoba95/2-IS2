package bo.impl;

import singleton.Data;
import model.Usuario;
import singleton.Log;
import bo.IBaseBO;
import model.Reserva;

/**
 *
 * @author Manuel
 */
public class UserBOImpl implements IBaseBO<Usuario> {

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
        Usuario aux = (Usuario) findById(id);
        if (aux != null) {
            data.getUsuarios().remove(aux);
        } else {
            log.error("Se ha producido un error al intentar eliminar el Usuario con Id: " + id + " no existe un usuario en los datos de la aplicación con ese Id.");
        }
    }

    @Override
    public void createOrUpdate(Object object) {
        log.infoCallMethod("createOrUpdate");
        Usuario aux = (Usuario) object;
        if (aux.getId() != null) {
            log.info("actualizamos el usuario con id:" + aux.getId());
            int index = data.getUsuarios().indexOf(data.getReservas().stream().filter(a -> a.getId().equals(aux.getId())).findAny().get());
            data.getUsuarios().set(index, aux);

        } else {
            log.info("creando un nuevo usuario.");
            data.getUsuarios().add(aux);

        }
    }

}
