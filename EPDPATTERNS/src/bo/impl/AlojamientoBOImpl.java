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
        Alojamiento aux  = (Alojamiento) findById(id);
        if(aux!=null){
            data.getAlojamientos().remove(aux);
        }else{
            log.error("Se ha producido un error al intentar eliminar el Alojamiento con Id: "+id+" no existe un alojamineto en los datos de la aplicación con ese Id.");
        }
    }

    @Override
    public void createOrUpdate(Object object) {
        System.out.println("CREACIÓN DE ALOJAMIENTOS:");
        System.out.println("Introduzca nombre del alojamiento: ");
        String name = ioUtility.readString();
        System.out.println(name);
    }

}
