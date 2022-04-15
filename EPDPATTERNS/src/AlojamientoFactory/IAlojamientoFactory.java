package AlojamientoFactory;

import strategy.bo.IPayStrategy;

/**
 *
 * @author Manuel
 */
public interface IAlojamientoFactory {
    public void create(IPayStrategy payStrategy);
    public void calculatePrice();
}
