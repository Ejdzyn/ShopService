create table if not exists products(
    id integer primary key,
    product_name varchar(50) not null,
    quantity integer default 0
);
