package runnable;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FiveG {
    Runnable r =() -> System.out.println("lambda");
    Predicate<String> w =(g)-> g!=null;
    Consumer<String> firstC = x -> System.out.println(x.toLowerCase());
    BiFunction<Integer,Integer,Integer> max =(x,y)-> {if (x<y){return y;}else {return x;}};

    public static void main(String[] args) {
        FiveG gf = new FiveG();
        Thread t = new Thread(gf.r);
        t.start();
        System.out.println("my code"+gf.max.apply(10,20));
        System.out.println(gf.w.test("gokul"));
        List<String> list=new ArrayList<String>();
        list.add("shark");
        list.add("lion");
        list.add("tiger");
        list.add("crow");

        list.forEach(
                (n)->System.out.println(n)
        );
    }
}



