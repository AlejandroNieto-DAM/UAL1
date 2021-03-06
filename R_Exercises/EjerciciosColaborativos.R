# Ejercicio 1

# Apt A
tamanio = c(20, 10, 50, 17, 5)
tiempo = c(1.8, 1, 5.3, 1.9, 0.6)

# Recta de regresion para el tiempo dado el tamanio (y = a + bx)
# (Esta seria la recta para predecir el tiempo dado el tamanio)
lm(tiempo~tamanio)

a = -0.0315
b = 0.1055  
# Recta -> Tiempo = -0.0315 + 0.1055*Tamanio

# Recta de regresion para el tamanio dado el tiempo (y = a + bx)
# (Esta seria la recta para predecir el tamanio dado el tiempo)
lm(tamanio~tiempo)

a = 0.4602
b = 9.4056  
# Recta -> Tamanio = 0.4602 + 9.4056*Tiempo

# Apt B
# Coeficiente de regresion lineal
# Da igual si tamanio-tiempo o tiempo-tamanio
# El resultado que da es como de buenas son las rectas de regresion
cor(tamanio, tiempo)
cor(tiempo, tamanio)
# Como es cercano a uno podemos concluir que las rectas de
# regresion son adecuadas para resolver este problema.

# Apt C
# Si hacemos nuestra regla de regresion e intentamos predecir
# el tiempo para un tamanio de 30MB el resultado es
t = -0.0315 + (0.1055*30)
t


# Ejercicio 2
usuarios = c(15, 18, 20, 20, 26, 16, 19, 20, 21, 29)
tiempo = c(4.32, 7.14, 9.21, 9.71, 15.39, 5.2, 8.37, 9.34, 10.46, 18.9)

variance <- function (x)   sum((x-mean(x))^2)/(length(x)-1) #escrita como una funcion
(sqrt(variance(tiempo)) / (mean(tiempo)))
(sqrt(variance(usuarios)) / (mean(usuarios)))


lm(usuarios~tiempo)
a = 10.9727
b = 0.9616
# Tiempo = a + b*Usuarios
u = a + b*12
u

# Ejercicio 9

salario = c(2500, 2000, 1500)
desviacion = c(sqrt(10), sqrt(25), sqrt(15))
salario / desviacion
