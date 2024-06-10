drop table tarefas;
use tarefas;
create table tarefas
(
    id              BIGINT NOT NULL AUTO_INCREMENT,
    descricao       VARCHAR(255),
    finalizado      BOOLEAN,
    data_finalizacao DATE,
    primary key (id)
);


select * from tarefas;
