import asyncio

HOST = '127.0.0.1'
PORT = 5000

async def handle_echo(reader, writer):
    addr = writer.get_extra_info('peername')
    print(f"Conectado: {addr}")

    while True:
        data = await reader.read(1024)

        if not data:
            break

        message = data.decode()
        print(f"{addr}: {message}")

        writer.write(data)
        await writer.drain()

    writer.close()
    await writer.wait_closed()

async def main():
    server = await asyncio.start_server(
        handle_echo,
        HOST,
        PORT
    )

    addr = server.sockets[0].getsockname()
    print(f"Servidor en {addr}")

    async with server:
        await server.serve_forever()

asyncio.run(main())