--
-- PostgreSQL database dump
--

-- Dumped from database version 14.3
-- Dumped by pg_dump version 14.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: gender; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.gender AS ENUM (
    'male',
    'female'
);


ALTER TYPE public.gender OWNER TO postgres;

--
-- Name: hubungan; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.hubungan AS ENUM (
    'internal',
    'eksternal'
);


ALTER TYPE public.hubungan OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: depatermen; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.depatermen (
    id_departemen integer NOT NULL,
    nama_depatermen character(20),
    id_employee integer,
    manager_join_date date
);


ALTER TABLE public.depatermen OWNER TO postgres;

--
-- Name: depatermen_id_departemen_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.depatermen_id_departemen_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.depatermen_id_departemen_seq OWNER TO postgres;

--
-- Name: depatermen_id_departemen_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.depatermen_id_departemen_seq OWNED BY public.depatermen.id_departemen;


--
-- Name: dependen; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.dependen (
    id_dependen integer NOT NULL,
    id_employee integer,
    nama_dependen character(20),
    gender public.gender,
    tgl_lahir date,
    hubungan public.hubungan
);


ALTER TABLE public.dependen OWNER TO postgres;

--
-- Name: dependent_id_dependent_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.dependent_id_dependent_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.dependent_id_dependent_seq OWNER TO postgres;

--
-- Name: dependent_id_dependent_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.dependent_id_dependent_seq OWNED BY public.dependen.id_dependen;


--
-- Name: employee; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employee (
    ssn numeric(20,0) NOT NULL,
    nama_depan character(20) NOT NULL,
    nama_tengah character(20),
    nama_belakang character(20),
    tgl_lahir date,
    alamat text,
    gender public.gender,
    gaji bigint
);


ALTER TABLE public.employee OWNER TO postgres;

--
-- Name: lokasi_depatermen; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.lokasi_depatermen (
    id_lokasi integer NOT NULL,
    id_depatermen integer NOT NULL,
    lokasi_depatermen text NOT NULL
);


ALTER TABLE public.lokasi_depatermen OWNER TO postgres;

--
-- Name: projek; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.projek (
    id_projek integer NOT NULL,
    nama_projek character(30),
    lokasi_projek text,
    id_depatermen integer
);


ALTER TABLE public.projek OWNER TO postgres;

--
-- Name: projek_id_projek_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.projek_id_projek_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.projek_id_projek_seq OWNER TO postgres;

--
-- Name: projek_id_projek_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.projek_id_projek_seq OWNED BY public.projek.id_projek;


--
-- Name: works_on; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.works_on (
    id_workson integer NOT NULL,
    id_employee integer NOT NULL,
    id_projek integer NOT NULL,
    jam integer NOT NULL
);


ALTER TABLE public.works_on OWNER TO postgres;

--
-- Name: depatermen id_departemen; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depatermen ALTER COLUMN id_departemen SET DEFAULT nextval('public.depatermen_id_departemen_seq'::regclass);


--
-- Name: dependen id_dependen; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dependen ALTER COLUMN id_dependen SET DEFAULT nextval('public.dependent_id_dependent_seq'::regclass);


--
-- Name: projek id_projek; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.projek ALTER COLUMN id_projek SET DEFAULT nextval('public.projek_id_projek_seq'::regclass);


--
-- Data for Name: depatermen; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.depatermen (id_departemen, nama_depatermen, id_employee, manager_join_date) FROM stdin;
1	it                  	34242	2020-01-01
2	human resource      	12242	2021-01-01
4	it                  	84242	2019-01-01
\.


--
-- Data for Name: dependen; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.dependen (id_dependen, id_employee, nama_dependen, gender, tgl_lahir, hubungan) FROM stdin;
1	4	chandra             	male	2022-01-01	internal
2	4	mihawk              	male	2021-02-01	eksternal
3	2	law                 	male	2020-01-01	eksternal
4	1	roger               	male	2019-01-01	internal
5	1	leo                 	male	2022-01-01	internal
6	3	kaido               	male	2021-02-01	eksternal
7	2	apoo                	male	2020-01-01	eksternal
\.


