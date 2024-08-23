package ico.fesa.unam.mx.introduccion.composicion;

public class Rueda {
    private int rodada;
    private String tamanio;
    private String material;


    public Rueda() {
    }

    public Rueda(int rodada, String tamanio, String material) {
        this.rodada = rodada;
        this.tamanio = tamanio;
        this.material = material;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "rodada=" + rodada + " pulgadas" +
                ", tamanio='" + tamanio + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public void rodar(){
        System.out.println("Rodando...");
    }

}
