-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2023 at 08:00 PM
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
-- Database: `quanlypizza`
--

-- --------------------------------------------------------

--
-- Table structure for table `cthoadon`
--

CREATE TABLE `cthoadon` (
  `MaHD` int(11) NOT NULL,
  `MaSP` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `ThanhTien` int(11) NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cthoadon`
--

INSERT INTO `cthoadon` (`MaHD`, `MaSP`, `SoLuong`, `DonGia`, `ThanhTien`, `CreatedAt`, `UpdatedAt`) VALUES
(18, 114, 2, 159000, 318000, NULL, NULL),
(18, 122, 3, 249000, 747000, NULL, NULL),
(18, 124, 6, 19000, 114000, NULL, NULL),
(18, 130, 2, 19000, 38000, NULL, NULL),
(18, 132, 2, 25000, 50000, NULL, NULL),
(19, 115, 2, 119000, 238000, NULL, NULL),
(19, 120, 1, 239000, 239000, NULL, NULL),
(19, 128, 4, 19000, 76000, NULL, NULL),
(19, 131, 5, 10000, 50000, NULL, NULL),
(20, 118, 1, 129000, 129000, NULL, NULL),
(20, 120, 2, 239000, 478000, NULL, NULL),
(20, 129, 5, 19000, 38000, NULL, NULL),
(20, 130, 5, 19000, 95000, NULL, NULL),
(20, 131, 10, 10000, 100000, NULL, NULL),
(21, 112, 3, 129000, 387000, NULL, NULL),
(21, 117, 2, 149000, 298000, NULL, NULL),
(21, 126, 10, 19000, 190000, NULL, NULL),
(21, 127, 3, 29000, 87000, NULL, NULL),
(21, 128, 15, 19000, 285000, NULL, NULL),
(21, 131, 6, 10000, 60000, NULL, NULL),
(22, 114, 5, 159000, 795000, NULL, NULL),
(22, 127, 10, 29000, 290000, NULL, NULL),
(22, 129, 6, 19000, 95000, NULL, NULL),
(22, 132, 3, 25000, 75000, NULL, NULL),
(23, 112, 3, 129000, 387000, NULL, NULL),
(23, 113, 1, 119000, 119000, NULL, NULL),
(23, 118, 1, 129000, 129000, NULL, NULL),
(23, 128, 6, 19000, 114000, NULL, NULL),
(23, 131, 5, 10000, 50000, NULL, NULL),
(23, 132, 2, 25000, 25000, NULL, NULL),
(24, 115, 1, 119000, 119000, NULL, NULL),
(24, 116, 1, 130000, 130000, NULL, NULL),
(24, 119, 1, 239000, 239000, NULL, NULL),
(24, 126, 6, 19000, 114000, NULL, NULL),
(24, 127, 3, 29000, 87000, NULL, NULL),
(24, 131, 7, 10000, 70000, NULL, NULL),
(24, 132, 4, 25000, 100000, NULL, NULL),
(25, 118, 1, 129000, 129000, NULL, NULL),
(25, 121, 1, 229000, 229000, NULL, NULL),
(25, 130, 4, 19000, 76000, NULL, NULL),
(25, 131, 5, 10000, 50000, NULL, NULL),
(25, 132, 3, 25000, 75000, NULL, NULL),
(26, 111, 3, 169000, 507000, NULL, NULL),
(26, 120, 3, 239000, 717000, NULL, NULL),
(26, 122, 2, 249000, 498000, NULL, NULL),
(26, 127, 4, 29000, 116000, NULL, NULL),
(27, 113, 1, 119000, 119000, NULL, NULL),
(27, 119, 1, 239000, 239000, NULL, NULL),
(27, 123, 1, 269000, 269000, NULL, NULL),
(27, 126, 1, 19000, 19000, NULL, NULL),
(27, 131, 1, 10000, 10000, NULL, NULL),
(28, 113, 10, 119000, 1190000, NULL, NULL),
(28, 116, 4, 130000, 520000, NULL, NULL),
(28, 119, 3, 239000, 717000, NULL, NULL),
(28, 132, 5, 25000, 125000, NULL, NULL),
(29, 114, 4, 159000, 636000, NULL, NULL),
(29, 115, 1, 119000, 119000, NULL, NULL),
(29, 116, 1, 130000, 130000, NULL, NULL),
(29, 131, 2, 10000, 20000, NULL, NULL),
(30, 116, 1, 130000, 130000, NULL, NULL),
(30, 117, 7, 149000, 1043000, NULL, NULL),
(30, 123, 10, 269000, 2690000, NULL, NULL),
(30, 125, 1, 29000, 29000, NULL, NULL),
(30, 127, 2, 29000, 29000, NULL, NULL),
(31, 111, 1, 169000, 169000, NULL, NULL),
(31, 115, 6, 119000, 595000, NULL, NULL),
(31, 117, 1, 149000, 149000, NULL, NULL),
(31, 118, 1, 129000, 129000, NULL, NULL),
(31, 130, 4, 19000, 76000, NULL, NULL),
(32, 120, 5, 239000, 1195000, NULL, NULL),
(32, 121, 4, 229000, 916000, NULL, NULL),
(33, 116, 1, 130000, 130000, NULL, NULL),
(33, 119, 30, 239000, 7170000, NULL, NULL),
(35, 113, 1, 119000, 119000, NULL, NULL),
(35, 117, 1, 149000, 149000, NULL, NULL),
(35, 131, 8, 10000, 70000, NULL, NULL),
(37, 116, 1, 130000, 130000, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `ctphieunhap`
--

CREATE TABLE `ctphieunhap` (
  `MaPN` int(11) NOT NULL,
  `MaSP` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `ThanhTien` int(11) NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ctphieunhap`
--

INSERT INTO `ctphieunhap` (`MaPN`, `MaSP`, `SoLuong`, `DonGia`, `ThanhTien`, `CreatedAt`, `UpdatedAt`) VALUES
(4, 128, 100, 10000, 1000000, NULL, NULL),
(4, 129, 3, 9000, 27000, NULL, NULL),
(5, 124, 6, 10000, 60000, NULL, NULL),
(5, 125, 3, 15000, 45000, NULL, NULL),
(5, 126, 7, 10000, 70000, NULL, NULL),
(5, 127, 2, 15000, 30000, NULL, NULL),
(5, 130, 3, 9000, 27000, NULL, NULL),
(5, 131, 9, 4000, 36000, NULL, NULL),
(7, 126, 9, 10000, 90000, NULL, NULL),
(8, 124, 30, 10000, 300000, NULL, NULL),
(8, 126, 50, 10000, 500000, NULL, NULL),
(8, 129, 30, 9000, 270000, NULL, NULL),
(9, 135, 100, 10000, 1000000, NULL, NULL),
(10, 136, 200, 23000, 4600000, NULL, NULL),
(10, 137, 80, 84500, 6760000, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `giamgia`
--

CREATE TABLE `giamgia` (
  `MaGiam` int(11) NOT NULL,
  `TenGiamGia` text NOT NULL,
  `PhanTramGiam` int(11) NOT NULL,
  `DieuKien` int(11) NOT NULL,
  `NgayBD` date NOT NULL,
  `NgayKT` date NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `giamgia`
--

INSERT INTO `giamgia` (`MaGiam`, `TenGiamGia`, `PhanTramGiam`, `DieuKien`, `NgayBD`, `NgayKT`, `CreatedAt`, `UpdatedAt`) VALUES
(1, 'Không giảm giá', 0, 0, '2020-01-01', '2042-12-31', NULL, NULL),
(2, 'Giảm 20% đơn hàng từ 150.000đ', 20, 150000, '2021-04-22', '2021-05-13', NULL, NULL),
(4, 'Giảm 10% đơn hàng từ 80.000đ', 10, 80000, '2021-03-26', '2021-05-31', NULL, NULL),
(6, '30/04-01/05 giảm 30% đơn hàng từ 300.000đ', 30, 300000, '2021-04-20', '2021-05-08', NULL, NULL);

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
-- Table structure for table `loai`
--

CREATE TABLE `loai` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` text NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loai`
--

INSERT INTO `loai` (`MaLoai`, `TenLoai`, `CreatedAt`, `UpdatedAt`) VALUES
(1, 'Pizza', NULL, NULL),
(2, 'Nước uống', NULL, NULL),
(3, 'Nguyên liệu', NULL, NULL);

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
-- Table structure for table `phanquyen`
--

CREATE TABLE `phanquyen` (
  `Quyen` varchar(255) NOT NULL,
  `NhapHang` int(1) NOT NULL,
  `QLSanPham` int(1) NOT NULL,
  `QLNhanVien` int(1) NOT NULL,
  `QLKhachHang` int(1) NOT NULL,
  `ThongKe` int(1) NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phanquyen`
--

INSERT INTO `phanquyen` (`Quyen`, `NhapHang`, `QLSanPham`, `QLNhanVien`, `QLKhachHang`, `ThongKe`, `CreatedAt`, `UpdatedAt`) VALUES
('Default', 0, 0, 0, 0, 0, NULL, NULL),
('Nhân viên', 0, 0, 0, 1, 0, NULL, NULL),
('Quản lý', 1, 0, 1, 1, 1, NULL, NULL),
('Quản trị', 1, 1, 1, 1, 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPN` int(11) NOT NULL,
  `MaNCC` int(11) NOT NULL,
  `MaNV` int(11) NOT NULL,
  `NgayLap` date NOT NULL,
  `TongTien` int(11) NOT NULL,
  `CreatedAt` timestamp NULL DEFAULT NULL,
  `UpdatedAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phieunhap`
--

INSERT INTO `phieunhap` (`MaPN`, `MaNCC`, `MaNV`, `NgayLap`, `TongTien`, `CreatedAt`, `UpdatedAt`) VALUES
(4, 2, 0, '2021-04-19', 1027000, NULL, NULL),
(5, 2, 0, '2021-04-23', 268000, NULL, NULL),
(7, 2, 0, '2021-04-26', 90000, NULL, NULL),
(8, 2, 0, '2021-05-02', 1070000, NULL, NULL),
(9, 1, 0, '2021-05-04', 1000000, NULL, NULL),
(10, 5, 0, '2021-05-07', 11360000, NULL, NULL);

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
-- Indexes for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD PRIMARY KEY (`MaHD`,`MaSP`),
  ADD KEY `cthoadon_ibfk_1` (`MaHD`);

--
-- Indexes for table `ctphieunhap`
--
ALTER TABLE `ctphieunhap`
  ADD PRIMARY KEY (`MaPN`,`MaSP`);

--
-- Indexes for table `giamgia`
--
ALTER TABLE `giamgia`
  ADD PRIMARY KEY (`MaGiam`);

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
-- Indexes for table `loai`
--
ALTER TABLE `loai`
  ADD PRIMARY KEY (`MaLoai`);

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
-- Indexes for table `phanquyen`
--
ALTER TABLE `phanquyen`
  ADD PRIMARY KEY (`Quyen`);

--
-- Indexes for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPN`),
  ADD KEY `phieunhap_ibfk_1` (`MaNCC`),
  ADD KEY `phieunhap_ibfk_2` (`MaNV`);

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
-- AUTO_INCREMENT for table `giamgia`
--
ALTER TABLE `giamgia`
  MODIFY `MaGiam` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

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
-- AUTO_INCREMENT for table `loai`
--
ALTER TABLE `loai`
  MODIFY `MaLoai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `nhacungcap`
--
ALTER TABLE `nhacungcap`
  MODIFY `MaNCC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MaNV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `MaPN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

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
-- Constraints for table `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD CONSTRAINT `cthoadon_ibfk_1` FOREIGN KEY (`MaHD`) REFERENCES `hoadon` (`MaHD`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ctphieunhap`
--
ALTER TABLE `ctphieunhap`
  ADD CONSTRAINT `ctphieunhap_ibfk_2` FOREIGN KEY (`MaPN`) REFERENCES `phieunhap` (`MaPN`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MaNCC`) REFERENCES `nhacungcap` (`MaNCC`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE ON UPDATE CASCADE;

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
