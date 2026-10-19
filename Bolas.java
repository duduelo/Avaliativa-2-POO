class Bolas extends Equipamentos{
    private String tipoBola;

    //Construtor
    public Bolas(int index, String tipoBola){
        super("Bola", index, 1);
        this.tipoBola=tipoBola;
    }

    //Setter
    public void setTipoBola(String tipoBola){
        this.tipoBola=tipoBola;
    }
}