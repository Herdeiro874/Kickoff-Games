const inputField = document.getElementById("input");
inputField.addEventListener("keydown", (e) => {
  if (e.code === "Enter") {
    let input = inputField.value;
    inputField.value = "";
    output(input);
  }
});

function output(input) {
  let product;
  let text = input.toLowerCase().replace(/[^\w\s\d]/gi, "");
  text = text
    .replace(/ a /g, " ")
    .replace(/whats/g, "what is")
    .replace(/please /g, "")
    .replace(/ please/g, "")
    .replace(/r u/g, "are you");

  if (compare(imputPadrao, respostas, text)) {
    // Search for exact match in triggers
    product = compare(imputPadrao, respostas, text);
  } 
  else {
    product = alternatives[Math.floor(Math.random() * alternatives.length)];
  }


  addChatEntry(input, product);


}

function compare(imputPadraoArray, answersArray, string) {
  let reply;
  let replyFound = false;
  for (let x = 0; x < imputPadraoArray.length; x++) {
    for (let y = 0; y < imputPadraoArray[x].length; y++) {
      if (imputPadraoArray[x][y] === string) {
        let replies = answersArray[x];
        reply = replies[Math.floor(Math.random() * replies.length)];
        replyFound = true;
        break;
      }
    }
    if (replyFound) {
      break;
    }
  }
  return reply;
}

function addChatEntry(input, product) {
  const messagesContainer = document.getElementById("messages");
  let userDiv = document.createElement("div");
  userDiv.id = "user";
  userDiv.className = "user response";
  userDiv.innerHTML = `<span>-------------------------------------------</span>`;
  messagesContainer.appendChild(userDiv);

  let botDiv = document.createElement("div");
  let botText = document.createElement("span");
  botDiv.id = "bot";
  botDiv.className = "bot response";
  botText.innerText = "Digitando...";
  botDiv.appendChild(botText);
  messagesContainer.appendChild(botDiv);

  messagesContainer.scrollTop =
    messagesContainer.scrollHeight - messagesContainer.clientHeight;

  setTimeout(() => {
    botText.innerText = `${product}`;
  }, 1200);
}

