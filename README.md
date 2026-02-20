🧮 Cálculo de IMC em Java (Pessoa e Atleta)

Este projeto em Java demonstra conceitos fundamentais de Programação Orientada a Objetos (POO) como herança, polimorfismo, encapsulamento e sobrescrita de métodos, utilizando o cálculo de IMC (Índice de Massa Corporal) como exemplo prático.

A aplicação possui duas classes principais (Pessoa e Atleta) e uma classe executável (imc) responsável por testar o funcionamento do sistema.

📌 Sobre o Projeto

O sistema permite:

Criar uma pessoa comum e calcular seu IMC

Criar um atleta (que herda de pessoa)

Aplicar uma regra diferenciada de cálculo de IMC para atletas

Demonstrar polimorfismo utilizando referência do tipo Pessoa

🏗 Estrutura das Classes
👤 Classe Pessoa

Representa uma pessoa com os seguintes atributos:

nome

idade

peso

altura

Principais métodos:

calcularIMC() → Calcula o IMC com a fórmula:

IMC = peso / (altura * altura)

mostrarDetalhes() → Exibe todas as informações da pessoa, incluindo o IMC

Getters e Setters para controle dos atributos (encapsulamento)

🏃 Classe Atleta

A classe Atleta herda de Pessoa:

public class Atleta extends Pessoa

Ela adiciona:

esportePraticado

Além disso, sobrescreve o método calcularIMC(), aplicando um ajuste de 5% no valor final:

return imc * 0.95;

Esse ajuste simula uma diferença no cálculo considerando a composição corporal do atleta.

🖥 Classe imc (Main)

Responsável por executar o programa.

No main, são criados:

Um objeto Pessoa

Um objeto Atleta, utilizando referência do tipo Pessoa

Pessoa atleta = new Atleta("Carlos", 75.0, 1.80, "Natação");

Aqui ocorre polimorfismo, pois mesmo a referência sendo do tipo Pessoa, o método sobrescrito em Atleta será executado automaticamente.

🎯 Conceitos Aplicados

Herança → Atleta herda atributos e comportamentos de Pessoa

Polimorfismo → O método sobrescrito é chamado mesmo com referência da superclasse

Encapsulamento → Atributos privados com acesso controlado por getters e setters

Sobrescrita de método (Override) → Alteração do comportamento do cálculo de IMC na subclasse

▶️ Exemplo de Saída
----- Pessoa -----
Nome: Mateus
Idade: 19
Peso: 83.0 kg
Altura: 1.83 m
IMC: 24.78

----- Atleta -----
Nome: Carlos
Idade: 22
Peso: 75.0 kg
Altura: 1.8 m
IMC: 21.99
🚀 Como Executar

Compile os arquivos:

javac Pessoa.java Atleta.java imc.java

Execute o programa:

java imc
📚 Objetivo

Este projeto foi desenvolvido com fins educacionais para praticar conceitos de orientação a objetos em Java, reforçando a relação entre superclasse e subclasse, uso de super, e comportamento polimórfico.
