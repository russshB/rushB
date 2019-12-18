create database Russh
go
use Russh
go
create table Users(
Uid nvarchar(20) primary key,
Uimg nvarchar(22) not null,
Uname nvarchar(20) not null,
Upwd nvarchar(20) not null,
UGender nvarchar(20) not null,
Ubirthday datetime ,
Upid nvarchar(30) not null,
Uemail nvarchar(23),
UphoneNo nvarchar(24),
Upower int default 0,
URole int default 0
)
go
create table Post(
Pid nvarchar(20) primary key,
Puser nvarchar(20) not null,
Ptitle nvarchar(50) not null,
Pabstr nvarchar(20) not null,
Pdetails nvarchar(300) not null,
Pblock nvarchar(20) not null,
Ppower int default 0,
Preadnum int default 0,
foreign key(Puser) references Users(Uid)
)
go
create table Reply(
Rid nvarchar(20) primary key,
Rpid nvarchar(20) not null,
Ruid nvarchar(20) not null,
Rcontent nvarchar(50) not null,
Rpower int default 0,
Rtime datetime not null,
foreign key(Rpid) references Post(Pid),
foreign key(Ruid) references Users(Uid)
)
go
create table Message(
Mid nvarchar(20) primary key,
Mdate datetime not null,
MbeenUid nvarchar(20) not null,
Muid nvarchar(20) not null,
Mdetail nvarchar(300) not null,
foreign key(MbeenUid) references Users(Uid),
foreign key(Muid) references Users(Uid)
)
go
create table star(
SUid nvarchar(20),
SPid nvarchar(20),
primary key(Suid,Spid),
foreign key(SUid) references Users(Uid),
foreign key(SPid) references Post(Pid)
)
go


insert into Users values
('U001','IU001','张三','123','男','1999-1-1','370684199901011111','1111111111@qq.com','13399991111',2,0),
('U002','IU002','李四','123','男','1999-1-1','370684199901011112','1111111112@qq.com','13399991112',1,0),
('U003','IU003','王五','123','男','1999-1-1','370684199901011113','1111111113@qq.com','13399991113',1,0),
('U004','IU004','赵六','123','男','1999-1-1','370684199901011114','1111111114@qq.com','13399991114',1,0),
('U005','IU005','jojo','123','男','1999-1-1','370684199901011115','1111111115@qq.com','13399991115',1,0),
('U006','IU006','dio!','123','男','1999-1-1','370684199901011116','1111111116@qq.com','13399991116',0,0),
('U007','IU006','卡兹','123','男','1999-1-1','370684199901011117','1111111117@qq.com','13399991117',0,0)
go

insert into Post values
('P001','U001','张三の帖子','ko no dio da！','我真是high到不行啊！.jpg','B001',0,1),
('P002','U002','李四の帖子','ko no dio da！','我真是high到不行啊！.jpg','B002',0,0),
('P003','U003','王五の帖子','ko no dio da！','我真是high到不行啊！.jpg','B003',0,0),
('P004','U004','赵六の帖子','ko no dio da！','我真是high到不行啊！.jpg','B004',0,0),
('P005','U005','jojoの帖子','ko no dio da！','我真是high到不行啊！.jpg','B005',0,3)
go

insert into Reply values
('R001','P001','U001','ko no dio da！',0,'1999-1-1'),
('R002','P002','U002','ko no dio da！',0,'1999-1-2'),
('R003','P003','U003','ko no dio da！',0,'1999-1-3'),
('R004','P004','U004','ko no dio da！',0,'1999-1-4'),
('R005','P005','U005','ko no dio da！',0,'1999-1-5')
go

insert into Message values
('M001','1999-1-1','U001','U005','ko no dio da！'),
('M002','1999-1-2','U002','U004','ko no dio da！'),
('M003','1999-1-3','U003','U003','ko no dio da！'),
('M004','1999-1-4','U004','U002','ko no dio da！'),
('M005','1999-1-5','U005','U001','ko no dio da！')
go

insert into star values
('U001','P005'),
('U001','P004')
insert into star values
('U001','P003'),
('U001','P002')
go

--go
--drop table Users
--drop table Post
--drop table Reply
--drop table Message
--drop table Blockers
--drop table Administer
--drop table star
go
select * from Users
select * from Post
select * from Reply
select * from Message
select * from star
go
--delete from Users where uid = 'u0001'
