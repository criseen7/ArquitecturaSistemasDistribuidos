import socket

HOST = '127.0.0.1'
PORT = 5000

client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

client_socket.connect((HOST, PORT))

while True:
    mensaje = input("Mensaje: ")

    if mensaje.lower() == "salir":
        break

    client_socket.sendall(mensaje.encode())

    data = client_socket.recv(1024)

    print("Eco del servidor:", data.decode())

client_socket.close()