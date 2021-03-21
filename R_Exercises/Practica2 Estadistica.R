#intall.packages('e1071')
library(e1071)
library(mlbench)

data(HouseVotes84, package = "mlbench")
model <- naiveBayes(Class ~ ., data = HouseVotes84)
predict(model, HouseVotes84[1:10,])
predict(model, HouseVotes84[1:10,], type = "raw")

# Cargamos el CSV con la función que nos da R para meterlo en una variable Dataframe
notas <- read.csv(file = '/Users/alejandronietoalarcon/Documents/UAL1/R_Exercises/notas.csv', sep=";", dec=",")

# Mostramos el dataframe por completo
notas

model <- naiveBayes(NotaFinalJunio ~ ., data = notas)

predict(model, notas[1:10], type = "raw")


