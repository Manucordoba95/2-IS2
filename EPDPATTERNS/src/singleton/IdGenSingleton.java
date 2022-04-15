package singleton;

/**
 *
 * @author Manuel
 */
public class IdGenSingleton {
    private static IdGenSingleton instance = new IdGenSingleton();

    private volatile Long next = 0L;

    private IdGenSingleton() {}

    public static IdGenSingleton getInstance() {
        return instance;
    }

    public synchronized Long getNextSequence() {
        return next++;
    }
}
