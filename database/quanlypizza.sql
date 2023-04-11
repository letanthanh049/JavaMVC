-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2023 at 06:24 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlpizza`
--

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHD` int(11) NOT NULL,
  `MaKH` int(11) NOT NULL,
  `MaNV` int(11) NOT NULL,
  `NgayLap` date NOT NULL,
  `TongTien` int(11) NOT NULL,
  `GhiChu` text NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`MaHD`, `MaKH`, `MaNV`, `NgayLap`, `TongTien`, `GhiChu`, `CreatedAt`, `UpdatedAt`) VALUES
(18, 4, 3, '2021-01-18', 1013600, 'Đã thanh toán', NULL, NULL),
(19, 1, 1, '2021-01-20', 482400, 'Đã thanh toán', NULL, NULL),
(20, 2, 1, '2021-01-28', 840000, 'Đã thanh toán', NULL, NULL),
(21, 3, 2, '2021-02-07', 1045600, 'Đã thanh toán', NULL, NULL),
(22, 1, 1, '2021-02-14', 1004000, 'Đã thanh toán', NULL, NULL),
(23, 7, 3, '2021-02-16', 576800, 'Đã thanh toán', NULL, NULL),
(24, 7, 2, '2021-03-08', 601300, 'Đã thanh toán', NULL, NULL),
(25, 2, 2, '2021-03-09', 391300, 'Đã thanh toán', NULL, NULL),
(26, 8, 4, '2021-03-12', 1286600, 'Đã thanh toán', NULL, NULL),
(27, 8, 3, '2021-03-24', 590400, 'Đã thanh toán', NULL, NULL),
(28, 7, 4, '2021-02-04', 2041600, 'Đã thanh toán', NULL, NULL),
(29, 9, 2, '2021-04-10', 633500, 'Đã thanh toán', NULL, NULL),
(30, 10, 4, '2021-04-15', 3136800, 'Đã thanh toán', NULL, NULL),
(31, 11, 4, '2021-05-02', 782600, 'Đã thanh toán', NULL, NULL),
(32, 11, 0, '2021-05-03', 1477700, 'Đã thanh toán', NULL, NULL),
(33, 9, 0, '2021-05-06', 5110000, 'Đã thanh toán', NULL, NULL),
(35, 3, 0, '2021-05-08', 304200, 'Đã thanh toán', NULL, NULL),
(37, 2, 0, '2021-05-08', 117000, 'Đã thanh toán', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKH` int(11) NOT NULL,
  `Ho` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `GioiTinh` varchar(3) NOT NULL,
  `TongChiTieu` int(11) NOT NULL DEFAULT 0,
  `TinhTrang` int(11) NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`MaKH`, `Ho`, `Ten`, `GioiTinh`, `TongChiTieu`, `TinhTrang`, `CreatedAt`, `UpdatedAt`) VALUES
(1, 'Nguyễn Văn', 'An', 'Nam', 1486400, 1, NULL, NULL),
(2, 'Trần Ngọc', 'Bình', 'Nữ', 1497300, 1, NULL, NULL),
(3, 'Lê Thị', 'Giải', 'Nữ', 1468800, 1, NULL, NULL),
(4, 'Hà Thanh', 'Thoát', 'Nam', 1013600, 1, NULL, NULL),
(7, 'Trịnh Thị', 'Yên', 'Nữ', 3219700, 1, NULL, NULL),
(8, 'Trương Đình', 'Vui', 'Nam', 1877000, 1, NULL, NULL),
(9, 'Lại Thị Ngọc', 'Miền', 'Nữ', 5743500, 1, NULL, NULL),
(10, 'Trần Quang', 'Cực', 'Nam', 3136800, 1, NULL, NULL),
(11, 'Nguyễn Ngọc', 'Lạc', 'Nam', 2260300, 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `MaNCC` int(11) NOT NULL,
  `TenNCC` varchar(255) NOT NULL,
  `DiaChi` varchar(255) NOT NULL,
  `DienThoai` text NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhacungcap`
--

INSERT INTO `nhacungcap` (`MaNCC`, `TenNCC`, `DiaChi`, `DienThoai`, `CreatedAt`, `UpdatedAt`) VALUES
(1, 'Bột mì Khánh Toàn', '273 An Dương Vương, phường 3, quận 5, TP.HCM', '0396527908', NULL, NULL),
(2, 'Công ty giải khát Tường Vy', '12/49/2 Võ Văn Kiệt, P. Cô Giang, Q1', '0902669733', NULL, NULL),
(5, 'Nguyên liệu bánh Việt Hoàng', '492 Xô Viết Nghệ Tĩnh, P.25, Q. Bình Thạnh', '0397682193', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` int(11) NOT NULL,
  `Ho` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `GioiTinh` varchar(3) NOT NULL,
  `ChucVu` varchar(255) NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Ho`, `Ten`, `GioiTinh`, `ChucVu`, `CreatedAt`, `UpdatedAt`) VALUES
(0, 'Admin', '', '', 'Admin', NULL, NULL),
(1, 'Sau Đại', 'Phát', 'Nam', 'Quản Lý', NULL, NULL),
(2, 'Trần Quang', 'Vinh', 'Nam', 'Quản Lý', NULL, NULL),
(3, 'Trần Hữu', 'Khương', 'Nam', 'Quản Lý', NULL, NULL),
(4, 'Nhữ Quốc Anh', 'Tài', 'Nam', 'Nhân Viên', NULL, NULL),
(12, 'Trịnh Thu', 'Huyền', 'Nữ', 'Nhân Viên', NULL, NULL),
(13, 'Nguyễn Ngọc Mai', 'Linh', 'Nữ', 'Nhân Viên', NULL, NULL),
(14, 'Hà Văn', 'Hùng', 'Nam', 'Nhân Viên', NULL, NULL),
(15, 'Lê Thị Thuý', 'Diễm', 'Nữ', 'Quản Lý', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `sanpham`
--

CREATE TABLE `sanpham` (
  `MaSP` int(11) NOT NULL,
  `TenSP` varchar(255) NOT NULL,
  `MaLoai` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonViTinh` varchar(255) NOT NULL,
  `HinhAnh` varchar(255) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Bang San Pham';

--
-- Dumping data for table `sanpham`
--

INSERT INTO `sanpham` (`MaSP`, `TenSP`, `MaLoai`, `SoLuong`, `DonViTinh`, `HinhAnh`, `DonGia`, `CreatedAt`, `UpdatedAt`) VALUES
(111, 'Pizza Hải Sản Pesto Xanh', 1, 31, 'Cái', 'pizza0.png', 169000, NULL, NULL),
(112, 'Pizza Hải Sản Nhiệt Đới', 1, 39, 'Cái', 'pizza1.png', 129000, NULL, NULL),
(113, 'Pizza Hải Sản Cocktail', 1, 34, 'Cái', 'pizza2.png', 119000, NULL, NULL),
(114, 'Pizza Tôm Cocktail', 1, 36, 'Cái', 'pizza3.png', 159000, NULL, NULL),
(115, 'Pizza Aloha', 1, 38, 'Cái', 'pizza4.png', 119000, NULL, NULL),
(116, 'Pizza Thịt Xông Khói', 1, 39, 'Cái', 'pizza5.png', 130000, NULL, NULL),
(117, 'Pizza Thịt Nguội', 1, 34, 'Cái', 'pizza6.png', 149000, NULL, NULL),
(118, 'Pizza Gà Nướng 3 Vị', 1, 35, 'Cái', 'pizza7.png', 129000, NULL, NULL),
(119, 'Pizza hải sản Pesto gấp đôi nhân', 1, 13, 'Cái', 'pizza8.jpg', 239000, NULL, NULL),
(120, 'Pizza gấp đôi nhân phủ cơn lốc hải sản', 1, 37, 'Cái', 'pizza9.jpg', 239000, NULL, NULL),
(121, 'Pizza gấp đôi nhân phủ hải sản xốt tiêu đen', 1, 41, 'Cái', 'pizza10.jpg', 229000, NULL, NULL),
(122, 'Pizza bò nướng tiêu đen', 1, 43, 'Cái', 'pizza11.jpg', 249000, NULL, NULL),
(123, 'Pizza cá ngừ thanh cua', 1, 33, 'Cái', 'pizza12.jpg', 269000, NULL, NULL),
(124, 'Pepsi lon 330ml', 2, 150, 'Lon', 'douong0.jpeg', 19000, NULL, NULL),
(125, 'Pepsi chai 1.5l', 2, 250, 'Chai', 'douong1.jpeg', 29000, NULL, NULL),
(126, '7Up lon 330ml', 2, 150, 'Lon', 'douong2.jpeg', 19000, NULL, NULL),
(127, '7Up chai 1.5l', 2, 110, 'Chai', 'douong3.jpeg', 29000, NULL, NULL),
(128, 'Pepsi no calories 330ml', 2, 180, 'Lon', 'douong4.jpg', 19000, NULL, NULL),
(129, 'Mirinda cam 330ml', 2, 100, 'Lon', 'douong5.jpg', 19000, NULL, NULL),
(130, 'Mirinda kem soda 330ml', 2, 80, 'Lon', 'douong6.jpg', 19000, NULL, NULL),
(131, 'Nước suối Aquafina', 2, 52, 'Chai', 'douong7.jpg', 10000, NULL, NULL),
(132, 'Trà sữa trà đen', 2, 6, 'Ly', 'douong8.jpg', 25000, NULL, NULL),
(135, 'Bột mì Meizan 500g', 3, 100, 'Gói', 'default.png', 10000, NULL, NULL),
(136, 'Men nở Mauripan 50g*5', 3, 200, 'Hộp', 'default.png', 23000, NULL, NULL),
(137, 'Dầu olive Olivoilà 250ml', 3, 80, 'Chai', 'default.png', 84500, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MaNV` int(11) NOT NULL,
  `TenDangNhap` varchar(255) NOT NULL,
  `MatKhau` varchar(255) NOT NULL,
  `Quyen` varchar(255) NOT NULL,
  `TrangThai` int(11) NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`MaNV`, `TenDangNhap`, `MatKhau`, `Quyen`, `TrangThai`, `CreatedAt`, `UpdatedAt`) VALUES
(0, 'admin', 'admin', 'Quản trị', 1, NULL, NULL),
(1, 'ql01', 'ql01', 'Quản lý', 1, NULL, NULL),
(2, 'ql02', 'ql02', 'Quản lý', 1, NULL, NULL),
(3, 'ql03', 'ql03', 'Quản lý', 1, NULL, NULL),
(4, 'nv01', 'nv01', 'Nhân viên', 1, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHD`),
  ADD KEY `hoadon_ibfk_1` (`MaNV`),
  ADD KEY `hoadon_ibfk_2` (`MaKH`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKH`);

--
-- Indexes for table `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`MaNCC`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Indexes for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MaSP`),
  ADD KEY `sanpham_ibfk_1` (`MaLoai`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `taikhoan_ibfk_2` (`Quyen`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `MaHD` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `MaKH` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `nhacungcap`
--
ALTER TABLE `nhacungcap`
  MODIFY `MaNCC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MaNV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `MaSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=145;

--
-- AUTO_INCREMENT for table `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `MaNV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`MaLoai`) REFERENCES `loai` (`MaLoai`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `taikhoan_ibfk_2` FOREIGN KEY (`Quyen`) REFERENCES `phanquyen` (`Quyen`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
