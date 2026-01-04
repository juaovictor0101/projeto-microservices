CREATE TABLE produto(
  id BIGSERIAL primary key,
  nome VARCHAR(100) NOT NULL,
  preco DECIMAL(10,2) NOT NULL
);