package avalicao1bim;

public class Pacote {
    private int id = 101;
    private double peso = 12.5;
    private double volume = 300.0;

    public Pacote(int id, double peso, double volume) {
        this.id = id;
        this.peso = peso;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Pacote [ID =" + id + ", PESO =" + peso + ", VOLUME =" + volume + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("ID: " + this.id);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        System.out.println("Peso: " + this.peso);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
        System.out.println("Volume: " + this.volume);
    }


}
