package singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manuel
 */
public class IOUtility {

    private static IOUtility io;
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    Log log = Log.getInstance(this.getClass());

    private IOUtility() {
    }

    public static IOUtility getInstance() {
        if (io == null) {
            io = new IOUtility();
        }
        return io;
    }

    public int readInt() {
        Integer readInt = null;
        try {
            readInt = Integer.valueOf(bf.readLine());
        } catch (IOException ex) {
            log.error("Se ha producido un error al leer Integer en IOUtility");
            readInt = null;
        }
        return readInt;
    }

    public String readString() {
        String str = null;
        try {
            str = bf.readLine();
        } catch (IOException ex) {
            log.error("Se ha producido un error al leer String en IOUtility");
            str = null;
        }
        return str;
    }

    public double readDouble() {
        Double readDouble = null;
        try {
            readDouble = Double.valueOf(bf.readLine());
        } catch (IOException ex) {
            log.error("Se ha producido un error al leer Double en IOUtility");
            readDouble = null;
        }
        return readDouble;
    }

}
