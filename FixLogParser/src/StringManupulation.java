import java.lang.reflect.Array;
import java.util.*;

public class StringManupulation {

    public static void main(String[] args) {
        System.out.println("Fixlog parser using array of string ");
        String fixlog="8=FIX.4.3;9=102;35=A;49=BuySide;56=SellSide;34=1;52=20190605-11:37:55.565;98=0;108=30;141=Y;553=Username;554=Password;10=118";
        System.out.println(fixlog);
        Validation_tag validation=new Validation_tag();
        //Substring
        //String[] fixtag = fixlog.split("\\.^");
        String[] fixtag=fixlog.split(";");
        System.out.println(Arrays.toString(fixtag));
//map
        Map<String, String> hashMap
                = new HashMap<String, String>();

        // Iterating over array of strings
        for (int i = 0; i < fixtag.length; i++) {
            String[] fixtemp=fixtag[i].split("=");
            System.out.println(Arrays.toString(fixtemp));
            // And set fix tag and value
            hashMap.put(fixtemp[0], fixtemp[1]);
        }

        // Printing HashMap
        System.out.println("String to hashmap: " + hashMap);
        //displaying particular key
        System.out.println("The Value is: " + hashMap.get("141"));
//// printing all the values

        for(String key: hashMap.keySet()){
            System.out.println("The Value is: " + hashMap.get(key));
        }


    }
}
