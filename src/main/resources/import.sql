INSERT INTO Pessoa(id, nome, anoNascimento) VALUES(1, 'Teste 1', 1995);
INSERT INTO Pessoa(id, nome, anoNascimento) VALUES(2, 'Teste 2', 1996);
INSERT INTO Pessoa(id, nome, anoNascimento) VALUES(3, 'Teste 3', 1997);

ALTER SEQUENCE pessoa_seq RESTART WITH 4;