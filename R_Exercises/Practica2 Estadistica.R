# Cargamos el CSV con la funci√≥n que nos da R para meterlo en una variable Dataframe
notas <- read.csv(file = 'notas.csv', sep=";", dec=",")

## **************** EJERCICIO 1 ******************
# Ponemos a 0 todos los Nan a 0 como dice el enunciado para saber que es un suspenso.
notas[is.na(notas)] <- 0

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


## **************** EJERCICIO 2 ******************
# Creo mi modelo NaiveBayes para predecir aprobar la asignatura en Junio.
# Para instalar el modelo NaiveBayes install.packages("e1071")
library(e1071)
model <- naiveBayes(NotaFinalJunio ~ ., data = notas)

# Dado el suceso de aprobar el examen de Junio
notas$Predicted <- predict(model, notas)
tabla <- table(notas[, c('NotaFinalJunio', 'Predicted')])
tabla


prop.table(tabla, 1)
## La probabilidad de que acierte en la prediccion de aprobado dado que el/la alumno/a ha aprobado. 0.83333333
## La probabilidad de que acierte en la prediccion de suspenso dado que el/la alumno/a ha suspendido. 0.98230088

pie(prop.table(tabla, 1)[1,], labels=c("Aprobado", "Suspenso"), main = " La probabilidad de que acierte en la prediccion \n 
    de aprobado dado que el/la alumno/a ha aprobado", col=c("#23D800", "red"))

prop.table(tabla, 2)
## La probabilidad de que el/la alumno/a aprueba dado que el clasificador predice que va a aprobar. 0.93750000
## La probabilidad de que el/la alumno/a suspenda dado que el clasificador predice que va a suspender. 0.94871795

pie(prop.table(tabla, 2)[1,], labels=c("Aprobado", "Suspenso"), main = "La probabilidad de que el/la alumno/a aprueba dado \n
    que el clasificador predice que va a aprobar.", col=c("#23D800", "red"))

## La probabilidad de que el clasificador acierte en su prediccion.
## Es la suma de los aciertos entre todos.
(30+111)/(30+6+2+111)



## **************** EJERCICIO 3 ******************
# A) Dado el suceso ser del Grupo A
dfGrupos <- notas[c('Grupo', 'NotaFinalJunio')]
modelGrupo <- naiveBayes(NotaFinalJunio ~ ., data = dfGrupos)
dfGrupos$PredictPorGrupo <- predict(modelGrupo, dfGrupos)
tabla1 <- table(dfGrupos[, c('NotaFinalJunio', 'PredictPorGrupo')])
prop.table(tabla1, 1)
prop.table(tabla1, 2)

barplot(tabla1, beside = T, xlab = "APROBADOS/SUSPENSOS", main="PredicciÛn en base a su grupo", col=c(rgb(0, 0.848, 1), rgb(0.94, 0.51, 0)))


# B) Utilizando informacion de grupo, de Practica 1 y de Practica 2.
dfGruposPracticas <- notas[c('Grupo', 'Practica1', 'Practica2', 'NotaFinalJunio')]
modelPracticasGrupo <- naiveBayes(NotaFinalJunio ~ ., data = dfGruposPracticas)
dfGruposPracticas$PredictPorPracticasGrupo <- predict(modelPracticasGrupo, dfGruposPracticas)
tabla2 <- table(dfGruposPracticas[, c('NotaFinalJunio', 'PredictPorPracticasGrupo')])
prop.table(tabla2, 1)
prop.table(tabla2, 2)

barplot(tabla2, beside = T, xlab = "APROBADOS/SUSPENSOS", main="PredicciÛn en base a su grupo y las notas de las pr·cticas 1 y 2", col=c(rgb(0, 0.848, 1), rgb(0.94, 0.51, 0)))

# C) Utilizando informacion de grupo, de Practica 1, de Practica 2 y de Evaluacion parcial.
dfGruposPracticasEvaluacion <- notas[c('Grupo', 'Practica1', 'Practica2', 'EvaluacionParcial', 'NotaFinalJunio')]
modelPracticasGrupo <- naiveBayes(NotaFinalJunio ~ ., data = dfGruposPracticasEvaluacion)
dfGruposPracticasEvaluacion$PredictPorPracticasGrupo <- predict(modelPracticasGrupo, dfGruposPracticasEvaluacion)
tabla3 <- table(dfGruposPracticasEvaluacion[, c('NotaFinalJunio', 'PredictPorPracticasGrupo')])
prop.table(tabla3, 1)
prop.table(tabla3, 2)

barplot(tabla3, beside = T, xlab = "APROBADOS/SUSPENSOS", main="PredicciÛn en base a su grupo y las notas de las pr·cticas 1, 2 y Èxamen parcial", col=c(rgb(0, 0.848, 1), rgb(0.94, 0.51, 0)))


# D) Utilizando toda la informacioon disponible de grupo, practicas y evaluacion parcial.
dfGruposPracticasEvaluacionT <- notas[c('Grupo', 'Practica1', 'Practica2', 'Practica3', 'TotalPracticas', 'EvaluacionParcial', 'NotaFinalJunio')]
modelPracticasGrupo <- naiveBayes(NotaFinalJunio ~ ., data = dfGruposPracticasEvaluacionT)
dfGruposPracticasEvaluacionT$PredictPorPracticasGrupo <- predict(modelPracticasGrupo, dfGruposPracticasEvaluacionT)
tabla4 <- table(dfGruposPracticasEvaluacionT[, c('NotaFinalJunio', 'PredictPorPracticasGrupo')])
prop.table(tabla4, 1)
prop.table(tabla4, 2)

tabla4
barplot(tabla4, beside = T, xlab = "APROBADOS/SUSPENSOS", main="PredicciÛn en base toda la informacioon disponible de grupo, practicas y evaluacion parcial", col=c(rgb(0, 0.848, 1), rgb(0.94, 0.51, 0)))


## **************** EJERCICIO 4 ******************
## Calcula la prediccion de Aprobar en Junio para cada uno de los miembros del grupo
## en base a las notas que creeis que obtendreis en las practicas 1 y 2.
modelNotasPracticas <- naiveBayes(NotaFinalJunio ~ ., data = notas[c('Practica1', 'Practica2', 'NotaFinalJunio')])
nuestrasNotas <- data.frame (Practica1  = c('S', 'A', 'A', 'A', 'A'),
                             Practica2 = c('A', 'S', 'S', 'A', 'S'),
                             Nombre = c('Alejandro M', 'Alejandro N', 'Nicolas Garcia', 'Jesus David Martinez', 'David Casado'))
nuestrasNotas$Predicted <- predict(modelNotasPracticas, nuestrasNotas)
nuestrasNotas

