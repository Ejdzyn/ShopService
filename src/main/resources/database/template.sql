create table if not exists products(
    id serial primary key,
    product_name varchar(50) not null,
    quantity integer default 0,
    unique(product_name)
);

insert into products(product_name, quantity) values ('pepsi',6);
insert into products(product_name, quantity) values ('fanta',20);
insert into products(product_name) values ('3bit');

/*update products set quantity = quantity+5 where product_name = 'pepsi'*/
