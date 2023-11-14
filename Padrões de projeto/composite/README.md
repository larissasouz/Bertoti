<h2 align="center">Composite</center></h2>

<p align="center">
  <img src="https://github.com/larissasouz/Bertoti/assets/102266928/e238c45a-4fb8-45be-abe3-3d1ba2c8518a" alt="composite">
</p>


Contexto do Código: 

Depósito de Remédios

Este código Java implementa um sistema de gerenciamento de remédios com o padrão de projeto Composite. O objetivo é permitir que objetos individuais (como Dipirona) e composições desses objetos (como um Depósito de Remédios) sejam tratados de maneira uniforme.

Classes Principais:

Remedio (Interface): Define a interface para todos os remédios, com o método insert().

Dipirona (Classe): Implementa a interface Remedio e representa um tipo específico de remédio. Possui atributos como nome, dosagem e marca, e sobrescreve o método insert().

DepRemedios (Classe): Implementa a interface Remedio e atua como um contêiner para armazenar remédios individuais ou outros depósitos de remédios. Permite adição, remoção e inserção de remédios. A lista remedioList armazena os remédios ou depósitos internos.

Funcionamento:

Criação de instâncias de remédios (por exemplo, Dipirona) e do depósito de remédios (DepRemedios).
Adição de remédios ao depósito usando o método add(remedio).
Remoção de remédios do depósito usando o método remove(remedio).
Inserção de todos os remédios no depósito usando o método insert(). Isso resulta na chamada do método insert() de cada remédio, independentemente de ser um remédio individual ou um depósito de remédios contendo outros remédios.
Esse design facilita a manipulação de coleções complexas de objetos relacionados, garantindo que tanto objetos individuais quanto composições de objetos possam ser tratados de maneira consistente.
