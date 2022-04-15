package model;

import singleton.IdGenSingleton;

/**
 *
 * @author Manuel
 */
public class ModelEntity {

    private Long id = IdGenSingleton.getInstance().getNextSequence();

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    
}
