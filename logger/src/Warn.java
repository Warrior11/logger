package src;

public class Warn {

    void warn(String str, Object obj){
        System.out.println(str + obj.toString());
    }

    void warn(String str){
        System.out.println("[Warn] " + str);
    }
}
