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
-- Name: format_album; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.format_album AS ENUM (
    'CD',
    'MC'
);


ALTER TYPE public.format_album OWNER TO postgres;

--
-- Name: kunci_musik; Type: TYPE; Schema: public; Owner: postgres
--

CREATE TYPE public.kunci_musik AS ENUM (
    'C',
    'B#',
    'A',
    'D'
);


ALTER TYPE public.kunci_musik OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: tb_album; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_album (
    id_album integer NOT NULL,
    id_lagu integer NOT NULL,
    nama_album character(50) NOT NULL,
    tgl_copyright date NOT NULL,
    format_album public.format_album NOT NULL
);


ALTER TABLE public.tb_album OWNER TO postgres;

--
-- Name: tb_album_id_album_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_album_id_album_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_album_id_album_seq OWNER TO postgres;

--
-- Name: tb_album_id_album_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_album_id_album_seq OWNED BY public.tb_album.id_album;


--
-- Name: tb_instrumen; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_instrumen (
    id_instrumen integer NOT NULL,
    nama_instrumen character(30),
    kunci_musik public.kunci_musik
);


ALTER TABLE public.tb_instrumen OWNER TO postgres;

--
-- Name: tb_instrumen_id_instrumen_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_instrumen_id_instrumen_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_instrumen_id_instrumen_seq OWNER TO postgres;

--
-- Name: tb_instrumen_id_instrumen_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_instrumen_id_instrumen_seq OWNED BY public.tb_instrumen.id_instrumen;


--
-- Name: tb_instrumen_musisi; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_instrumen_musisi (
    id_instrumen_musisi integer NOT NULL,
    id_musisi integer,
    id_instrumen integer
);


ALTER TABLE public.tb_instrumen_musisi OWNER TO postgres;

--
-- Name: tb_instrumen_musisi_id_instrumen_musisi_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_instrumen_musisi_id_instrumen_musisi_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_instrumen_musisi_id_instrumen_musisi_seq OWNER TO postgres;

--
-- Name: tb_instrumen_musisi_id_instrumen_musisi_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_instrumen_musisi_id_instrumen_musisi_seq OWNED BY public.tb_instrumen_musisi.id_instrumen_musisi;


--
-- Name: tb_lagu; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_lagu (
    id_lagu integer NOT NULL,
    id_pengarang integer,
    judul_lagu character(50)
);


ALTER TABLE public.tb_lagu OWNER TO postgres;

--
-- Name: tb_lagu_id_lagu_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_lagu_id_lagu_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_lagu_id_lagu_seq OWNER TO postgres;

--
-- Name: tb_lagu_id_lagu_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_lagu_id_lagu_seq OWNED BY public.tb_lagu.id_lagu;


--
-- Name: tb_musisi_lagu; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_musisi_lagu (
    id_musisi_lagu integer NOT NULL,
    id_musisi integer NOT NULL,
    id_lagu integer NOT NULL
);


ALTER TABLE public.tb_musisi_lagu OWNER TO postgres;

--
-- Name: tb_musisi_lagu_id_musisi_lagu_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_musisi_lagu_id_musisi_lagu_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_musisi_lagu_id_musisi_lagu_seq OWNER TO postgres;

--
-- Name: tb_musisi_lagu_id_musisi_lagu_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_musisi_lagu_id_musisi_lagu_seq OWNED BY public.tb_musisi_lagu.id_musisi_lagu;


--
-- Name: tb_pemusik; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_pemusik (
    ssn numeric(20,0) NOT NULL,
    nama_pemusik character(50) NOT NULL,
    alamat text,
    no_tlp numeric(15,0) NOT NULL
);


ALTER TABLE public.tb_pemusik OWNER TO postgres;

--
-- Name: tb_pengarang; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_pengarang (
    id_pengarang integer NOT NULL,
    nama_pengarang character(50)
);


ALTER TABLE public.tb_pengarang OWNER TO postgres;

--
-- Name: tb_pengarang_id_pengarang_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_pengarang_id_pengarang_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_pengarang_id_pengarang_seq OWNER TO postgres;

