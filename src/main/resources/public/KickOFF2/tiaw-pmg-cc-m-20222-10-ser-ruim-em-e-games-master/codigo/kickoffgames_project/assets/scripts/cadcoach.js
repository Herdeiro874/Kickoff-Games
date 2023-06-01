function leDados() {
    let strDados = localStorage.getItem('db');
    let objDados = {};
    if (strDados) {
        objDados = JSON.parse(strDados);
    } else {
        objDados = {
            "dicas": [
                {
                    "lapide": false,
                    "id": 0,
                    "habilidade": "Lineup de viper Fracture",
                    "jogo": "Valorant",
                    "descricao": "Lineup de viper na fracture que eu escontrei, roubado",
                    "categoria": "Viper, Fracture, Lineup",
                    "midia": "https://www.youtube.com/embed/biFi8_fVr98",
                    "urlmidia": "biFi8_fVr98",
                    "dificuldade": "Iniciante",
                    "nota": "5",
                },
                {
                    "lapide": false,
                    "id": 1,
                    "habilidade": "Setup de Cypher na ascent",
                    "jogo": "Valorant",
                    "descricao": "Setup de Cypher pos-rework na ascent",
                    "categoria": "Cypher, Ascent, Setup",
                    "midia": "https://www.youtube.com/embed/Hrf5EMwvIiM",
                    "urlmidia": "Hrf5EMwvIiM",
                    "dificuldade": "Iniciante",
                    "nota": "4",
                },
                {
                    "lapide": false,
                    "id": 2,
                    "habilidade": "Counter-Strafe",
                    "jogo": "Valorant",
                    "descricao": "Como dar counter-strafe pra não tomar capa toda hora",
                    "categoria": "Movimentação, Tiro, Todos",
                    "midia": "https://www.youtube.com/embed/FSgzDYxLKIo",
                    "urlmidia" : "FSgzDYxLKIo",
                    "dificuldade": "Avançado",
                    "nota": "3",
                },
                {
                    "lapide": false,
                    "id": 3,
                    "habilidade": "Como manter a Economia",
                    "jogo": "Valorant",
                    "descricao": "Como manter o dinheiro sem ter que ficar jogando eco o jogo todo",
                    "categoria": "Economia, Todos",
                    "midia": "https://www.youtube.com/embed/SS9JBP5fKnc",
                    "urlmidia" : "SS9JBP5fKnc",
                    "dificuldade": "Intermediário",
                    "nota": "2",
                },
                {
                    "lapide": false,
                    "id": 4,
                    "habilidade": "Aprenda a usar o flash",
                    "jogo": "LOL",
                    "descricao": "Comno usar o flash e algumas spells no time correto",
                    "categoria": "spell setup",
                    "midia": "https://www.youtube.com/embed/nyzth-6AhCw",
                    "urlmidia" : "nyzth-6AhCw",
                    "dificuldade": "Iniciante",
                    "nota": "1",
                },
                {
                    "lapide": false,
                    "id": 5,
                    "habilidade": "Setup de minions",
                    "jogo": "LOL",
                    "descricao": "Como farmar",
                    "categoria": "farm",
                    "midia": "https://www.youtube.com/embed/TbnmRrGZrso",
                    "urlmidia" : "TbnmRrGZrso",
                    "dificuldade": "Intermediario",
                    "nota": "2",
                },
                {
                    "lapide": false,
                    "id": 6,
                    "habilidade": "Rotação",
                    "jogo": "LOL",
                    "descricao": "Onde e quando rotacionar",
                    "categoria": "Movimentação no mapa",
                    "midia": "https://www.youtube.com/embed/NByGlmX3gxM",
                    "urlmidia" : "NByGlmX3gxM",
                    "dificuldade": "Avançado",
                    "nota": "3",
                },
                {
                    "lapide": false,
                    "id": 7,
                    "habilidade": "Como subir de elo",
                    "jogo": "LOL",
                    "descricao": "Como sair do elohell",
                    "categoria": "Dicas gerais",
                    "midia": "https://www.youtube.com/embed/fz7htXNPMZE",
                    "urlmidia" : "fz7htXNPMZE",
                    "dificuldade": "Avançado",
                    "nota": "4",
                }
            ],
            "usuario": [
                {
                    "lapide": false,
                    "id": 0,
                    "jogo": "LOL",
                    "email": "a@gmail.com",
                    "nick": "brTT",
                    "funcao": "Coach",
                    "elo": "Desafiante",
                    "discord": "brTT#0001",
                    "avatar": "0",
                    "descricao": "Ex-jogador profissional buscando ajudar novos jogadores a melhorarem",
                },
                {
                    "lapide": false,
                    "id": 1,
                    "jogo": "LOL",
                    "email": "b@gmail.com",
                    "nick": "Besourinho",
                    "funcao": "Aluno",
                    "elo": "Prata",
                    "discord": "besourinho#9323",
                    "avatar": "1",
                    "descricao": "Jogador casual e ruim que quer aprender a farmar",
                },
                {
                    "lapide": false,
                    "id": 2,
                    "jogo": "Valorant",
                    "email": "c@gmail.com",
                    "nick": "Pancho",
                    "funcao": "Aluno",
                    "elo": "Ferro",
                    "discord": "Daniel S M#2471",
                    "avatar": "2",
                    "descricao": "Acabei de instalar Valorant e gostaria de aprender a jogar, nunca joguei FPS antes",
                },
                {
                    "lapide": false,
                    "id": 3,
                    "jogo": "Valorant",
                    "email": "d@gmail.com",
                    "nick": "FalleN",
                    "funcao": "Coach",
                    "elo": "Radiante",
                    "discord": "FalleN#0002",
                    "avatar": "3",
                    "descricao": "Jogador profissional de CS:GO, bicampeão mundial disposto a ensinar o básico de FPS para novatos no Valorant ",
                }
            ],
            "metas": [
                {
                    "lapide": false,
                    "id": 0,
                    "jogo": "LOL",
                    "idAluno": "0",
                    "anotacoes": "aprenda o dano do seu campeão ele pode ser confuso as vezes",
                    "treinos": "treino de farm (last hit)",
                    "observacoes": "cresça",
                    "objetivos": "virar o melhor de todos",
                },
                {
                    "lapide": false,
                    "id": 1,
                    "jogo": "LOL",
                    "idAluno": "1",
                    "anotacoes": "ahahahaaha mt bom",
                    "treinos": "combo keyblade e courtesycombo",
                    "observacoes": "clica rapido",
                    "objetivos": "seguir os ensinamentos do mais brabo",
                },
                {
                    "lapide": false,
                    "id": 2,
                    "jogo": "Valorant",
                    "idAluno": "2",
                    "anotacoes": "Pancho verde e colhido",
                    "treinos": "clique nos circulos; anda, atira e anda",
                    "observacoes": "de inicio não se preocupe com velocidade, mas sim com precisão",
                    "objetivos": "tornar um caçador de cabeças",
                },
                {
                    "lapide": false,
                    "id": 3,
                    "jogo": "Valorant",
                    "idAluno": "3",
                    "anotacoes": "sua mira é boa mas o resto é medíocre",
                    "treinos": "lineups e oneways",
                    "observacoes": "decore cada lineup de cada mapa",
                    "objetivos": "causar medo nos demais",
                }
            ]      
        };
    }
    return objDados;
}


