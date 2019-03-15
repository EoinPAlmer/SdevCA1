# --- Sample dataset

# --- !Ups

insert into category(id,name) values(1,'Network Engineer');
insert into category(id,name) values(2,'Java Developer');
insert into category(id,name) values(3,'Programmer');
insert into catagory(id,name) values(4, "App Engineer");

insert into product (id,name,brand,size,stock,category_id,price) values(1, "Yeezy boost 350 Turtle Dove", "Yeezy", 10, 700, 14, 4);
insert into product (id,name,brand,size,stock,category_id,price) values(2, "Yeezy boost 750 black", "Yeezy", 8, 850, 10, 4);
insert into product (id,name,brand,size,stock,category_id,price) values(3, "BAPE NMD Green Camo", "Adidas", 9, 600, 10, 1);
insert into product (id,name,brand,size,stock,category_id,price) values(4, "BAPE NMD MasterMind", "Adidas", 8, 650, 7, 1);
insert into product (id,name,brand,size,stock,category_id,price) values(5, "Nike React", "Nike", 9,100, 11, 2);
insert into product (id,name,brand,size,stock,category_id,price) values(6, "Nike Air Jordan", "Nike", 9, 620, 10, 2);
insert into product (id,name,brand,size,stock,category_id,price) values(7, "Baleniaga Platform crocs", "Balenciaga", 9, 800, 10, 3);
insert into product (id,name,brand,size,stock,category_id,price) values(8, "Balenciaga Thriple S", "Balenciaga", 9, 600, 10, 3);


insert into manager (email,role,name,password) values ('eoin@IT-Project-Management.com','manager','EoinPalmer','password');
insert into manager (email,role,name,password) values ('paul@IT-Project-Management.com','manager','PaulRoche','password');

insert into employee (email,role,name,password) values ('employee@IT-Project-Management.com','employee','employee','password');