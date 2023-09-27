public class cilindroHueco extends Cilindro {
    private double radioInterior;

    public cilindroHueco(){

    }
    public void setRadioInterior(double radioInterior){
        this.radioInterior = radioInterior;
    }
    @Override
    public double volumen() {
        double volumenExterior = super.volumen();
        double volumenInterior = Math.PI * radioInterior * radioInterior * getAltura();
        return volumenExterior - volumenInterior;
    }
}