--
-- Data for Name: employee; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employee (ssn, nama_depan, nama_tengah, nama_belakang, tgl_lahir, alamat, gender, gaji) FROM stdin;
34242	chandra             	jackson             	aja                 	2022-01-01	jln. perkantoran no.8	male	536352
12242	nami                	                    	aja                 	2022-02-01	jln. perkantoran no.9	female	236352
44242	robin               	                    	                    	2022-03-01	jln. perkantoran no.10	female	136352
84242	usop                	jackson             	aja                 	2022-04-01	jln. perkantoran no.11	male	936352
5	chandra             	nishakara           	aja                 	2022-01-01	jln. perkantoran no.12	male	526352
6	bison               	                    	aja                 	2022-02-01	jln. perkantoran no.12	female	231352
7	lance               	                    	                    	2022-03-01	jln. perkantoran no.14	female	936352
8	chopper             	jacie               	aja                 	2022-04-01	jln. perkantoran no.16	male	436352
1	chandra             	jackson             	aja                 	2022-01-01	jln. perkantoran no.8	male	536352
2	nami                	                    	aja                 	2022-02-01	jln. perkantoran no.9	female	236352
3	robin               	                    	                    	2022-03-01	jln. perkantoran no.10	female	136352
4	usop                	jackson             	aja                 	2022-04-01	jln. perkantoran no.11	male	936352
\.


--
-- Data for Name: lokasi_depatermen; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.lokasi_depatermen (id_lokasi, id_depatermen, lokasi_depatermen) FROM stdin;
1	1	malaysia
2	4	indonesia
3	2	palembang
\.


--
-- Data for Name: projek; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.projek (id_projek, nama_projek, lokasi_projek, id_depatermen) FROM stdin;
6	jakarta-fest                  	jakarta selatan	1
7	bandung-fest                  	bandung	1
8	palembang-fest                	palembang	1
9	bali-fest                     	bali	4
10	japan-fest                    	japan	2
1	first-fest                    	jakarta selatan	1
\.


--
-- Data for Name: works_on; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.works_on (id_workson, id_employee, id_projek, jam) FROM stdin;
1	2	6	20
2	2	7	100
3	2	8	300
4	2	9	2
5	7	9	2
6	8	1	2000
7	5	6	300
8	5	9	2
\.


--
-- Name: depatermen_id_departemen_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.depatermen_id_departemen_seq', 1, false);


--
-- Name: dependent_id_dependent_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.dependent_id_dependent_seq', 1, false);


--
-- Name: projek_id_projek_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.projek_id_projek_seq', 1, false);


--
-- Name: depatermen depatermen_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depatermen
    ADD CONSTRAINT depatermen_pkey PRIMARY KEY (id_departemen);


--
-- Name: dependen dependent_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dependen
    ADD CONSTRAINT dependent_pkey PRIMARY KEY (id_dependen);


--
-- Name: employee employee_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (ssn);


--
-- Name: projek projek_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.projek
    ADD CONSTRAINT projek_pkey PRIMARY KEY (id_projek);


--
-- Name: depatermen uq_employee; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depatermen
    ADD CONSTRAINT uq_employee UNIQUE (id_employee);


--
-- Name: lokasi_depatermen uq_lokasi_depatermen; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.lokasi_depatermen
    ADD CONSTRAINT uq_lokasi_depatermen UNIQUE (lokasi_depatermen);


--
-- Name: dependen uq_nama_dependen; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dependen
    ADD CONSTRAINT uq_nama_dependen UNIQUE (nama_dependen);


--
-- Name: projek uq_nama_projek; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.projek
    ADD CONSTRAINT uq_nama_projek UNIQUE (nama_projek);


--
-- Name: works_on uq_together_workson; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.works_on
    ADD CONSTRAINT uq_together_workson UNIQUE (id_employee, id_projek) INCLUDE (id_employee, id_projek);


--
-- Name: works_on works_on_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.works_on
    ADD CONSTRAINT works_on_pkey PRIMARY KEY (id_workson);


--
-- Name: projek fk_depatermen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.projek
    ADD CONSTRAINT fk_depatermen FOREIGN KEY (id_depatermen) REFERENCES public.depatermen(id_departemen);


--
-- Name: lokasi_depatermen fk_depatermen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.lokasi_depatermen
    ADD CONSTRAINT fk_depatermen FOREIGN KEY (id_depatermen) REFERENCES public.depatermen(id_departemen);


--
-- Name: dependen fk_employee; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dependen
    ADD CONSTRAINT fk_employee FOREIGN KEY (id_employee) REFERENCES public.employee(ssn);


--
-- Name: works_on fk_employee; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.works_on
    ADD CONSTRAINT fk_employee FOREIGN KEY (id_employee) REFERENCES public.employee(ssn);


--
-- Name: works_on fk_projek; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.works_on
    ADD CONSTRAINT fk_projek FOREIGN KEY (id_projek) REFERENCES public.projek(id_projek);


--
-- PostgreSQL database dump complete
--

