CREATE TABLE "libro" (
                        lb_id serial NOT NULL,
                        lb_name character varying(50) NOT NULL,
                        lb_desc character varying(100) NOT NULL,
                        PRIMARY KEY (ld_id)
                       );

ALTER TABLE "libro" OWNER to postgres;