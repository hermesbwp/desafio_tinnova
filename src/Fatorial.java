public class Fatorial {
    private int numero=6;
    public int resultado=1;

    public Fatorial(){}

    public int calcularFatorial(){
        if(numero-1!=0){
            resultado=numero*resultado;
            numero=numero-1;
            calcularFatorial();
        }

        return this.resultado;
    }
}
