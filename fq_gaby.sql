-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-01-2019 a las 16:03:17
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fq_gaby`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `control`
--

CREATE TABLE `control` (
  `id_control` int(11) NOT NULL,
  `fecha` datetime DEFAULT NULL,
  `estatura` float DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `comentario` varchar(45) DEFAULT NULL,
  `paciente_id_paciente` int(11) NOT NULL,
  `medico_id_medico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `id_medico` int(11) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `cargo` varchar(45) DEFAULT NULL,
  `rut` varchar(45) DEFAULT NULL,
  `contrasenna` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`id_medico`, `nombres`, `apellidos`, `cargo`, `rut`, `contrasenna`) VALUES
(1, 'Nombre Completo', 'Apellidos', 'Cargo', 'Rut', 'Contraseña'),
(2, 'Nombre Completo', 'Apellidos', 'Cargo', 'Rut', '1'),
(3, 'a', ' asApellidos', 'Cargo', 'Rut', 'Contraseña'),
(4, 'Byron Antonio', 'Navarro Ayala', 'Analista Programador', '182661333', '1'),
(5, 'Nombre Completo', 'Apellidos', 'Cargo', '123123', '123123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `fecha_incorporacion` date DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `estatura` float DEFAULT NULL,
  `comentario` varchar(10000) DEFAULT NULL,
  `medico_id_medico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id_paciente`, `nombre`, `fecha_nacimiento`, `fecha_incorporacion`, `peso`, `estatura`, `comentario`, `medico_id_medico`) VALUES
(1, 'asdf', '2019-01-23', '2019-01-17', 12, 12, 'sdfsadf', 3),
(4, 'asdfasdf', '2019-01-11', '2019-01-12', 5, 3, 'asdfasd', 1),
(5, 'asdfasdf', '2019-01-11', '2019-01-12', 5, 3, 'asdfasd', 1),
(7, 'asdfasfd', '2019-01-11', '2019-01-22', 3, 5, 'asdfasdf', 4),
(10, 'Violeta', '2019-01-10', '2019-01-23', 2, 2, 'asd', 4),
(11, 'akane', '2019-01-18', '2019-01-13', 1, 1, 'a', 4),
(12, 'asd', '2019-01-18', '2019-01-12', 6, 5, 'asdasd', 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `control`
--
ALTER TABLE `control`
  ADD PRIMARY KEY (`id_control`),
  ADD UNIQUE KEY `idControl_UNIQUE` (`id_control`),
  ADD KEY `fk_id_control_paciente1_idx` (`paciente_id_paciente`),
  ADD KEY `fk_id_control_medico1_idx` (`medico_id_medico`);

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id_medico`),
  ADD UNIQUE KEY `id_UNIQUE` (`id_medico`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`),
  ADD UNIQUE KEY `id_paciente_UNIQUE` (`id_paciente`),
  ADD KEY `fk_paciente_medico_idx` (`medico_id_medico`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `control`
--
ALTER TABLE `control`
  MODIFY `id_control` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `medico`
--
ALTER TABLE `medico`
  MODIFY `id_medico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `control`
--
ALTER TABLE `control`
  ADD CONSTRAINT `fk_id_control_medico1` FOREIGN KEY (`medico_id_medico`) REFERENCES `medico` (`id_medico`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_id_control_paciente1` FOREIGN KEY (`paciente_id_paciente`) REFERENCES `paciente` (`id_paciente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `fk_paciente_medico` FOREIGN KEY (`medico_id_medico`) REFERENCES `medico` (`id_medico`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
