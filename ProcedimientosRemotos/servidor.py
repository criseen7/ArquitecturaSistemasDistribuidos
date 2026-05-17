from xmlrpc.server import SimpleXMLRPCServer

class Calculadora:
    def potencia(self, a, b):
        return a ** b

    def factorial(self, n):
        resultado = 1
        for i in range(1, n + 1):
            resultado *= i
        return resultado


server = SimpleXMLRPCServer(
    ("localhost", 8000)
)
server.register_instance(
    Calculadora()
)
print("Servidor RPC activo")
server.serve_forever()