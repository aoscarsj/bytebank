def play():
    print("******************************************")
    print("********Bem vindo ao jogo da Forca*******!")
    print("******************************************")

    palavra_secreta = "banana"
    palavra_secreta = palavra_secreta.upper()

    enforcou = False
    acertou = False

    while(not enforcou and not acertou):
        chute = input("Qual a letra? ")
        chute = chute.strip().upper()
        print(chute)

        index = 0
        for letra in palavra_secreta:
            if(chute == letra):
                print("Encontrei a letra {} na posição {}".format(letra,index))
            index += 1


    print("Fim do jogo")


if (__name__ == "__main__"):
    play()
