## Practica 3
#notas <- read.csv(file = '/Users/alejandronietoalarcon/Documents/UAL1/R_Exercises/notas.csv', sep=";", dec=",")
notas <- read.csv(file = 'C:/Users/aleja/OneDrive/Documents/notas.csv', sep=";", dec=",")

# Ponemos a 0 todos los valores que esten debajo de 0

notas$Practica1[notas$Practica1 < 0] <- 0
notas$Practica2[notas$Practica2 < 0] <- 0
notas$Practica3[notas$Practica3 < 0] <- 0
notas$TotalPracticas[notas$TotalPracticas < 0] <- 0
notas$EvaluacionParcial[notas$EvaluacionParcial < 0] <- 0
notas$ExamenJunio[notas$ExamenJunio < 0] <- 0
notas$NotaFinalJunio[notas$NotaFinalJunio < 0] <- 0
notas$ExamenSeptiembre[notas$ExamenSeptiembre < 0] <- 0
notas$NotaFinalSeptiembre[notas$NotaFinalSeptiembre < 0] <- 0


# Ponemos a 0 todos los Nan a 0 como dice el enunciado.
notas[is.na(notas)] <- 0

# Nos guardamos una copia del dataset con los valores numericos
notasN <- notas


#Cambiamos todas las variables cuantitativas a cualitativas con valores de Aprobado = A o Suspenso = S
notas$Practica1[notas$Practica1 >= '0.5'] <- 'A'
notas$Practica1[notas$Practica1 < '0.5'] <- 'S'

notas$Practica2[notas$Practica2 >= '0.5'] <- 'A'
notas$Practica2[notas$Practica2 < '0.5'] <- 'S'

notas$Practica3[notas$Practica3 >= '0.5'] <- 'A'
notas$Practica3[notas$Practica3 < '0.5'] <- 'S'

notas$TotalPracticas[notas$TotalPracticas >= '1'] <- 'A'
notas$TotalPracticas[notas$TotalPracticas < '1'] <- 'S'

notas$EvaluacionParcial[notas$EvaluacionParcial >= '1'] <- 'A'
notas$EvaluacionParcial[notas$EvaluacionParcial < '1'] <- 'S'

notas$ExamenJunio[notas$ExamenJunio >= '3'] <- 'A'
notas$ExamenJunio[notas$ExamenJunio < '3'] <- 'S'

notas$NotaFinalJunio[notas$NotaFinalJunio >= '5'] <- 'A'
notas$NotaFinalJunio[notas$NotaFinalJunio < '5'] <- 'S'

notas$ExamenSeptiembre[notas$ExamenSeptiembre >= '4'] <- 'A'
notas$ExamenSeptiembre[notas$ExamenSeptiembre < '4'] <- 'S'

notas$NotaFinalSeptiembre[notas$NotaFinalSeptiembre >= '5'] <- 'A'
notas$NotaFinalSeptiembre[notas$NotaFinalSeptiembre < '5'] <- 'S'


# Reescalamos todas las notas en base al intervalo en el que se encuentran
reescalarNotaPracticas <- function(x) ((x * 10))

notasN$Practica1 <- reescalarNotaPracticas(notasN$Practica1)
notasN$Practica2 <- reescalarNotaPracticas(notasN$Practica2)
notasN$Practica3 <- reescalarNotaPracticas(notasN$Practica3)

reescalarTotalPracticas <- function(x) ((x * 10) / 2)

notasN$TotalPracticas <- reescalarTotalPracticas(notasN$TotalPracticas)

reescalarParcial <- function(x) ((x * 10) / 2)

notasN$EvaluacionParcial <- reescalarParcial(notasN$EvaluacionParcial)

reescalarExamenJunio <- function(x) ((x * 10) / 6)

notasN$ExamenJunio <- reescalarExamenJunio(notasN$ExamenJunio)

reescalarExamenSeptiembre <- function(x) ((x * 10) / 8)

notasN$ExamenSeptiembre <- reescalarExamenSeptiembre(notasN$ExamenSeptiembre)
notasN

# **************************** Ejercicio 1 ****************************

#Comprobar si la nota del examen de junio es independiente de las demas variables
# Si p.value > 0.05 son independientes
values = c()
tablaP1 <- table(notasN$ExamenJunio, notasN$Practica1)
resultadoP1 <- chisq.test(tablaP1, simulate.p.value = TRUE)
values[1] = resultadoP1$p.value

tablaP2 <- table(notasN$ExamenJunio, notasN$Practica2)
resultadoP2 <- chisq.test(tablaP2, simulate.p.value = TRUE)
values[2] = resultadoP2$p.value

tablaP3 <- table(notasN$ExamenJunio, notasN$Practica3)
resultadoP3 <- chisq.test(tablaP3, simulate.p.value = TRUE)
values[3] = resultadoP3$p.value

