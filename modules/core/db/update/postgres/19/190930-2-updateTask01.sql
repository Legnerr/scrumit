alter table SCRUMIT_TASK add constraint FK_SCRUMIT_TASK_ON_WORKFLOW foreign key (WORKFLOW_ID) references WFSTP_WORKFLOW(ID);
create index IDX_SCRUMIT_TASK_ON_WORKFLOW on SCRUMIT_TASK (WORKFLOW_ID);