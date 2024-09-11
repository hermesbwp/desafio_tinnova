//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var votos=new Votos();
        System.out.println(votos.getPercentual(votos.getBrancos(), votos.getTotal_eleitores()));
        System.out.println(votos.getPercentual(votos.getNulos(), votos.getTotal_eleitores()));
        System.out.println(votos.getPercentual(votos.getValidos(), votos.getTotal_eleitores()));

        var bubble=new BubbleSort();
        bubble.getVetor();

        var fatorial=new Fatorial();
        fatorial.calcularFatorial();
        System.out.println(fatorial.resultado);

        var multiplos=new MultiplosTresCinco();
        multiplos.getMultiplos();
    }
}