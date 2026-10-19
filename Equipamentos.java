abstract class Equipamentos{
    private String tipoEquipamento;
    private int index;
    private int tempoMaximo;
    private boolean disponivel;

    //Construtor
    public Equipamentos(String tipo, int index, int tempoMaximo){
        setTipo(tipo);
        setIndex(index);
        setTempoMax(tempoMaximo);
    }

    //Getters
    public String getTipo(){
        return tipoEquipamento;
    }

    public int getIndex(){
        return index;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    //Setters
    public void setTipo(String tipo){
        tipoEquipamento=tipo;
    }

    public void setIndex(int index){
        this.index=index;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel=disponivel;
    }

    public void setTempoMax(int tempoMaximo){
        this.tempoMaximo=tempoMaximo;
    }
    //Métodos


}