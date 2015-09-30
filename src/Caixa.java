public class Caixa {
    private int saldo;
    private int cantidad;
    public Caixa(int saldo){
        this.saldo =saldo;
    }

     public int sacarDinero(int cantidad) {
        this.cantidad = cantidad;
        if (cantidad > saldo) {
            saldo = 0;
        } else {
            saldo = saldo - cantidad;
        }
         return saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    public void IngresarDinero(int cantidad) {
        saldo = saldo + cantidad;
    }
}
