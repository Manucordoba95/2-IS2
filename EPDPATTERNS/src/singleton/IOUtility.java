package singleton;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel
 */
public class IOUtility {

    private static final IOUtility io = new IOUtility();
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    Log log = Log.getInstance(this.getClass());

    
        private IOUtility() {}

    public static IOUtility getInstance() {

        return io;
    }

    public int readInt() {
        Integer readInt = null;
        try {
           readInt =  Integer.valueOf(bf.readLine());
        } catch (IOException ex) {
            log.error("Se ha producido un error al leer Integer en IOUtility");
            readInt = null;
        }
        return readInt;
    }

    public String readString() {
        String str = null;
        try {
           str =  bf.readLine();
        } catch (IOException ex) {
            log.error("Se ha producido un error al leer String en IOUtility");
            str = null;
        }
        return str;
    }

}
