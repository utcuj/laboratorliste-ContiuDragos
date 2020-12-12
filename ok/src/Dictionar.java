import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;
public class Dictionar {
    private Map<String, String> dictionar = new HashMap<>();


    public void addCuvant(String cuvantRomana, String cuvantEngleza)
    {
        dictionar.put(cuvantRomana,cuvantEngleza);
    }

    public int dimenisiune()
    {
        return dictionar.size();
    }
    public void entrySet() {
        for (Entry<String,String> entry : dictionar.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Cheia este "+key+" si valoarea este "+value);
        }
    }
    public String getValue(String cuvant)
    {
        return dictionar.get(cuvant);
    }

    public void getKeys()
    {
        for(String key:dictionar.keySet())
        {
            System.out.println(key);
        }
    }
    public void getValues()
    {
        for(String value:dictionar.values())
        {
            System.out.println(value);
        }
    }

    public void setNewTranslate(String key, String value) {
        dictionar.put(key, value);
    }

}
