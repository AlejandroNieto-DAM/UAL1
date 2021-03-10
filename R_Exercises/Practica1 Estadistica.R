# Cargamos el CSV con la función que nos da R para meterlo en una variable Dataframe
notas <- read.csv(file = '/Users/alejandronietoalarcon/Documents/UAL1/R_Exercises/notas.csv', sep=";", dec=",")

# Mostramos el dataframe por completo
notas

# Guardamos la columna ¨NotaFinalJunio¨ que contiene las notas de los alumnos en el exámen de junio.
examen_notas <- as.vector(notas[,"NotaFinalJunio"])
# Mostramos el vector anteriormente guardado.
examen_notas

# Creamos intervalos de 1 para hacer posteriormente una tabla de frecuencias ya que si no hiciesemos estos intervalos
# debido a la variabilidad de las notas haría una tabla con tantas columnas como notas diferentes haya.
intervalosNotasExamen=cut(examen_notas,breaks=seq(1,length=nclass.Sturges(examen_notas)),include.lowest=TRUE)
# Mostramos la tabla de frecuencia de la variable en intervalos que hemos calculado anteriormente.
table(intervalosNotasExamen)

# Creamos un grafico de sectores con la variable en intervalos para verlo de una forma más visual.
pie(table(intervalosNotasExamen))

# Calculamos la media de las notas del examen de junio.
mean(examen_notas)
# Calculamos la mediana de las notas del examen de junio.
median(examen_notas)
# Calculamos la desviación tipica de las notas del examen de junio.
desviacionTipicaExamen = sqrt(var(examen_notas)) 
desviacionTipicaExamen

# Coeficiente de variacion de Pearson
coeficientePearsonExamen = (desviacionTipicaExamen / mean(examen_notas))
coeficientePearsonExamen

# Guardamos la columna ¨Grupo¨ que contiene a que grupo pertenece cada alumno.
grupos <- as.vector(notas[,"Grupo"])
# Mostramos el vector anteriormente guardado.
grupos

# Para calcular la moda es necesario ejecutar previamente install.packages("modeest")
library(modeest)
# Mostramos la moda del vector grupos.
mfv(grupos)

# Mostramos la tabla de frecuencia del vector grupos.
table(grupos)
# Mostramos el diagrama de barras de la tabla de frecuencia del vector grupos.
barplot(table(grupos), col=rgb(0.2, 0.4, 0.6) )

# Guardamos los valores del dataframe principal pero solo de los alumnos que pertenezcan al grupo A.
grupoANotas <- subset(notas, (Grupo == 'A'))
grupoANotas
# Guardamos los valores del dataframe grupoANotas pero solo de los alumnos que tengan una nota igual o superior a 5 en el examen de junio.
grupoANotasAprobados <- subset(grupoANotas, (NotaFinalJunio >= 5))
grupoANotasAprobados
# Guardamos los valores del dataframe grupoANotas pero solo de los alumnos que tengan una nota menor a 5 en el examen de junio.
grupoANotasSuspensos <- subset(grupoANotas, (NotaFinalJunio < 5))
grupoANotasSuspensos

# Guardamos los valores del dataframe principal pero solo de los alumnos que pertenezcan al grupo B.
grupoBNotas <- subset(notas, (Grupo == 'B'))
grupoBNotas
# Guardamos los valores del dataframe grupoBNotas pero solo de los alumnos que tengan una nota igual o superior a 5 en el examen de junio.
grupoBNotasAprobados <- subset(grupoBNotas, (NotaFinalJunio >= 5))
# Guardamos los valores del dataframe grupoBNotas pero solo de los alumnos que tengan una nota menor a 5 en el examen de junio.
grupoBNotasSuspensos <- subset(grupoBNotas, (NotaFinalJunio < 5))

