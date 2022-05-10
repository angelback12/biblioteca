CREATE TABLE "libro"(
                        id serial NOT NULL,
                        name character varying(50) NOT NULL,
                        description character varying(100) NOT NULL,
                        PRIMARY KEY (id)
                       );
ALTER TABLE "libro" OWNER to postgres;