import java.util.ArrayList;

public class resto extends calc {
    double resul;
    public double rest(ArrayList<String> list){
        int tamanho = list.size();
        double result =0;            
        for (int i = 1; i < tamanho; i++) {
            if(tamanho<=2){

                double num1 = Double.parseDouble(list.get(0));
                double num2 = Double.parseDouble(list.get(1));
                result =restoDivisao(num1, num2);
            }else{
                double num2 = Double.parseDouble(list.get(i));
                result += restoDivisao(result, num2);
            }
        }
        return result;
    }
}
