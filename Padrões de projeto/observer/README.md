
<h2 align="center">Observer</center></h2>

<p align="center">
  <img src="https://github.com/larissasouz/Bertoti/assets/102266928/dbc492d0-fa56-442b-af82-0cb3e7cbfb95" alt="composite">
</p>


Este código implementa um sistema simples de notificação para informações da loteria, utilizando os padrões de projeto Observer. Ele consiste em três principais componentes:

Observadores (Observers): Representados pelas classes Jornal e TV, são entidades interessadas em receber informações da loteria. Elas implementam a interface Observer, contendo o método update para receber e processar as notificações.

Assunto (Subject): Representado pela classe Loteria, é responsável por manter as informações da loteria (nome, número e tipo) e notificar os observadores quando essas informações mudam. A classe possui métodos para adicionar, remover e definir observadores, além de notificar todos os observadores registrados.

Exemplo de Uso (Main): Na classe Main, é criada uma instância de Loteria com informações iniciais. Observadores (Jornal e TV) são adicionados à lista de observadores. O método notificarObservadores é chamado, informando os observadores sobre as informações atuais da loteria. Um observador (Jornal) é removido, e um novo observador (novaTV) é adicionado, seguido por uma segunda notificação.

Este código em Java implementa um sistema básico de notificação da loteria, seguindo o padrão de projeto Observer. Os observadores, representados por Jornal e TV, recebem informações sobre a loteria (nome, número e tipo) quando ocorrem mudanças. A classe Loteria funciona como o objeto observado, notificando todos os observadores registrados sobre as atualizações. O exemplo de uso na classe Main ilustra como adicionar, remover e notificar observadores. Este padrão é útil para implementar sistemas de notificação e atualização em tempo real em diferentes partes de um sistema.