function salvaDados(dados) {
    localStorage.setItem('db', JSON.stringify(dados));
}
function addCadastro() {
    let dados = leDados();
    let jogo = "";
    let funcao = "";
    let avatar = "";
    if (document.getElementById("campoJogo").value == 1) {
        jogo = "LOL";
    } else if (document.getElementById("campoJogo").value == 2) {
        jogo = "Valorant";
    }

    if (document.getElementById("campoFuncao").value == 1) {
        funcao = "Aluno";
    } else if (document.getElementById("campoFuncao").value == 2) {
        funcao = "Coach";
    }
    
    if (document.getElementById("campoAvatar").value == 1) {
        avatar = "1";
    } else if (document.getElementById("campoAvatar").value == 2) {
        avatar = "2";
    } else avatar = "0";

    let membro = {
        "lapide": false,
        "id": dados.usuario.length,
        "jogo": jogo,
        "email": document.getElementById("campoEmail").value,
        "nick": document.getElementById("campoNick").value,
        "funcao": funcao,
        "elo": document.getElementById("campoElo").value,
        "discord": document.getElementById("campoDiscord").value,
        "avatar": avatar, 
        "descricao": document.getElementById("campoDescricao").value,
    }   
    dados.usuario.push(membro);
    salvaDados(dados);
    alert("Membro adicionado com sucesso!");
    mostraMembros();
    window.location.reload();
}

function mostraMembros() {

    let tela = document.getElementById("catJogadores");
    let strHtml = "";
    let objDados = leDados();
    for (i = 0; i < objDados.usuario.length; i++) {
        if (!objDados.usuario[i].lapide){
        strHtml += `<div id=${i} class=selCard>`;
        strHtml += `<p><b>ID: </b>${objDados.usuario[i].id}  `;
        strHtml += ` <b>Jogo: </b>${objDados.usuario[i].jogo}  `;
        strHtml += ` <b>Email: </b>${objDados.usuario[i].email}  `;
        strHtml += ` <b>Nick: </b>${objDados.usuario[i].nick}  `;
        strHtml += ` <b>Função: </b>${objDados.usuario[i].funcao}  `;
        strHtml += ` <b>Elo: </b>${objDados.usuario[i].elo}  `;
        strHtml += ` <b>Discord: </b>${objDados.usuario[i].discord}</p>`;
        strHtml += `<p><b>Descrição: </b>${objDados.usuario[i].descricao}</p>`;
        strHtml += "</div>";
    }
    }
    tela.innerHTML = strHtml;
}
//buttons
document.getElementById("botaoSalvar").addEventListener("click", addCadastro)
document.getElementById("botaoAlterar").addEventListener("click", editaDica)
document.getElementById("botaoApagar").addEventListener("click", apagaMembro)

