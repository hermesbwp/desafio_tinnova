import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {
    private int[] vetor={8,5,3,9,2,4,10,7,1,0,6};

    public BubbleSort(){}
    public void getVetor(){
        int i=0;

        while(i<vetor.length){
            percorrerVetor();
            i+=1;
        }

        Arrays.stream(vetor).forEach(System.out::println);
    }

    private void percorrerVetor() {
        for(int i=0;i<vetor.length;i++){
            if(i+1<vetor.length){
                if(change(vetor[i],vetor[i+1])){
                    var aux = vetor[i];
                    vetor[i]=vetor[i+1];
                    vetor[i+1]=aux;
                }
            }
        }
    }

    public boolean change(int a, int b){
        if(a>b) return true;
        return false;
    }

}