É um jogo interativo que se realiza no terminal, no qual a jogadora e o computador se alternam para tentar adivinhar um número aleatório entre 1 e 100. Deve-se levar em consideração a tentativa anterior, se foi "muito alta" ou "muito baixa".

GUESS THE NUMER DEMO

4. Objetivos de Aprendizado
Java & OOP
 Tipos de dados: primitivos vs não primitivos

 Strings (cadeias de caracteres)

 Arrays (matrizes)

 Access Modifiers: private

 Access Modifiers: protected

 Access Modifiers: public

Programação Orientada a Objetos (OOP)
 Classes
 Objetos
 Métodos
 Atributos
 Construtores
 Encapsulamento
 Abstração
 Composição
 Interfaces
 Herança: super
 Herança: extends
 Herança: override
 Linguagem Unificada de Modelagem (UML): Diagramas de classes
 Variáveis

 Condicionais

 Uso de loops/ciclos (loops)

Coleções
 Listas: ArrayList
Testes
 JUnit
 Mockito
5. Considerações Gerais
Duração do projeto: Estima-se que este projeto levará de 1 a 2 sprints.
Deve ser implementado em Java. As únicas dependências externas que podem ser usadas são JUnit e Mockito para testes unitários.
O jogo será realizado no terminal. Os testes podem ser executados no terminal ou em seu IDE (recomendamos usar IntelliJ Community Edition)
Será usado um número aleatório entre 1 e 100 como número secreto.
A jogadora e o computador se alternarão para adivinhar o número.
Após cada turno, informações sobre a suposição feita serão exibidas.
O jogo terminará quando o número for adivinhado. A lista de todas as tentativas da jogadora vencedora deve ser exibida.
Diagrama de Classes
Diagrama de Classes

GuessTheNumberGame
Propósito: Lida com a lógica principal, decide qual jogador assume o próximo turno.

Atributos estáticos (static):

random: Gerador de números aleatórios.
targetNumber: Número aleatório entre 1 e 100 a ser adivinhado na partida atual.
Métodos estáticos (static):

main(String[] args): Inicia o jogo e gera o número aleatório.
checkGuess(Player player): Executa um turno, obtém a suposição e avalia o novo estado da partida.
Player
Propósito: Representa uma jogadora genérica. É uma classe abstrata. Define os atributos e métodos que todas as classes de jogadoras devem compartilhar:

Atributos:

name: O nome da jogadora.
guesses: O histórico de suposições da jogadora.
Métodos:

makeGuess(): Retorna a suposição da jogadora. É um método abstrato.
getName(): Retorna o nome da jogadora.
getGuesses(): Retorna o histórico de suposições da jogadora.
HumanPlayer e ComputerPlayer (herdam de Player)
Propósito: Representa as jogadoras Humana e Computadora, respectivamente.

Métodos:

makeGuess(): Método que cada classe que herda de Player deve implementar.
Relações:

A classe GuessTheNumberGame interage com as classes HumanPlayer e ComputerPlayer para gerenciar o jogo.
Tanto a classe HumanPlayer quanto Computer Player são subclasses de Player, o que implica que herdam todas as suas propriedades e métodos, mas também têm algumas características adicionais próprias.
Este design de classes permite separar as responsabilidades, facilitando a manutenção e possíveis extensões do jogo no futuro.

Por exemplo, poderíamos adicionar diferentes jogadoras "máquina" com diferentes estratégias para a suposição automática, um novo tipo de jogadora "remota" ou até mesmo diferentes níveis de dificuldade.

Critérios de Aceitação Mínimos do Projeto
A jogadora e o computador se alternarão em turnos para tentar adivinhar o número.
Após cada tentativa, deve ser exibido:
O nome do jogador (pessoa ou computador).
A suposição feita.
Uma mensagem indicando se a suposição foi muito alta, muito baixa ou correta.
O jogo terminará assim que a jogadora ou o computador adivinhar o número secreto. Deve ser exibida uma mensagem de fim de jogo, bem como uma lista de todas as tentativas feitas pela jogadora vencedora.
6. Considerações Técnicas
O jogo será realizado no terminal usando Java.
A lógica do jogo será baseada em estruturas de controle, incluindo loops, condicionais e coleções.
Deve-se dividir o código e melhorar sua legibilidade e manutenção.
Deve-se usar uma funcionalidade da biblioteca de utilitários do Java para geração de números aleatórios.
Devem ser realizados testes unitários para suas classes e métodos usando JUnit e simulação de geração de números aleatórios com Mockito.
7. Marcos do projeto
Não trabalhe como se fosse uma fábrica fazendo uma classe tooooooooooooooooda e depois outra. O risco de trabalhar assim é que você obtenha muitas partes sem nenhuma ou meia funcionalidade e aprenda pouco; não faça o inverso também - muitas funcionalidades no console, mas sem uma finalização que possa ser usada por uma usuária não desenvolvedora.

A metáfora a seguir pode ajudá-la a entender melhor a ideia.

MARCOS

Essas etapas, do skate ao carro, são o que chamaremos de "marcos".