# Creamos un vector con el numero de suspensos y aprobados del grupo A trayendonos el total de valores que hay en cada subdataset del grupo A que hemos creado.
A <- c(nrow(grupoANotasSuspensos), nrow(grupoANotasAprobados))
A
# Creamos un vector con el numero de suspensos y aprobados del grupo B trayendonos el total de valores que hay en cada subdataset del grupo B que hemos creado.
B <- c(nrow(grupoBNotasSuspensos), nrow(grupoBNotasAprobados))
B
# Creamos un dataframe con los dos vectores anteriores.
comparacionGrupos <- cbind(A, B)
comparacionGrupos
# Mostramos un grafico de barras en el que se muestra cada grupo en un lugar y una subdivision de sus aprobados y suspensos.
barplot(comparacionGrupos, beside = T, xlab = "Grupos")

# Guardamos la columna ¨TotalPracticas¨ que contiene la nota de la suma de las 3 practicas que vale un 20% de la nota final.
notaPracticas <- as.vector(notas[,"TotalPracticas"])
notaPracticas

# Funcion creada para cambiar los valores de TotalPracticas que van de [0,2] a [0, 10]
reescalarTotalPracticas <- function(x) ((x * 10) / 2)

# Reescalamos el vector notaPracticas para que los valores que contengan sean entorno a 10
notaPracticas <- reescalarTotalPracticas(notaPracticas)
notaPracticas

# Creamos intervalos de 1 para hacer posteriormente una tabla de frecuencias ya que si no hiciesemos estos intervalos
# debido a la variabilidad de las notas haría una tabla con tantas columnas como notas diferentes haya.
intervalosPracticas=cut(notaPracticas,breaks=seq(1,length=nclass.Sturges(notaPracticas)),include.lowest=TRUE)

# Mostramos una tabla de frecuencias bidimensional de las notas de las practicas y las notas del examen en junio.
table(intervalosPracticas, intervalosNotasExamen)

# Mostramos el diagrama de cajas de las notas de las practicas para poder realizar un análisis sencillo a primera vista de los
# cuartiles y mediana además de ver si hay ciertos valores (outliers) que no son normales.
boxplot(notaPracticas, col=rgb(0.6, 0.2, 0.3))
# Quitamos los NA que contenga el vector y los sustituimos por 0
notaPracticas[is.na(notaPracticas)] <- 0
#Obtenemos de forma numerica los cuartiles del vector notaPracticas para ver los valores exactos.
quantile(notaPracticas, prob = c(0.25, 0.5, 0.75))

# Guardamos la columna ¨EvaluacionParcial¨ que contiene la nota del exámen parcial realizado por los alumnos.
notas_parcial <- as.vector(notas[,"EvaluacionParcial"])
notas_parcial

# Funcion creada para cambiar los valores de EvaluacionParcial que van de [0,2] a [0, 10]
reescalarParcial <- function(x) ((x * 10) / 2)

# Reescalamos el vector notas_parcial para que los valores que contengan sean entorno a 10
notas_parcial <- reescalarParcial(notas_parcial)
# Guardamos en un vector los valores NA del vector notas_parcial para saber cuanta gente no se presentó al exámen.
gente_no_presentada <- notas_parcial[is.na(notas_parcial)]
length(gente_no_presentada)
# Guardamos las notas de la gente que si hizo el exámen en un nuevo vector.
notas_parcial <- notas_parcial[!is.na(notas_parcial)]
notas_parcial

# Creamos intervalos de 1 para hacer posteriormente una tabla de frecuencias ya que si no hiciesemos estos intervalos
# debido a la variabilidad de las notas haría una tabla con tantas columnas como notas diferentes haya.
intervalosNotasParcial=cut(notas_parcial,breaks=seq(2,length=nclass.Sturges(notas_parcial)),include.lowest=TRUE)
# Mostramos un histograma que nos mostrara por intervalos las notas y la proporción de gente en ese intervalo.
hist(notas_parcial, col=rgb(0.54, 0.67, 0.33), xlab = 'Notas Evaluacion Parcial', ylab = 'Frecuencia', main = '')

# Funcion creada para reescalar los valores de una practica individual que vale 1 punto.
reescalarNotaPracticas <- function(x) ((x * 10))

