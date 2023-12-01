![image](https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/ae26d04c-342f-4876-b59d-220abc71c54c)![image](https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/5c744ecd-ef7d-4151-b107-ee93e0dbe1f7)Engenharia de Software
    
    We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. 
    On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. 
    In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. 
    Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.


Interpretação
    
    Os engenheiros de softwares tem algumas diferenças com os programadores em questão de exisgências de projetos, como: 
    ser mais preocupado com o tempo que é gasto, a eficiencia e tem muitos decisões que geram um grande risco, 
    que as vezes são baseadas em estimativas de tempo imprecisas.

------------------------------------------------

Engenharia de Software não é só programar
    
    Within Google, we sometimes say, “Software engineering is programming integrated over time.” 
    Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. 
    If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). 
    The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. 
    Software engineering isn’t programming.

Interpretação
    
    Engenharia de software não é apenas programação pois não envolvem apenas em codígos mas nas decisões dos desenvolvedores
    na hora de fazer o programa, os "trade-offs".
    
------------------------------------------------

    
Trade-Off

        1º trade-off - Meu sistema tem muito segurança para o usúario mas isso acaba diminuindo a usabilidade
    
        2º trade-off - Meu sistema processa muitos dados rapidamente, mas eles demoram muito para serem lidos o que acaba atrapalhando
        na hora de buscar os dados
    
        3º trade-off - Meu sistema tem uma grande facilidade ao ser desenvolvido mas ele acaba não tem um grande desempenho em grande escala

------------------------------------------------

Atividade 3 - (Escolha outro exemplo e faça na mesma atividade)

        Um outro exemplo para isso, é a Steam e a Epic Games
        onde a Steam tem um maior acesso de usúarios diariamente
        do que a Epic, um dos grandes motivos é o fato da acessibilidade
        da Epic, já que o launcher dele demora muito para abrir e na Steam
        o acesso é muito mais rápido.
        
------------------------------------------------

Atividade 3 - Encontre um erro e um acerto de cada heurística e coloque no seu readm.md do github.

1 - Visibilidade do status do sistema
    
Acerto: Quando você consegue ver a trajetória do uber até chegar em você.
        
Erro: Quando você clica em um botão e não recebe um feedback de que ele foi clicado
        
<img align="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/1feeb35a-11e8-4302-8c95-141bf85d83c6"/>

2 - Correspondência entre o sistema e o mundo real
    
Acerto: Ao criar um aplicativo que simula uma bússola, fazer ela parecida como a vida real, assim fazendo assim que o usuário tenha uma familiaridade com o sistema.
        
Erro: Sistemas com muitas palavras tecnicas e assim dificultando para quem é iniciante ou não entende algumas siglas.

<img align="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/4261d23e-c7ba-44f0-94ec-54d3c9c86488"/>

3 - Controle e liberdade do usuário
    
Acerto: Botões de voltar que se forem usados podem quebrar a lógica subjacente e assim, ao o usuário clicar na opção gerar uma tela perguntando se deseja realmente voltar e explicando o que pode acontecer
        
Erro: Você nao conseguir ler as informações sem ter que logar/pagar 
<img align="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/e1f02a33-7314-4bc9-9d62-cd474780287a"/>

4 - Consistência e padrões
    
Acerto: Sites que mantem a estrutura do site, como o link clicavel seja azul, um icone de engrenagem seja a de configurações, etc.
        
Erro: Sites completamente fora do padrão, deixando o usuário confuso

<img align="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/3462235f-3bf6-4862-b638-ef39c8281f19"/>

5 - Prevenção de erros
    
Acerto: Sites que completem a sua pesquisa conforme você for digitando, assim facilidando a pesquisa do usuário e ainda prevenindo dele escrever o nome do produto incorretamente.
        
Erro: Você não ter um botão para apagar uma informação automaticamente e ter que fazer na mão

<img align="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/47025d95-bf85-4ff6-a066-fb2c1c2cdef4"/>

6 - Reconhecimento em vez de recordação
    
Acerto: Mostrar histórico das páginas que o usuário usou recentemente.
        
Erro: Um formulário online que não fornece dicas contextuais ao usuário sobre o formato correto de entrada, obrigando-os a lembrar-se de regras específicas, como tem que botar o DDD ou () no número e etc.

<img align="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/a252d8e9-22f0-40ec-8d4f-7b9dfde74815"/>

7 - Flexibilidade e eficiência de uso
    
Acerto: Criar atalhos para facilitar o usuário a navegar mais rapidamente no site.
        
Erro: Dificil acesso a uma certa informação e assim obrigando o usuário ter que fazer uma grande quantidade de etapas.

<img align="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/32c9d44f-6cd7-4b35-82ff-9fb42adf295a"/>

8 - Design estético e minimalista
    
Acerto: Colocar apenas o necessário na tela para assim fazer que o usuário foque no que está na sua tela.
        
Erro: Deixar muitas informações na tela e assim distraindo o usuário do que realmente precisam.

![image](https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/3faec075-e01a-47c5-b5fd-1db04f9acc30)

9 - Ajude os usuários a reconhecer, diagnosticar e se recuperar de erros
    
Acerto: Ter indicações que sejam amigaveis para usuário que não sejam experientes com o aplicativo.
        
Erro: Ao ocorrer um erro mostrar por exemplo o erro "404" e que mesmo que isso possa ser obvio para a maioria sempre vai ter alguem que não saberá o que significa.
        
10 - Ajuda e documentação
    
Acerto: Ao poder criar um slide, o aplicativo já proporcionar designs de slides mais comuns
        
Erro: Documentação dificil de entender.
        
------------------------------------------------


Atividade 4 - Fazer o diagrama de casos de uso com os requisitos funcionais do seu sistema

<img align="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/d9b1ab98-7576-45b1-9e58-678df2ef9a97"/>

Diagrama UML

<img align ="center" src="https://github.com/GabrielBartolomeu1/Bertoti/assets/127538473/7a48553b-4c57-4687-978c-011bd1d4fdf5"/>

