public class Votos {
    private final int total_eleitores=1000;
    private final int validos=800;
    private final int brancos=150;
    private final int nulos=50;

    public Votos(){}

    public int getTotal_eleitores() {
        return total_eleitores;
    }

    public int getValidos() {
        return validos;
    }

    public int getBrancos() {
        return brancos;
    }

    public int getNulos() {
        return nulos;
    }

    public int getPercentual(int valor, int total) {return valor*100/total;}
}
