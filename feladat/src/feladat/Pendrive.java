package feladat;

/**
 *
 * @author Szatmári Ferenc
 */
public class Pendrive extends Adathordozo {
    private int verzio;

    public Pendrive(int kapacitas, int verzio) {
        super("Pendrive", kapacitas);
        this.verzio = verzio;
    }

    @Override
    public String toString() {
        return super.toString() + ", szabvány verzió: " +verzio;
    }     
  
}
