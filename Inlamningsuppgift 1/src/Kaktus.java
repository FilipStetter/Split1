class Kaktus extends Vaxt {
    public Kaktus(String namn, double langd) {
        super(namn, langd);
    }

    @Override
    public double beraknaVatskeMangd() {
        return 0.02; // 2 cl mineralvatten
    }

    @Override
    public String getVatskaTyp() {
        return "mineralvatten";
    }
}