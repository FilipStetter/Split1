abstract class Vaxt implements VaxtBehov {

    //INKAPSLING
    private String namn;
    private double langd;

    public Vaxt(String namn, double langd) {
        this.namn = namn;
        this.langd = langd;
    }

    public String getNamn() {
        return namn;
    }

    public double getLangd() {
        return langd;
    }

    @Override
    public String getVatskaTyp() {
        return "okänd vätska";
    }
}