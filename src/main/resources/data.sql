insert into user_details(id,birthdate,name)
values(10001, current_date(), 'Sakib');
insert into user_details(id,birthdate,name)
values(10002, current_date(), 'Rakib');
insert into user_details(id,birthdate,name)
values(10003, current_date(), 'Asif');

insert into post(id,description,user_id)
values(20001,'I want to learn AWS', 10001);

insert into post(id,description,user_id)
values(20002,'I want to learn DevOps', 10001);

insert into post(id,description,user_id)
values(20003,'I want to Get AWS Certified', 10002);

insert into post(id,description,user_id)
values(20004,'I want to learn Multi Cloud', 10002);