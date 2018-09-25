package feladat;

/**
 *
 * @Sztamári Ferenc
 */
public class Feladat {

    public static void main(String[] args) {
        Adathordozo adathordozok [] = {new Merevlemez(500, 7200), new Merevlemez(1000, 5400), new Pendrive (64, 2), new Pendrive (128, 3)};
        
        //Kiíratás
        for (int i = 0; i < 4; i++) {
            System.out.println(adathordozok [i]);
        }
        
        //Legnagyobb kapacitású adathordozó
        int leg=0;
        for (int i = 1; i < 4; i++) {
            if (adathordozok [i].nagyobbMint(adathordozok [leg])) {
                leg=i;
            }
        }
        System.out.println("A legnagyobb kapacitású: " + adathordozok [leg]);
        
        //Penrive-ok kiíratása
        System.out.println("Pendrive-ok:");
        for (int i = 0; i < 4; i++) {
            if (adathordozok [i] instanceof Pendrive) {
                System.out.println(adathordozok [i]);
            }
        }
        Próba
        System.out.println("");
        Adathordozo a=new Merevlemez (64, 2);
        Merevlemez m=(Merevlemez)a;
        System.out.println(a);
        System.out.println(m);
        
    }
    
}
