ALTER TABLE tb_pecas
ADD COLUMN numero_chamado VARCHAR(255);

ALTER TABLE tb_pecas
ADD CONSTRAINT fk_cliente
FOREIGN KEY (numero_chamado) REFERENCES tb_clientes(numero_chamado);
