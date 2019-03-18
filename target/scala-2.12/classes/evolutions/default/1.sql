# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  brand                         varchar(255),
  size                          integer not null,
  stock                         integer not null,
  price                         double not null,
  category_id                   bigint,
  constraint pk_project primary key (id)
);

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  role                          varchar(255),
  constraint pk_user primary key (email)
);

alter table project add constraint fk_project_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_project_category_id on project (category_id);


# --- !Downs

alter table project drop constraint if exists fk_project_category_id;
drop index if exists ix_project_category_id;

drop table if exists category;

drop table if exists project;

drop table if exists user;

