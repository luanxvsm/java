import java.util.Scanner;

public class imc {
    public void ExibirIMC(){
    System.out.println("Digite o seu peso: ");
    Scanner entrada = new Scanner(System.in);
    double peso = entrada.nextDouble();

    System.out.println("Digite a sua altura: ");
    Scanner entrada2 = new Scanner(System.in);
    double altura = entrada2.nextDouble();
    
    double resultado;
    resultado = peso / (altura*altura);
    //System.out.printf("%.2f", resultado);

    if(resultado < 18.5){
        System.out.printf("O seu IMC é %.2f e você é considerado magro(a)", resultado);
    } else if(resultado > 18.5 && resultado < 24.9){
        System.out.printf("O seu IMC é %.2f e você é considerado normal", resultado);
    } else if(resultado > 25 && resultado < 29.9){
        System.out.printf("O seu IMC é %.2f e você é considerado sobrepeso", resultado);
    } else if(resultado > 30 && resultado < 34.9){
        System.out.printf("O seu IMC é %.2f e você é considerado obeso(a)", resultado);
    } else{
        System.out.printf("O seu IMC é %.2f e você é considerado obesidade mórbida", resultado);
    }

    entrada.close();
    entrada2.close();
    }    
}
