# Terminal Bank 🏦

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Sobre o Projeto
O **Terminal Bank** é um sistema bancário interativo de console desenvolvido para consolidar os fundamentos da Programação Orientada a Objetos (POO) em Java. O projeto foi arquitetado com foco em escalabilidade, iniciando com validações de regras de negócio em memória na **Fase 1**, deixando a estrutura preparada para futuras integrações com bancos de dados.

## 🧠 Arquitetura e Aprendizados em POO

A construção desta primeira fase ignorou a simples escrita de scripts para focar na criação de um domínio sólido, priorizando:

*   **Encapsulamento Rigoroso e Imutabilidade:** O estado interno da conta (como o `saldo`) é estritamente privado, eliminando o uso de métodos "setters" genéricos. O dinheiro só é movimentado através de métodos de negócio controlados (`depositar` e `sacar`). Atributos críticos, como o CPF do cliente e o número da conta, utilizam o modificador `final`, garantindo imutabilidade e segurança contra alterações em tempo de execução.
*   **Composição:** A modelagem respeita a dependência entre as entidades do mundo real. A classe `Conta` não armazena strings soltas com dados do usuário, mas compõe a sua estrutura recebendo a injeção de um objeto `Cliente` completo.
*   **Clean Code e Early Return:** Os métodos de operação financeira utilizam *Guard Clauses* para validar condições de erro imediatamente (como saques maiores que o saldo), interrompendo a execução sem a necessidade de criar cadeias complexas e difíceis de ler de `if/else`.

## 🚀 Como Executar

Certifique-se de ter o JDK (Java Development Kit) instalado.

```bash
# Clone este repositório
git clone [https://github.com/Raul-dev-br/terminal-bank.git](https://github.com/Raul-dev-br/terminal-bank.git)

# Acesse a pasta contendo o código-fonte
cd terminal-bank/src

# Compile o projeto
javac Main.java

# Execute a aplicação
java Main