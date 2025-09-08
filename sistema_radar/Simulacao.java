

public class Simulacao {
    public static void main(String[] args) {
        Carro mazda = new Carro("LYSSA777",0,98,"RX7");

        Radar radar = new Radar("Pistão Sul", 60);

        radar.avaliarVelocidade(mazda);

        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.setVelocidade(-60);

        radar.avaliarVelocidade(mazda);
    }
}
