create table sala
(
   sala_id serial,
   sala_nome varchar(255),
   constraint sala_pkey primary key(sala_id)
);

create table agendamento
(
   ag_id serial,
   ag_data date,
   ag_salaId int references sala (sala_id),
   constraint agendamento_pk primary key(ag_id)
);