let usuario = document.querySelector('#usuario')
let labelUsuario = document.querySelector('#labelUsuario')
let validUsuario = false

let senha = document.querySelector('#senha')
let labelSenha = document.querySelector('#labelSenha')
let validSenha = false

let confirmSenha = document.querySelector('#confirmSenha')
let labelConfirmSenha = document.querySelector('#labelConfirmSenha')
let validConfirmSenha = false

let msgError = document.querySelector('#msgError')
let msgSuccess = document.querySelector('#msgSuccess')

usuario.addEventListener('keyup', () => {
  if (usuario.value.length <= 4) {
    labelUsuario.setAttribute('style', 'color: red')
    labelUsuario.innerHTML = 'Email *Insira no minimo 5 caracteres'
    usuario.setAttribute('style', 'border-color: red')
    validUsuario = false
  } else {
    labelUsuario.setAttribute('style', 'color: green')
    labelUsuario.innerHTML = 'Email'
    usuario.setAttribute('style', 'border-color: green')
    validUsuario = true
  }
})

senha.addEventListener('keyup', () => {
  if (senha.value.length <= 5) {
    labelSenha.setAttribute('style', 'color: red')
    labelSenha.innerHTML = 'Senha *Insira no minimo 6 caracteres'
    senha.setAttribute('style', 'border-color: red')
    validSenha = false
  } else {
    labelSenha.setAttribute('style', 'color: green')
    labelSenha.innerHTML = 'Senha'
    senha.setAttribute('style', 'border-color: green')
    validSenha = true
  }
})

confirmSenha.addEventListener('keyup', () => {
  if (senha.value != confirmSenha.value) {
    labelConfirmSenha.setAttribute('style', 'color: red')
    labelConfirmSenha.innerHTML = 'Confirmar Senha *As senhas não conferem'
    confirmSenha.setAttribute('style', 'border-color: red')
    validConfirmSenha = false
  } else {
    labelConfirmSenha.setAttribute('style', 'color: green')
    labelConfirmSenha.innerHTML = 'Confirmar Senha'
    confirmSenha.setAttribute('style', 'border-color: green')
    validConfirmSenha = true
  }
})

function cadastrar() {
  if (validUsuario && validSenha && validConfirmSenha) {
    
    msgSuccess.setAttribute('style', 'display: block')
    msgSuccess.innerHTML = '<strong>Cadastro de Jogador Concluido</strong>'
    msgError.setAttribute('style', 'display: none')
    msgError.innerHTML = '<strong>D:</strong>'

    setTimeout(() => {
      window.location.href = "/login/login/"
    }, 1000)


  } else {
    msgError.setAttribute('style', 'display: block')
    msgError.innerHTML = '<strong>Preencha todos os campos corretamente antes de cadastrar</strong>'
    msgSuccess.innerHTML = ''
    msgSuccess.setAttribute('style', 'display: none')
  }
}

btn.addEventListener('click', () => {
  let inputSenha = document.querySelector('#senha')

  if (inputSenha.getAttribute('type') == 'password') {
    inputSenha.setAttribute('type', 'text')
  } else {
    inputSenha.setAttribute('type', 'password')
  }
})

btnConfirm.addEventListener('click', () => {
  let inputConfirmSenha = document.querySelector('#confirmSenha')

  if (inputConfirmSenha.getAttribute('type') == 'password') {
    inputConfirmSenha.setAttribute('type', 'text')
  } else {
    inputConfirmSenha.setAttribute('type', 'password')
  }
})

let bton = document.querySelector('.fa-eye')

bton.addEventListener('click', () => {
  let inputSenha = document.querySelector('#senha')

  if (inputSenha.getAttribute('type') == 'password') {
    inputSenha.setAttribute('type', 'text')
  } else {
    inputSenha.setAttribute('type', 'password')
  }
})

function entrar() {
  let usuario = document.querySelector('#usuario')


  let senha = document.querySelector('#senha')
 

  let msgError = document.querySelector('#msgError')

  let userValid = {

  }


  if ((usuario.value != "") && (senha.value != "") && (senha.value.charAt(0) != '1')) {

    let token = document.getElementById("usuario").value

    localStorage.setItem('token', token)
    localStorage.setItem('userLogado', JSON.stringify(userValid))
    console.log(token);
    setTimeout(() => {
      window.location.href = "/dicas/dicas/"
    }, 1000)
  } else {
    userLabel.setAttribute('style', 'color: red')
    usuario.setAttribute('style', 'border-color: red')
    senhaLabel.setAttribute('style', 'color: red')
    senha.setAttribute('style', 'border-color: red')
    msgError.setAttribute('style', 'display: block')
    msgError.innerHTML = 'Email ou senha incorretos'
    usuario.focus()
  }

}

function logado() {
  console.log(localStorage.getItem('token'));
  if (localStorage.getItem('token') == null) {
    alert('Você precisa estar logado para acessar essa página')
    window.location.href = "/login/login/"
  }

}

function sair() {
  console.log(localStorage.getItem('token'))
  localStorage.removeItem('token')
  localStorage.removeItem('userLogado')
}

window.addEventListener("load", logado);