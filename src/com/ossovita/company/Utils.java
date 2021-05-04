package com.ossovita.company;

public class Utils {

    static void disAllowNullArgs(Object... args){
        for(Object arg : args)
            if(args==null)
                throw new IllegalArgumentException("Null Arguments");
    }

    static void disallowZerosAndNegatives(double...args){
        for(double arg : args)
            if(arg<=0)
                throw new IllegalArgumentException("Zero or negative argument");
    }
}
