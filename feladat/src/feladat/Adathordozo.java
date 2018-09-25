package feladat;

/**
 *
 * @author Szatmári Ferenc
 */
public class Adathordozo {
    private String nev;
    private int kapacitas;

    public Adathordozo(String nev, int kapacitas) {
        this.nev = nev;
        this.kapacitas = kapacitas;
    }

    @Override
    public String toString() {
        return nev + ", kapacitás = " +kapacitas;
    }
    
    public boolean nagyobbMint(Adathordozo masik){
        return kapacitas-masik.kapacitas>0;
    }

}