# Guardamos la columna ¨Practica1¨ que contiene la nota de la suma de las 3 practicas que vale un 20% de la nota final.
notas_practica1 <- as.vector(notas[,"Practica1"])
# Reescalamos el vector notas_practica1 para que los valores que contengan sean entorno a 10
notas_practica1 <- reescalarNotaPracticas(notas_practica1)
notas_practica1

# Guardamos la columna ¨Practica2¨ que contiene la nota de la suma de las 3 practicas que vale un 20% de la nota final.
notas_practica2 <- as.vector(notas[,"Practica2"])
# Reescalamos el vector notas_practica2 para que los valores que contengan sean entorno a 10
notas_practica2 <- reescalarNotaPracticas(notas_practica2)
notas_practica2

# Guardamos la columna ¨Practica3¨ que contiene la nota de la suma de las 3 practicas que vale un 20% de la nota final.
notas_practica3 <- as.vector(notas[,"Practica3"])
# Reescalamos el vector notas_practica3 para que los valores que contengan sean entorno a 10
notas_practica3 <- reescalarNotaPracticas(notas_practica3)
notas_practica3

notas_practica1
notas_practica2
length(notas_practica1)
length(notas_practica2)

# Sumamos los valores de las practica1 y la practica2
sumaNotasPracticas12 <- (notas_practica1 + notas_practica2)
#Recta de regresion lineal sobre la nota de la practica 3 y la suma de la practica1 y practica2
lm(notas_practica3~sumaNotasPracticas12)

# RECORDAD QUE LAS NOTAS ESTÁN REECALADAS DE 0 A 10 ASI QUE TIENES QUE CONVERTIR LA NOTA PARA REALIZAR
# DE UNA FORMA CORRECTA LA SIGUIENTE RECTA DE REGRESIÓN.
# NotaPractica3 = 1.6276 + 0.2811(Suma notas practicas 1 y 2)

# Hacemos un grafico de puntos de la suma de la nota de las practicas 1 y 2 respecto de la nota de la practica 3
plot(sumaNotasPracticas12, notas_practica3, xlab = "NOTA PRACTICA 1 + PRACTICA 2", ylab = "NOTA PRACTICA 3", col=rgb(0, 0, 1))
# Le añadimos al anterior grafico la recta de regresión que habíamos creado anteriormente.
abline(lm(notas_practica3~sumaNotasPracticas12), col=rgb(1, 0, 0))

# Para hacer los siguientes datos que vamos a realizar debemos quitar los NA que contengan los vectores por lo
# que procedemos a hacer dos vectores pero esta vez sin NA
sumaNotasPracticas12_noNA <- sumaNotasPracticas12[!is.na(sumaNotasPracticas12)]
notas_practica3_noNA <- notas_practica3[!is.na(notas_practica3)]

# Calculamos la covarianza que tienen los dos vectores.
cov(notas_practica3_noNA, sumaNotasPracticas12_noNA)
# Calculamos la varianza que tiene la suma de la nota de las practicas 1 y 2.
var(sumaNotasPracticas12_noNA)
# Calculamos la desviación típica que tiene la suma de la nota de las practicas 1 y 2.
desviacionTipica = sqrt(variance(sumaNotasPracticas12_noNA))
desviacionTipica

# Creamos una funcion que nos calculará el numerador del coeficiente de asimetría de Fisher.
mucubo <- function (x)   sum((x-mean(x))^3)/(length(x)-1)
# Mostramos el coeficiente de asimetría de Fisher.
(mucubo(sumaNotasPracticas12_noNA) / (desviacionTipica^3))

# Creamos una funcion que nos calculará el numerador del coeficiente de Curtosis.
mucuarta <- function (x)   sum((x-mean(x))^4)/(length(x)-1)
# Mostramos el coeficiente Curtosis.
(mucuarta(sumaNotasPracticas12_noNA) / (desviacionTipica^4)) - 3
# Analizamos la correlación que tienen los vectores para los que hemos creado el grñafico de puntos y la recta de regresión.
cor(sumaNotasPracticas12_noNA, notas_practica3_noNA)

