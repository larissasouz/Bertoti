## Meus Projetos

### Em 2022-1

<div align="justify">

No primeiro semestre de 2022, desenvolvemos a assistente virtual BETA, que tinha como objetivo ajudar alunos em seus estudos diários com funcionalidades como: modo pomodoro, consulta à Wikipedia, reprodutor de música, gravação de voz, gerenciamento de calendário, anotações, lembretes, calculadora e informações sobre o clima. Seguindo a metodologia Scrum em três sprints, o projeto focou em responder a comandos de voz e operar em múltiplas plataformas. Utilizamos Python, HTML e CSS para desenvolvimento e documentamos todo o processo no GitHub. A interface foi desenhada para ser intuitiva e visualmente atrativa, visando uma interação eficiente do usuário 

![API FATEC - BETA - YouTube - Google Chrome 2024-05-14 20-38-45](https://github.com/larissasouz/Bertoti/assets/102266928/3c0bc2aa-4542-4fdf-8f23-99744b82e65b)

<b>Exemplo:</b> 
O código abaixo é um script em Python que usa reconhecimento de voz e uma API de clima para informar ao usuário a temperatura atual de uma cidade especificada verbalmente

</div>

~~~~java
import speech_recognition as sr
import requests
import pyttsx3
# link do open_weather: https://openweathermap.org/
def clima():
    audio = sr.Recognizer()
    maquina = pyttsx3.init()
    with sr.Microphone() as source:
        maquina.say("Informe a cidade da qual deseja descobrir a temperatura. ")
        maquina.runAndWait()
        print('ouvindo...')
        voz = audio.listen(source)
        cidade = audio.recognize_google(voz, language='pt-BR')
        maquina.say(cidade)
        API_KEY = "00a7922cfcccb7df823f10e7014e2e42"
        link = f"https://api.openweathermap.org/data/2.5/weather?q={cidade}&appid={API_KEY}&lang=pt_br"
        requisicao = requests.get(link)
        requisicao_dic = requisicao.json()  # Faz a requisição
        descricao = requisicao_dic['weather'][0]['description']  # Puxa a descrição de como esta o clima
        temperatura = requisicao_dic['main']['temp'] - 273.15  # Puxa a temperatura atual e faz a conversão
        maquina = pyttsx3.init()
        maquina.say(f'Em {cidade} o céu está {descricao} e está {temperatura:.0f}ºC hoje')
        maquina.runAndWait()
~~~~
Para mais informações: <a href="https://github.com/alanfmorato/BETA/">GIT</a>

<b> Tecnologias Utilizadas </b>
- Python (Back-end)
- Tkinter (Front-end)
- HTML5 (Front-end)
- CSS3 (Front-end)

### Contribuições pessoais

<div align="justify>

Durante minha atuação no projeto, desenvolvi várias funcionalidades importantes, incluindo:

<b> Calculadora: </b> Criei uma função que permite aos usuários realizar operações matemáticas por controle de voz. O usuário insere dois números e escolhe a operação desejada entre as opções de: soma, subtração, multiplicação, divisão e exponenciação. Para utilizar a função, o usuário deve dizer: <i> "Beta, calculadora". </i>.

<b> Clima: </b> Desenvolvi uma função que retorna a temperatura de um município. A assistente virtual pergunta ao usuário qual cidade ele deseja saber a temperatura, e o usuário responde com o nome da cidade. O código consulta a API do <i> OpenWeatherMap </i>, que retorna a temperatura atual e uma descrição do clima, se está nublado ou ensolarado. Para utilizar a função, o usuário deve dizer: <i> "Beta, clima". </i>

Essas funcionalidades foram fundamentais para tornar a BETA uma ferramenta versátil e útil para os alunos, permitindo uma interação natural e eficiente através de comandos de voz. Ao integrar essas capacidades, garanti que a assistente virtual pudesse oferecer suporte significativo e prático no dia a dia dos usuários, contribuindo para a melhoria da gestão do tempo e das tarefas estudantis.

</div>

### Hard Skills
- Python - Tenho a capacidade de desenvolver soluções de programação de maneira independente, com foco em Python como minha principal linguagem.
- HTML5 - Competência em estruturação semântica, como por exemplo, utilização de tags semânticas como header, footer, article, section, etc., para criar uma estrutura lógica e bem definida do conteúdo da página.
- CSS3 - Competência em estilizar de forma autônoma, sendo possível criar animações e transições.

### Soft Skills
- Colaboração - Trabalhei com a equipe para alcançar o objetivo, sempre com foco em compartilhar conhecimentos e resolver problemas juntos, o que melhorou nossa produtividade e criatividade.
- Liderança - Pela experiência que tive, atuei auxiliando na liderança, lidando com adversidades e trabalhando com a gestão de tempo.
- Adaptabilidade - Apesar das dificuldades que surgiram no caminho, consegui, junto à equipe, me adaptar às situações e pensar na melhor forma de lidar com elas.

----

Em 2023-1

![image](https://github.com/larissasouz/Bertoti/assets/102266928/a40ad081-cf92-4932-8035-a582fa4d0e00)


## DESCRIÇÃO DO PROJETO
O projeto em questão desafia a criação de uma aplicação web com foco no gerenciamento de vendas. A aplicação tem como objetivo principal abranger três áreas cruciais: o histórico do vendedor, o planejamento de vendas e o registro das vendas efetuadas.

Um dos principais recursos da aplicação é a capacidade de comparar esses três conjuntos de dados, permitindo uma análise minuciosa e precisa das informações. Isso significa que os resultados das vendas podem ser avaliados em relação ao histórico dos vendedores e ao planejamento estabelecido.

O diferencial deste projeto é a integração de um algoritmo de Inteligência Artificial já existente. Esse algoritmo será empregado para gerar previsões e insights adicionais, com o objetivo de elevar a precisão e a confiabilidade das análises realizadas pela aplicação.

Em resumo, o desafio consiste em desenvolver uma aplicação web que simplifica o gerenciamento de vendas, proporcionando uma análise detalhada por meio da comparação do histórico dos vendedores, do planejamento e das vendas registradas. Além disso, a aplicação será aprimorada com previsões de IA para aprimorar a tomada de decisões relacionadas às vendas.

## TECNOLOGIAS UTILIZADAS

![image](https://github.com/larissasouz/Bertoti/assets/102266928/27dcc3bc-1708-4d58-97c1-11b31ff9af77)


## CONTRIBUIÇÕES PESSOAIS
No meu papel de desenvolvedora, minha contribuição abrangeu tanto o Front-End quanto o Back-End do projeto. Algumas das atividades que desempenhei incluíram:<br>
<br>
<details> 
<summary><b>Desenvolvimento de Modelagem e Script: </b></summary>

Criei a modelagem de banco de dados e desenvolvi o script para criação das tabelas com suas chaves primárias e atributos. <br>
![image](https://github.com/larissasouz/Bertoti/assets/102266928/6dffb1eb-bafb-4e60-a736-c9afe1dc8e9e)
</details>

<details>
<summary><b>Desenvolvimento de tela de visualização de planejamento: </b></summary><br>
Projetei e implementei uma interface de usuário que permitia a visualização de informações de planejamento. Isso ajudou a organizar e acompanhar o planejamento de atividades ou tarefas relevantes para o sistema.<br>
 
![image](https://github.com/larissasouz/Bertoti/assets/102266928/084af6a5-c709-45cb-a7ac-b2cddf26df76) <br>
O código acima fornece a estrutura básica para exibir informações de planejamento em uma tabela, juntamente com uma imagem e um formulário <br>

![image](https://github.com/larissasouz/Bertoti/assets/102266928/4302cf92-6289-41fb-9c2e-e7aca7733264) <br>
Neste código, um método é mapeado para lidar com solicitações HTTP GET em uma aplicação Spring Boot. Ele busca dados de planejamento de algum serviço, converte esses dados para um formato específico usando um conversor e retorna essa informação como uma resposta HTTP com status 200 e o corpo contendo a lista de objetos convertidos. Este padrão é comum em APIs RESTful, onde a resposta é estruturada de acordo com o modelo de dados desejado para ser consumido pelos clientes.

</details>

<details>
<summary><b> Desenvolvimento do CRUD para administrador: </b></summary><br>
Criei as operações básicas de CRUD (Create, Read, Update e Delete) para gerenciar informações de administradores no sistema. Isso permitiu a criação, leitura, atualização e exclusão de dados relacionados aos administradores.<br>
O código abaixo representa um endpoint de uma API que permite salvar administradores, desde que o e-mail do administrador não esteja em uso. Se o e-mail estiver em uso, ele retornará um erro de conflito (status 409), caso contrário, retornará uma resposta de sucesso (status 201) com o objeto do administrador recém-salvo no corpo da resposta.
 
![image](https://github.com/larissasouz/Bertoti/assets/102266928/b9a812bc-9a7c-4886-9b0e-8670da256d74)

</details>

------------------------------------------------------------------------------------

### Para realizar essas tarefas, utilizei diversas tecnologias, incluindo:

<i>JavaScript:</i> Usei JavaScript para aprimorar a interatividade do Front-End, permitindo aos usuários interagir com os dados e realizar ações nas páginas da web.

<i>Framework Bootstrap:</i> Para aprimorar o design e a aparência das interfaces de usuário, aproveitei o Bootstrap, um framework de CSS e JavaScript amplamente utilizado para criar layouts responsivos e visualmente atraentes.

<i>Java e Spring Boot:</i> Desenvolvi a lógica do Back-End usando Java e o framework Spring Boot. Isso envolveu o processamento de solicitações do cliente, o acesso ao banco de dados SQL e a lógica de negócios para as operações CRUD.

<i>Banco de Dados SQL:</i> Utilizei um banco de dados SQL para armazenar e gerenciar os dados do sistema de maneira estruturada e segura.

Em conjunto, essas tecnologias e atividades contribuíram para o desenvolvimento de um sistema completo e funcional que permitiu o gerenciamento eficiente de administradores, vendas e planejamento dentro da aplicação.

## APRENDIZADOS
Os principais aprendizados da minha experiência trabalhando em projetos que envolvem tanto o Front-End quanto o Back-End: <br>

<b>Domínio de Tecnologias Diversas:</b> Aprendi a usar uma variedade de tecnologias, desde JavaScript e Java até frameworks como Spring Boot e Bootstrap.<br>

<b>Entendimento do Ciclo de Desenvolvimento:</b> Ganhei uma visão completa do ciclo de vida do desenvolvimento de software, desde a criação da interface do usuário até a lógica de negócios e o gerenciamento de dados.<br>

<b>Fluxo de Dados:</b> Compreendi como os dados fluem entre o Front-End e o Back-End em aplicativos web.<br>
