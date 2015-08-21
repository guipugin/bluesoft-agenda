create table sala
(
   sala_id serial primary key not null,
   sala_nome varchar(255)
);

create table agendamento
(
   ag_id serial not null,
   ag_data timestamp,
   ag_salaId int references sala(sala_id)
);