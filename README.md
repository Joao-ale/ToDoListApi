# ToDoList API RestFull

Este projeto é uma API RestFull para uma ToDoList. Ele permite que você gerencie suas tarefas diárias de forma organizada e eficiente. A API fornece endpoints para realizar operações de leitura (`GET`) sobre as tarefas e os usuários associados.

## Estrutura do Projeto

### Tasks
As `Tasks` representam as atividades a serem realizadas. Cada tarefa contém os seguintes campos:

- **Id**: Identificador único da tarefa.
- **User**: Usuário associado à tarefa, contendo o Id, nome e nickname do usuário.
- **Nome**: Nome da tarefa.
- **Descrição**: Detalhes sobre o que a tarefa envolve.
- **Data**: Data em que a tarefa deve ser realizada.

### Users
Os `Users` são os responsáveis pelas tarefas. Cada usuário contém os seguintes campos em sua View:

- **Id**: Identificador único do usuário.
- **Nome**: Nome completo do usuário.
- **Nickname**: Apelido do usuário.

## Endpoints Disponíveis

### GET /tasks
Retorna a lista de todas as tasks registradas no sistema, incluindo os detalhes do usuário associado.
