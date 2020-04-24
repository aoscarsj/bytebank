// a funcao $() eh um atalho (Short Range) para a funcao jQuery()

var frase = $(".frase").text();
var numPalavras = frase.split(" ").length;

var tamanhoFrase = $("#tamanho-frase");
tamanhoFrase.text(numPalavras);

console.log(frase);