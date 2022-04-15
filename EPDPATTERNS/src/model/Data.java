package model;

import java.util.ArrayList;
import java.util.List;
import singleton.IOUtility;

/**
 *
 * @author Manuel
 */
public class Data{
    private List<Alojamiento> alojamientos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

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
