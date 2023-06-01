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

function geraUrl(link){
    let url = '';
    for(i=0;i<11;i++){
        url += link[link.length-11+i];
    }
    return url;
}

function addDica() {
    let dados = leDados();
    let dificuldade = "";
    let jogo = "";
    let nota = "";

    if (document.getElementById("campoDificuldade").value == 1) {
        dificuldade = "Iniciante";
    } else if (document.getElementById("campoDificuldade").value == 2) {
        dificuldade = "Intermediário";
    } else if (document.getElementById("campoDificuldade").value == 3) {
        dificuldade = "Avançado";
    }

    if (document.getElementById("campoJogo").value == 1) {
        jogo = "LOL";
    } else if (document.getElementById("campoJogo").value == 2) {
        jogo = "Valorant";
    }

    if (document.getElementById("campoNota").value == 1) {
        nota = "1";
    } else if (document.getElementById("campoNota").value == 2) {
        nota = "2";
    } else if (document.getElementById("campoNota").value == 3) {
        nota = "3";
    } else if (document.getElementById("campoNota").value == 4) {
        nota = "4";
    } else nota = "5";



    
    let url = geraUrl(document.getElementById("campoMidia").value);
    let dica = {
        "lapide": false,
        "id": dados.dicas.length,
        "habilidade": document.getElementById("campoHabilidade").value,
        "descricao": document.getElementById("campoDescricao").value,
        "categoria": document.getElementById("campoCategoria").value,
        "midia": document.getElementById("campoMidia").value,
        "urlmidia" : url,
        "jogo": jogo,
        "dificuldade": dificuldade,
        "nota" : nota,
    }
    dados.dicas.push(dica);
    salvaDados(dados);
    alert("Dica adicionada com sucesso!");
    mostraDicas();
}

function mostraDicas() {

    let tela = document.getElementById("catAulas");
    let strHtml = "";
    let objDados = leDados();
    console.log("teste");
    for (i = 0; i < objDados.dicas.length; i++) {
        if (!objDados.dicas[i].lapide){
        strHtml += `<div id=${i} class=selCard>`;
        strHtml += `<p><b>ID: </b>${objDados.dicas[i].id}  `;
        strHtml += `<b>Jogo: </b>${objDados.dicas[i].jogo} </p>`;
        strHtml += ` <p><b>Habilidade: </b>${objDados.dicas[i].habilidade}  `;
        strHtml += ` <b>Categoria: </b>${objDados.dicas[i].categoria}`;
        strHtml += ` <b>Dificuldade: </b>${objDados.dicas[i].dificuldade}</p>`;
        strHtml += `<b>Descrição: </b>${objDados.dicas[i].descricao}`;
        strHtml += `<p></p>`;
        strHtml += `<p><b>Nota: </b>${objDados.dicas[i].nota}</p>`;
        if (objDados.dicas[i].midia != "") {
            strHtml += `<p><b>Mídia: </b> <a href =${objDados.dicas[i].midia}> Link </a></p>`;
        }
        strHtml += "</div>";
    }
    }
    tela.innerHTML = strHtml;
}
//buttons
document.getElementById("botaoSalvar").addEventListener("click", addDica)
document.getElementById("botaoAlterar").addEventListener("click", editaDica)
document.getElementById("botaoApagar").addEventListener("click", apagaDica)

function editaDica() {
    let dados = leDados();

    if (document.getElementById("campoDificuldade").value == 1) {
        dificuldade = "Iniciante";
    } else if (document.getElementById("campoDificuldade").value == 2) {
        dificuldade = "Intermediário";
    } else if (document.getElementById("campoDificuldade").value == 3) {
        dificuldade = "Avançado";
    }

    if (document.getElementById("campoJogo").value == 1) {
        jogo = "LOL";
    } else if (document.getElementById("campoJogo").value == 2) {
        jogo = "Valorant";
    }

    if (document.getElementById("campoNota").value == 1) {
        nota = "1";
    } else if (document.getElementById("campoNota").value == 2) {
        nota = "2";
    } else if (document.getElementById("campoNota").value == 3) {
        nota = "3";
    } else if (document.getElementById("campoNota").value == 4) {
        nota = "4";
    } else nota = "5";

    let dica = {
        "lapide": false,
        "id": dados.dicas[index].id,
        "habilidade": document.getElementById("campoHabilidade").value,
        "descricao": document.getElementById("campoDescricao").value,
        "jogo": jogo,
        "nota": nota,
        "categoria": document.getElementById("campoCategoria").value,
        "midia": document.getElementById("campoMidia").value,
        "urlmidia": geraUrl(document.getElementById("campoMidia").value),
        "dificuldade": dificuldade,
    }
    dados.dicas[index]=dica;
    salvaDados(dados);
    alert("Dica alterada com sucesso!");
    console.log("editaDica");
    mostraDicas();
}

function apagaDica(){
    let dados = leDados();
    dados.dicas[index].lapide = true;
    salvaDados(dados);
    alert("Dica apagada com sucesso!");
    mostraDicas();
    console.log("apagaDica");
}

function CheckClick() {
    let lista = document.querySelectorAll(".selCard");
    lista.forEach((item) => {
        item.onclick = trataEvento;
    });
}
let trataEvento = (evento) => {
    let objDados = leDados();
    let dificuldade = "";
    let jogo = "";
    let nota = "";

    alvo = objDados.dicas[$(evento.currentTarget).attr("id")];
    index = alvo.id;
    console.log(alvo);
    document.getElementById("campoHabilidade").value = alvo.habilidade;
    document.getElementById("campoDescricao").value = alvo.descricao;
    document.getElementById("campoCategoria").value = alvo.categoria;
    document.getElementById("campoMidia").value = alvo.midia;

    if (alvo.dificuldade == "Iniciante") {
        dificuldade = 1;
    } else if (alvo.dificuldade == "Intermediário") {
        dificuldade = 2;
    } else if (alvo.dificuldade == "Avançado") {
        dificuldade = 3;
    }

    if (alvo.jogo == "LOL") {
        jogo = 1;
    } else if (alvo.jogo == "Valorant") {
        jogo = 2;
    } 

    if (alvo.nota == "1") {
        nota = 1;
    } else if (alvo.nota == "2") {
        nota = 2;
    } else if (alvo.nota == "3") {
        nota = 3;
    } else if (alvo.nota == "4") {
        nota = 4;
    } else if (alvo.nota == "5") {
        nota = 5;
    } 
    
    document.getElementById("campoDificuldade").value = dificuldade;
    document.getElementById("campoJogo").value = jogo;
    document.getElementById("campoNota").value = nota;

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
        mostraDicas();
        botaoSalvar.disabled = true;
        botaoAlterar.disabled = true;
        botaoApagar.disabled = true;
        let ValidaForm = () => {
            if (campoHabilidade.value == "" || campoDescricao.value == "" || campoCategoria.value == "" || campoDificuldade.value == 0 || campoNota.value == 0) {
                botaoSalvar.disabled = true;
            } else {
                botaoSalvar.disabled = false;
            }
        }
        campoHabilidade.onchange = ValidaForm;
        campoDescricao.oninput = ValidaForm;
        campoCategoria.onchange = ValidaForm;
        campoDificuldade.onchange = ValidaForm;
        campoNota.onchange = ValidaForm;

        CheckClick();
    })


