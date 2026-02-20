🏃‍♂️ Sistema de Cálculo de IMC - Versão Atletas

<p align="center">
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java Badge">
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Badge">
  <img src="https://img.shields.io/badge/POO-Conceitos-blue?style=for-the-badge" alt="POO Badge">
</p>




📝 Sobre o Projeto

Este projeto consiste em uma aplicação Java simples, porém robusta, desenvolvida para demonstrar conceitos fundamentais de Programação Orientada a Objetos (POO ). O sistema realiza o cálculo do Índice de Massa Corporal (IMC) de indivíduos, diferenciando o cálculo entre uma pessoa comum e um atleta profissional.

A principal característica deste projeto é a aplicação prática de Herança e Polimorfismo, onde a classe Atleta estende as funcionalidades da classe Pessoa, aplicando uma lógica de cálculo específica para o perfil esportivo.




🚀 Tecnologias e Conceitos

Abaixo estão as principais ferramentas e pilares da POO utilizados no desenvolvimento deste sistema:

Categoria
Tecnologia / Conceito
Descrição
Linguagem
Java
Linguagem principal utilizada para a lógica do sistema.
Herança
extends
A classe Atleta herda atributos e métodos da classe Pessoa.
Polimorfismo
Sobrescrita
O método calcularIMC() é sobrescrito para aplicar um fator de correção.
Encapsulamento
Getters/Setters
Proteção e acesso controlado aos atributos das classes.







🏗️ Estrutura do Código

O projeto está dividido em três componentes principais, cada um com uma responsabilidade específica:

1. Classe Pessoa

É a classe base (superclasse) que contém os dados biométricos fundamentais.

•
Atributos: Nome, Idade, Peso e Altura.

•
Método Principal: calcularIMC() — Fórmula padrão: $Peso / (Altura \times Altura)$.

2. Classe Atleta

Subclasse que herda de Pessoa e introduz especializações.

•
Atributo Adicional: esportePraticado.

•
Diferencial: Sobrescreve o método calcularIMC() aplicando um redutor de 5% ($IMC \times 0.95$), considerando que atletas possuem maior densidade muscular.

3. Classe imc (Main)

Responsável pela execução do programa e demonstração do polimorfismo.

•
Instancia objetos do tipo Pessoa e Atleta.

•
Demonstra como um objeto Atleta pode ser referenciado como uma Pessoa.




💻 Exemplo de Execução

Ao executar a classe principal, o sistema gera a seguinte saída no console:

Plain Text


----- Pessoa -----
Nome: Mateus
Idade: 19
Peso: 83.0 kg
Altura: 1.83 m
IMC: 24.78425751739377

----- Atleta -----
Nome: Carlos
Idade: 22
Peso: 75.0 kg
Altura: 1.8 m
IMC: 21.99074074074074
Esporte praticado: Natação






⚙️ Como Executar

Para rodar este projeto localmente, siga os passos abaixo:

1.
Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.

2.
Clone este repositório ou copie os arquivos .java.

3.
Compile os arquivos:

Bash


javac *.java





4.
Execute a classe principal:

Bash


java imc








✒️ Autor

Projeto desenvolvido como exemplo prático de estudos em Java.

