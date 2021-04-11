# kafka-consumer



#### Instruções:
* Crie um banco no postgres com o nome payment
* Executar o seguinte sql, dentro do banco criado

CREATE TABLE PEDIDO (
    ID SERIAL PRIMARY KEY UNIQUE,
    CLIENTE VARCHAR(200) NOT NULL,
    VALOR_TOTAL NUMERIC NOT NULL,
    STATUS_PAGAMENTO VARCHAR(200)NOT NULL
);

INSERT INTO PEDIDO (CLIENTE, VALOR_TOTAL, STATUS_PAGAMENTO) 
VALUES (‘Carlos Xavier’, 200.00, ‘PENDENTE’);

INSERT INTO PEDIDO (CLIENTE, VALOR_TOTAL, STATUS_PAGAMENTO) 
VALUES ('Jeferson Pedroso', 120.00, 'PENDENTE');

INSERT INTO PEDIDO (CLIENTE, VALOR_TOTAL, STATUS_PAGAMENTO) 
VALUES ('Raquel Oliveira', 1200.00, 'PENDENTE');

INSERT INTO PEDIDO (CLIENTE, VALOR_TOTAL, STATUS_PAGAMENTO) 
VALUES ('Daniel Antunes', 200.00, 'PENDENTE');

INSERT INTO PEDIDO (CLIENTE, VALOR_TOTAL, STATUS_PAGAMENTO) 
VALUES ('João da Rosa', 100.00, 'PENDENTE');

INSERT INTO PEDIDO (CLIENTE, VALOR_TOTAL, STATUS_PAGAMENTO) 
VALUES ('Letícia Assis', 5200.00, 'PENDENTE');



