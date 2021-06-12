public class contador {

    private static int valorActual = 0 ;
    private static int incremento = 1;
    private static int valorLimite;
    private static int valorInicial = 0;

    public contador(int valorActual, int incremento, int valorLimite, int valorInicial) {
        this.valorActual = valorActual;
        this.incremento = incremento;
        this.valorLimite = valorLimite;
        this.valorInicial = valorInicial;
    }

    public int getValorInicial() {
        return valorInicial;
    }
    public void setValorInicial(int valorInicial) {
        this.valorInicial = valorInicial;
    }
    public int getValorLimite() {
        return valorLimite;
    }
    public void setValorLimite(int valorLimite) {
        this.valorLimite = valorLimite;
    }
    public int getValorActual() {
        return valorActual;
    }
    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }
    public int getIncremento() {
        return incremento;
    }
    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int tenerValorActual(){
        return getValorActual();
    }

    public void incrementarContador(){
        if (getValorActual() + getIncremento() > getValorLimite()) {
            setValorActual(getValorInicial());
        }
        else{
            setValorActual(getValorActual() + getIncremento());
        }
    }

    public void resetearContador(){
        setValorActual(getValorInicial());
    }
}
