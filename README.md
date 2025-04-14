# 📊 Projeto Contador com Controle de Fluxo

Este é um projeto simples em Java que simula um contador baseado na diferença entre dois números fornecidos pelo usuário. O programa faz uso de tratamento de exceções para garantir que o segundo número seja maior que o primeiro.

## 🚀 Como funciona

1. O programa solicita que o usuário digite dois valores inteiros.
2. Ele verifica se o **segundo valor é maior que o primeiro**.
3. Se a verificação for válida, ele realiza uma contagem com base na subtração dos dois números.
4. Caso contrário, lança uma exceção personalizada chamada `ParametrosInvalidosException`.

## 💻 Exemplo de uso

Digite o primeiro valor: 3 Digite o segundo valor: 7
Contando de 1 até 4: 1 2 3 4

Se o usuário digitar um valor inválido:
  Digite o primeiro valor: 8 Digite o segundo valor: 5
  Erro: O segundo parâmetro deve ser maior que o primeiro.

## 🧠 Conceitos utilizados

- Estruturas de controle de fluxo (`if`, `for`)
- Tratamento de exceções com `try-catch`
- Criação de exceções personalizadas (`ParametrosInvalidosException`)
- Entrada de dados com `Scanner`

## 📁 Estrutura do projeto

Contador/ ├── ContadorControleFluxo.java └── ParametrosInvalidosException.java


📚 Aprendizado
Este projeto foi desenvolvido com o objetivo de praticar:

Entrada e validação de dados
Criação de métodos
Estruturação de código limpo e modular
Tratamento de exceções em Java

Feito com 💻 por Maria Clara de Andrade Paiva
