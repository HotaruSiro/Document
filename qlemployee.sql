-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 10, 2019 lúc 03:47 AM
-- Phiên bản máy phục vụ: 10.1.37-MariaDB
-- Phiên bản PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


USE qlemployee;
CREATE DATABASE qlemployee;
USE qlemployee;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlemployee`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bangcap`
--

CREATE TABLE `bangcap` (
  `Mabangcap` int(11) NOT NULL,
  `Tenbangcap` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `bangcap`
--

INSERT INTO `bangcap` (`Mabangcap`, `Tenbangcap`) VALUES
(1, 'Bằng đại Học'),
(2, 'Bằng cao đẳng'),
(3, 'Bằng thạc sĩ'),
(4, 'Bằng trung cấp');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `Machucvu` int(11) NOT NULL,
  `Tenchucvu` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`Machucvu`, `Tenchucvu`) VALUES
(1, 'Chủ Tịch'),
(2, 'Trưởng phòng'),
(3, 'Nhân viên'),
(4, 'Thư ký');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `congviec`
--

CREATE TABLE `congviec` (
  `Macongviec` int(11) NOT NULL,
  `Tencongviec` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `congviec`
--

INSERT INTO `congviec` (`Macongviec`, `Tencongviec`) VALUES
(1, 'Điều Hành'),
(2, 'Dev'),
(3, 'Quản lý'),
(4, 'Marketing');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dantoc`
--

CREATE TABLE `dantoc` (
  `Madantoc` int(11) NOT NULL,
  `Tendantoc` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `dantoc`
--

INSERT INTO `dantoc` (`Madantoc`, `Tendantoc`) VALUES
(1, 'Kinh'),
(2, 'Khơ me'),
(3, 'Mông'),
(4, 'Búa rùi');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `employee`
--

CREATE TABLE `employee` (
  `MaNV` int(11) NOT NULL,
  `Hoten` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Bidanh` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Magioitinh` int(11) NOT NULL,
  `Didong` int(11) NOT NULL,
  `Dienthoainha` int(11) NOT NULL,
  `Diachiemail` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Ngaysinh` date NOT NULL,
  `Noisinh` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Matinhthanh` int(11) NOT NULL,
  `CMND` int(11) NOT NULL,
  `Ngaycap` date NOT NULL,
  `Noicap` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Quequan` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `Diachi` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `Tamtru` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `Maloainv` int(11) NOT NULL,
  `Ngayvaolam` date NOT NULL,
  `Maphongban` int(11) NOT NULL,
  `Macongviec` int(11) NOT NULL,
  `Machucvu` int(11) NOT NULL,
  `Mucluongcb` int(11) NOT NULL,
  `Heso` int(11) NOT NULL,
  `Mucluong` int(11) NOT NULL,
  `Phucapluong` int(11) NOT NULL,
  `Sosolaodong` int(11) NOT NULL,
  `Ngaycapsld` date NOT NULL,
  `Noicapsld` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Tknganhang` int(11) NOT NULL,
  `Nganhang` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `Mahocvan` int(11) NOT NULL,
  `Mabangcap` int(11) NOT NULL,
  `Mangoaingu` int(11) NOT NULL,
  `Matinhoc` int(11) NOT NULL,
  `Madantoc` int(11) NOT NULL,
  `Maquoctich` int(11) NOT NULL,
  `Matongiao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `employee`
--

INSERT INTO `employee` (`MaNV`, `Hoten`, `Bidanh`, `Magioitinh`, `Didong`, `Dienthoainha`, `Diachiemail`, `Ngaysinh`, `Noisinh`, `Matinhthanh`, `CMND`, `Ngaycap`, `Noicap`, `Quequan`, `Diachi`, `Tamtru`, `Maloainv`, `Ngayvaolam`, `Maphongban`, `Macongviec`, `Machucvu`, `Mucluongcb`, `Heso`, `Mucluong`, `Phucapluong`, `Sosolaodong`, `Ngaycapsld`, `Noicapsld`, `Tknganhang`, `Nganhang`, `Mahocvan`, `Mabangcap`, `Mangoaingu`, `Matinhoc`, `Madantoc`, `Maquoctich`, `Matongiao`) VALUES
(1, 'Phan Van Hieu', 'Hotaru', 1, 907040110, 900090, 'luffy.phan@gmail.com', '1997-11-12', 'Nghe An', 1, 123456789, '1997-11-12', 'Ngh? An', 'Nghe An', 'Nghe An', 'HCM', 1, '1997-11-12', 1, 1, 1, 500, 2, 500, 200, 1511, '1997-11-12', 'HCM', 500, 'VCB', 1, 1, 1, 1, 1, 1, 1),
(3, 'alex phan', 'best', 1, 907040110, 907040110, 'alex@gmail.com', '2019-01-09', 'xóm cao s?n,xã v?nh thành', 1, 123456789, '2019-01-09', 'ngh? an', 'nghe an', 'hcm', 'hcm', 1, '2019-01-09', 1, 1, 1, 100000, 6, 200000, 400000, 987654, '2019-01-09', 'hcm', 123456987, 'vietcombank', 1, 1, 1, 1, 1, 1, 1),
(4, 'a', 'a', 2, 7, 2, 'a', '2019-01-10', 'a', 3, 2, '2019-01-10', 'q', 't', 't', 't', 1, '2019-01-10', 1, 1, 4, 3, 2, 4, 2, 4, '2019-01-10', 'f', 2, 'a', 1, 1, 1, 1, 1, 1, 1),
(5, 'g', 'gd', 1, 3, 3, 'k', '2019-01-10', 'k', 1, 5, '2019-01-10', 'm', 'l', 'b', 'p', 1, '2019-01-10', 1, 1, 1, 5, 9, 8, 7, 5, '2019-01-10', 'k', 8, 'k', 1, 1, 1, 1, 1, 1, 1),
(6, 'e', 'e', 2, 6, 8, 'l', '2019-01-10', 'l', 2, 5, '2019-01-10', 'l', 'l', 'l', 'l', 2, '2019-01-10', 2, 3, 1, 9, 9, 9, 9, 9, '2019-01-10', '9', 9, 'd', 2, 1, 1, 1, 1, 1, 1),
(7, 'd', 'd', 1, 9, 9, 'd', '2019-01-10', 'd', 1, 9, '2019-01-10', 'd', 'd', 'd', 'd', 1, '2019-01-10', 1, 1, 4, 9, 9, 9, 9, 9, '2019-01-10', 'd', 9, 'd', 1, 1, 1, 1, 1, 1, 1),
(8, 'e', 'e', 1, 8, 8, 'e', '2019-01-10', 'e', 1, 8, '2019-01-10', 'e', 'e', 'e', 'e', 1, '2019-01-10', 1, 1, 1, 8, 8, 8, 8, 8, '2019-01-10', 'e', 8, 'e', 1, 1, 1, 1, 1, 1, 1),
(9, 'r', 'o', 1, 888, 777, 'd', '2019-01-10', 'd', 1, 7, '2019-01-10', 'd', 'dd', 'd?', 'dd', 1, '2019-01-10', 1, 1, 1, 8, 8, 8, 8, 8, '2019-01-10', 'd', 8, 'd', 1, 1, 1, 1, 1, 1, 1),
(10, 't', 'k', 1, 9, 9, 't', '2019-01-10', 't', 1, 9, '2019-01-10', 'k', 't', 't', 't', 1, '2019-01-10', 1, 1, 1, 9, 9, 9, 9, 9, '2019-01-10', 't', 9, 't', 1, 1, 1, 1, 1, 1, 1),
(11, 'j', 'j', 1, 4, 5, 'k', '2019-01-10', 'k', 1, 4, '2019-01-10', 'k', 'k', 'k', 'k', 1, '2019-01-10', 1, 1, 1, 4, 4, 4, 4, 4, '2019-01-10', 'j', 5, 'k', 1, 1, 1, 1, 1, 1, 1),
(12, '44444444444444', '5555555', 1, 2344, 56565656, '23334443', '2019-01-10', '578', 2, 91111111, '2019-01-10', '', 'abc', '', '', 1, '2019-01-10', 1, 1, 2, 6, 78, 89, 9, 9000, '2019-01-10', '', 789, '', 1, 1, 1, 1, 1, 1, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `gioitinh`
--

CREATE TABLE `gioitinh` (
  `Magioitinh` int(11) NOT NULL,
  `Tengioitinh` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `gioitinh`
--

INSERT INTO `gioitinh` (`Magioitinh`, `Tengioitinh`) VALUES
(1, 'Nam'),
(2, 'Nu');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hocvan`
--

CREATE TABLE `hocvan` (
  `Mahocvan` int(11) NOT NULL,
  `Tenhocvan` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hocvan`
--

INSERT INTO `hocvan` (`Mahocvan`, `Tenhocvan`) VALUES
(1, 'Đại Học'),
(2, 'Cao đẳng'),
(3, 'Thạc sĩ'),
(4, 'Trung cấp');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loainhanvien`
--

CREATE TABLE `loainhanvien` (
  `Maloainv` int(11) NOT NULL,
  `Tenloainv` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loainhanvien`
--

INSERT INTO `loainhanvien` (`Maloainv`, `Tenloainv`) VALUES
(1, 'Chính Thức'),
(2, 'Hợp đồng'),
(3, 'Thời vụ'),
(4, 'Thực tập');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ngoaingu`
--

CREATE TABLE `ngoaingu` (
  `Mangoaingu` int(11) NOT NULL,
  `Tenngoaingu` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ngoaingu`
--

INSERT INTO `ngoaingu` (`Mangoaingu`, `Tenngoaingu`) VALUES
(1, 'N3'),
(2, 'N2'),
(3, 'N1'),
(4, 'N4');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phongban`
--

CREATE TABLE `phongban` (
  `Maphongban` int(11) NOT NULL,
  `Tenphongban` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phongban`
--

INSERT INTO `phongban` (`Maphongban`, `Tenphongban`) VALUES
(1, 'Hội Đồng'),
(2, 'Thư ký'),
(3, 'Nhân sự'),
(4, 'Developer');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quoctich`
--

CREATE TABLE `quoctich` (
  `Maquoctich` int(11) NOT NULL,
  `Tenquoctich` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `quoctich`
--

INSERT INTO `quoctich` (`Maquoctich`, `Tenquoctich`) VALUES
(1, 'Việt Nam'),
(2, 'Japan'),
(3, 'China'),
(4, 'Korean');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinhhoc`
--

CREATE TABLE `tinhhoc` (
  `Matinhoc` int(11) NOT NULL,
  `Tentinhoc` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tinhhoc`
--

INSERT INTO `tinhhoc` (`Matinhoc`, `Tentinhoc`) VALUES
(1, 'SSS'),
(2, 'A'),
(3, 'B'),
(4, 'C');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinhthanh`
--

CREATE TABLE `tinhthanh` (
  `Matinhthanh` int(11) NOT NULL,
  `Tentinhthanh` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tinhthanh`
--

INSERT INTO `tinhthanh` (`Matinhthanh`, `Tentinhthanh`) VALUES
(1, 'Nghệ An'),
(2, 'TP.HCM'),
(3, 'Nha trang'),
(4, 'Hà nội');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tongiao`
--

CREATE TABLE `tongiao` (
  `Matongiao` int(11) NOT NULL,
  `Tentongiao` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tongiao`
--

INSERT INTO `tongiao` (`Matongiao`, `Tentongiao`) VALUES
(1, 'Không'),
(2, 'Thiên chúa giao'),
(3, 'Phật giáo'),
(4, 'Nho giáo');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bangcap`
--
ALTER TABLE `bangcap`
  ADD PRIMARY KEY (`Mabangcap`);

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`Machucvu`);

--
-- Chỉ mục cho bảng `congviec`
--
ALTER TABLE `congviec`
  ADD PRIMARY KEY (`Macongviec`);

--
-- Chỉ mục cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`Madantoc`);

--
-- Chỉ mục cho bảng `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `employee_quoctich` (`Maquoctich`),
  ADD KEY `employee_bangcap` (`Mabangcap`),
  ADD KEY `employee_chucvu` (`Machucvu`),
  ADD KEY `employee_congviec` (`Macongviec`),
  ADD KEY `employee_dantoc` (`Madantoc`),
  ADD KEY `employee_hocvan` (`Mahocvan`),
  ADD KEY `employee_loainv` (`Maloainv`),
  ADD KEY `employee_ngoaingu` (`Mangoaingu`),
  ADD KEY `employee_phongban` (`Maphongban`),
  ADD KEY `employee_tinhoc` (`Matinhoc`),
  ADD KEY `employee_tinhthanh` (`Matinhthanh`),
  ADD KEY `employee_tongiao` (`Matongiao`),
  ADD KEY `employee_gioitinh` (`Magioitinh`);

--
-- Chỉ mục cho bảng `gioitinh`
--
ALTER TABLE `gioitinh`
  ADD PRIMARY KEY (`Magioitinh`);

--
-- Chỉ mục cho bảng `hocvan`
--
ALTER TABLE `hocvan`
  ADD PRIMARY KEY (`Mahocvan`);

--
-- Chỉ mục cho bảng `loainhanvien`
--
ALTER TABLE `loainhanvien`
  ADD PRIMARY KEY (`Maloainv`);

--
-- Chỉ mục cho bảng `ngoaingu`
--
ALTER TABLE `ngoaingu`
  ADD PRIMARY KEY (`Mangoaingu`);

--
-- Chỉ mục cho bảng `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`Maphongban`);

--
-- Chỉ mục cho bảng `quoctich`
--
ALTER TABLE `quoctich`
  ADD PRIMARY KEY (`Maquoctich`);

--
-- Chỉ mục cho bảng `tinhhoc`
--
ALTER TABLE `tinhhoc`
  ADD PRIMARY KEY (`Matinhoc`);

--
-- Chỉ mục cho bảng `tinhthanh`
--
ALTER TABLE `tinhthanh`
  ADD PRIMARY KEY (`Matinhthanh`);

--
-- Chỉ mục cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`Matongiao`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bangcap`
--
ALTER TABLE `bangcap`
  MODIFY `Mabangcap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  MODIFY `Machucvu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `congviec`
--
ALTER TABLE `congviec`
  MODIFY `Macongviec` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  MODIFY `Madantoc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `employee`
--
ALTER TABLE `employee`
  MODIFY `MaNV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT cho bảng `gioitinh`
--
ALTER TABLE `gioitinh`
  MODIFY `Magioitinh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `hocvan`
--
ALTER TABLE `hocvan`
  MODIFY `Mahocvan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `loainhanvien`
--
ALTER TABLE `loainhanvien`
  MODIFY `Maloainv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `ngoaingu`
--
ALTER TABLE `ngoaingu`
  MODIFY `Mangoaingu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `phongban`
--
ALTER TABLE `phongban`
  MODIFY `Maphongban` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `quoctich`
--
ALTER TABLE `quoctich`
  MODIFY `Maquoctich` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `tinhhoc`
--
ALTER TABLE `tinhhoc`
  MODIFY `Matinhoc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `tinhthanh`
--
ALTER TABLE `tinhthanh`
  MODIFY `Matinhthanh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  MODIFY `Matongiao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_bangcap` FOREIGN KEY (`Mabangcap`) REFERENCES `bangcap` (`Mabangcap`),
  ADD CONSTRAINT `employee_chucvu` FOREIGN KEY (`Machucvu`) REFERENCES `chucvu` (`Machucvu`),
  ADD CONSTRAINT `employee_congviec` FOREIGN KEY (`Macongviec`) REFERENCES `congviec` (`Macongviec`),
  ADD CONSTRAINT `employee_dantoc` FOREIGN KEY (`Madantoc`) REFERENCES `dantoc` (`Madantoc`),
  ADD CONSTRAINT `employee_gioitinh` FOREIGN KEY (`Magioitinh`) REFERENCES `gioitinh` (`Magioitinh`),
  ADD CONSTRAINT `employee_hocvan` FOREIGN KEY (`Mahocvan`) REFERENCES `hocvan` (`Mahocvan`),
  ADD CONSTRAINT `employee_loainv` FOREIGN KEY (`Maloainv`) REFERENCES `loainhanvien` (`Maloainv`),
  ADD CONSTRAINT `employee_ngoaingu` FOREIGN KEY (`Mangoaingu`) REFERENCES `ngoaingu` (`Mangoaingu`),
  ADD CONSTRAINT `employee_phongban` FOREIGN KEY (`Maphongban`) REFERENCES `phongban` (`Maphongban`),
  ADD CONSTRAINT `employee_quoctich` FOREIGN KEY (`Maquoctich`) REFERENCES `quoctich` (`Maquoctich`),
  ADD CONSTRAINT `employee_tinhoc` FOREIGN KEY (`Matinhoc`) REFERENCES `tinhhoc` (`Matinhoc`),
  ADD CONSTRAINT `employee_tinhthanh` FOREIGN KEY (`Matinhthanh`) REFERENCES `tinhthanh` (`Matinhthanh`),
  ADD CONSTRAINT `employee_tongiao` FOREIGN KEY (`Matongiao`) REFERENCES `tongiao` (`Matongiao`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
