public class MultiplosTresCinco {
    int numero=100;

    public MultiplosTresCinco(){}

    public void getMultiplos(){
        int i=0;
        int soma=0;

        while(i<numero){
            if(i%5==0 || i%3==0){
                soma=soma+i;
            }
            i+=1;
        }

        System.out.println(soma);
    }

}
