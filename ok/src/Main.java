import java.sql.ClientInfoStatus;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args)
    {
        /*
        FacebookAccount dan = new FacebookAccount("Dan",20,"Cluj");
        Friends emi = new Friends("Emi","Oradea");
        Friends dragos = new Friends("Dragos","Targu Mures");
        Friends miahi = new Friends("Mihai","Bistrita");
        Friends bogdan = new Friends("Bogdan","Bistrita");

        dan.adaugaPrieten(emi);
        dan.adaugaPrieten(dragos);
        dan.adaugaPrieten(miahi);


        dan.afisarePrieteni();
        System.out.println();
        dan.stergePrieten(dragos);
        dan.afisarePrieteni();

        System.out.println();
        List<Friends> prieteni = dan.getFriendsByLocation("Bistrita");
        for(Friends f: prieteni)
        {
            System.out.println(f.getNume()+' '+f.getLocatie());
            System.out.println();
        }

        Implementati un Dictionar roman-englez pentru maxim 10 cuvinte la alegere folosind un java.util.Map
//        - afisati numarul de cuvinte salvate in dictionar (size)
//        - afisati toate cuvintele din dictionar impreuna cu traducerea lor (entrySet)
//        - afisati toate cuvintele in romana pentru care avem traducerea (chei)
//        - afisati toate cuvintele in engleza pentru care avem traducerea (valori)
//        - updatati valoarea unui cuvant din dictionar cu o noua traducere si afisati-o la consola


        Dictionar dictionar = new Dictionar() ;
        dictionar.addCuvant("mar","apple");
        dictionar.addCuvant("masina","car");
        dictionar.addCuvant("casa","house");
        dictionar.addCuvant("geam","window");
        dictionar.addCuvant("pahar","glass");

        dictionar.entrySet();

        System.out.println(dictionar.getValue("geam"));

        dictionar.getKeys();
        System.out.println();
        dictionar.getValues();

        System.out.println();
        dictionar.setNewTranslate("mar","BEMVEU");
        dictionar.entrySet();
        */

        PetHotel hotel = new PetHotel();
        Catel caine1 = new Catel("Max","Huskey","Alb",7);
        Catel caine2 = new Catel("Leia","Poodle","Gri",4);
        Catel caine3 = new Catel("Tara","Cocker","Alb inchis",2);
        Catel caine4 = new Catel("John","Golden Retriever","Golden",1);
        Catel caine5 = new Catel("Rex","Pitbul","Maro",9);
        Catel caine6 = new Catel("Pablo","Bulldog","Cafeniu",5);
        Catel caine7 = new Catel("Sony","Beagle","Maro",1);
        hotel.adaugaCatel(1,caine1);
        hotel.adaugaCatel(2,caine2);
        hotel.adaugaCatel(3,caine3);
        hotel.adaugaCatel(4,caine4);
        hotel.adaugaCatel(5,caine5);
        hotel.adaugaCatel(6,caine6);

        hotel.entrySet();

        System.out.println(hotel.getValue(2));

        hotel.getKeys();
        System.out.println();
        hotel.getValues();
        System.out.println();

        hotel.schimbaCatel(1,caine7);
        hotel.entrySet();

    }
}
