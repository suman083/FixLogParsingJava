import java.lang.reflect.Array;
import java.util.Arrays;

public class StringManupulation {

    public static void main(String[] args) {
        System.out.println("Fixlog parser using array of string ");
        String fixlog="8=FIX.4.3;9=102;35=A;49=BuySide;56=SellSide;34=1;52=20190605-11:37:55.565;98=0;108=30;141=Y;553=Username;554=Password;10=118";
        System.out.println(fixlog);

        //Substring
        //String[] fixtag = fixlog.split("\\.^");
        String[] fixtag=fixlog.split(";");
        System.out.println(Arrays.toString(fixtag));

    }
}
