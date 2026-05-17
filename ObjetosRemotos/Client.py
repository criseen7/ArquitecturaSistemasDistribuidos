import Pyro5.api

# Reemplazar con URI real del servidor
uri = "PYRO:obj_123456789@localhost:9090"
# Crear proxy remoto
calculadora = Pyro5.api.Proxy(uri)
print("Suma:", calculadora.sumar(10, 5))
print("Resta:", calculadora.restar(10, 5))
print("Multiplicación:", calculadora.multiplicar(10, 5))
print("División:", calculadora.dividir(10, 5))