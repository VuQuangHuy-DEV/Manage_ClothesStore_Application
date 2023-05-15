CREATE DATABASE [ShopQuanAo]
GO



USE [ShopQuanAo]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 10/2/2022 7:27:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[maHoaDon] int NOT NULL,
	[maSanPham] int NOT NULL,
	[donGia] [float] NOT NULL,
	[soLuong] [int] NOT NULL,
	[giamGia] [float] NOT NULL,
	[tongTien] [float] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DatHang]    Script Date: 10/2/2022 7:27:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DatHang](
	[maDonHang] int NOT NULL,
	[maSanPham] int NOT NULL,
	[maKhachHang] int NOT NULL,
	[tenKhachHang] [nchar](50) NOT NULL,
	[tenSanPham] [nchar](100) NOT NULL,
	[soLuong] [int] NOT NULL,
	[ngayTaoDon] [datetime] NOT NULL,
 CONSTRAINT [dathangpk] PRIMARY KEY CLUSTERED 
(
	[maDonHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 10/2/2022 7:27:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHoaDon] int NOT NULL,
	[maNhanVien] int NOT NULL,
	[maKhachHang] int NOT NULL,
	[ngayLap] [datetime] ,
	[tenKhachHang] [nchar](50) ,
	[tenNhanVien] [nchar](50) ,
 CONSTRAINT [hoadonpk] PRIMARY KEY CLUSTERED 
(
	[maHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 10/2/2022 7:27:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKhachHang] int NOT NULL,
	[hoTen] [nchar](50) NOT NULL,
	[gioiTinh] [bit] ,
	[ngayDangKy] [datetime] NOT NULL,
	[soDienThoai] [nchar](11) NOT NULL,
	[namSinh] int,
	[diaChi] [nchar](200) ,
	[soTienDaMua] [float] ,
 CONSTRAINT [khachhangpk] PRIMARY KEY CLUSTERED 
(
	[maKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 10/2/2022 7:27:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[maNhaCungCap] int NOT NULL,
	[tenNhaCungCap] [nchar](50) NOT NULL,
	[soDienThoai] [nchar](11) NOT NULL,
	[diaChi] [nchar](1000) NOT NULL,
 CONSTRAINT [nhacungcappk] PRIMARY KEY CLUSTERED 
(
	[maNhaCungCap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 10/2/2022 7:27:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNhanVien] int NOT NULL,
	[hoTen] [nchar](50) NOT NULL,
	
	[gioiTinh] [bit] NOT NULL,
	[ngaySinh] Date,
	[chucVu] [nchar](30) NOT NULL,
	[ngayDangKi] Date ,
	[soDienThoai] [nchar](11) NOT NULL,
	[email] [nchar](100) NOT NULL,
	[diaChi] [nchar](1000) NOT NULL,
	[hinhAnh] [image] NOT NULL,
 CONSTRAINT [nhanvienpk] PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 10/2/2022 7:27:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[maSanPham] int NOT NULL,
	[maNhaCungCap] int NOT NULL,
	[tenSanPham] [nchar](100) NOT NULL,
	[loaiSanPham] [nchar](100) NOT NULL,
	[kichCo] [nchar](10) NOT NULL,
	[giaSanPham] [float] NOT NULL,
	[hinhAnh] [image] NOT NULL,
 CONSTRAINT [sanphampk] PRIMARY KEY CLUSTERED 
(
	[maSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([maHoaDon])
REFERENCES [dbo].[HoaDon] ([maHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([maSanPham])
REFERENCES [dbo].[SanPham] ([maSanPham])
GO
ALTER TABLE [dbo].[DatHang]  WITH CHECK ADD FOREIGN KEY([maKhachHang])
REFERENCES [dbo].[KhachHang] ([maKhachHang])
GO
ALTER TABLE [dbo].[DatHang]  WITH CHECK ADD FOREIGN KEY([maSanPham])
REFERENCES [dbo].[SanPham] ([maSanPham])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([maKhachHang])
REFERENCES [dbo].[KhachHang] ([maKhachHang])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVien] ([maNhanVien])
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD FOREIGN KEY([maNhaCungCap])
REFERENCES [dbo].[NhaCungCap] ([maNhaCungCap])
GO
