package AlojamientoFactory;

import model.Alojamiento;
import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public interface IAlojamientoFactory {
    public void create(IPayStrategy payStrategy);
    public void calculatePrice(Alojamiento alojamiento);
}
