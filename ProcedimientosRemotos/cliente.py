import xmlrpc.client

proxy = xmlrpc.client.ServerProxy(
    "http://localhost:8000/"
)
print("=== CLIENTE RPC ===")
print("Suma:", proxy.sumar(10, 5))
print("Resta:", proxy.restar(10, 5))
print("Multiplicación:", proxy.multiplicar(10, 5))
print("División:", proxy.dividir(10, 5))
print("Potencia:", proxy.potencia(2, 8))
print("Factorial:", proxy.factorial(5))