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
Upower int default 0
)
go
create table Post(
Pid nvarchar(20) primary key,
Puser nvarchar(20) not null,
Ptitle nvarchar(50) not null,
Pabstr nvarchar(20) not null,
Pdetails nvarchar(300) not null,
Pblock nvarchar(20) not null,
Preadnum int default 0,
foreign key(Puser) references Users(Uid)
)
go
create table Reply(
Rid nvarchar(20) primary key,
Rpid nvarchar(20) not null,
Ruid nvarchar(20) not null,
Rcontent nvarchar(50) not null,
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
create table Administer(
Aid nvarchar(20) primary key,
Auid nvarchar(20) not null,
foreign key (Auid) references Users(Uid)
)
go
create table Blockers(
Bid nvarchar(20) primary key,
Buid nvarchar(20) not null,
foreign key (Buid) references Users(Uid)
)

go
