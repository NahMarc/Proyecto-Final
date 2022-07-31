-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 31-07-2022 a las 19:52:19
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `backendnahuel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

DROP TABLE IF EXISTS `educacion`;
CREATE TABLE IF NOT EXISTS `educacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre_carrera` varchar(255) DEFAULT NULL,
  `nombre_insti` varchar(255) DEFAULT NULL,
  `ano_fin` varchar(255) DEFAULT NULL,
  `ano_inicio` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `educacion`
--

INSERT INTO `educacion` (`id`, `nombre_carrera`, `nombre_insti`, `ano_fin`, `ano_inicio`) VALUES
(4, 'Educación Secundaria con orientación en Cs. Sociales', 'Instituto Pre-Universitario \"E.C.L.G.S.M\"', '2011', '2006'),
(5, 'Lic. en Trabajo Social', 'UNSJ FACSO', '2019', '2012'),
(6, 'Lic en Programación', 'FCEFN UNSJ', 'En curso', '2021'),
(7, 'Sé Programar', 'Ministerio de Desarrollo Productivo', '2021', '2021'),
(11, 'Yo Programo', 'Ministerio de Desarrollo Productivo', '2022', '2022'),
(14, 'Curso de inglés para desarrollo de software', 'Ministerio de Desarrollo Productivo', '2022', '2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
CREATE TABLE IF NOT EXISTS `experiencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcione` varchar(255) DEFAULT NULL,
  `nombree` varchar(255) DEFAULT NULL,
  `descripcion_exp` varchar(255) DEFAULT NULL,
  `nombre_exp` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `experiencia`
--

INSERT INTO `experiencia` (`id`, `descripcione`, `nombree`, `descripcion_exp`, `nombre_exp`) VALUES
(5, NULL, NULL, 'Encargado de colectivo de Colonia de Verano (2015-2017)', 'Municipalidad de Rawson'),
(7, NULL, NULL, 'Administrativo (2017-2020)', 'Programa Municipal de Microcrédito Solidario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `sobremi` varchar(500) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `img` varchar(200) NOT NULL,
  `imgbanner` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `apellido`, `nombre`, `sobremi`, `titulo`, `img`, `imgbanner`) VALUES
(10, 'Carrasan Perez', 'Marcio Nahuel', 'Soy un joven desarrollador de San Juan que es entusiasta del aprendizaje y que está en búsqueda de nuevos desafíos. Entre mis hobbys están el escuchar/tocar música, videojuegos, el teatro y consumir vídeos de divulgación científica/filosófica. ', 'Full Stack Developer Jr.', 'file:///C:/Users/monch/Documents/ProyectoArgentinaProgama/ProyectoFinalNahuel/Frontend/src/assets/fotoperfil1.jpg', 'file:///C:/Users/monch/Documents/ProyectoArgentinaProgama/ProyectoFinalNahuel/Frontend/src/assets/banner1.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
CREATE TABLE IF NOT EXISTS `proyectos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descri_proy` varchar(255) DEFAULT NULL,
  `img_proy` varchar(255) DEFAULT NULL,
  `link_proy` varchar(255) DEFAULT NULL,
  `nombre_proy` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `proyectos`
--

INSERT INTO `proyectos` (`id`, `descri_proy`, `img_proy`, `link_proy`, `nombre_proy`) VALUES
(2, 'Trabajo final del Programa \"Argentina Programa\"', 'http://localhost:4200', 'http://localhost:4200', 'Portfolio ArgProg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

DROP TABLE IF EXISTS `rol`;
CREATE TABLE IF NOT EXISTS `rol` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rol_nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id`, `rol_nombre`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `nombre_usuario` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `email`, `nombre`, `nombre_usuario`, `password`) VALUES
(1, 'user@user.com', 'user', 'user', '$2a$10$UjqzzShdrzILvQttOowaBuzDFjHy/bNLzhIiWaJDviiN4TOGDUtiC'),
(2, 'admin@admin.com', 'admin', 'admin', '$2a$10$bMaLuRMwjRmAYstylYi6qeKXM8VyQsQRQtzpF6Jo2IhDYKhe6B5Ky');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_rol`
--

DROP TABLE IF EXISTS `usuario_rol`;
CREATE TABLE IF NOT EXISTS `usuario_rol` (
  `usuario_id` int NOT NULL,
  `rol_id` int NOT NULL,
  PRIMARY KEY (`usuario_id`,`rol_id`),
  KEY `FK610kvhkwcqk2pxeewur4l7bd1` (`rol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario_rol`
--

INSERT INTO `usuario_rol` (`usuario_id`, `rol_id`) VALUES
(2, 1),
(1, 2),
(2, 2);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD CONSTRAINT `FK610kvhkwcqk2pxeewur4l7bd1` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`),
  ADD CONSTRAINT `FKbyfgloj439r9wr9smrms9u33r` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
