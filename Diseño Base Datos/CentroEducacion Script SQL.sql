
CREATE DATABASE "CentroEducativo"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;




-- SELECT * FROM Grado;
-- DROP TABLE Grado;
CREATE TABLE Grado
(
	Codigo INTEGER PRIMARY KEY NOT NULL,
	Nombre VARCHAR(50) UNIQUE NOT NULL,
	Descripcion VARCHAR(500) NOT NULL
);

-- DELETE FROM Grado;
INSERT INTO Grado VALUES (1, 'Primer Grado', 'Grado 1');
INSERT INTO Grado VALUES (2, 'Segundo Grado', 'Grado 2');
INSERT INTO Grado VALUES (3, 'Tercer Grado', 'Grado 3');
INSERT INTO Grado VALUES (4, 'Cuarto Grado', 'Grado 4');
INSERT INTO Grado VALUES (5, 'Quinto Grado', 'Grado 5');
INSERT INTO Grado VALUES (6, 'Sexto Grado', 'Grado 6');
INSERT INTO Grado VALUES (7, 'Septimo Grado', 'Grado 7');
INSERT INTO Grado VALUES (8, 'Octavo Grado', 'Grado 8');
INSERT INTO Grado VALUES (9, 'Noveno Grado', 'Grado 9');
INSERT INTO Grado VALUES (10, 'Decimo Grado', 'Grado 10');



-- SELECT * FROM Persona;
-- DROP TABLE Persona;
CREATE TABLE Persona
(
	Identificacion INTEGER PRIMARY KEY NOT NULL,
	Nombre_1 VARCHAR(50) NOT NULL,
	Nombre_2 VARCHAR(50),
	Apellido_1 VARCHAR(50) NOT NULL,
	Apellido_2 VARCHAR(50),
	Genero VARCHAR(10) CHECK(Genero = 'M' OR Genero = 'F') NOT NULL,
	Tipo VARCHAR(50) CHECK(Tipo = 'Padre' OR Tipo = 'Maestro' OR Tipo = 'Padre y Maestro' OR Tipo = 'Alumno') NOT NULL,
	Telefono INTEGER UNIQUE,
	Salario FLOAT,
	MatriculaInicial DATE,
	GradoInicial INTEGER REFERENCES Grado(Codigo)
);

--DELETE FROM Persona WHERE Tipo = Padre;
INSERT INTO Persona VALUES (111, 'Padre1_N1', 'Padre1_N2', 'Padre1_A1', 'Padre1_A2', 'M', 'Padre', 111, NULL, NULL, NULL);
INSERT INTO Persona VALUES (222, 'Madre1_N1', 'Madre1_N2', 'Madre1_A1', 'Madre1_A2', 'F', 'Padre', 222, NULL, NULL, NULL);
INSERT INTO Persona VALUES (333, 'Padre2_N1', 'Padre2_N2', 'Padre2_A1', 'Padre2_A2', 'M', 'Padre', 333, NULL, NULL, NULL);
INSERT INTO Persona VALUES (444, 'Madre2_N1', 'Madre2_N2', 'Madre2_A1', 'Madre2_A2', 'F', 'Padre', 444, NULL, NULL, NULL);
--DELETE FROM Persona WHERE Tipo = Maestro;
INSERT INTO Persona VALUES (555, 'Maestro1_N1', 'Maestro1_N2', 'Maestro1_A1', 'Maestro1_A2', 'M', 'Maestro', 555, 6000.50, NULL, NULL);
INSERT INTO Persona VALUES (666, 'Maestro2_N1', 'Maestro2_N2', 'Maestro2_A1', 'Maestro2_A2', 'F', 'Maestro', 666, 7000.50, NULL, NULL);
INSERT INTO Persona VALUES (777, 'Maestro3_N1', 'Maestro3_N2', 'Maestro3_A1', 'Maestro3_A2', 'F', 'Maestro', 777, 6000.50, NULL, NULL);
INSERT INTO Persona VALUES (888, 'Maestro4_N1', 'Maestro4_N2', 'Maestro4_A1', 'Maestro4_A2', 'M', 'Maestro', 888, 7000.50, NULL, NULL);
INSERT INTO Persona VALUES (999, 'Maestro5_N1', 'Maestro5_N2', 'Maestro5_A1', 'Maestro5_A2', 'F', 'Maestro', 999, 7000.50, NULL, NULL);
INSERT INTO Persona VALUES (101010, 'Maestro5_N1', 'Maestro5_N2', 'Maestro5_A1', 'Maestro5_A2', 'M', 'Maestro', 101010, 6000.50, NULL, NULL);
--DELETE FROM Persona WHERE Tipo = Alumno;
INSERT INTO Persona VALUES (100, 'Alumno1_N1', 'Alumno1_N2', 'Padre1_A1', 'Madre1_A1', 'M', 'Alumno', NULL, NULL, '10/8/2012', 1);
INSERT INTO Persona VALUES (200, 'Alumno2_N1', 'Alumno2_N2', 'Padre1_A1', 'Madre1_A1', 'F', 'Alumno', NULL, NULL, '10/8/2012', 1);
INSERT INTO Persona VALUES (300, 'Alumno3_N1', 'Alumno3_N2', 'Padre2_A1', 'Madre2_A1', 'M', 'Alumno', 300, NULL, '12/1/2010', 8);
INSERT INTO Persona VALUES (400, 'Alumno4_N1', 'Alumno4_N2', 'Padre2_A1', 'Madre2_A1', 'F', 'Alumno', 400, NULL, '12/1/2014', 7);
INSERT INTO Persona VALUES (500, 'Alumno5_N1', 'Alumno5_N2', 'Padre1_A1', 'Madre2_A1', 'F', 'Alumno', NUll, NULL, '11/2/2014', 2);
INSERT INTO Persona VALUES (600, 'Alumno6_N1', 'Alumno6_N2', 'Padre2_A1', 'Madre1_A1', 'M', 'Alumno', NULL, NULL, '11/2/2014', 2);



