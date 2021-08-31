import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        
        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);

        argList.stream()
        .forEach(e->System.out.format("%s ",e));

        System.out.println();
    }
}
