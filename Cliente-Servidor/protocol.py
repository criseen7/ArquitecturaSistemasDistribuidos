import json
import struct

HEADER_SIZE = 4

def encode_message(message_dict):
    """ Convierte diccionario -> bytes """
    json_data = json.dumps(message_dict).encode()
    message_length = len(json_data)
    header = struct.pack("!I", message_length)
    return header + json_data

def recv_exactly(sock, n):
    """ Lee exactamente n bytes """
    data = b''
    while len(data) < n:
        packet = sock.recv(n - len(data))
        if not packet:
            return None
        data += packet
    return data

def decode_message(sock):
    """ Lee un mensaje completo del socket """
    header = recv_exactly(sock, HEADER_SIZE)
    if not header:
        return None
    message_length = struct.unpack("!I", header)[0]
    payload = recv_exactly(sock, message_length)
    if not payload:
        return None
    return json.loads(payload.decode())