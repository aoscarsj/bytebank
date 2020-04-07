var titulo = document.querySelector(".titulo")
titulo.textContent = "Aparecida Nutricionista"

var paciente = document.querySelector("#primeiro-paciente")

var tdPeso = paciente.querySelector(".info-peso")
var tdAltura = paciente.querySelector(".info-altura")

var peso = tdPeso.textContent
var altura = tdAltura.textContent

var tdImc = paciente.querySelector(".info-imc")
if(peso <= 0 || peso > 250)
    tdImc.textContent = "Peso inválido!"
else if(altura <= 0 || altura >= 4)
    tdImc.textContent = "Altura inválida!"
else
    tdImc.textContent = (peso)/(altura*altura)

console.log(altura)
console.log(peso)
console.log(tdPeso)