--
-- Name: tb_pengarang_id_pengarang_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_pengarang_id_pengarang_seq OWNED BY public.tb_pengarang.id_pengarang;


--
-- Name: tb_produser; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tb_produser (
    id_produser integer NOT NULL,
    id_musisi integer NOT NULL,
    id_album integer NOT NULL
);


ALTER TABLE public.tb_produser OWNER TO postgres;

--
-- Name: tb_produser_id_produser_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tb_produser_id_produser_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_produser_id_produser_seq OWNER TO postgres;

--
-- Name: tb_produser_id_produser_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tb_produser_id_produser_seq OWNED BY public.tb_produser.id_produser;


--
-- Name: tb_album id_album; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_album ALTER COLUMN id_album SET DEFAULT nextval('public.tb_album_id_album_seq'::regclass);


--
-- Name: tb_instrumen id_instrumen; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_instrumen ALTER COLUMN id_instrumen SET DEFAULT nextval('public.tb_instrumen_id_instrumen_seq'::regclass);


--
-- Name: tb_instrumen_musisi id_instrumen_musisi; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_instrumen_musisi ALTER COLUMN id_instrumen_musisi SET DEFAULT nextval('public.tb_instrumen_musisi_id_instrumen_musisi_seq'::regclass);


--
-- Name: tb_lagu id_lagu; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_lagu ALTER COLUMN id_lagu SET DEFAULT nextval('public.tb_lagu_id_lagu_seq'::regclass);


--
-- Name: tb_musisi_lagu id_musisi_lagu; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_musisi_lagu ALTER COLUMN id_musisi_lagu SET DEFAULT nextval('public.tb_musisi_lagu_id_musisi_lagu_seq'::regclass);


--
-- Name: tb_pengarang id_pengarang; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_pengarang ALTER COLUMN id_pengarang SET DEFAULT nextval('public.tb_pengarang_id_pengarang_seq'::regclass);


--
-- Name: tb_produser id_produser; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_produser ALTER COLUMN id_produser SET DEFAULT nextval('public.tb_produser_id_produser_seq'::regclass);


--
-- Data for Name: tb_album; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_album (id_album, id_lagu, nama_album, tgl_copyright, format_album) FROM stdin;
1	1	album a                                           	2022-01-01	CD
2	1	album b                                           	2022-02-01	CD
3	2	album b                                           	2022-03-01	MC
\.


--
-- Data for Name: tb_instrumen; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_instrumen (id_instrumen, nama_instrumen, kunci_musik) FROM stdin;
1	gitar                         	C
2	flute                         	A
3	piano                         	B#
\.


--
-- Data for Name: tb_instrumen_musisi; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_instrumen_musisi (id_instrumen_musisi, id_musisi, id_instrumen) FROM stdin;
1	134658123	2
2	234658167	1
3	334652343	3
4	334652343	1
5	334652343	2
6	434567663	1
\.


--
-- Data for Name: tb_lagu; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_lagu (id_lagu, id_pengarang, judul_lagu) FROM stdin;
1	3	dark                                              
2	1	versace on the floor                              
3	2	treasure                                          
\.


--
-- Data for Name: tb_musisi_lagu; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_musisi_lagu (id_musisi_lagu, id_musisi, id_lagu) FROM stdin;
1	234658167	3
2	234658167	2
3	234658167	2
4	234658167	2
\.


--
-- Data for Name: tb_pemusik; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_pemusik (ssn, nama_pemusik, alamat, no_tlp) FROM stdin;
134658123	chandra                                           	jln. ansi no 8	23425643
234658167	nami                                              	jln. sinsa no 9	23455643
334652343	brook                                             	jln. orange no 7	8924643
434567663	usop                                              	jln. malky no 7	27825643
534634553	sanji                                             	jln. ways no 6	45725643
\.


--
-- Data for Name: tb_pengarang; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_pengarang (id_pengarang, nama_pengarang) FROM stdin;
1	jacob                                             
2	arial                                             
3	violet                                            
\.


--
-- Data for Name: tb_produser; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tb_produser (id_produser, id_musisi, id_album) FROM stdin;
1	234658167	2
2	234658167	2
3	334652343	1
4	334652343	3
\.


