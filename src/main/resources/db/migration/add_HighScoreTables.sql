create table BeginnerHighScore
(
    id bigint not null
        constraint ToDo_pkey
            primary key,
    playerName varchar (1000),
    timeElapsed bigint not null
);

alter table BeginnerHighScore owner to postgres;

create table IntermediatHighScore
(
    id bigint not null
        constraint ToDo_pkey
            primary key,
    playerName varchar (1000),
    timeElapsed bigint not null
);

alter table IntermediatHighScore owner to postgres;

create table ExpertHighScore
(
    id bigint not null
        constraint ToDo_pkey
            primary key,
    playerName varchar (1000),
    timeElapsed bigint not null
);

alter table ExpertHighScore owner to postgres;