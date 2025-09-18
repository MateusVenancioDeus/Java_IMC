public class Atleta extends Pessoa {
    private String esportePraticado;

    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    public double calcularIMC() {
        double imc = super.calcularIMC();
        return imc * 0.95;
    }

    public void mostrarDetalhesAtleta() {
        super.mostrarDetalhes();
        System.out.println("Esporte praticado: " + esportePraticado);
    }
}
