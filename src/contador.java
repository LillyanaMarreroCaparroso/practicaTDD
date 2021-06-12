public class contador {

    private static int valorActual = 0 ;
    private static int incremento = 1;
    private static int valorLimite;

    public contador(int valorActual, int incremento, int valorLimite) {
        this.valorActual = valorActual;
        this.incremento = incremento;
        this.valorLimite = valorLimite;
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
        return this.valorActual;
    }
}
