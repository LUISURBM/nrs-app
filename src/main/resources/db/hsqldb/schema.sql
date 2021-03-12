DROP TABLE vehiculos IF EXISTS;

CREATE TABLE vehiculos (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(2000),
  dor       DATE,
  ciudad    VARCHAR(2000),
  correo    VARCHAR(2000),
  marca    VARCHAR(2000),
  tpoCombustible    VARCHAR(2000),
  vmax    NUMBER(5),
  tpoTransmision    VARCHAR(2000)

);
CREATE INDEX vehiculo_first_name ON autores (first_name);
