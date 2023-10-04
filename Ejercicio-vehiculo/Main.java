public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("CAM213", 4);
        Camion miCamion = new Camion("JJAR89");
        Remolque miRemolque = new Remolque(500);

        miCoche.acelerar(50);
        miCamion.acelerar(80);
        miCamion.ponRemolque(miRemolque);

        System.out.println("Info del Coche: " + miCoche.toString());
        System.out.println("Info del Camion: " + miCamion.toString());

        miCamion.acelerar(30); 
    }
}
