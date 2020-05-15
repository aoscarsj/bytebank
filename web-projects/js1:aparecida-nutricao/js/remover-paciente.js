var pacientes = document.querySelectorAll(".paciente");

var tabela = document.querySelector("#tabela-pacientes");

tabela.addEventListener("dblclick", function (event) {
    // var alvoEvento = event.target; // eh a td
    // var paiDoAlvo = alvoEvento.parentNode; // eh a tr
    // paiDoAlvo.remove();

    event.target.parentNode.classList.add("fadeOut");

    setTimeout(function () {
        event.target.parentNode.remove();
    }, 500);

});

// pacientes.forEach(function (paciente) {
//    paciente.addEventListener("dblclick", function () {
//        this.remove(); // o dono do evento, quem foi clicado
//    });
// });