--
-- Name: tb_album_id_album_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_album_id_album_seq', 1, false);


--
-- Name: tb_instrumen_id_instrumen_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_instrumen_id_instrumen_seq', 1, false);


--
-- Name: tb_instrumen_musisi_id_instrumen_musisi_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_instrumen_musisi_id_instrumen_musisi_seq', 1, false);


--
-- Name: tb_lagu_id_lagu_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_lagu_id_lagu_seq', 1, false);


--
-- Name: tb_musisi_lagu_id_musisi_lagu_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_musisi_lagu_id_musisi_lagu_seq', 1, false);


--
-- Name: tb_pengarang_id_pengarang_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_pengarang_id_pengarang_seq', 1, false);


--
-- Name: tb_produser_id_produser_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tb_produser_id_produser_seq', 1, false);


--
-- Name: tb_album tb_album_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_album
    ADD CONSTRAINT tb_album_pkey PRIMARY KEY (id_album);


--
-- Name: tb_instrumen_musisi tb_instrumen_musisi_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_instrumen_musisi
    ADD CONSTRAINT tb_instrumen_musisi_pkey PRIMARY KEY (id_instrumen_musisi);


--
-- Name: tb_instrumen tb_instrumen_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_instrumen
    ADD CONSTRAINT tb_instrumen_pkey PRIMARY KEY (id_instrumen);


--
-- Name: tb_lagu tb_lagu_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_lagu
    ADD CONSTRAINT tb_lagu_pkey PRIMARY KEY (id_lagu);


--
-- Name: tb_musisi_lagu tb_musisi_lagu_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_musisi_lagu
    ADD CONSTRAINT tb_musisi_lagu_pkey PRIMARY KEY (id_musisi_lagu);


--
-- Name: tb_pemusik tb_pemusik_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_pemusik
    ADD CONSTRAINT tb_pemusik_pkey PRIMARY KEY (ssn);


--
-- Name: tb_pengarang tb_pengarang_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_pengarang
    ADD CONSTRAINT tb_pengarang_pkey PRIMARY KEY (id_pengarang);


--
-- Name: tb_produser tb_produser_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_produser
    ADD CONSTRAINT tb_produser_pkey PRIMARY KEY (id_produser);


--
-- Name: tb_produser fk_album; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_produser
    ADD CONSTRAINT fk_album FOREIGN KEY (id_album) REFERENCES public.tb_album(id_album);


--
-- Name: tb_instrumen_musisi fk_instrumen; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_instrumen_musisi
    ADD CONSTRAINT fk_instrumen FOREIGN KEY (id_instrumen) REFERENCES public.tb_instrumen(id_instrumen);


--
-- Name: tb_album fk_lagu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_album
    ADD CONSTRAINT fk_lagu FOREIGN KEY (id_lagu) REFERENCES public.tb_lagu(id_lagu);


--
-- Name: tb_musisi_lagu fk_lagu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_musisi_lagu
    ADD CONSTRAINT fk_lagu FOREIGN KEY (id_lagu) REFERENCES public.tb_lagu(id_lagu);


--
-- Name: tb_produser fk_musisi; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_produser
    ADD CONSTRAINT fk_musisi FOREIGN KEY (id_musisi) REFERENCES public.tb_pemusik(ssn);


--
-- Name: tb_instrumen_musisi fk_musisi; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_instrumen_musisi
    ADD CONSTRAINT fk_musisi FOREIGN KEY (id_musisi) REFERENCES public.tb_pemusik(ssn);


--
-- Name: tb_musisi_lagu fk_musisi; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_musisi_lagu
    ADD CONSTRAINT fk_musisi FOREIGN KEY (id_musisi) REFERENCES public.tb_pemusik(ssn);


--
-- Name: tb_lagu fk_pengarang; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tb_lagu
    ADD CONSTRAINT fk_pengarang FOREIGN KEY (id_pengarang) REFERENCES public.tb_pengarang(id_pengarang);


--
-- PostgreSQL database dump complete
--

