import forca
import adivinhacao

def escolhe_jogo():
    print("***********************************")
    print("********Escolhe o seu jogo!********")
    print("***********************************")

    print("(1) Forca (2) Adivinhação")
    jogo = int(input("Qual o jogo? "))

    if(jogo == 1):
        print("Jogando forca")
        forca.play()
    else:
        print("Jogando adivinhação")
        adivinhacao.play()

if(__name__ == "__main__"):
    escolhe_jogo()