package src;

public class Error {

    void error(String str, Object obj){
        System.out.println(str + obj.toString());
    }

    void error(String str){
        System.out.println("[Error] " + str);
    }
}
