import java.util.ArrayList;

public class multipli extends calc {
    double resul;
    public double multi(ArrayList<String> list){
        int tamanho = list.size();
        double result =0;            
        for (int i = 2; i < tamanho; i++) {
            if(tamanho==2){

                double num1 = Double.parseDouble(list.get(0));
                double num2 = Double.parseDouble(list.get(1));
                result =multiplicacao(num1, num2);
            }else{
                double num2 = Double.parseDouble(list.get(i));
                result *= multiplicacao(result, num2);
            }
        }
        return result;
    }
}
