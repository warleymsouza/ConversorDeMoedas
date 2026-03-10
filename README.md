Conversor de Moedas em Java

Este projeto é um **Conversor de Moedas desenvolvido em Java** que utiliza uma API de taxas de câmbio para realizar conversões entre diferentes moedas em tempo real.

O programa roda no **console** e permite que o usuário escolha a conversão desejada através de um menu interativo.

---

Funcionalidades

- Conversão entre as seguintes moedas:
  - Dólar → Peso Argentino
  - Peso Argentino → Dólar
  - Dólar → Real Brasileiro
  - Real Brasileiro → Dólar
  - Dólar → Peso Colombiano
  - Peso Colombiano → Dólar
- Consulta das taxas de câmbio em tempo real através de uma API.
- Interface interativa no console.
- Validação de opções do usuário.
- Formatação de valores monetários com duas casas decimais.

---

Tecnologias utilizadas

- **Java**
- **Gson** (para manipulação de JSON)
- **HTTP Client do Java**
- **ExchangeRate API**

---

 API utilizada

Este projeto utiliza a API:

https://www.exchangerate-api.com/

Ela fornece as taxas de câmbio atualizadas em formato JSON.

Exemplo de endpoint utilizado:


---

## 📂 Estrutura do projeto

O projeto possui as seguintes classes principais:

### `Principal`
Responsável pelo menu interativo e pela lógica de conversão.

### `ConsultaCambio`
Realiza a chamada da API e obtém as taxas de câmbio.

### `RespostaCambio`
Classe utilizada para mapear a resposta JSON da API.

---

Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

- Consumo de APIs em Java
- Manipulação de JSON com Gson
- Uso de `Map` para armazenar dados
- Estruturas de repetição (`while`)
- Estruturas condicionais (`switch`)
- Entrada de dados com `Scanner`
- Organização de código em classes

