import java.util.Set;
import java.util.HashMap;
public class trackList {
    public static void main (String[] args){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("you and i ","hi");
        trackList.put("ahwak","hi");
        trackList.put("mustabeda","hi");
        trackList.put("strong woman","hi");

        Set<String> keys = trackList.keySet();
        for(String key : keys ) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}