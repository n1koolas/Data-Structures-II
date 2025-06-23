# ⚔️ Aventura Épica: Desafio de Estruturas de Dados II 🛡️

Bem-vindos ao repositório do projeto **Aventura Épica**, meu software desenvolvido como parte do **Desafio de Estruturas de Dados II: O Mestre dos Algoritmos**. Este projeto é um RPG de turnos, inspirado nos clássicos jogos da série Final Fantasy, onde os jogadores podem explorar um mundo vasto, combater monstros em batalhas estratégicas e desenvolver seus personagens.

## 🎯 Tema do Projeto e Justificativa

**Aventura Épica** é um RPG (Role-Playing Game) por turnos que transporta o jogador para um reino de fantasia medieval. A premissa central é a exploração de um mapa interconectado, o combate estratégico baseado em turnos contra diversos inimigos e o desenvolvimento dos personagens através de equipamentos e habilidades.

Escolhi este tema por sua vasta capacidade de integração com os conceitos de Estruturas de Dados e Algoritmos. Jogos de RPG, por sua natureza, exigem o gerenciamento de grandes volumes de dados (inventários, estatísticas de personagens, mapas, inimigos) e a implementação de lógicas complexas (movimentação, combate, inteligência artificial). A estrutura de um RPG de turnos clássico, como os antigos Final Fantasy, oferece um terreno fértil para aplicar cada tópico da ementa de forma prática e divertida, permitindo que a teoria se transforme em uma experiência de jogo tangível.

## 💡 Visão Geral das Funcionalidades

O jogo contará com as seguintes funcionalidades principais:

* **Exploração de Mapa:** Um mapa interativo com diferentes áreas (cidades, masmorras, florestas) que os jogadores podem navegar.
* **Sistema de Batalha por Turnos:** Encontros com inimigos que levam a batalhas estratégicas onde o jogador e os inimigos se revezam para atacar, usar habilidades e itens.
* **Gerenciamento de Inventário:** Um sistema para gerenciar itens, equipamentos e consumíveis dos personagens.
* **Evolução de Personagens:** Desenvolvimento de personagens através de pontos de experiência, equipamentos e desbloqueio de novas habilidades.
* **Diálogos e Quests:** Interações com NPCs (personagens não jogáveis) para receber missões e avançar na história.
* **Sistema de Salvamento/Carregamento:** Permite ao jogador salvar o progresso do jogo e retomá-lo posteriormente.

## 🔗 Integração da Ementa: Algoritmos em Ação

Cada tópico da ementa de Estruturas de Dados II será incorporado como um módulo ou funcionalidade essencial dentro de **Aventura Épica**. Abaixo, detalho como cada um será implementado:

### 📊 Teoria da Complexidade (NP-Difíceis/Completos)

* **Funcionalidade/Módulo:** **Desafio da Masmorra Infinitas / Otimização de Formação de Grupo**
* **Como é implementado:** O jogo apresentará "Masmorras Infinitas" onde a geração de layouts e posicionamento de inimigos podem se aproximar de um problema NP-Difícil (como o problema do caixeiro viajante para otimização de caminhos entre salas, embora com heurísticas). O desafio não será resolver o problema de forma ótima, mas sim demonstrar a dificuldade de encontrar a solução ideal em tempo polinomial. Outra aplicação será a otimização da formação de um grupo de personagens para uma determinada batalha, considerando as sinergias de habilidades e resistências dos inimigos. O software poderá usar heurísticas para encontrar uma boa (mas não necessariamente ótima) combinação em tempo razoável.

### 🔍 Algoritmos de Busca (Sequencial, Binária, Busca em Texto, Hashing)

* **Funcionalidade/Módulo:** **Loja de Itens Otimizada / Enciclopédia de Monstros / Busca de Diálogos**
* **Como é implementado:**
    * **Busca Sequencial/Binária:** A loja do jogo, o inventário do jogador e o banco de dados de itens utilizarão busca binária para encontrar rapidamente itens por ID ou nome (se a lista estiver ordenada), ou busca sequencial para filtros mais complexos.
    * **Busca em Texto:** Haverá uma "Enciclopédia de Monstros" ou um "Diário de Quests" onde o jogador poderá pesquisar informações sobre inimigos ou missões utilizando algoritmos de busca em texto (como KMP ou Rabin-Karp) para encontrar ocorrências específicas em descrições e notas.
    * **Hashing:** O sistema de cache de recursos (sprites, modelos 3D, áudios) do jogo usará tabelas hash para acesso rápido aos arquivos, minimizando o tempo de carregamento. O acesso rápido a estatísticas de personagens e itens por seus IDs únicos também será otimizado com hashing.

### 💾 Compressão de Dados (RLE, Huffman)

