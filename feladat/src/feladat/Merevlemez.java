package feladat;

/**
 *
 * @author Szatmári Ferenc
 */
public class Merevlemez extends Adathordozo {
    private int fordulatszam;

    public Merevlemez(int kapacitas, int fordulatszam) {
        super("Merevlemez", kapacitas);
        this.fordulatszam = fordulatszam;
    }

    @Override
    public String toString() {
        return super.toString() + ", fordulatszám: " + fordulatszam;
    }
    
    
    
}
