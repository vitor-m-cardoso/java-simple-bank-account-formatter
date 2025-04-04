# Java Simple Bank Account Formatter

## Entregáveis

<details>
  <summary>O que foi desenvolvido</summary>

Foi desenvolvido uma simulação de um pequeno sistema de apoio à validação de contas bancárias.

</details>

<details>
  <summary><strong>Habilidades</strong></summary>

- Solucionar problemas relacionados ao gerenciamento de dependências no Maven;
- Configurar e utilizar o Maven como ferramenta de gerenciamento de dependências em um projeto Java.

</details>

## Orientações

<summary><strong>Testes</strong></summary>

Para executar todos os testes basta rodar o comando:

```bash
mvn test
```

Para executar apenas uma classe de testes:

```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos

### Formatação do número da conta

<details>
  <summary>descrição</summary>

- `conta < 6 dígitos`: deverá adicionar zeros àa esquerda até atender ao tamanho de 6 números;
- `conta > 6 dígitos`: deverão ser removidos todos os números antes dos 6 últimos;
- `conta == 6 dígitos`: já está aderente, o valor deve permanecer inalterado.

Exemplos:

- Conta `448` deverá ser formatada como `"000448"`;
- Conta `877665544` deverá ser formatada como `"665544"`;
- Conta `334455` deverá ser formatada como `"334455"`.

</details>

### Leitura da conta via terminal

<details>
  <summary>descrição</summary>

- Recebe o número da conta bancária no console (terminal) do sistema;
- Rejeita valores não numéricos com a mensagem: `Número da conta inválido!`;
- Caso a conta seja válida, mostra como resultado a conta com a formatação padrão. A conta é apresentada seguindo o padrão de mensagem `Número da conta: XXXXXX` , onde `XXXXXX`  é o número da conta já formatado.

</details>

---
