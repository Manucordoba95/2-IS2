package singleton;

/**
 *
 * @author Manuel
 */
public class Log {

    private static final Log logInstance = new Log();
    private String msg;    
    private static  Class classCall;

    private Log() {
        
    }

    public static Log getInstance(Class classCall) {
        setClass(classCall);
        return logInstance;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

   

    public void info(String msg) {
        System.out.println(msg);
    }

    public void error(String error) {
        System.err.println(error);
    }

    public void debug(String debug) {
        System.out.println("DEBUG LOG MODE-- INFO MSG: " + debug + "CLASS CALL IDENTIFIER: "+classCall.getName());
    }
    
    public void infoCallMethod(String methodCallName) {
        System.out.println("'Entrando en el método '"+methodCallName+" de la clase:'"+classCall.getName()+"'");
    }
    
    private static void setClass(Class callClassentry){
        classCall = callClassentry;
    }

}
