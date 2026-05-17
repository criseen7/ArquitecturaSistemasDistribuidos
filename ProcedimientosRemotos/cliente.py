import xmlrpc.client

proxy = xmlrpc.client.ServerProxy(
    "http://localhost:8000/"
)
print(proxy.potencia(2, 8))
print(proxy.factorial(5))