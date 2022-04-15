package model;

import java.util.Date;


/**
 *
 * @author Manuel
 */
public class Reserva extends ModelEntity{
    
    private Usuario usuario;
    private Alojamiento alojamiento;
    private ClientUser cliente;
    private Date fechaInicioReserva;
    private Date fechaFinReserva;

    
    public Reserva(Usuario usuario, Alojamiento alojamiento, ClientUser cliente){
        this.usuario = usuario;
        this.alojamiento = alojamiento;
        this.cliente = cliente;
    }
    
    
    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the alojamiento
     */
    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    /**
     * @param alojamiento the alojamiento to set
     */
    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    /**
     * @return the cliente
     */
    public ClientUser getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(ClientUser cliente) {
        this.cliente = cliente;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String tipoAlojamiento = (alojamiento instanceof Apartamento) ? "Apartamento" : "Hotel";
        sb.append("Reserva de tipo: " + tipoAlojamiento);
        sb.append("Datos del USUARIO "+usuario.toString());
        sb.append("DATOS DEL CLIENTE:"+ cliente.toString());
        sb.append(" Fecha de la reserva: INICIO:" + fechaInicioReserva.toString() + " FIN:" +fechaFinReserva.toString());
        return sb.toString();
    }

   
    
    
}
