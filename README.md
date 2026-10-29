# Padrão Comportamental: Mediator (Central de Ajuda e Atendimento)

## Descrição do Projeto
Este projeto demonstra a implementação do padrão comportamental **Mediator** num ecossistema de **apoio ao cliente de uma plataforma de comércio eletrónico**.

O objetivo do padrão Mediator é diminuir o acoplamento entre múltiplos objetos ou serviços, assegurando que estes não comuniquem diretamente entre si, mas sim através de um mediador central encapsulado.

## Estrutura do Padrão
* **Mediator (`CentralAjuda`)**: Concentra a comunicação entre os intervenientes. Em vez de o cliente enviar mensagens diretas para o setor de entregas, toda a interação é recebida, padronizada e encaminhada pela central.
* **Colleague Interface (`Departamento`)**: Define as operações padronizadas que qualquer setor da organização suporta (`receberElogio`, `receberReclamacao`, `receberSugestao`).
* **Colleague Concreto (`Logistica`)**: O setor operacional que processa as mensagens delegadas pelo mediador.
* **Emissor / Participante (`Utilizador` e `Cliente`)**: As classes que originam as solicitações sem guardar dependência direta do departamento de logística.

## Execução dos Testes
Para executar a suite de testes unitários com JUnit 5:

```bash
mvn test