// entradas
const imputPadrao = [
 
    ["como voce esta", "como esta", "como esta", "como voce esta",],
    ["hi", "Ola", "ola", "bom dia", "boa tarde", "boa noite", "oi","koe"],
    ["quem e voce"],    
    ["tudo bem?", "tudo bem"],
    ["login", "como fazer login", "Login"],
    ["help", "ajuda", "comandos","mim ajuda"],
    ["cadastro", "cadastrar", "como"],
    ["dicas", "dicar", "dica"],
    ["metas", "meta", "metar", "meter"],
    ["usuario", "usuarios", "usuari"],
    ["membro","membros"],
    ["dica aleatoria lol","dicas aleatorias lol","dica aleatoria league","dica aleatoria league of legends"], 
    ["dica aleatoria valorant","dicas aleatorias valorant","dica aleatoria vavas"],
    ["meta aleatoria lol","metas aleatorias lol","meta aleatoria league","meta aleatoria league of legends"], 
    ["meta aleatoria valorant","metas aleatorias valorant","meta aleatoria vavas"],

  ];
  
  // Respostas possiveis
  
  const respostas = [
     [
      "Bem! E voce?",
      "Otimo, e voce?",
      "Fantastico, e voce?"
    ],
    [
      "Ola! Sou o assistente digital da Kickoff Games! Como posso lhe ajudar?"
    ],   
    ["Sou o assistente digital da Kickoff Games! Como posso lhe ajudar"],
    ["Tudo Sim!."],

    ["Para fazer login vá até a pagina: http://localhost:5501/login/login/  e digite seus dados"],
    ["\"ajuda\" - lista todos os comandos\n\n\"login\" - informações sobre login\n\n\"cadastro\" - informações sobre cadastro\n\n\"metas\" - informações sobre metas\n\n\"membro\" - informações sobre benefícios de ser membro\n\n\"meta aleatoria lol\" - requisita metas de lol\n\n\"meta aleatoria valorant\" - requisita metas de valorant"],
    ["Deseja fazer cadastro de usuário, metas ou dicas?"],
    ["Para cadastrar dicas vá até a pagina: http://127.0.0.1:5502/LoginTrab.html e digite os dados. \n\nDicas LOL: http://localhost:5501/aulas/listar/1 Valorant: http://localhost:5501/aulas/listar/2"],
    ["\"dica aleatoria lol\" - requisita dicas lol  \n\"dica aleatoria valorant\" - requisita metas valorant \n\nPara acessar as metas vá até sua pagina de perfil: http://localhost:5501/perfil/"],
    ["Para cadastrar usuário vá até a pagina: http://localhost:5501/login/cadastro/ e digite os dados."],
    ["Os membros da Kickoff são constantemente acompanhados por profissionais que estão sempre dispostos a te fazer alcançar niveis mais altos de gameplay. Venha ser um membro da Kickoff!"],
    [
      "Aprofunde-se na mecânica de gameplay do seu campéão à escolha",
      "Melhorar a precisão nas habilidades de skillshot",
      "Dominar a arte do posicionamento durante as teamfights",
      "Aprimorar a visão e controle de mapa",
      "Aprender a controlar melhor os minions na fase de rotas",
      "Melhorar a tomada de decisões em situações de pressão",
      "Aprender a sincronizar habilidades com os companheiros de equipe",
      "Dominar a arte do roaming efetivo",
      "Aprimorar a comunicação com a equipe durante o jogo",
      "Melhorar o tempo de reação e reflexos durante as partidas",
      "Aprender a adaptar a estratégia de acordo com a composição inimiga",
      "Dominar a arte do desvio de habilidades inimigas",
      "Aprimorar o entendimento do jogo em diferentes fases",
      "Aprender a capitalizar nas vantagens obtidas",
      "Melhorar a eficiência na execução de combos de habilidades",
      "Dominar a arte do controle de objetivos como dragões e barões",
      "Aprimorar a habilidade de tilting e manter a calma em situações adversas",
      "Aprender a ajustar a construção de itens de acordo com a situação",
      "Dominar a arte do counterpicking e contrajogadas",
      "Aprimorar a habilidade de liderança e coordenação da equipe"
    ],
    [
      "Treine no the range por 30 minutos com bots no médio",
      "Jogue deathmatch apenas com a arma sheriff",
      "Pratique o controle de recoil com a Vandal por 15 minutos",
      "Assista a vídeos de jogadores profissionais de Valorant para aprender novas táticas",
      "Faça aquecimento antes de começar a jogar, fazendo exercícios de mira e movimentação",
      "Experimente diferentes agentes e descubra qual se adequa melhor ao seu estilo de jogo",
      "Participe de partidas personalizadas com amigos para treinar em equipe",
      "Aprenda os pontos de controle e rotas mais comuns em cada mapa",
      "Aprimore suas habilidades de comunicação com os colegas de equipe durante as partidas",
      "Faça pausas regulares para descansar a mente e evitar o cansaço",
      "Analise suas próprias partidas para identificar erros e áreas de melhoria",
      "Pratique o posicionamento correto para aproveitar ao máximo as habilidades do seu agente",
      "Desenvolva um bom senso de timing para utilizar habilidades e realizar jogadas estratégicas",
      "Aprenda a economizar dinheiro nas rodadas para ter um melhor controle econômico do jogo",
      "Jogue em todos as posições na defesa pra aprimorar seu conhecimento de mapa",
      "Treine jogadas de retake e plant para aumentar sua eficiência em situações cruciais",
      "Assista a transmissões ao vivo de jogadores profissionais para aprender novas táticas",
      "Mantenha a calma e evite tiltar durante as partidas para manter o foco e o desempenho",
      "Faça exercícios físicos regulares para melhorar sua agilidade e reflexos",
      "Participe de torneios amadores para ganhar experiência em ambientes competitivos",
      "Divirta-se e aproveite o jogo, mantendo uma atitude positiva, mesmo em derrotas"
      
    ],

    [
      "Alcançar uma taxa de vitória de 55% ou mais",
      "Manter uma média de 8 ou mais CS (creep score) por minuto",
      "Aumentar a taxa de acerto de habilidades de skillshot para 70% ou mais",
      "Ter uma média de 3 ou menos mortes por partida",
      "Atingir uma média de no mínimo 10.000 de dano ao campeão por partida",
      "Alcançar uma média de 3 torres derrubadas por partida",
      "Aprimorar a taxa de acerto de last hit em minions para 90% ou mais",
      "Alcançar uma média de 10 assists por partida",
      "Manter uma média de 200 de farm (creep score) aos 20 minutos",
      "Alcançar uma média de 20.000 de dano objetivo por partida",
      "Ter uma média de 2 ou mais dragões conquistados por partida",
      "Manter uma média de 4 ou menos mortes por jogo",
      "Derrube todas as torres em uma partida",
      "Realize um \"Penta\" sem levar dano",
      "Roubar 2 monstros épicos em uma única partida",
      "Conquistar uma sequência de 5 abates sem morrer",
      "Derrubar todas as torres inimigas em uma única partida",
      "Alcançar um pentakill (5 abates consecutivos) em menos de 20 minutos",
      "Roubar o Barão Nashor e o Dragão Ancião na mesma partida",
      "Derrubar o inibidor inimigo sem perder nenhuma torre",
      "Realizar 3 jogadas de split pushing efetivas que resultem na destruição de torres inimigas",
      "Roubar 3 buffs do inimigo em uma única partida",
      "Ter uma sequência de 100 CS sem errar uma única last hit",
      "Conquistar 12 assists antes dos 20 minutos de jogo",
      "Destruir o Nexus inimigo em menos de 25 minutos de jogo",
      "Conquistar um abate solo em um duelo contra o laner inimigo",
      "Roubar o Arauto do Vale e utilizá-lo para derrubar duas torres inimigas",
      "Impedir o time inimigo de conquistar qualquer dragão durante toda a partida",
      "Realizar um backdoor em uma partida",
      "Alcançar uma sequência de 10 abates sem sofrer nenhuma morte"
    ],

    [
      
        "Acerte 3 headshots de Sheriff em uma única partida",
        "Consiga 1 kills de Shorty em uma única rodada",
        "Mate 5 oponentes sem agachar em uma única partida",
        "Faça 3 eliminações utilizando apenas armas SMG",
        "Elimine 10 oponentes com a Vandal em uma unica partida ",
        "Vença 3 partidas",
        "Obtenha uma média de 180 pontos de dano por rodada",
        "Faça uma lurker bem sucedido",
        "Use todas suas habilidades em 3 rodadas na partida",
        "Consiga uma first kill em uma rodada",
        "Consiga um abate em um oponente que não te percebeu ",
        "Dê um headshot com a arma Marshal",
        "Utilize sua habilidade ultimate 3 vezes na partida",
        "Faça uma jogada em equipe e ganhe uma rodada",
        "Faça o entry para seu time e sobreviva até o final da rodada",
        "Ganhe o MVP (Most Valuable Player) em uma partida",
        "Ganhe 8 rounds em um único lado do mapa(Defesa ou Ataque)",
        "Faça 3 eliminações com spray de armas automáticas",
        "Seja o último sobrevivente de sua equipe e vença a rodada",
        "Elimine 10 oponentes com a Phantom em uma unica partida"
      

    ]
    
  
  ];
  
  // Random for any other user input
  
  const alternatives = [
    "Desculpe, nao entendi",
    "Poderia repetir?",
    "Tente novamente",

  ];