function editaDica() {
    let dados = leDados();
    let jogo = "";
    let funcao = "";
    let avatar = "";

    if (document.getElementById("campoJogo").value == 1) {
        jogo = "LOL";
    } else if (document.getElementById("campoJogo").value == 2) {
        jogo = "Valorant";
    }

    if (document.getElementById("campoFuncao").value == 1) {
        funcao = "Aluno";
    } else if (document.getElementById("campoFuncao").value == 2) {
        funcao = "Coach";
    }

    if (document.getElementById("campoAvatar").value == 1) {
        avatar = "1";
    } else if (document.getElementById("campoAvatar").value == 2) {
        avatar = "2";
    } else avatar = "0";

    let membro = {
        "lapide": false,
        "id": dados.usuario[index].id,
        "jogo": jogo,
        "email": document.getElementById("campoEmail").value,
        "nick": document.getElementById("campoNick").value,
        "funcao": funcao,
        "elo": document.getElementById("campoElo").value,
        "discord": document.getElementById("campoDiscord").value,
        "avatar": avatar, 
        "descricao": document.getElementById("campoDescricao").value,
    }   
    dados.usuario[index]=membro;
    salvaDados(dados);
    alert("Membro alterado com sucesso!");
    console.log("editaMembro");
    mostraMembros();
    window.location.reload();
}

function apagaMembro(){
    let dados = leDados();
    dados.usuario[index].lapide = true;
    salvaDados(dados);
    alert("Membro apagado com sucesso!");
    mostraMembros();
    console.log("apagaMembro");
    window.location.reload();
}

function CheckClickMembro() {
    let lista = document.querySelectorAll(".selCard");
    lista.forEach((item) => {
        item.onclick = trataEvento;
    });
}
let trataEvento = (evento) => {
    let objDados = leDados();
    let jogo = "";
    let funcao = "";
    let avatar = "";

    alvo = objDados.usuario[$(evento.currentTarget).attr("id")];
    index = alvo.id;
    console.log(alvo);
    document.getElementById("campoEmail").value = alvo.email;
    document.getElementById("campoNick").value = alvo.nick;
    document.getElementById("campoElo").value = alvo.elo;
    document.getElementById("campoDescricao").value = alvo.descricao;
    document.getElementById("campoDiscord").value = alvo.discord;
    document.getElementById("campoAvatar").value = alvo.avatar;
    
    if (alvo.jogo == "LOL") {
        jogo = 1;
    } else if (alvo.jogo == "Valorant") {
        jogo = 2;
    }

    if (alvo.funcao == "Aluno") {
        funcao = 1;
    } else if (alvo.funcao == "Coach") {
        funcao = 2;
    }

    if (alvo.avatar == "1") {
        avatar = 1;
    } else if (alvo.avatar == "2") {
        avatar = 2;
    } else avatar = 0;

    document.getElementById("campoJogo").value = jogo;
    document.getElementById("campoFuncao").value = funcao;
    document.getElementById("campoAvatar").value = avatar;
    checkChange();
  };


function checkChange(){
    if(index >= 0) {
        botaoAlterar.disabled = false;
        botaoApagar.disabled = false;
    }
}



window.addEventListener("load",function() {
        var index = -1;
        console.log("Página carregada");
        mostraMembros();
        botaoSalvar.disabled = true;
        botaoAlterar.disabled = true;
        botaoApagar.disabled = true;
        let ValidaForm = () => {
            if (campoJogo.value == 0 || campoEmail.value == "" || campoNick.value == "" || campoFuncao.value == 0 || campoElo.value == "" || campoDiscord.value == "" || campoDescricao.value == "" ){
                botaoSalvar.disabled = true;
            } else {
                botaoSalvar.disabled = false;
            }
        }
        campoJogo.onchange = ValidaForm;
        campoEmail.onchange = ValidaForm;
        campoNick.onchange = ValidaForm;
        campoFuncao.onchange = ValidaForm;
        campoAvatar.onchange = ValidaForm;
        campoElo.onchange = ValidaForm;
        campoDiscord.onchange = ValidaForm;
        campoDescricao.onchange = ValidaForm;
        CheckClickMembro();
    })


















    