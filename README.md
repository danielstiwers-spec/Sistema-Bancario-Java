# Objetivo
O objetivo desta atividade é aplicar os conceitos fundamentais de lógica de programação na
linguagem Java, exercitando o uso de variáveis, entrada e saída de dados, estruturas de
repetição (while) e estruturas condicionais (switch-case ou if-else).
Descrição da Tarefa
Você deve implementar um programa em Java que simule a lógica de um sistema bancário
simplificado. O programa deve rodar em loop no console, gerenciando o saldo de um único
usuário com base em suas interações com o menu.

# Requisitos Técnicos (Java)

1. Inicialização e Entrada de Dados
Utilize a classe Scanner (*do pacote java.util.Scanner* ) para ler as opções e os valores
digitados pelo usuário no teclado.
Certifique-se de fechar o objeto Scanner ao encerrar o programa para evitar vazamento de
memória (*resource leak*).
2. Gerenciamento de Saldo
O saldo deve ser armazenado em uma variável do tipo primitivo double.
3. Menu Iterativo e Controle de Fluxo
O menu deve ser exibido continuamente dentro de um laço while.
A escolha do usuário deve ser processada obrigatoriamente através de uma estrutura de
decisão (*switch-case ou if-else*).

Lógica das Operações

Depositar: O programa deve ler um valor. Se for maior que zero, soma-o ao saldo atual.
Caso contrário, exibe um alerta de valor inválido.

Sacar: O programa lê a quantia desejada. Deve-se validar se o valor é positivo e se o saldo
atual é suficiente para cobrir o saque. Se sim, subtrai o valor do saldo; se não, exibe uma
mensagem de erro clara (*ex: "Saldo insuficiente"*).

Extrato: Exibe o valor do saldo atual na tela. Busque formatar a saída com duas casas
decimais utilizando System.out.printf(). (Opcional: implementar um array ou ArrayList para
listar o histórico das operações realizadas).

Sair: Altera a condição do laço while para encerrar o loop, exibe uma mensagem de
encerramento do sistema e finaliza a execução.

⚠️ AVISO IMPORTANTE: USO DE INTELIGÊNCIA ARTIFICIAL

Proibição de IA: Atividades que utilizem códigos prontos gerados por Inteligência Artificial
(*ChatGPT, Claude, Gemini, Copilot, etc.*) não serão avaliadas e receberão nota zero (0).
Validação do Código: O professor poderá selecionar alunos aleatoriamente para realizar
uma defesa oral do código, onde será necessário explicar o funcionamento da lógica aplicada
em Java.