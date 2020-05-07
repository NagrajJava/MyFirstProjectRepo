package Features.JAVA8FEATURES;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Function<Integer, Integer> f =i->i*i;
    	     System.out.println(f.apply(4));
        System.out.println( "Hello World!" );
        
        
        ArrayList<Integer> al = new ArrayList<Integer>();
          al.add(3);
          al.add(4);
          al.add(6);
          al.add(10);
          System.out.println(al);
          List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
          List<Integer> l1 = al.stream().map(i->i*2).collect(Collectors.toList());
          System.out.println(l1);
          System.out.println(l);
    }
}
