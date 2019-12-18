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
Pid int primary key identity(1,1),
Puser nvarchar(20) not null,
Ptitle nvarchar(50) not null,
Pabstr nvarchar(20) not null,
Pdetails nvarchar(500) not null,
Pblock nvarchar(20) not null,
Ppower int default 0,
Preadnum int default 0,
foreign key(Puser) references Users(Uid)
)
go
create table Reply(
Rid int primary key identity(1,1),
Rpid int not null,
Ruid nvarchar(20) not null,
Rcontent nvarchar(500) not null,
Rpower int default 0,
Rtime nvarchar(30),
foreign key(Rpid) references Post(Pid),
foreign key(Ruid) references Users(Uid)
)
go
create table Message(
Mid int primary key identity(1,1),
Mdate datetime,
MbeenUid nvarchar(20) not null,
Muid nvarchar(20) not null,
Mdetail nvarchar(500) not null,
foreign key(MbeenUid) references Users(Uid),
foreign key(Muid) references Users(Uid)
)
go
create table star(
SUid nvarchar(20),
SPid int,
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
('U001','张三の帖子','ko no dio da！','我真是high到不行啊！.jpg','B001',0,1),
('U002','李四の帖子','ko no dio da！','我真是high到不行啊！.jpg','B002',0,0),
('U003','王五の帖子','ko no dio da！','我真是high到不行啊！.jpg','B003',0,0),
('U004','赵六の帖子','ko no dio da！','我真是high到不行啊！.jpg','B004',0,0),
('U005','jojoの帖子','ko no dio da！','我真是high到不行啊！.jpg','B005',0,3)
go

insert into Reply values
(1,'U001','ko no dio da！',0,'1999-1-1'),
(2,'U002','ko no dio da！',0,'1999-1-2'),
(3,'U003','ko no dio da！',0,'1999-1-3'),
(4,'U004','ko no dio da！',0,'1999-1-4'),
(5,'U005','ko no dio da！',0,'1999-1-5')
go

insert into Message values
('1999-1-1','U001','U005','ko no dio da！'),
('1999-1-2','U002','U004','ko no dio da！'),
('1999-1-3','U003','U003','ko no dio da！'),
('1999-1-4','U004','U002','ko no dio da！'),
('1999-1-5','U005','U001','ko no dio da！')
go

insert into star values
('U001',1),
('U001',2),
('U001',3),
('U001',4)
go

--go
--drop table Users
--drop table Post
--drop table Reply
--drop table Message
--drop table star
go
select * from Users
select * from Post
select * from Reply
select * from Message
select * from star
go
--delete from Users where uid = 'u0001'
--实验内容
select  likedusers0_.spid as spid1_4_0_, 	
	likedusers0_.suid as suid2_4_0_, 	
	users1_.Uid as Uid1_3_1_, 		
	users1_.Ubirthday as 			
Ubirthda2_3_1_, users1_.
	Uemail as Uemail3_3_1_, 		
users1_.UGender as UGender4_3_1_, 		
users1_.Uimg as Uimg5_3_1_, 			
users1_.Uname as Uname6_3_1_, 			
users1_.UphoneNo asUphoneNo7_3_1_, 	
users1_.Upid as Upid8_3_1_, 
	users1_.Upower as Upower9_3_1_, 	
	users1_.Upwd as Upwd10_3_1_, 		
	users1_.URole as URole11_3_1_ 
 from Star likedusers0_ inner join 		
	Russh.dbo.Users users1_ on 		
	likedusers0_.suid=users1_.Uid     
where likedusers0_.spid='P002'
go
select likeposts0_.suid as suid2_4_0_, likeposts0_.spid as spid1_4_0_, post1_.Pid as Pid1_1_1_, post1_.Ppower as Ppower2_1_1_, post1_.Pabstr as Pabstr3_1_1_, post1_.Pblock as Pblock4_1_1_, post1_.Pdetails as Pdetails5_1_1_, post1_.Preadnum as Preadnum6_1_1_, post1_.Ptitle as Ptitle7_1_1_, post1_.Puser as Puser8_1_1_, users2_.Uid as Uid1_3_2_, users2_.Ubirthday as Ubirthda2_3_2_, users2_.Uemail as Uemail3_3_2_, users2_.UGender as UGender4_3_2_, users2_.Uimg as Uimg5_3_2_, users2_.Uname as Uname6_3_2_, users2_.UphoneNo as UphoneNo7_3_2_, users2_.Upid as Upid8_3_2_, users2_.Upower as Upower9_3_2_, users2_.Upwd as Upwd10_3_2_, users2_.URole as URole11_3_2_ from Star likeposts0_ inner join Russh.dbo.Post post1_ on likeposts0_.spid=post1_.Pid left outer join Russh.dbo.Users users2_ on post1_.Puser=users2_.Uid where likeposts0_.suid='U001'
go
select sendmessag0_.Muid as Muid5_0_0_, sendmessag0_.Mid as Mid1_0_0_, sendmessag0_.Mid as Mid1_0_1_, sendmessag0_.MbeenUid as MbeenUid4_0_1_, sendmessag0_.Mdate as Mdate2_0_1_, sendmessag0_.Mdetail as Mdetail3_0_1_, sendmessag0_.Muid as Muid5_0_1_, users1_.Uid as Uid1_3_2_, users1_.Ubirthday as Ubirthda2_3_2_, users1_.Uemail as Uemail3_3_2_, users1_.UGender as UGender4_3_2_, users1_.Uimg as Uimg5_3_2_, users1_.Uname as Uname6_3_2_, users1_.UphoneNo as UphoneNo7_3_2_, users1_.Upid as Upid8_3_2_, users1_.Upower as Upower9_3_2_, users1_.Upwd as Upwd10_3_2_, users1_.URole as URole11_3_2_ from Russh.dbo.Message sendmessag0_ left outer join Russh.dbo.Users users1_ on sendmessag0_.MbeenUid=users1_.Uid where sendmessag0_.Muid='U001'
go



