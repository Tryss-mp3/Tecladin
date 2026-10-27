# Padrão Adapter — Teclado C para USB

## Problema
O teclado possui uma conexão do tipo C, enquanto o gabinete espera receber um dispositivo pela interface USB representada pelo contrato `DispositivoUSB`.

## Solução
O `TecladoAdapter` implementa `DispositivoUSB` e recebe um objeto `TecladoC`. Quando o gabinete pede uma conexão USB, o adapter faz a adaptação e aciona o teclado.

## Classes
- `TecladoC`: representa o teclado com conexão C.
- `DispositivoUSB`: interface esperada pelo gabinete.
- `TecladoAdapter`: adapta o teclado C para a interface USB.
- `Gabinete`: aceita dispositivos que implementam `DispositivoUSB`.
- `Main`: cria os objetos e demonstra a conexão.

## Como executar
Abra o projeto em uma IDE Java (por exemplo, IntelliJ IDEA), localize `src/estruturais/adapter_teclado/Main.java` e execute a classe `Main`.

Saída esperada:
```text
Adaptando a conexão C para USB...
Teclado conectado usando entrada C.
Teclado conectado ao gabinete pela entrada USB.
```

> Observação: esta é uma simulação didática do padrão Adapter em Java. Não realiza uma conversão elétrica/física real entre conectores.
