import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Logiczone {
    public ArrayList<String> things = new ArrayList<String>();
    public int ran = -1;
    public int count=0;
    public int rancount =0;
    Logiczone()
    {

    }
    public ArrayList<String> array(String newshop)
    {
        things.add(newshop);
        count++;
        return things;
    } 
    public String random()
    {
       Random random = new Random();
       rancount = random.nextInt(count);
       
       return things.get(rancount);
       
    }
    public void clearList()
    {
     things.clear();
    }
}
