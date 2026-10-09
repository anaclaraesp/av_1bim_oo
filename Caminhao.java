package avalicao1bim;

import java.util.ArrayList;

public class Caminhao extends Pacote{
    private String placa = "ABC-1234";
    private double capacidadeQuilos = 1000.0;
    private double capacidadeVolume = 5000.0;

    private ArrayList<Pacote>pacotes;

    public Caminhao(int id, double peso, double volume, String placa, double capacidadeQuilos, double capacidadeVolume) {
        super(id, peso, volume);
        this.placa = placa;
        this.capacidadeQuilos = capacidadeQuilos;
        CapacidadeVolume = capacidadeVolume;
    }

    @Override
    public String toString() {
        return "Caminhao [placa =" + placa + ", capacidadeQuilos =" + capacidadeQuilos + ", CapacidadeVolume =" + CapacidadeVolume + "]";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeQuilos() {
        return capacidadeQuilos;
    }

    public void setCapacidadeQuilos(double capacidadeQuilos) {
        this.capacidadeQuilos = capacidadeQuilos;
    }

    public double getCapacidadeVolume() {
        return CapacidadeVolume;
    }

    public void setCapacidadeVolume(double capacidadeVolume) {
        CapacidadeVolume = capacidadeVolume;
    }

    public ArrayList<Pacote> getPacotes() {
        return pacotes;
    }

    public void setPacotes(ArrayList<Pacote> pacotes) {
        this.pacotes = pacotes;
    }

    public double calcularTotalPeso(){

    }

    public double calcularTotalVolume(){

    }
}
