import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {

        String vaxtNamn = JOptionPane.showInputDialog("Vilken växt ska få mat?");
        double vatskaMangd = 0.0;
        String vatskaTyp = "";

        Vaxt vaxt = null;


        // I DENNA SWITCH ANVÄNDS POLYMORFISM
        switch (vaxtNamn) {
            case "Igge":
                vaxt = new Kaktus("Igge", 0.2);
                break;
            case "Laura":
                vaxt = new Palm("Laura", 5.0);
                break;
            case "Meatloaf":
                vaxt = new KottatandeVaxt("Meatloaf", 0.7);
                break;
            case "Olof":
                vaxt = new Palm("Olof", 1.0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Okänd växt.");
                return;
        }

        vatskaMangd = vaxt.beraknaVatskeMangd();
        vatskaTyp = vaxt.getVatskaTyp();

        JOptionPane.showMessageDialog(null, "Växten " + vaxtNamn + " ska få " + vatskaMangd + " liter " + vatskaTyp + ".");
    }
}