* **Funcionalidade/Módulo:** **Sistema de Salvamento Eficiente / Transmissão de Dados de Rede (se multiplayer)**
* **Como é implementado:**
    * **RLE (Run-Length Encoding):** O sistema de salvamento do jogo utilizará RLE para comprimir dados repetitivos, como o layout de certas áreas do mapa (mapas com grandes trechos de terreno idêntico) ou informações de estado de entidades com muitas características idênticas, reduzindo o tamanho dos arquivos de save.
    * **Huffman:** O sistema de diálogo ou as descrições de itens e habilidades, que podem conter texto repetitivo, poderão ser comprimidos utilizando o algoritmo de Huffman para otimizar o armazenamento em disco e a leitura durante o jogo. Caso o projeto evolua para um aspecto multiplayer simples (ex: troca de mensagens), Huffman poderia ser usado para otimizar a transmissão de pacotes de dados.

### 🌐 Grafos (Caminhos, Redes, Conexões, Fluxos, etc.)

* **Funcionalidade/Módulo:** **Mapa Mundi Interconectado / IA de Movimentação de Inimigos / Sistema de Rota de Itens**
* **Como é implementado:**
    * **Caminhos/Redes:** O mapa do jogo será modelado como um grafo, onde as cidades e masmorras são vértices e as estradas/caminhos entre elas são arestas. Algoritmos como **Dijkstra** ou **A*** (A-estrela) serão usados para encontrar o caminho mais curto para o jogador (ou para a IA de inimigos) entre dois pontos.
    * **Conexões:** Ações de combate (ex: "encadeamento de combos") ou sistemas de dependência de habilidades/itens poderão ser representados como grafos direcionados para verificar a viabilidade e a ordem das ações.
    * **Fluxos:** Em algumas masmorras, pode haver puzzles que envolvam "fluxo" de energia ou água através de tubulações, que poderiam ser modelados e resolvidos usando algoritmos de fluxo máximo (como Edmonds-Karp ou Ford-Fulkerson).

### 💰 Algoritmos Gulosos (Troco, Escalonamento de Intervalos, Mochila Fracionário)

* **Funcionalidade/Módulo:** **Sistema de Comércio Inteligente / Otimização de Uso de Habilidades em Combate / Alocação de Recursos de Batalha**
* **Como é implementado:**
    * **Troco:** Em lojas, ao calcular o troco para o jogador, o algoritmo guloso de troco será utilizado para minimizar o número de moedas/itens entregues.
    * **Escalonamento de Intervalos:** Durante o combate, a IA inimiga ou mesmo um sistema de "sugestão de ação" para o jogador poderá utilizar um algoritmo guloso para escalonar habilidades com base em seus tempos de recarga e efeitos, visando maximizar o dano ou a cura em um turno.
    * **Mochila Fracionário:** Na alocação de "buffs" ou "debuffs" (aprimoramentos/enfraquecimentos) para o grupo ou inimigos, considerando uma capacidade limitada (ex: número máximo de buffs ativos), um algoritmo guloso pode ser usado para escolher os efeitos que proporcionam o maior "valor" por "custo" fracionário.

### 🧠 Programação Dinâmica (Mochila 0/1, Multiplicação de Matrizes, LCS, etc.)

* **Funcionalidade/Módulo:** **Otimização de Inventário com Restrições / Cálculo de Dano Complexo / Alinhamento de Sequências de Ataques**
* **Como é implementado:**
    * **Mochila 0/1:** A otimização do inventário do jogador, onde cada item tem um peso e um valor, e o jogador tem uma capacidade de carga limitada, será um problema de mochila 0/1. A programação dinâmica será usada para determinar a combinação de itens de maior valor que o jogador pode carregar.
    * **Multiplicação de Matrizes:** O cálculo de dano em combate pode envolver a multiplicação de várias matrizes (atributos do personagem, do equipamento, resistências do inimigo, modificadores de habilidades), e a programação dinâmica pode ser usada para otimizar a ordem dessas multiplicações (problema da cadeia de multiplicação de matrizes).
    * **LCS (Longest Common Subsequence):** Em um sistema de "combos" ou "sequências de habilidades", a programação dinâmica pode ser usada para encontrar a maior subsequência comum de ataques para otimizar o dano ou desbloquear efeitos especiais.

## 🛠️ Tecnologias Escolhidas

* **Linguagem de Programação:** **Java 21**
* **IDE (Ambiente de Desenvolvimento Integrado):** **IntelliJ IDEA**
* **Possíveis Bibliotecas/Frameworks (a serem avaliados durante o desenvolvimento):**
    * **JUnit:** Para testes unitários dos algoritmos e funcionalidades.
    * **Jackson:** Para serialização/desserialização de dados (ex: arquivos de save, dados de configuração).
---