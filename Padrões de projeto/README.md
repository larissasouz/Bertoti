<h1>Padrões de projeto</h1>

<h2 align="center">Strategy</center></h2>

[Strategy](https://github.com/larissasouz/Bertoti/tree/main/Padr%C3%B5es%20de%20projeto/Digimon/src/strategy)

![Strategy](https://github.com/larissasouz/Bertoti/blob/main/Padr%C3%B5es%20de%20projeto/Digimon/DiagramaDigion.drawio%20(2).png?raw=true)

| Nome           | Anti Padrão | Definição | Problema que resolve | Exemplo de Aplicação |
| -------------- | ----------- | --------- | -------------------- | -------------------- |
| Strategy       | Herança     | É um padrão de projeto comportamental que permite a troca dinâmica de comportamento de um objeto, encapsulando diferentes estratégias em objetos separados. | Evita condicionais complexos e subclasses excessivas ao lidar com comportamento variável em classes, promovendo um código mais flexível e fácil de manter. | Usado em sistemas de processamento de pagamentos para alternar entre estratégias de pagamento, como cartão de crédito, PayPal e transferência bancária, sem condicionais complexos. |
| Observer | Evento Excessivo (Over-Notification). | É um padrão de projeto comportamental que permite que um objeto (o sujeito) notifique automaticamente vários outros objetos (os observadores) quando seu estado muda. | Resolve o problema de estabelecer notificações eficazes entre objetos sem acoplamento direto, promovendo a flexibilidade. | Um exemplo é um sistema de e-mail, onde a caixa de entrada é o sujeito e diferentes partes do aplicativo, como a lista de mensagens e a barra de notificação, são observadores. Quando um novo e-mail chega, todos os observadores são notificados automaticamente. |
| Composite |  Acoplamento Excessivo (Over-Composition). | É um padrão de projeto estrutural que permite tratar objetos individuais e composições de objetos de forma uniforme, criando uma hierarquia em árvore. | Resolve o problema de criar estruturas hierárquicas de objetos onde objetos simples e composições de objetos podem ser tratados de maneira uniforme, simplificando o código. | Um sistema gráfico que renderiza formas individuais e grupos de formas usando a mesma interface comum, permitindo tratar todos os elementos da mesma forma ao manipulá-los. |
| Facade | Acoplamento Excessivo (Excessive Facade). | É um padrão de projeto estrutural que fornece uma interface simplificada para sistemas complexos, ocultando detalhes internos. | Resolve o problema de simplificar a interação de clientes com sistemas complexos, reduzindo o acoplamento e tornando o uso mais simples. | Um exemplo é um sistema operacional, onde a GUI atua como uma fachada para subsistemas complexos, como hardware e sistema de arquivos. |
