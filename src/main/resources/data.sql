INSERT INTO operadores (id_operador, nombre) VALUES (1, 'Tigo');
INSERT INTO operadores (id_operador, nombre) VALUES (2, 'Movistar');
INSERT INTO operadores (id_operador, nombre) VALUES (3, 'Claro');
INSERT INTO operadores (id_operador, nombre) VALUES (4, 'Uff');

INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (1, 1000);
INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (2, 2000);
INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (3, 3000);
INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (4, 4000);
INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (5, 5000);
INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (6, 10000);
INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (7, 20000);
INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (8, 30000);
INSERT INTO valores_recarga (id_valor_recarga, cantidad) VALUES (9, 50000);

INSERT INTO vendedores (id_vendedor,nombre,correo,telefono) VALUES (1,'example','example@gmail.com','320xxxxxxx');

INSERT INTO recargas (id_recarga,id_vendedor,id_operador,cantidad_inicial) VALUES (1,1,1,500000);
INSERT INTO recargas (id_recarga,id_vendedor,id_operador,cantidad_inicial) VALUES (2,1,1,700000);
INSERT INTO recargas (id_recarga,id_vendedor,id_operador,cantidad_inicial) VALUES (3,1,1,400000);
INSERT INTO recargas (id_recarga,id_vendedor,id_operador,cantidad_inicial) VALUES (4,1,1,800000);