Estes marcos são pequenas tarefas a serem implementadas, assim, você evita trabalhar como uma fábrica e você consegue ir aprendendo um pouco de cada coisa, agregando valor para seu usuário ao término de cada marco.

A seguir deixamos alguns marcos como sugestão para que você construa o seu projeto.

7.1 Marco 1 - Configurações do ambiente de trabalho
Você deve configurar o seu ambiente de trabalho, ou seja:

Baixar a versão escolhida do Java e instalá-la em seu computador. Hoje, em out e nov/2023, recomendamos a versão 17 pois é versão mais compatível com a IDE IntelliJ.
Instalar a sua IDE (recomendamos usar IntelliJ Community Edition, em casos extremos de recurso computacional pode ser utilizado o VSCode)
Conteúdos que podem te apoiar na configuração do ambiente
Tutoriais para preparação de ambiente Java
Como eu instalo o Java?
Install IntelliJ IDEA
Step by Step guide to install Intellij Idea on Mac
7.2 Marco 2 - Primeiros passos com a linguagem
Crie a primeira classe do projeto que contenha o método main. Você pode adicionar um comando que exiba "Olá mundo!" no console. Assim vc poderá checar se as suas configurações estão corretas. Além disso, você pode estudar conceitos da linguagem como:

O que são classes e como construí-las?
O que são métodos e como utilizá-los?
Quais o tipos de dados existentes na linguagem? (Lembre-se dos que você mais utilizou em JavaScript e tente buscar por tipos similares)
Como criar um array usando Java?
O que são modificadores de acesso como: public, private, protected?
O que são métodos construtores? Como fazê-lo?
O que é encapsulamento? Como fazê-lo?
O que é herança? Como criar no Java?
Lembre-se de também utilizar conteúdos práticos para compreender esses conceitos. Não passe muito tempo somente lendo ou assistindo vídeos! Crie códigos! Tente, erre, tente de novo, etc.

Conteúdos que podem te apoiar nos primeiros passos com Java
Learn the Basics of Java Programming
Programação Orientada a Objetos com Java - Kamila Code
Java Basic Syntax
Java Data Types And Variables – Explained for Beginners
Learn Java
Java Classes and Objects
Java Methods
7.3 Marco 3 - Compreendendo o Diagrama de Classes
Deixamos um Diagrama de Classes para que você possa se basear para construir o seu projeto. Mas é preciso compreender o que ele significa antes mesmo de começar a desenvolver o que será o seu projeto. Neste marco você pode compreender o que esse diagrama está representando.

Conteúdos que podem te apoiar na compreensão do Diagrama de Classes
O que é um diagrama de classe UML?
O que são os Diagramas de Classe
7.4 Marco 4 - Começando o jogo!
Neste marco você pode criar o jogo para somente um jogador.

Comece criando as classes que representam a jogadora humana. Depois sorteie o número alvo que deve ser um número aleatório entre 1 a 100 e por fim crie a lógica para verificar se o palpite da jogadora é abaixo ou acima do valor alvo. Exiba no terminal informando se é um valor alto ou baixo!

Conteúdos que podem te apoiar para iniciar o jogo
Java: Como ler e apresentar dados com os comandos de entrada e saída
Java Scanner
Scanner class in Java
Java User Input
Random Number
7.5 Marco 5 - Adicionando mais jogadores
Neste marco você pode adicionar mais uma jogadora ao jogo!

Comece criando as classes que representam a segunda jogadora, que pode ser o computador. Crie a lógica para alternar entre as jogadoras. Por fim, coloque informações adicionais quando alguma jogadora ganhar o jogo! Você pode exibir a quantidade de tentativas e quais foram as tentativas da jogadora.

7.6 Marco 6 - Configurações para construção dos testes unitários
Neste marco você pode configurar as bibliotecas JUnit5 e Mockito na sua IDE, assim você poderá criar os testes unitários.

Conteúdos que podem te apoiar para adicionar dependências de testes
Adicionar JUnit5 no IntelliJ
Testing Java with VSCode
7.7 Marco 7 - Criação dos testes unitários
Crie os testes unitários do seu projeto. Preocupe-se em cobrir com testes os a lógica do seu jogo baseando-se em comportamentos. Por exemplo, crie testes que:

Simule que o palpite da jogadora é maior que o número alvo.
Simule que o palpite da jogadora é menor que o número alvo.
Simule que o palpite é o próprio número alvo.
Conteúdos que podem te apoiar a criar testes unitários
Qualidade e JUnit: introduzindo automatização de testes unitários do seu software Java no dia-a-dia
Mockito Tutorial
7.8 Marco 8 (Hacker Edition) - Criação de uma "inteligência" para jogar contra o computador
Neste marco, que entendemos como Hacker Edition, você poderá criar uma lógica para que os palpites da segunda jogadora, quando estivermos jogando contra o computador, sejam palpites mais inteligentes. Esse palpites podem considerar a informação se o palpite é alto ou baixo em relação ao número alvo e assim o jogo pode se tornar mais emocionante.