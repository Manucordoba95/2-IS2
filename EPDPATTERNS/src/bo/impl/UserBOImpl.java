package bo.impl;

import model.Data;
import model.Usuario;
import singleton.Log;
import bo.IBaseBO;

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
        Usuario aux  = (Usuario) findById(id);
        if(aux!=null){
            data.getUsuarios().remove(aux);
        }else{
            log.error("Se ha producido un error al intentar eliminar el Usuario con Id: "+id+" no existe un usuario en los datos de la aplicación con ese Id.");
        }
    }

    @Override
    public void createOrUpdate(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
