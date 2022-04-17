package singleton;

/**
 *
 * @author Manuel
 */
public class IdGenSingleton {

    private static IdGenSingleton instance;

    private volatile Long next = 0L;

    private IdGenSingleton() {
    }

    public static IdGenSingleton getInstance() {
        if (instance == null) {
            instance = new IdGenSingleton();
        }
        return instance;
    }

    public synchronized Long getNextSequence() {
        return next++;
    }
}
