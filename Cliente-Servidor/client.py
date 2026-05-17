import socket
from protocol import encode_message, decode_message

HOST = '127.0.0.1'
PORT = 5000

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect((HOST, PORT))
print("Conectado al servidor")

while True:
    text = input("Mensaje: ")
    if text.lower() == "salir":
        break
    message = {
        "type": "MESSAGE",
        "sender": "cliente1",
        "content": text
    }
    client.sendall(
        encode_message(message)
    )
    response = decode_message(client)
    print("Servidor respondió:")
    print(response)

client.close()