import Pyro5.api

@Pyro5.api.expose
class Calculadora:
    def sumar(self, a, b):
        return a + b
    def restar(self, a, b):
        return a - b
    def multiplicar(self, a, b):
        return a * b
    def dividir(self, a, b):
        if b == 0:
            raise ValueError("División entre cero")
        return a / b

# Crear daemon Pyro
daemon = Pyro5.api.Daemon()
# Registrar objeto remoto
uri = daemon.register(Calculadora)
print("Objeto remoto disponible en:")
print(uri)
# Esperar llamadas remotas
daemon.requestLoop()