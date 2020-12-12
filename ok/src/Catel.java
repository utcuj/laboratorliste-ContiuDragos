public class Catel {
    private String nume;
    private String rasa;
    private String culoare;
    private int varsta;

    public Catel(String nume, String rasa, String culoare, int varsta)
    {
        this.nume=nume;
        this.rasa=rasa;
        this.culoare=culoare;
        this.varsta=varsta;
    }

    public String toString()
    {
        return "Catelul "+this.nume+" e rasa "+this.rasa+" de culoare "+this.culoare+" si are varsta de "+this.varsta+" ani\n";
    }
}
