use master
go

create database Soda_ElPelon
on primary
(name = 'SodaElPelon_Data',
filename = 'C:\SodaElPelon\SodaElPelon.mdf',
Size = 512mb,
maxsize = 1024mb,
filegrowth = 5%
)
log on
(name = 'SodaElPelon_Log',
filename = 'C:\SodaElPelon\SodaElPelon_Data.ldf',
Size = 102mb,
maxsize = 512mb,
filegrowth = 5%
)
go

USE Soda_ElPelon
go

-- Crar Usuario, se accede con el Usuario KrakenLures y contraseña 1234
CREATE LOGIN Soda WITH PASSWORD = '1234';
go
ALTER SERVER ROLE sysadmin ADD MEMBER Soda;
go

USE Soda_ElPelon
CREATE USER Pelon FOR LOGIN Soda;
ALTER ROLE db_owner ADD MEMBER Pelon;
go