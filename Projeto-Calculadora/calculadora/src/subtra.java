import java.util.ArrayList;

public class subtra extends calc {
    double resul;
    public double Subt(ArrayList<String> list){
        int tamanho = list.size();
        double result =0;            
        for (int i = 1; i < tamanho; i++) {
            if(tamanho<=2){

                double num1 = Double.parseDouble(list.get(0));
                double num2 = Double.parseDouble(list.get(1));
                result =subtracao(num1, num2);
            }else{
                double num2 = Double.parseDouble(list.get(i));
                result -= subtracao(result, num2);
            }
        }
        return result;
    }
}