-- SELECT * FROM Paternidad;
-- DROP TABLE Paternidad;
CREATE TABLE Paternidad
(
	Codigo INTEGER PRIMARY KEY NOT NULL,
	ID_Padre INTEGER REFERENCES Persona(Identificacion),
	ID_Madre INTEGER REFERENCES Persona(Identificacion),
	ID_Hijo INTEGER REFERENCES Persona(Identificacion)
);

-- DELET FROM Paternidad;
INSERT INTO Paternidad VALUES (1, 111, 222, 100);
INSERT INTO Paternidad VALUES (2, 111, 222, 200);
INSERT INTO Paternidad VALUES (3, 333, 444, 300);
INSERT INTO Paternidad VALUES (4, 333, 444, 400);
INSERT INTO Paternidad VALUES (5, 111, 444, 500);
INSERT INTO Paternidad VALUES (6, 333, 222, 600);



-- SELECT * FROM CentroEstudio;
-- DROP TABLE CentroEstudio;
CREATE TABLE CentroEstudio
(
	Codigo INTEGER PRIMARY KEY NOT NULL,
	Nombre VARCHAR(50) UNIQUE NOT NULL,
	Direccion VARCHAR(500) NOT NULL
);

-- DELETE FROM CentroEstudio;
INSERT INTO CentroEstudio VALUES (1, 'Centro_1', 'Direccion_1');
INSERT INTO CentroEstudio VALUES (2, 'Centro_2', 'Direccion_2');
INSERT INTO CentroEstudio VALUES (3, 'Centro_3', 'Direccion_3');



-- SELECT * FROM Seccion;
-- DROP TABLE Seccion;
CREATE TABLE Seccion
(
	Codigo INTEGER PRIMARY KEY NOT NULL,
	Nombre_Seccion VARCHAR(50) UNIQUE NOT NULL,
	ID_Grado INTEGER REFERENCES Grado(Codigo) NOT NULL,
	ID_MaestroGuía INTEGER REFERENCES Persona(Identificacion) NOT NULL,
	ID_CentroEstudio INTEGER REFERENCES CentroEstudio(Codigo) NOT NULL
);

-- DELETE FROM Seccion;
INSERT INTO Seccion VALUES (1, 'Grado 1A', 1, 999, 1);
INSERT INTO Seccion VALUES (2, 'Grado 1B', 1, 888, 1);
INSERT INTO Seccion VALUES (3, 'Grado 8A', 8, 101010, 1);
INSERT INTO Seccion VALUES (4, 'Grado 2A', 2, 555, 2);
INSERT INTO Seccion VALUES (5, 'Grado 7A', 7, 666, 2);
INSERT INTO Seccion VALUES (6, 'Grado 7B', 7, 777, 2);



-- SELECT * FROM Clase;
-- DROP TABLE Clase;
CREATE TABLE Clase
(
	Codigo INTEGER PRIMARY KEY NOT NULL,
	Nombre VARCHAR(100) UNIQUE NOT NULL,
	Descripcion VARCHAR(500),
	ID_Maestro INTEGER REFERENCES Persona(Identificacion)
);

-- DELET FROM Clase;
INSERT INTO Clase VALUES (1, 'Clase_1', 'AAA', 555);
INSERT INTO Clase VALUES (2, 'Clase_2', 'BBB', 666);
INSERT INTO Clase VALUES (3, 'Clase_3', 'GGG', 777);
INSERT INTO Clase VALUES (4, 'Clase_4', 'DDD', 888);
INSERT INTO Clase VALUES (5, 'Clase_5', 'HHH', 999);
INSERT INTO Clase VALUES (6, 'Clase_6', 'WWW', 101010);



