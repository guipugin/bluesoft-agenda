create table sala
(
   sala_id int primary key,
   sala_nome varchar(50)
);

create table agendamento
(
   ad_id int primary key,
   ag_data timestamp,
   ag_salaId int references sala (sala_id)
);