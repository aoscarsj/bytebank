var titulo = document.querySelector(".titulo");
titulo.textContent = "Aparecida Nutricionista";

var pacientes = document.querySelectorAll(".paciente");

for (var i = 0; i < pacientes.length; i++) {
    var paciente = pacientes[i];
    var tdPeso = paciente.querySelector(".info-peso");
    var tdAltura = paciente.querySelector(".info-altura");

    var peso = tdPeso.textContent;
    var altura = tdAltura.textContent;

    var tdImc = paciente.querySelector(".info-imc");

    var pesoEhValido = validaPeso(peso);
    var alturaEhValida = validaAltura(altura);

    if(pesoEhValido && alturaEhValida)
        tdImc.textContent = calculaImc(peso, altura);
    else{
        paciente.classList.add("paciente-invalido");
        if(!pesoEhValido)
            tdImc.textContent = "Peso inválido!";
        else
            tdImc.textContent = "Altura inválida!";
    }

}
function validaPeso(peso) {
    if(peso >= 0 && peso < 300)
        return true;
    return false;
}
function validaAltura(altura) {
    if(altura >= 0 && altura < 4)
        return true;
    return false;
}

function calculaImc(peso, altura) {
    var imc = 0;
    imc = peso / (altura * altura);

    return imc.toFixed(2);

}

