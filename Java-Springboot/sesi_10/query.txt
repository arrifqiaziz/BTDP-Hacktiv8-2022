-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP VIEW IF EXISTS `data_gaji`;
CREATE TABLE `data_gaji` (`id_pegawai` int(11), `nama_pegawai` varchar(50), `jabatan` enum('Staff','Supervisor'), `gaji` int(10), `tgl_gaji` date);


DROP VIEW IF EXISTS `data_transaksi`;
CREATE TABLE `data_transaksi` (`id_transaksi` int(11), `nama_pembeli` varchar(50), `nama_menu` varchar(50), `nama_pegawai` varchar(50), `tgl_transaksi` date);


SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_gaji`;
CREATE TABLE `tb_gaji` (
  `id_gaji` int(11) NOT NULL AUTO_INCREMENT,
  `id_pegawai` int(11) NOT NULL,
  `gaji` int(10) NOT NULL,
  `tgl_gaji` date NOT NULL,
  PRIMARY KEY (`id_gaji`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_gaji_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_gaji`;
INSERT INTO `tb_gaji` (`id_gaji`, `id_pegawai`, `gaji`, `tgl_gaji`) VALUES
(1,	3,	8000000,	'2022-06-20'),
(2,	1,	5000000,	'2022-06-20'),
(3,	2,	3000000,	'2022-06-20');

DROP TABLE IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu` (
  `id_menu` int(11) NOT NULL AUTO_INCREMENT,
  `nama_menu` varchar(50) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  PRIMARY KEY (`id_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_menu`;
INSERT INTO `tb_menu` (`id_menu`, `nama_menu`, `jenis`, `harga`) VALUES
(1,	'Gorengan',	'Gehu',	2000),
(2,	'Gorengan',	'Bala-bala',	5000),
(3,	'Jus',	'Alpukat',	10000);

DROP TABLE IF EXISTS `tb_pegawai`;
CREATE TABLE `tb_pegawai` (
  `id_pegawai` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pegawai` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `status` enum('Aktif','Tidak Aktif') NOT NULL,
  `no_tlp` varchar(13) NOT NULL,
  `jabatan` enum('Staff','Supervisor') NOT NULL,
  PRIMARY KEY (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_pegawai`;
INSERT INTO `tb_pegawai` (`id_pegawai`, `nama_pegawai`, `alamat`, `jenis_kelamin`, `tgl_lahir`, `status`, `no_tlp`, `jabatan`) VALUES
(1,	'sanji',	'North Blue',	'Laki-laki',	'1992-10-14',	'Aktif',	'1234567891234',	'Staff'),
(2,	'zoro',	'Bogor',	'Laki-laki',	'1992-04-13',	'Aktif',	'0857484875152',	'Staff'),
(3,	'nami',	'desa jeruk',	'Perempuan',	'1989-01-02',	'Aktif',	'0258498715154',	'Supervisor');

DROP TABLE IF EXISTS `tb_pembeli`;
CREATE TABLE `tb_pembeli` (
  `id_pembeli` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pembeli` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `status` enum('Aktif','Tidak Aktif') NOT NULL,
  `no_hp` int(13) NOT NULL,
  `pekerjaan` varchar(50) NOT NULL,
  PRIMARY KEY (`id_pembeli`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_pembeli`;
INSERT INTO `tb_pembeli` (`id_pembeli`, `nama_pembeli`, `alamat`, `jenis_kelamin`, `tgl_lahir`, `status`, `no_hp`, `pekerjaan`) VALUES
(1,	'Jinbe',	'Fishman Island',	'Laki-laki',	'1992-04-15',	'Aktif',	2147483647,	'Juru Kemudi'),
(2,	'Usopp',	'Syrup Village',	'Laki-laki',	'1995-06-13',	'Aktif',	2147483647,	'Sniper'),
(3,	'Robin Cwann',	'Ohara',	'Perempuan',	'1992-08-13',	'Aktif',	2147483647,	'Arkeolog');

DROP TABLE IF EXISTS `tb_transaksi`;
CREATE TABLE `tb_transaksi` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `id_pembeli` int(11) NOT NULL,
  `id_menu` int(11) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  PRIMARY KEY (`id_transaksi`),
  KEY `id_pembeli` (`id_pembeli`),
  KEY `id_menu` (`id_menu`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_transaksi_ibfk_1` FOREIGN KEY (`id_pembeli`) REFERENCES `tb_pembeli` (`id_pembeli`),
  CONSTRAINT `tb_transaksi_ibfk_2` FOREIGN KEY (`id_menu`) REFERENCES `tb_menu` (`id_menu`),
  CONSTRAINT `tb_transaksi_ibfk_3` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_transaksi`;
INSERT INTO `tb_transaksi` (`id_transaksi`, `id_pembeli`, `id_menu`, `id_pegawai`, `tgl_transaksi`) VALUES
(1,	1,	1,	1,	'2022-06-20'),
(2,	2,	2,	2,	'2022-06-20'),
(3,	3,	3,	3,	'0000-00-00');

DROP TABLE IF EXISTS `data_gaji`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `data_gaji` AS select `tp`.`id_pegawai` AS `id_pegawai`,`tp`.`nama_pegawai` AS `nama_pegawai`,`tp`.`jabatan` AS `jabatan`,`tg`.`gaji` AS `gaji`,`tg`.`tgl_gaji` AS `tgl_gaji` from (`tb_pegawai` `tp` join `tb_gaji` `tg` on(`tg`.`id_pegawai` = `tp`.`id_pegawai`)) order by `tp`.`id_pegawai`;

DROP TABLE IF EXISTS `data_transaksi`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `data_transaksi` AS select `tr`.`id_transaksi` AS `id_transaksi`,`tpl`.`nama_pembeli` AS `nama_pembeli`,`tm`.`nama_menu` AS `nama_menu`,`tp`.`nama_pegawai` AS `nama_pegawai`,`tr`.`tgl_transaksi` AS `tgl_transaksi` from (((`tb_transaksi` `tr` join `tb_pembeli` `tpl` on(`tr`.`id_pembeli` = `tpl`.`id_pembeli`)) join `tb_menu` `tm` on(`tr`.`id_menu` = `tm`.`id_menu`)) join `tb_pegawai` `tp` on(`tr`.`id_pegawai` = `tp`.`id_pegawai`));

-- 2022-06-20 07:51:45