algoritmo "semnome"

var
   numero : inteiro

inicio
      escreval("Insira um n�mero")
      leia(numero)
      
      // Condicional se
      se (numero > 10) entao
           escreval("N�mero maior do que 10!")
      fimse
      
      // Condicional se-sen�o
      se (numero > 10) entao
           escreval("N�mero maior do que 10!")
      senao
           escreval("N�mero menor ou igual a 10!")
      fimse
      
      // Condicional de escolha
      escolha (numero)
      caso 1
           escreva("um")
      caso 2, 3, 4
           escreva("dois, tr�s ou quatro")
      caso 7
           escreva("sete")
      outrocaso
           escreva("nenhum dos anteriores")
      fimescolha
      
      // La�o enquanto
      enquanto (numero <= 10) faca
           escreva(numero)
           numero <- numero + 1
      fimenquanto
      
      // La�o repita-at�
      repita
           escreva(numero)
           numero <- numero + 1
      ate (numero >= 10)
      
      // La�o para
      para numero de 1 ate 10 faca
           escreva(numero)
      fimpara
      
      // Quebra de la�o com interrompa (aplic�vel a qualquer la�o)
      enquanto (numero <= 10) faca
           escreva(numero)
           se (numero = 5) entao
                interrompa
           fimse
           numero <- numero + 1
      fimenquanto
fimalgoritmo
