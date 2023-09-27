public class Main  {
    public static void main(String[]args){
        Circulo miCirculo = new Circulo();
        miCirculo.setRradio(6.0);
        System.out.println("El area de el circulo es : " + miCirculo.area());
        System.out.println("La circunferencia del circulo es  : " + miCirculo.circunferencia());


    
        Cilindro miCilindro = new Cilindro();
        miCilindro.setRradio(4.0);
        miCilindro.setAltura(2.0);

        System.out.println("El volumen de el cilindro es : " + miCilindro.volumen());
        

        cilindroHueco mCilindroHueco = new cilindroHueco();
        mCilindroHueco.setRradio(2.0);
        mCilindroHueco.setAltura(3.4);
        mCilindroHueco.setRadioInterior(1.1);
    
        System.out.println("El volumen de el cilindro hueco es de : " + mCilindroHueco.volumen());
    }
}
