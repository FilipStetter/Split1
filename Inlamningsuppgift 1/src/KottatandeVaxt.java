class KottatandeVaxt extends Vaxt {
    public KottatandeVaxt(String namn, double langd) {
        super(namn, langd);
    }

    @Override
    public double beraknaVatskeMangd() {
        return 0.1 + 0.2 * getLangd();
    }

    @Override
    public String getVatskaTyp() {
        return "proteindryck";
    }
}