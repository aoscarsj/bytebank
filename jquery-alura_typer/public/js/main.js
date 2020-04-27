// a funcao $() eh um atalho (Short Range) para a funcao jQuery()

var frase = $(".frase").text();
var numPalavras = frase.split(" ").length;
var tamanhoFrase = $("#tamanho-frase");
tamanhoFrase.text(numPalavras);

var campo = $(".campo-digitacao");

campo.on("input", function () {
   var conteudo = campo.val();
   var qtdPalavras = conteudo.split(/\S+/).length; //expressao regular que busca por qualquer espaco vazio
   var qtdLetras = conteudo.length;

   $("#contador-palavras").text(qtdPalavras-1);
   $("#contador-caracteres").text(qtdLetras);
});

function f () {

}