class Palm extends Vaxt {
    public Palm(String namn, double langd) {
        super(namn, langd);
    }

    @Override
    public double beraknaVatskeMangd() {
        return 0.5 * getLangd();
    }

    @Override
    public String getVatskaTyp() {
        return "kranvatten";
    }
}