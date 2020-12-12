public class Friends {
    private String nume;
    private String locatie;

    public Friends(String nume, String locatie)
    {
        this.nume=nume;
        this.locatie=locatie;
    }

    public boolean equals(Object o)
    {
        Friends prieten = (Friends)o;
        if(this.nume.equals(prieten.getNume()) && this.locatie.equals(prieten.getLocatie()) )
            return true;
        return false;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
}
