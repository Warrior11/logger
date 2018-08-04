package src;


public class Logger {

    private static Logger log;
    private static Info info;
    private static Error error;
    private static Warn warn;

   public static Logger getLogger(){
       if(log == null){
           info  = new Info();
           warn = new Warn();
           error = new Error();
           log = new Logger();
           return log;
       }
       return log;
    }

    public void info(String str){
        info.info(str);
    }

    public void warn(String str){
         warn.warn(str);
    }

    public void error(String str){
         error.error(str);
    }
}
