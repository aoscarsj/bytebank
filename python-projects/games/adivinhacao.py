import random


print("******************************************")
print("Bem vindo ao jogo de Adivinhação!")
print("******************************************")

# random.seed(101) # python gera um pseudo-aleatorio. Depende do seed.
numero_secreto = random.randrange(1,101)
pontos = 1000
total_de_tentativas = 0
rodada = 1

print("(1) Fácil (2) Médio (3) Difícil")
nivel = int(input("Defina o nível: "))

if(nivel == 1):
    total_de_tentativas = 20
elif(nivel == 2):
    total_de_tentativas = 10
else:
    total_de_tentativas = 5

# while (rodada <= total_de_tentativas):
# o range vc pode passar o terceiro param que eh o i+=x; onde x eh o 3 param. por pad. x = 1;
for rodada in range(1, total_de_tentativas+1): # for (int rodada = 1; rodada < tot...; rodada++){
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
        print("Você acertou e fez {} pontos!".format(pontos))
        break
    else:
        pontos -= abs(chute - numero_secreto)
        if(maior):
            print("Você errou! O seu chute foi maior do que o número secreto.")
        elif(menor):
            print("Você errou! O seu chute foi menor do que o número secreto.")

if(rodada >= total_de_tentativas):
    print("O número secreto era {}. Você fez {} pontos.".format(numero_secreto, pontos))
print("Fim do jogo", rodada)
