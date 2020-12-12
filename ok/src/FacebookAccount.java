import java.util.*;
import java.util.stream.Collectors;

public class FacebookAccount {
    private String nume;
    private int varsta;
    private String locatie;
    private List<Friends> listaPrieteni = new ArrayList<>();

    public FacebookAccount(String nume, int varsta, String locatie)
    {
        this.nume=nume;
        this.varsta=varsta;
        this.locatie=locatie;
    }
    public void adaugaPrieten(Friends prieten)
    {
        listaPrieteni.add(prieten);
    }
    public void stergePrieten(Friends prieten)
    {
        listaPrieteni.remove(prieten);
    }

    public List<Friends> getFriends()
    {
        return listaPrieteni;
    }
    public List<Friends> getFriendsByLocation(String location)
    {
        return (List<Friends>)listaPrieteni.stream().filter(friends-> friends.getLocatie().equals(locatie)).collect(Collectors.toList());
    }

    public void afisarePrieteni()
    {
        for(Friends prieten: listaPrieteni)
        {
            System.out.println(prieten.getNume()+' '+prieten.getLocatie());
        }
    }
}
