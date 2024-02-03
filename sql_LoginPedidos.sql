create database AnadirPedidos;
use AnadirPedidos;

create table Productos(
ID int primary key,
Descripcion varchar(255),
CodigoSKU varchar(255),
Precio float,
IVA int
);
select * from Productos;
describe DetallesPedido;


DELIMITER //

CREATE TRIGGER before_insert_Productos
BEFORE INSERT ON Productos FOR EACH ROW
BEGIN
    DECLARE last_id INT;

    SELECT MAX(ID) INTO last_id FROM Productos;
    
    IF last_id IS NULL THEN
        SET NEW.ID = 1;
    ELSE
        SET NEW.ID = last_id + 1;
    END IF;
END//
DELIMITER ;

CREATE TABLE Clientes (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255),
    Apellidos VARCHAR(255),
    Edad INT
);

DELIMITER // 
CREATE TRIGGER before_insert_Clientes
BEFORE INSERT ON Clientes FOR EACH ROW
BEGIN
    DECLARE last_id INT;

    SELECT MAX(ID) INTO last_id FROM Clientes;	
    
    IF last_id IS NULL THEN
        SET NEW.ID = 1;
    ELSE
        SET NEW.ID = last_id + 1;
    END IF;
END//
DELIMITER ;	

CREATE TABLE CabeceraPedido (
    IDPedido INT PRIMARY KEY,
    IDCliente INT,
    FechaPedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (IDCliente) REFERENCES Clientes(ID)
);

DELIMITER //
CREATE TRIGGER before_insert_CabeceraPedido
BEFORE INSERT ON CabeceraPedido FOR EACH ROW
BEGIN
    DECLARE last_id INT;

    SELECT MAX(IDPedido) INTO last_id FROM CabeceraPedido;	
    
    IF last_id IS NULL THEN
        SET NEW.IDPedido = 1;
    ELSE
        SET NEW.IDPedido = last_id + 1;
    END IF;
END//
DELIMITER ;


CREATE TABLE DetallesPedido (
    IdLinea INT PRIMARY KEY,
    IDPedido INT,
    IDProducto INT,
    Unidades INT,
    PvpUnidad DECIMAL(10, 2),
    FOREIGN KEY (IDPedido) REFERENCES CabeceraPedido(IDPedido),
    FOREIGN KEY (IdProducto) REFERENCES Productos(ID)
);
ALTER TABLE DetallesPedido
MODIFY COLUMN IdLinea INT AUTO_INCREMENT;
ALTER TABLE DetallesPedido
ADD PvpTotal DECIMAL(10, 2);

DELIMITER //
CREATE TRIGGER before_insert_DetallesPedido
BEFORE INSERT ON DetallesPedido FOR EACH ROW
BEGIN
    DECLARE last_id INT;

    SELECT MAX(IdLinea) INTO last_id FROM DetallesPedido;	
    
    IF last_id IS NULL THEN
        SET NEW.IdLinea = 1;
    ELSE
        SET NEW.IdLinea = last_id + 1;
    END IF;
END//
DELIMITER ;


ALTER TABLE DetallesPedido
MODIFY COLUMN IdLinea INT NULL,
MODIFY COLUMN IDPedido INT NULL;
show tables;



