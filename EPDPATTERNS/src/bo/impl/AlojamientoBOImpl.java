package bo.impl;

import java.util.Optional;
import model.Alojamiento;
import model.Data;
import singleton.Log;
import bo.IBaseBO;
import singleton.IOUtility;

/**
 *
 * @author Manuel
 */
public class AlojamientoBOImpl implements IBaseBO<Alojamiento> {

    private Data data = Data.getInstance();
    private Log log = Log.getInstance(this.getClass());
    private IOUtility ioUtility = IOUtility.getInstance();

    @Override
    public Object findById(Long id) {
        log.infoCallMethod("findById");
        return data.getAlojamientos().stream().filter(a -> a.getId().equals(id)).findFirst().get();
    }

    @Override
    public void removeById(Long id) {
        log.infoCallMethod("removeById");
        Alojamiento aux = (Alojamiento) findById(id);
        if (aux != null) {
            data.getAlojamientos().remove(aux);
        } else {
            log.error("Se ha producido un error al intentar eliminar el Alojamiento con Id: " + id + " no existe un alojamineto en los datos de la aplicación con ese Id.");
        }
    }

    @Override
    public void createOrUpdate(Object object) {
        Alojamiento aux = (Alojamiento) object;
        if (aux.getId() != null) {
            log.info("actualizamos el alojamiento con id:" + aux.getId());
            int index = data.getAlojamientos().indexOf(data.getAlojamientos().stream().filter(a -> a.getId().equals(aux.getId())).findAny().get());
            data.getAlojamientos().set(index, aux);

        } else {
            log.info("creando un nuevo alojamiento.");
            data.getAlojamientos().add(aux);

        }

    }

}
