package bo;

import model.Alojamiento;
import model.ClientUser;
import model.OwnerUser;

/**
 *
 * @author Manuel
 */
public interface IGestionBO {
    public void makeBook(ClientUser clientUser, Alojamiento alojamiento);
    public void makeBookApartament(OwnerUser ownerUsers, Alojamiento alojamiento,ClientUser clientUser);
    public void cancelBook(Long idBook);
    public void showBooks();
    public void createAlojamiento();
    
}
