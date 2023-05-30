abstract class calc {
    public double adicao(double num1,double num2){
        return num1+num2;
    }
    public double  subtracao(double num1,double num2){
        return num1-num2;

    }
    public  double multiplicacao(double num1,double num2){
        return num1*num2;

    }
    public  double divisao(double num1,double num2){
        return num1/num2;

    }
    public  double restoDivisao(double num1,double num2){
        return num1%num2;

    }
    public boolean is_numeric(String num1String, String num2String){
        try {
            double num1 = Double.parseDouble(num1String);
            double num2 = Double.parseDouble(num2String);
            return true;
        } catch (NumberFormatException e) {
             return false;
        }
    }
}
