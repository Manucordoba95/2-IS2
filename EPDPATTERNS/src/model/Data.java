package model;

import java.util.List;
import singleton.IOUtility;

/**
 *
 * @author Manuel
 */
public class Data{
    private List<Alojamiento> alojamientos;
    private List<Usuario> usuarios;
    private List<Reserva> reservas;

    private static final Data dataInstance = new Data();
    
    private Data(){}
    
    public static Data getInstance(){
        return dataInstance;
    }
    /**
     * @return the alojamientos
     */
    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }  

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public List<Reserva> getReservas(){
        return reservas;
    }

   
    
    
    
}
