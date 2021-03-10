
notas <- read.csv(file = '/Users/alejandronietoalarcon/Documents/UAL1/R_Exercises/notas.csv', sep=";", dec=",")



######## NO PODEMOS PONER TODOS LOS VALORES A 0 YA QUE ALGUNOS ALUMNOS PODRIAN NO PRESENTARSE A X VARIABLE 
####### EJEMPLO: EL EXAMEN FINAL DE JUNIO
notas[is.na(notas)] <- 0
notas

reescalarPracticas <- function(x) ((x * 10))

notasPractica1 <- as.vector(notas[,"Practica1"])
notasPractica1 <- reescalarPracticas(notasPractica1)
notasPractica1
typeof(notasPractica1) 
intervalosNotasPracticas1=cut(notasPractica1,breaks=seq(2,length=nclass.Sturges(notasPractica1)),include.lowest=TRUE)

notasPractica2 <- as.vector(notas[,"Practica2"])
notasPractica2 <- reescalarPracticas(notasPractica2)
typeof(notasPractica2) 
intervalosNotasPracticas2=cut(notasPractica2,breaks=seq(2,length=nclass.Sturges(notasPractica2)),include.lowest=TRUE)

table(intervalosNotasPracticas, intervalosNotasPracticas2)

vecto = as.vector(table(intervalosNotasPracticas))
vecto

barplot(table(intervalosNotasPracticas))

# Grafico de sectores
pie(table(intervalosNotasPracticas))

# Histograma
hist(table(intervalosNotasPracticas))

#Boxplot
boxplot(notasPractica1)

#Recta de regresion lineal sobre TotalPracticas y NotaFinalJunio
totalPracticas <- as.vector(notas[,"TotalPracticas"])
notaFinalJunio <- as.vector(notas[,"NotaFinalJunio"])

lm(notaFinalJunio~totalPracticas)

#a = 0.9505
#b = 2.3844
#NotaFinalJunio = 0.9505 + 2.3844 * TotalPracticas

plot(totalPracticas, notaFinalJunio)
abline(lm(notaFinalJunio~totalPracticas))

# Media aritmetica, moda y mediana.
mean(notaFinalJunio)
median(notaFinalJunio)
# Para calcular la moda es necesario ejecutar previamente install.packages("modeest")
library(modeest)
mfv(notaFinalJunio)

#Analisis de los cuantiles
quantile(notaFinalJunio, prob = c(0.25, 0.5, 0.75, 1))

#Varianza y desviacion tipica
variance <- function (x)   sum((x-mean(x))^2)/(length(x)-1) 
variance(notaFinalJunio) # Varianza
var(notaFinalJunio)

desviacionTipica = sqrt(variance(notaFinalJunio)) # Desviacion tipica
desviacionTipica

# Coeficiente de variacion de Pearson
coeficientePearson = (desviacionTipica / mean(notaFinalJunio))
coeficientePearson

library(psych)

# Coeficiente de asimetria de Fisher
mucubo <- function (x)   sum((x-mean(x))^3)/(length(x)-1) 
(mucubo(notaFinalJunio) / (desviacionTipica^3))
skew(notaFinalJunio)

# Coeficiente de curtosis
mucuarta <- function (x)   sum((x-mean(x))^4)/(length(x)-1) 
(mucuarta(notaFinalJunio) / (desviacionTipica^4)) - 3
kurtosi(notaFinalJunio)

# Covarianza
cov(notasPractica1, notaFinalJunio)

#Analisis regresion lineal





examen_notas <- as.vector(notas[,"NotaFinalJunio"])
examen_notas

typeof(examen_notas) 
intervalosNotasExamen=cut(examen_notas,breaks=seq(1,length=nclass.Sturges(examen_notas)),include.lowest=TRUE)
table(intervalosNotasExamen)

pie(table(intervalosNotasExamen))

mean(examen_notas)
median(examen_notas)

desviacionTipica = sqrt(var(examen_notas)) # Desviacion tipica
desviacionTipica

# Coeficiente de variacion de Pearson
coeficientePearson = (desviacionTipica / mean(examen_notas))
coeficientePearson
