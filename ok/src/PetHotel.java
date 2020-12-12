import java.util.HashMap;
import java.util.*;
public class PetHotel {
     private Map<Integer, Catel> listaCatei = new HashMap<>();

     public void adaugaCatel(Integer index, Catel catel)
     {
          listaCatei.put(index,catel);
     }
     public int numarDeCatei()
     {
          return listaCatei.size();
     }
     public void entrySet() {
          for (Map.Entry<Integer,Catel> entry : listaCatei.entrySet())
          {
               Integer key = entry.getKey();
               Catel value = entry.getValue();
               System.out.println("Cheia este "+key+" si valoarea este "+value.toString());
          }
     }
     public String getValue(Integer index)
     {
          return listaCatei.get(index).toString();
     }
     public void getKeys()
     {
          for(Integer key:listaCatei.keySet())
          {
               System.out.println(key);
          }
     }
     public void getValues()
     {
          for(Catel value:listaCatei.values())
          {
               System.out.println(value.toString());
          }
     }

     public void schimbaCatel(Integer key, Catel catel)
     {
          listaCatei.replace(key,catel);
     }
}
