package Pracownia.Introduction;

import org.apache.log4j.Logger;

public class Main {

    static Logger log = Logger.getLogger("abc"); //static method on class Logger, static object


    public static void main(String [ ] args) {

        log.info("message");


        System.out.println("Hello World");
    }
}