import socket
import threading
from protocol import encode_message, decode_message

HOST = '127.0.0.1'
PORT = 5000

def handle_client(client_socket, address):
    print(f"[NUEVA CONEXIÓN] {address}")
    while True:
        try:
            message = decode_message(client_socket)
            if message is None:
                break
            print(f"[{address}] {message}")
            response = {
                "type": "RESPONSE",
                "status": "OK",
                "echo": message["content"]
            }
            client_socket.sendall(
                encode_message(response)
            )
        except Exception as e:
            print(f"Error: {e}")
            break
    print(f"[DESCONECTADO] {address}")
    client_socket.close()

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((HOST, PORT))
server.listen()
print(f"[SERVIDOR ESCUCHANDO] {HOST}:{PORT}")
while True:
    client_socket, address = server.accept()
    thread = threading.Thread(
        target=handle_client,
        args=(client_socket, address)
    )
    thread.start()