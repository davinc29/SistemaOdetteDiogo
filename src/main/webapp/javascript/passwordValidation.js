function validarSenha(event) {
    let senhaNova = document.getElementById("novaSenha");
    let confirmarSenha = document.getElementById("confirmarSenha");
    let erro = document.getElementById("erroSenha");

    if (senhaNova.value !== confirmarSenha.value) {
        event.preventDefault();
        erro.innerText = "Senha nova e confirmar senha devem ser iguais";
    }
}