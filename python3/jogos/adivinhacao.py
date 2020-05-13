import random


print("******************************************")
print("Bem vindo ao jogo de Adivinhação!")
print("******************************************")

# random.seed(101) # python gera um pseudo-aleatorio. Depende do seed.
numero_secreto = random.randrange(1,101);

total_de_tentativas = 3
rodada = 1

# while (rodada <= total_de_tentativas):
# o range vc pode passar o terceiro param que eh o i+=x; onde x eh o 3 param. por pad. x = 1;
for rodada in range(0, total_de_tentativas): # for (int rodada = 1; rodada < tot...; rodada++){
    print("Tentativa: {} de {}".format(rodada, total_de_tentativas))
    # rodada += 1
    chute = input("Digite um número entre 1 e 100!")
    print("Você digitou ", chute)
    chute = int(chute)

    if(chute < 1 or chute > 100):
        print("Digite um número entre 1 e 100!")
        continue

    acertou = chute == numero_secreto
    maior   = chute > numero_secreto
    menor   = chute < numero_secreto

    if (acertou):
        print("Você acertou")
        break
    else:
        if(maior):
            print("Você errou! O seu chute foi maior do que o número secreto.")
        elif(menor):
            print("Você errou! O seu chute foi menor do que o número secreto.")


print("Fim do jogo")
