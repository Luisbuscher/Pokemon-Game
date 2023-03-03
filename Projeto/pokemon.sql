-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28-Nov-2022 às 02:50
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pokemon`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `player`
--

CREATE TABLE `player` (
  `nick` varchar(30) NOT NULL,
  `vitorias` int(3) DEFAULT 0,
  `derrotas` int(3) DEFAULT 0,
  `ultimo_poke1` varchar(30) DEFAULT NULL,
  `ultimo_poke2` varchar(30) DEFAULT NULL,
  `ultimo_poke3` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `player`
--

INSERT INTO `player` (`nick`, `vitorias`, `derrotas`, `ultimo_poke1`, `ultimo_poke2`, `ultimo_poke3`) VALUES
('Fabuloso', 6, 3, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pokemons`
--

CREATE TABLE `pokemons` (
  `nome` varchar(30) DEFAULT NULL,
  `tipo` enum('agua','fogo','eletrico','planta','fantasma','psiquico','dragao','normal') DEFAULT NULL,
  `vida` int(3) DEFAULT NULL,
  `fraqueza` enum('agua','fogo','eletrico','planta','fantasma','psiquico','dragao','normal') DEFAULT NULL,
  `skill_1` varchar(50) DEFAULT NULL,
  `tipo_skill_1` enum('dano','cura') DEFAULT NULL,
  `qtd_skill_1` int(2) DEFAULT NULL,
  `elemento_skill_1` enum('agua','fogo','eletrico','planta','fantasma','psiquico','dragao','normal') DEFAULT NULL,
  `skill_2` varchar(50) DEFAULT NULL,
  `tipo_skill_2` enum('dano','cura') DEFAULT NULL,
  `qtd_skill_2` int(2) DEFAULT NULL,
  `elemento_skill_2` enum('agua','fogo','eletrico','planta','fantasma','psiquico','dragao','normal') DEFAULT NULL,
  `skill_3` varchar(50) DEFAULT NULL,
  `tipo_skill_3` enum('dano','cura') DEFAULT NULL,
  `qtd_skill_3` int(2) DEFAULT NULL,
  `elemento_skill_3` enum('agua','fogo','eletrico','planta','fantasma','psiquico','dragao','normal') DEFAULT NULL,
  `boost` varchar(40) DEFAULT NULL,
  `tipo_boost` enum('forca','defesa') DEFAULT NULL,
  `qtd_boost` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pokemons`
--

INSERT INTO `pokemons` (`nome`, `tipo`, `vida`, `fraqueza`, `skill_1`, `tipo_skill_1`, `qtd_skill_1`, `elemento_skill_1`, `skill_2`, `tipo_skill_2`, `qtd_skill_2`, `elemento_skill_2`, `skill_3`, `tipo_skill_3`, `qtd_skill_3`, `elemento_skill_3`, `boost`, `tipo_boost`, `qtd_boost`) VALUES
('Charizard', 'fogo', 78, 'agua', 'Corte Aéreo', 'dano', 25, 'normal', 'Lança-chamas', 'dano', 30, 'fogo', 'Bafo de dragão', 'dano', 20, 'dragao', 'Fortificar', 'defesa', 2),
('Blastoise', 'agua', 80, 'eletrico', 'Pulso de Água', 'dano', 20, 'agua', 'Morder', 'dano', 20, 'normal', 'Bomba Hidraulica', 'dano', 20, 'agua', 'Defesa de Ferro', 'defesa', 5),
('Venusaur', 'planta', 80, 'fogo', 'Nevasca de Pétalas', 'dano', 30, 'planta', 'chicote de Videira', 'dano', 15, 'planta', 'Semente da Vida', 'cura', 10, 'planta', 'Aumentar Resistência', 'defesa', 2),
('Pikachu', 'eletrico', 40, 'planta', 'Choque do Trovão', 'dano', 30, 'eletrico', 'Cauda de Ferro', 'dano', 30, 'normal', 'Cabeçada', 'dano', 10, 'normal', 'Protagonismo', 'forca', 10),
('Dragonite', 'dragao', 90, 'psiquico', 'Soco de Fogo', 'dano', 25, 'fogo', 'Soco de Trovão', 'dano', 25, 'eletrico', 'Jato da Água', 'dano', 25, 'agua', 'Furia do Dragão', 'forca', 2),
('Snorlax', 'normal', 180, 'psiquico', 'Beijo do Gordo', 'dano', 10, 'normal', 'Bundada', 'dano', 40, 'normal', 'Recuperar', 'cura', 15, 'normal', 'Barrigão Tanquinho', 'defesa', 2),
('Gengar', 'fantasma', 60, 'fogo', 'Assombrar', 'dano', 25, 'fantasma', 'Xingamento', 'dano', 25, 'fantasma', 'Recuperação Fantasma', 'cura', 10, 'fantasma', 'Aumentar Ataque', 'forca', 5),
('Chansey', 'normal', 250, 'fogo', 'Tapa', 'dano', 5, 'normal', 'soco', 'dano', 6, 'normal', 'Curar', 'cura', 15, 'normal', 'Defesa Divina', 'defesa', 2),
('Flareon', 'fogo', 60, 'agua', 'Chamas', 'dano', 20, 'fogo', 'Brasa', 'dano', 15, 'fogo', 'Recuperacao Fenix', 'cura', 15, 'fogo', 'Armadura de Fogo', 'defesa', 2),
('Onix', 'normal', 40, 'agua', 'Esmagar', 'dano', 25, 'normal', 'Cauda de Pedra', 'dano', 15, 'normal', 'Recuperação Antiga', 'cura', 8, 'normal', 'Endurecer', 'defesa', 6);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `player`
--
ALTER TABLE `player`
  ADD UNIQUE KEY `nick` (`nick`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
