package bo;

import java.util.Optional;

/**
 *
 * @author Manuel
 */
public interface IBaseBO<T>{
    Object findById(Long id);    
    void removeById(Long id);    
    void createOrUpdate(Object object);
    
}
