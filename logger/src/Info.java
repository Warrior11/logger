package src;

public class Info {

    void info(String str, Object obj){
        System.out.println(str + obj.toString());
    }

    void info(String str){
        System.out.println("[Info] " + str);
    }
}
