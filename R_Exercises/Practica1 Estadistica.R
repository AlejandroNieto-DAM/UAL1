
notas <- read.csv(file = '/Users/alejandronietoalarcon/Documents/UAL1/R_Exercises/notas.csv', sep=";", dec=",")



######## NO PODEMOS PONER TODOS LOS VALORES A 0 YA QUE ALGUNOS ALUMNOS PODRIAN NO PRESENTARSE A X VARIABLE 
####### EJEMPLO: EL EXAMEN FINAL DE JUNIO
notas[is.na(notas)] <- 0
notas

notasPractica1 <- as.vector(notas[,"Practica1"])
typeof(notasPractica1) 
intervalosNotasPracticas1=cut(notasPractica1,breaks=seq(0,2,length=nclass.Sturges(notasPractica1)),include.lowest=TRUE)

notasPractica2 <- as.vector(notas[,"Practica2"])
typeof(notasPractica2) 
intervalosNotasPracticas2=cut(notasPractica2,breaks=seq(0,2,length=nclass.Sturges(notasPractica2)),include.lowest=TRUE)
              
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

desviacionTipica = (sqrt(variance(notaFinalJunio)) / (mean(notaFinalJunio))) # Desviacion tipica
desviacionTipica

# Coeficiente de variacion de Pearson
coeficientePearson = (desviacionTipica / mean(notaFinalJunio))


# Coeficiente de asimetria de Fisher

# Coeficiente de curtosis

# Covarianza
cov(notasPractica1, notaFinalJunio)

#Analisis regresion lineal
