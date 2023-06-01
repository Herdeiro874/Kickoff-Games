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
    if (document.getElementById("campoJogo").value == 1) {
        jogo = "LOL";
    } else if (document.getElementById("campoJogo").value == 2) {
        jogo = "Valorant";
    }
    let metas = {
        "lapide": false,
        "id": dados.metas.length,
        "jogo": jogo,
        "idAluno": document.getElementById("campoId").value,
        "anotacoes": document.getElementById("campoAnotacoes").value,
        "treinos": document.getElementById("campoTreinos").value,
        "objetivos": document.getElementById("campoObjetivos").value,
        "observacoes": document.getElementById("campoObservacoes").value,
    }   
    dados.metas.push(metas);
    salvaDados(dados);
    alert("Meta adicionado com sucesso!");
    mostraMetas();
    window.location.reload();
}

function mostraMetas() {

    let tela = document.getElementById("catMetas");
    let strHtml = "";
    let objDados = leDados();
    for (i = 0; i < objDados.metas.length; i++) {
        if (!objDados.metas[i].lapide){
        strHtml += `<div id=${i}      class=selCard>`;
        strHtml += `<p><b>ID: </b>${objDados.metas[i].id}       `;
        strHtml += ` <b>Jogo: </b>${objDados.metas[i].jogo}       `;
        strHtml += ` <b>idAluno: </b>${objDados.metas[i].idAluno}  `;
        strHtml += ` <p><b>anotacoes: </b>${objDados.metas[i].anotacoes}</p>  `;
        strHtml += ` <p><b>treinos: </b>${objDados.metas[i].treinos}</p>  `;
        strHtml += `<p><b>objetivos: </b>${objDados.metas[i].objetivos}</p>`;
        strHtml += `<p><b>observações: </b>${objDados.metas[i].observacoes}</p>`;
        strHtml += "</div>";
    }
    }
    tela.innerHTML = strHtml;
}
//buttons
document.getElementById("botaoSalvar").addEventListener("click", addCadastro)
document.getElementById("botaoAlterar").addEventListener("click", editaDica)
document.getElementById("botaoApagar").addEventListener("click", apagaMeta)

function editaDica() {
    let dados = leDados();
    let jogo = "";
    if (document.getElementById("campoJogo").value == 1) {
        jogo = "LOL";
    } else if (document.getElementById("campoJogo").value == 2) {
        jogo = "Valorant";
    }
    let metas = {
        "lapide": false,
        "id": dados.metas[index].id,
        "jogo": jogo,
        "idAluno": document.getElementById("campoId").value,
        "anotacoes": document.getElementById("campoAnotacoes").value,
        "treinos": document.getElementById("campoTreinos").value,
        "objetivos": document.getElementById("campoObjetivos").value,
        "observacoes": document.getElementById("campoObservacoes").value,
    }   
    dados.metas[index]=metas;
    salvaDados(dados);
    alert("Meta alterada com sucesso!");
    console.log("editaMeta");
    mostraMetas();
    window.location.reload();;
}

function apagaMeta(){
    let dados = leDados();
    dados.metas[index].lapide = true;
    salvaDados(dados);
    alert("Meta apagada com sucesso!");
    mostraMetas();
    console.log("apagaMeta");
    window.location.reload();;
}

function CheckClickMeta() {
    let lista = document.querySelectorAll(".selCard");
    lista.forEach((item) => {
        item.onclick = trataEvento;
    });
}
let trataEvento = (evento) => {
    let objDados = leDados();
    let jogo = "";
    alvo = objDados.metas[$(evento.currentTarget).attr("id")];
    index = alvo.id;
    console.log(alvo);
    document.getElementById("campoId").value = alvo.idAluno;
    document.getElementById("campoAnotacoes").value = alvo.anotacoes;
    document.getElementById("campoTreinos").value = alvo.treinos;
    document.getElementById("campoObjetivos").value = alvo.objetivos;
    document.getElementById("campoObservacoes").value = alvo.observacoes;
    if (alvo.jogo == "LOL") {
        jogo = 1;
    } else if (alvo.jogo == "Valorant") {
        jogo = 2;
    }
    document.getElementById("campoJogo").value = jogo;
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
        mostraMetas();
        botaoSalvar.disabled = true;
        botaoAlterar.disabled = true;
        botaoApagar.disabled = true;
        let ValidaForm = () => {
            if (campoJogo.value == 0 || campoId.value == "" || campoAnotacoes.value == "" || campoTreinos.value == "" ||campoObjetivos.value == "" ||campoObservacoes.value == ""){
                botaoSalvar.disabled = true;
            } else {
                botaoSalvar.disabled = false;
            }
        }
        campoJogo.onchange = ValidaForm;
        campoId.onchange = ValidaForm;
        campoAnotacoes.onchange = ValidaForm;
        campoTreinos.onchange = ValidaForm;
        campoObjetivos.onchange = ValidaForm;
        campoObservacoes.onchange = ValidaForm;

        CheckClickMeta();
    })


















    