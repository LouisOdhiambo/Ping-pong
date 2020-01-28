package models;

import java.util.ArrayList;
import java.util.List;

public class PingPong {

    public static ArrayList<Object> runPingPong(int countUpTo) {
        ArrayList<Object> result = new ArrayList<Object>();
        for (int i = 1; i <= countUpTo; i++) {
            if (i % 15 == 0) {
                result.add("pingpong");
            } else if(i % 5 == 0){
                result.add("pong");
            }
            else if(i % 3 == 0){
                result.add("ping");
            }
            else {
                result.add(i);
            }
        }
        return result;
    }
}