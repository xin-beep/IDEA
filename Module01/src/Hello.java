import java.util.Arrays;

/**
 * @author wuxin
 * @create 2020-03-21-16:42
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello.main");
        System.out.println("args = " + args);
        int i=0;
        System.out.println("i = " + i);
        System.out.println(i);

    }
}
