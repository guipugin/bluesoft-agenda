﻿CREATE TABLE SALA
(
SALA_ID INT PRIMARY KEY,
SALA_NOME VARCHAR(40)
);

CREATE TABLE AGENDAMENTOS
(
AG_NOMESALA VARCHAR(40),
AG_DATA TIMESTAMP
);