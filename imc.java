public class imc {
    public static void main(String[] args) {
        // Objeto Pessoa
        Pessoa pessoa = new Pessoa("Mateus", 83.0, 1.83);
        pessoa.setIdade(19);

        // Objeto Atleta como referência de Pessoa
        Pessoa atleta = new Atleta("Carlos", 75.0, 1.80, "Natação");
        atleta.setIdade(22);

        // Exibir detalhes e IMC
        System.out.println("----- Pessoa -----");
        pessoa.mostrarDetalhes();

        System.out.println("\n----- Atleta -----");
        atleta.mostrarDetalhes();
        //Vai chamar o atleta
    }
}
