
<h2 align="center">Singleton</center></h2>

<p align="center">
  <img src="https://github.com/larissasouz/Bertoti/assets/102266928/fb8754ae-e968-455e-a34e-70d2bed738f3" alt="composite">
</p>

Contexto do Código: 
Padrão de Design Singleton

Este código implementa o padrão de design Singleton em Java. O padrão Singleton é utilizado quando se deseja garantir que uma classe tenha apenas uma instância e fornecer um ponto global para acessá-la. No contexto deste código:

Atributo Estático Privado: A classe possui um atributo estático e privado chamado instanciaUnica, que armazena a única instância da classe.

Construtor Privado: A classe possui um construtor privado, impedindo que instâncias sejam criadas diretamente fora da própria classe.

Método de Acesso (getInstance()): O método estático getInstance() é o ponto de acesso global à instância única. Se a instância ainda não existe, o método a cria. Este método é marcado como synchronized para garantir segurança em ambientes concorrentes.

Teste de Funcionalidade no Método Main: O método main é utilizado para demonstrar a funcionalidade do Singleton. Duas instâncias são obtidas usando getInstance(), e seus endereços de memória são impressos. Se ambos os endereços são iguais, confirma-se que as variáveis de referência apontam para a mesma instância única.

Como Funciona:

Quando getInstance() é chamado pela primeira vez, verifica-se se instanciaUnica é nulo.
Se instanciaUnica é nulo, uma nova instância da classe Singleton é criada.
A instância única é então armazenada em instanciaUnica.
Nas chamadas subsequentes de getInstance(), a instância já existente é retornada.
Isso garante que apenas uma instância da classe Singleton seja criada, promovendo o reuso eficiente dessa instância em todo o programa.
Este padrão é útil quando se precisa garantir que um recurso único, como uma configuração global, seja acessado de forma consistente em toda a aplicação.
