class Bicicletas extends Equipamentos{
    boolean pneuFunciona;
    boolean freioFunciona;
    boolean correnteFunciona;

    //Construtores
    public Bicicletas(int index){
        super("Raquete", index, 7);
        pneuFunciona=true;
        freioFunciona=true;
        correnteFunciona=true;
    }

    public Bicicletas(int index, boolean pneu, boolean freio, boolean corrente){
        super("Raquete", index, 7);
        pneuFunciona=pneu;
        freioFunciona=freio;
        correnteFunciona=corrente;
    }
}