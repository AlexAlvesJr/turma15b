-- comando utilizado para criar um database
create database itau;

-- comando utilizado para por em uso o database
use itau;

-- comando para criação da tabela
create table itau.clientes(
codigo_cliente integer not null primary key,
nome_cliente varchar(50) not null,
idade_cliente integer(3) not null,
email_cliente varchar(80) not null);

-- comando describe, permite ver os campos da tabela
describe itau.clientes;

-- comando utilizado para fazer a inserção de registros na tabela
insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente)
values
(1,"Edgar Augusto",22,"edgar.a@unibanco.com.br"),
(2,"Antonio Ricardo",25,"antonio.r@unibanco.com.br"),
(3,"Fernanda",19,"fernanda@unibanco.com.br"),
(4,"Aline Yoshimi",19,"aline.y@unibanco.com.br");

select * from itau.clientes;

use itau;
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (5,"Ainsley Frye",79,"mi.pede.nonummy@Quisquepurussapien.com"),(6,"Willa X. Carter",59,"faucibus.id@Mauris.org"),(7,"Colleen Simmons",60,"a.purus.Duis@lacus.ca"),(8,"Ronan Walsh",51,"quam@sitamet.com"),(9,"Samson Park",91,"posuere.enim.nisl@etultrices.edu"),(10,"Flavia Beck",73,"nisl@gravidamaurisut.com"),(11,"Ezra F. Banks",38,"iaculis.enim@Phasellusornare.com"),(12,"Natalie Y. Hensley",38,"amet.risus.Donec@sollicitudincommodo.edu"),(13,"Jena E. Peck",25,"pede.Nunc.sed@sit.com"),(14,"Gil N. Barnes",92,"nibh@facilisis.edu");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (15,"Cecilia Hayes",48,"Phasellus@elitpellentesque.co.uk"),(16,"Magee J. Cole",42,"Duis.sit@suscipit.com"),(17,"Melinda Vance",22,"mauris.eu@inlobortis.org"),(18,"Shelly Berg",85,"Donec.nibh@consectetuereuismod.com"),(19,"Omar N. Larsen",48,"sit.amet@Duisatlacus.ca"),(20,"Alice I. Cleveland",80,"Nulla.aliquet@faucibus.co.uk"),(21,"Jonas Finley",88,"ac@metusIn.ca"),(22,"Vielka E. Estes",26,"dapibus.ligula.Aliquam@magna.ca"),(23,"Gannon J. Huffman",69,"velit@mauriseu.net"),(24,"Camille Walter",87,"semper.pretium.neque@ametconsectetuer.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (25,"Cain Church",62,"risus@Inat.net"),(26,"Adele Weiss",92,"mi.felis@libero.net"),(27,"Dana T. Molina",96,"et.risus.Quisque@Integer.edu"),(28,"Jane Blanchard",88,"tristique.neque.venenatis@sagittislobortismauris.ca"),(29,"Shana R. Williams",58,"nibh.enim@nonsollicitudin.com"),(30,"Farrah F. Shelton",33,"nonummy.ut@ut.net"),(31,"Elijah Poole",77,"nunc.sit.amet@ut.edu"),(32,"Astra Workman",83,"ipsum@luctussitamet.co.uk"),(33,"Emerson Hanson",93,"tristique.pellentesque@posuere.edu"),(34,"Dieter X. Johns",36,"ante.blandit.viverra@Fuscefeugiat.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (35,"Stuart O. James",82,"nisl.elementum@vitaevelitegestas.net"),(36,"Merrill J. Crane",94,"tincidunt.tempus@bibendumfermentummetus.org"),(37,"Owen J. West",54,"Morbi.accumsan@lectus.com"),(38,"Aristotle Navarro",55,"vel.est.tempor@Suspendissesed.com"),(39,"Yoko M. Monroe",33,"dignissim.Maecenas@metusurnaconvallis.org"),(40,"Herman X. Castro",33,"est@Phasellus.net"),(41,"Taylor Shannon",93,"Donec.egestas.Aliquam@consequatdolorvitae.co.uk"),(42,"Karyn F. Davidson",47,"sociis.natoque.penatibus@nec.edu"),(43,"Colleen B. Crane",58,"Phasellus.fermentum.convallis@quistristiqueac.net"),(44,"Dillon Rivera",60,"euismod.in.dolor@parturientmontes.edu");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (45,"Ebony Stevenson",19,"adipiscing.fringilla@utlacusNulla.edu"),(46,"Haley Blevins",81,"eleifend.Cras@Quisqueporttitoreros.com"),(47,"Chanda Ratliff",45,"Lorem.ipsum@Maurisblandit.edu"),(48,"Clark I. May",77,"ligula.Aliquam@vehiculaaliquetlibero.ca"),(49,"Carla I. Curtis",69,"eu.tellus.eu@vestibulum.org"),(50,"Ronan I. Sparks",23,"Proin.mi.Aliquam@Aenean.co.uk"),(51,"Hammett Boone",50,"sociis.natoque@at.org"),(52,"Nomlanga K. Frederick",59,"dapibus@gravida.ca"),(53,"Griffith N. Poole",41,"Etiam.imperdiet@Aeneanegestashendrerit.co.uk"),(54,"Garrett N. Sellers",69,"lobortis@euismodurna.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (55,"Demetrius B. Chase",98,"magna.Phasellus.dolor@ipsumdolor.co.uk"),(56,"Quail Pickett",100,"malesuada@augue.edu"),(57,"Carol Farmer",83,"sem.ut.cursus@lectussit.co.uk"),(58,"Levi Obrien",20,"vitae.purus.gravida@purusgravida.ca"),(59,"Joel N. Pickett",28,"magna.et.ipsum@turpis.com"),(60,"Ursula Nunez",55,"arcu.Vivamus@liberoProin.org"),(61,"Octavius K. Mcconnell",54,"magna@apurusDuis.com"),(62,"Hasad S. Newton",23,"sit@nasceturridiculusmus.com"),(63,"Raya Reid",50,"ipsum.primis.in@feugiat.co.uk"),(64,"Tarik Osborn",23,"magna@dui.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (65,"Harper Chang",68,"id.libero@arcueuodio.net"),(66,"Fitzgerald W. Gilliam",71,"ultrices.Duis@loremlorem.org"),(67,"Dahlia M. Lloyd",57,"dignissim.pharetra.Nam@fringilla.net"),(68,"Ocean I. Foreman",45,"mauris.id.sapien@at.org"),(69,"Roary F. Manning",87,"Quisque.nonummy@risus.edu"),(70,"Lilah Hart",26,"ac.orci.Ut@velturpisAliquam.ca"),(71,"Lionel J. Dalton",99,"diam.Pellentesque@sapiencursusin.net"),(72,"Athena L. Patrick",50,"dolor.Quisque.tincidunt@adipiscing.edu"),(73,"Cruz Pena",31,"ante.bibendum.ullamcorper@justoPraesentluctus.ca"),(74,"Shannon Wilkinson",47,"malesuada@blanditviverraDonec.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (75,"Moses R. Marquez",82,"sodales.elit@enimdiam.com"),(76,"Regina H. Lynn",44,"faucibus.orci.luctus@mitempor.co.uk"),(77,"Kai Boyer",97,"vitae.orci@nibh.net"),(78,"Nicole Patrick",39,"ultricies.ligula.Nullam@ante.net"),(79,"Moana Kramer",50,"Mauris.magna.Duis@convallis.co.uk"),(80,"Craig Cortez",77,"aliquam.iaculis.lacus@consectetuer.ca"),(81,"Mary L. Tanner",78,"ligula.elit@lacusvariuset.com"),(82,"Quinlan Kirkland",84,"dapibus.rutrum.justo@nuncestmollis.edu"),(83,"Giacomo Hill",29,"et@estacmattis.co.uk"),(84,"Rajah Q. Rodriguez",39,"sagittis.Duis.gravida@semPellentesqueut.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (85,"Calista L. Mcconnell",28,"libero@arcu.com"),(86,"Maite Hill",94,"molestie@lectusNullamsuscipit.net"),(87,"Hadley Sanford",21,"lorem.eu.metus@ligulaNullam.com"),(88,"Denton V. Nixon",44,"habitant.morbi.tristique@Incondimentum.net"),(89,"Cameron Osborne",89,"quam.dignissim.pharetra@mattis.com"),(90,"Quinn Haney",55,"neque@molestie.ca"),(91,"Courtney Booker",48,"dictum@mi.edu"),(92,"Simone Craft",55,"mauris.ipsum.porta@iaculislacus.org"),(93,"Kermit Sharpe",72,"urna@Maurisblandit.co.uk"),(94,"August N. Trevino",42,"risus.Nulla.eget@augue.org");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (95,"Carson Massey",56,"orci.lobortis.augue@magna.net"),(96,"Constance Sharp",91,"egestas.blandit@ideratEtiam.ca"),(97,"Jared T. Young",80,"dis.parturient@InloremDonec.ca"),(98,"Clarke Warren",45,"elementum@necdiam.edu"),(99,"Brynne F. Barrett",40,"lorem.fringilla@malesuadamalesuadaInteger.org"),(100,"Summer M. Petty",34,"ipsum@massa.net"),(101,"Karina Roberson",100,"Praesent@ornare.com"),(102,"Otto Marquez",37,"tincidunt.pede@sollicitudina.org"),(103,"Stephen Horne",85,"Cras@arcuNuncmauris.ca"),(104,"Sandra N. Sharp",37,"faucibus.orci.luctus@luctussit.org");

select * from itau.clientes;

-- ordenando a visualização dos registros
select * from itau.clientes order by nome_cliente;

select * from itau.clientes where idade_cliente=19;

select * from itau.clientes where idade_cliente>=19 and idade_cliente<=25;

select * from itau.clientes where idade_cliente between 18 and 25;

select * from itau.clientes where idade_cliente in(20,30,40);

select * from itau.clientes where nome_cliente="Fernanda";

select * from itau.clientes where nome_cliente like "Antonio%";
select * from itau.clientes where nome_cliente like "%Ricardo";
select * from itau.clientes where nome_cliente like "%N.%";

select nome_cliente,idade_cliente from itau.clientes order by nome_cliente;

select min(idade_cliente) from itau.clientes;

select * from itau.clientes where idade_cliente=(select min(idade_cliente) from itau.clientes);

select max(idade_cliente) from itau.clientes;

select * from itau.clientes where idade_cliente=(select max(idade_cliente) from itau.clientes);

select count(*),max(idade_cliente) from itau.clientes where idade_cliente=(select max(idade_cliente) from itau.clientes);

select count(*) as Total_Registros from itau.clientes;

select max(idade_cliente) as Maior_Idade from itau.clientes;

select count(*) as Total_Registros,max(idade_cliente) as Maior_idade from itau.clientes where idade_cliente=(select max(idade_cliente) from itau.clientes);

-- adicionando um campo na estrutura da nossa tabela
alter table itau.clientes add endereco varchar(80) not null;
select * from itau.clientes;

-- renomeando um campo da tabela
alter table itau.clientes rename column endereco to endereco_cliente;

-- excluindo um campo na estrutura da nossa tabela
alter table itau.clientes drop endereco_cliente;

-- alterando o tipo de dados da estrutura de uma tabela
alter table itau.clientes change email_cliente email_clientes varchar(90) not null; 

-- comando update permite atualizar o conteúdo de um campo desejado
update itau.clientes set endereco_cliente="Rua Fábia" where codigo_cliente=1;

update itau.clientes set endereco_cliente="Atualizar o endereço do cliente" where endereco_cliente="";

-- como criar um backup da nossa tabela
create table itau.bck_clientes select * from itau.clientes;

select * from itau.bck_clientes;

describe itau.bck_clientes;

delete from itau.clientes;

select count(*) from itau.clientes;

insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_clientes,endereco_cliente)
select * from itau.bck_clientes;

select * from itau.clientes;

describe itau.clientes;

delete from itau.clientes where idade_cliente>=20;

insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_clientes,endereco_cliente)
select * from itau.bck_clientes where idade_cliente>=20;


create database unibanco;
create table unibanco.clientes select * from itau.clientes;

drop table itau.bck_clientes;
drop table itau.clientes;

create table itau.clientes(
codigo_cliente integer not null auto_increment,
nome_cliente varchar(50) not null,
cpf_cliente char(11) not null,
endereco_cliente varchar(50) not null,
bairro_cliente varchar(40) not null,
cep_cliente char(8) not null,
estado_cliente char(2) not null,
idade_cliente int(3) not null,
ag_cliente char(4) not null,
conta_corrente_cliente char(8) not null,
dig_verificador_cliente int(1) not null,
ddd_cliente int(2) not null,
celular_cliente char(9) not null,
email_cliente varchar(60) not null,
data_atualizacao_registro_cliente datetime,
primary key (codigo_cliente,cpf_cliente));

describe itau.clientes;

insert into itau.clientes (nome_cliente,cpf_cliente,endereco_cliente,bairro_cliente,cep_cliente,estado_cliente,idade_cliente,ag_cliente,conta_corrente_cliente,dig_verificador_cliente,ddd_cliente,celular_cliente,email_cliente,data_atualizacao_registro_cliente)
values
("Marcos André","25510853844","Rua Catão","Vila Romana","05019000","sp",44,"0191","121225",9,11,"999149999","marcos@ig.com.br","2021-03-02 14:42");

-- migrando registros e fazendo a normalização dos campos
insert into itau.clientes
(nome_cliente,cpf_cliente,endereco_cliente,bairro_cliente,cep_cliente,estado_cliente,idade_cliente,ag_cliente,conta_corrente_cliente,dig_verificador_cliente,ddd_cliente,celular_cliente,email_cliente,data_atualizacao_registro_cliente)
select nome_cliente,"atualizar",endereco_cliente,"atualizar","0","xx",idade_cliente,"0","0",0,00,"0","atualizar",now() from unibanco.clientes;


select * from itau.clientes;

create table itau.vendas(
codigo_venda int not null auto_increment primary key,
nome_produto varchar(50) not null,
quantidade_produto int(4) not null,
valor_unitario decimal(8,2) not null,
nome_vendedor varchar(50) not null);

insert into itau.vendas
(nome_produto,quantidade_produto,valor_unitario,nome_vendedor)
values
("Mouse",10,29.50,"Marcos"),
("Teclado",25,38.99,"Cristina"),
("Scanner",5,280.00,"André"),
("Monitor",15,480.00,"Cristina"),
("Impressora",10,360.99,"Marcos");

SELECT 
    nome_produto,
    quantidade_produto,
    valor_unitario,
    (quantidade_produto * valor_unitario) AS Total,
    nome_vendedor
FROM
    itau.vendas;
    
-- calculando o estoque total da empresa

SELECT 
    SUM(quantidade_produto * valor_unitario) AS Total_Bruto
FROM
    itau.vendas;
    
-- criar uma condição de valores aglutinados

SELECT 
    SUM(quantidade_produto * valor_unitario) AS Total_produtos,
    Nome_Vendedor
FROM
    itau.vendas
    group by nome_vendedor order by Total_Produtos desc;
    
use itau;

CREATE TABLE `Produtos` (
	`Cod_Produto` INT NOT NULL AUTO_INCREMENT,
	`Nome_Produto` varchar(50) NOT NULL,
	`Qtd_Produto` int NOT NULL,
	`Valor_Unitario` DECIMAL(8,2) NOT NULL,
	`Cod_Marca_Produto` int NOT NULL,
	PRIMARY KEY (`Cod_Produto`)
);

CREATE TABLE `Tabela de Marcas` (
	`Cod_Marca` int NOT NULL AUTO_INCREMENT,
	`Nome_Marca` varchar(50) NOT NULL,
	PRIMARY KEY (`Cod_Marca`)
);

ALTER TABLE `Produtos` ADD CONSTRAINT `Produtos_fk0` FOREIGN KEY (`Cod_Marca_Produto`) REFERENCES `Tabela de Marcas`(`Cod_Marca`);

use itau;
insert into `Tabela de Marcas`
(nome_marca)
values
("Brastemp"),
("Walitta"),
("Samsung");


insert into itau.produtos
(nome_produto,qtd_produto,valor_unitario,cod_marca_produto)
values
("Fogão",5,1500.00,1);

insert into itau.produtos
(nome_produto,qtd_produto,valor_unitario,cod_marca_produto)
values
("Geladeira",15,1850.00,1),
("Microondas",20,680.00,1),
("Batedeira",24,280.00,2),
("Liquidificador",18,89.99,2),
("TV",105,1800.00,3),
("Celular",20,1600.00,3);

select p.nome_produto,p.qtd_produto,p.valor_unitario,m.nome_marca
from produtos as p,
`tabela de marcas` as m
where p.cod_marca_produto=m.cod_marca

