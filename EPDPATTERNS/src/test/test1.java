package test;

import bo.impl.GestionBOImpl;
import model.Usuario;
import singleton.IOUtility;

/**
 *
 * @author Manuel
 */
public class test1 {

    public static void main(String[] args) {
        GestionBOImpl gestionBOImpl = new GestionBOImpl();
        gestionBOImpl.createAlojamiento();
    }
}
