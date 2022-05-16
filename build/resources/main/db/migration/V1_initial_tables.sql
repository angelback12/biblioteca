CREATE TABLE "libro"(
                        id serial NOT NULL,
                        name character varying(50) NOT NULL,
                        description character varying(100) NOT NULL
                       );
ALTER TABLE "libro" OWNER to postgres;

CREATE TABLE "revista"(
                        id serial NOT NULL,
                        name character varying(50) NOT NULL,
<<<<<<< HEAD
                        description character varying(100) NOT NULL,
=======
                        description character varying(100) NOT NULL
>>>>>>> b66f4ba33baaff0401bafe8e1a7e41c0d49397a4
                       );
ALTER TABLE "revista" OWNER to postgres;

CREATE TABLE "genero"(
                        id serial NOT NULL,
                        name character varying(50) NOT NULL,
<<<<<<< HEAD
                        description character varying(100) NOT NULL,
                       );
ALTER TABLE "genero" OWNER to postgres;
=======
                        description character varying(100) NOT NULL
                       );
ALTER TABLE "genero" OWNER to postgres;

CREATE TABLE "autor"(
                        id serial NOT NULL,
                        name character varying(50) NOT NULL,
                        nation character varying(50) NOT NULL
                       );
ALTER TABLE "autor" OWNER to postgres;
>>>>>>> b66f4ba33baaff0401bafe8e1a7e41c0d49397a4
