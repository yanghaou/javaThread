package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * function
 * Author: yang.hao
 * Date: 2016/11/24
 */
public class OomTest {
    static class oom{}
    public static void main(String[] args){
        List<oom> ooms = new ArrayList<oom>();

        while (true){
            ooms.add(new oom());
        }
    }
}