tablaTP <- table(notasN$ExamenJunio, notasN$TotalPracticas)
resultadoTP <- chisq.test(tablaTP, simulate.p.value = TRUE)
values[4] = resultadoTP$p.value

tablaEP <- table(notasN$ExamenJunio, notasN$EvaluacionParcial)
resultadoEP <- chisq.test(tablaEP, simulate.p.value = TRUE)
values[5] = resultadoEP$p.value

tablaNFJ <- table(notasN$ExamenJunio, notasN$NotaFinalJunio)
resultadoNFJ <- chisq.test(tablaNFJ, simulate.p.value = TRUE)
values[6] = resultadoNFJ$p.value

tablaES <- table(notasN$ExamenJunio, notasN$ExamenSeptiembre)
resultadoES <- chisq.test(tablaES, simulate.p.value = TRUE)
values[7] = resultadoES$p.value

tablaNFS <- table(notasN$ExamenJunio, notasN$NotaFinalSeptiembre)
resultadoNFS <- chisq.test(tablaNFS, simulate.p.value = TRUE)
values[8] = resultadoNFS$p.value


columns <- colnames(notasN)
columns <- columns[-7] 
columns
finalValues = cbind(columns, values)
finalValues

# **************************** Ejercicio 2 ****************************

# Datos estadisticos historicos arrojan que el porcentaje de aprobados en junio en la 
# asignatura de Estadistica suele estar en torno al 15 %.
# ¿Podemos confirmar en base a nuestros datos que ha habido un incremento de los aprobados en junio?
aprobadosJunio <- subset(notas, NotaFinalJunio == "A")
binom.test(c(length(aprobadosJunio$NotaFinalJunio), length(notas$NotaFinalJunio) - length(aprobadosJunio$NotaFinalJunio)), p = 0.15, alternative="g")
# p-value = 0.002211 y como p < 0.05 rechazamos H0. Podemos confirmar que ha habido un incremento

# Ademas, el estudio arroja que la nota media de las practicas (sobre 10 puntos) suele estar
# entorno a 5 puntos. ¿Podemos afirmar en base a nuestros datos que dicha media ha cambiado?
t.test(notasN$TotalPracticas, mu=5)
# p-value = 0.5975 y como p > 0.05 no tenemos evidencias suficientes para rechazar H0. Por lo cual
# nos indica que las medias son bastante similares y no hay diferencias significativas


# **************************** Ejercicio 3 ****************************

#Comprobar si hay diferencias entre la nota final de junio y la nota del examen de junio.
var.test(notasN$NotaFinalJunio, notasN$ExamenJunio)$p.value
t.test(notasN$NotaFinalJunio, notasN$ExamenJunio, var.equal = FALSE)$p.value

# **************************** Ejercicio 4 ****************************

# Comprobar si hay diferencias entre la nota final de septiembre y la nota del examen de septiembre.
var.test(notasN$NotaFinalSeptiembre, notasN$ExamenSeptiembre)$p.value
t.test(notasN$NotaFinalSeptiembre, notasN$ExamenSeptiembre, var.equal = FALSE)$p.value

# **************************** Ejercicio 5 ****************************

# Comprobar si hay diferencias entre los grupos A y B en lo que respecta a:
grupoA <- subset(notasN, Grupo == "A")
grupoB <- subset(notasN, Grupo == "B")

# Nota del examen de junio.
var.test(grupoA$ExamenJunio, grupoB$ExamenJunio)$p.value
t.test(grupoA$ExamenJunio, grupoB$ExamenJunio, var.equal = FALSE)$p.value

# Nota final de junio.
var.test(grupoA$NotaFinalJunio, grupoB$NotaFinalJunio)$p.value
t.test(grupoA$NotaFinalJunio, grupoB$NotaFinalJunio, var.equal = TRUE)$p.value

# Nota del examen de septiembre.
var.test(grupoA$ExamenSeptiembre, grupoB$ExamenSeptiembre)$p.value
t.test(grupoA$ExamenSeptiembre, grupoB$ExamenSeptiembre, var.equal = TRUE)$p.value

# Nota final de septiembre.
var.test(grupoA$NotaFinalSeptiembre, grupoB$NotaFinalSeptiembre)$p.value
t.test(grupoA$NotaFinalSeptiembre, grupoB$NotaFinalSeptiembre, var.equal = FALSE)$p.value

# Nota de practicas.
var.test(grupoA$TotalPracticas, grupoB$TotalPracticas)$p.value
t.test(grupoA$TotalPracticas, grupoB$TotalPracticas, var.equal = TRUE)$p.value

# Nota de los cuestionarios (evaluacion parcial).
var.test(grupoA$EvaluacionParcial, grupoB$EvaluacionParcial)$p.value
t.test(grupoA$EvaluacionParcial, grupoB$EvaluacionParcial, var.equal = FALSE)$p.value