-- SELECT * FROM ClasesSeccion;
-- DROP TABLE ClasesSeccion;
CREATE TABLE ClasesSeccion
(
	Codigo INTEGER PRIMARY KEY NOT NULL,
	ID_Seccion INTEGER REFERENCES Seccion(Codigo),
	ID_Clase INTEGER REFERENCES Clase(Codigo)
);

-- DELETE FROM ClasesSeccion;
INSERT INTO ClasesSeccion VALUES (1, 1, 1);
INSERT INTO ClasesSeccion VALUES (2, 1, 2);
INSERT INTO ClasesSeccion VALUES (3, 1, 3);
INSERT INTO ClasesSeccion VALUES (4, 2, 1);
INSERT INTO ClasesSeccion VALUES (5, 2, 2);
INSERT INTO ClasesSeccion VALUES (6, 2, 3);
INSERT INTO ClasesSeccion VALUES (7, 3, 1);
INSERT INTO ClasesSeccion VALUES (8, 3, 2);
INSERT INTO ClasesSeccion VALUES (9, 3, 3);
INSERT INTO ClasesSeccion VALUES (10, 3, 4);
INSERT INTO ClasesSeccion VALUES (11, 3, 5);
INSERT INTO ClasesSeccion VALUES (12, 3, 6);
INSERT INTO ClasesSeccion VALUES (13, 4, 1);
INSERT INTO ClasesSeccion VALUES (14, 4, 2);
INSERT INTO ClasesSeccion VALUES (15, 4, 3);
INSERT INTO ClasesSeccion VALUES (16, 4, 4);
INSERT INTO ClasesSeccion VALUES (17, 5, 1);
INSERT INTO ClasesSeccion VALUES (18, 5, 2);
INSERT INTO ClasesSeccion VALUES (19, 5, 3);
INSERT INTO ClasesSeccion VALUES (20, 5, 4);
INSERT INTO ClasesSeccion VALUES (21, 6, 1);
INSERT INTO ClasesSeccion VALUES (22, 6, 2);
INSERT INTO ClasesSeccion VALUES (23, 6, 3);
INSERT INTO ClasesSeccion VALUES (24, 6, 4);
INSERT INTO ClasesSeccion VALUES (25, 6, 5);



-- SELECT * FROM Calificaciones;
-- DROP TABLE Calificaciones;
CREATE TABLE Calificaciones
(
	Codigo INTEGER PRIMARY KEY NOT NULL,
	Año DATE NOT NULL,
	ID_Grado INTEGER REFERENCES Seccion(Codigo),
	ID_Clase INTEGER REFERENCES Clase(Codigo),
	ID_Persona INTEGER REFERENCES Persona(Identificacion),
	Parcial_1 FLOAT,
	Parcial_2 FLOAT,
	Parcial_3 FLOAT,
	Parcial_4 FLOAT,
	Promedio FLOAT,
	Observacion VARCHAR(300)
);

-- DELETE FROM Calificaciones;
INSERT INTO Calificaciones VALUES (1, '10/8/2013', 1, 1, 100, 90, 80, 80, 90, 85, 'Aprobado');
INSERT INTO Calificaciones VALUES (2, '10/8/2013', 1, 2, 100, 80, 80, 80, 80, 80, 'Aprobado');
INSERT INTO Calificaciones VALUES (3, '10/8/2013', 1, 3, 100, 70, 30, 20, 50, 42.5, 'Reprobado');
INSERT INTO Calificaciones VALUES (4, '10/8/2013', 1, 1, 200, 90, 80, 80, 90, 85, 'Aprobado');
INSERT INTO Calificaciones VALUES (5, '10/8/2013', 1, 2, 200, 50, 40, 70, 60, 50, 'Reprobado');
INSERT INTO Calificaciones VALUES (6, '10/8/2013', 1, 3, 200, 70, 80, 90, 100, 85, 'Aprobado');
INSERT INTO Calificaciones VALUES (7, '11/7/2016', 2, 1, 500, 70, 80, 90, 100, 85, 'Aprobado');
INSERT INTO Calificaciones VALUES (9, '11/7/2016', 2, 2, 500, 70, 30, 20, 50, 42.5, 'Reprobado');
INSERT INTO Calificaciones VALUES (10, '11/7/2016', 2, 3, 500, 70, 80, 90, 100, 85, 'Aprobado');
INSERT INTO Calificaciones VALUES (11, '11/7/2016', 2, 4, 500, 70, 80, 90, 100, 85, 'Aprobado');
INSERT INTO Calificaciones VALUES (12, '1/9/2009', 2, 4, 300, 100, 100, 100, 100, 100, 'Aprobado');
INSERT INTO Calificaciones VALUES (13, '1/9/2009', 2, 3, 400, 90, 90, 90, 90, 90, 'Aprobado');
