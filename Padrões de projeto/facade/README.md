<h2 align="center">Facade</center></h2>

<p align="center">
  <img src="https://github.com/larissasouz/Bertoti/assets/102266928/979ced47-b12d-4dbf-aa0c-f73e0ef3ae55" alt="composite">


</p>



Contexto do Código:

O código implementa um exemplo simples do padrão de projeto Facade em Java. O padrão Facade é um padrão estrutural que fornece uma interface simplificada para um conjunto de interfaces em um subsistema mais complexo, tornando a interação do cliente com o sistema mais fácil.

Funcionamento:

ContaBancaria: Representa uma conta bancária com atributos como número da conta, saldo e nome do cliente. Possui métodos para depositar dinheiro, obter o nome do cliente e o saldo da conta.

Fachada: Age como uma fachada para o sistema, simplificando as interações do cliente. Na inicialização, cria uma instância de ContaBancaria. O método fazerDeposito permite ao cliente realizar um depósito, exibindo informações relevantes, como o beneficiário, o número da conta, o saldo antes e depois do depósito.

AplicacaoCliente: Um exemplo simples de aplicação que utiliza a fachada para realizar um depósito em uma conta bancária. Cria uma instância da Fachada, passando o nome do cliente e o número da conta, e em seguida, chama o método fazerDeposito para efetuar um depósito de um valor específico.

O objetivo principal é demonstrar como a fachada pode simplificar a interação do cliente com um sistema mais complexo, isolando detalhes de implementação e oferecendo uma interface mais amigável. Este código pode servir como ponto de partida para compreensão e implementação do padrão Facade em outros contextos.
