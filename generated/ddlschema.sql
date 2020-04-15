
    create table Auftrag (
       auftragsnummer number(38,0) not null,
        kundennummer number(38,0),
        datum date,
        produktnummer number(38,0),
        stueckzahl number(38,0),
        verkaeufernummer number(38,0),
        gesamteinkaufspreis number(15,2),
        gesamtverkaufspreis number(15,2),
        primary key (auftragsnummer)
    );

    create table Bereiche (
       bereichsnummer number(38,0) not null,
        kostenstelle number(10,0),
        bereichsbezeichnung varchar2(20 char),
        primary key (bereichsnummer)
    );

    create table Bundesland (
       bundesland_kurz varchar2(2 char) not null,
        staat_kurz varchar2(50 char),
        bundesland varchar2(50 char),
        primary key (bundesland_kurz)
    );

    create table Kunde (
       kundennummer number(19,2) not null,
        ort varchar2(255 char),
        staat_kurz varchar2(255 char),
        kundenname varchar2(255 char),
        bundesland_kurz varchar2(255 char),
        strasse varchar2(255 char),
        PLZ number(10,0),
        primary key (kundennummer)
    );

    create table Produkt (
       produktnummer number(38,0) not null,
        herkunft varchar2(15 char),
        produktbezeichnung varchar2(50 char),
        einkaufspreis number(15,2),
        verkaufspreis number(15,2),
        sortenkennzeichen varchar2(3 char),
        jahrgang varchar2(25 char),
        primary key (produktnummer)
    );

    create table Sorte (
       sortenkennzeichen varchar2(3 char) not null,
        bereichsbezeichnung varchar2(50 char),
        bereichsnummer varchar2(50 char),
        rebsorte varchar2(50 char),
        primary key (sortenkennzeichen)
    );

    create table Staat (
       staat_kurz varchar2(2 char) not null,
        staat varchar2(50 char),
        primary key (staat_kurz)
    );

    create table Verkaeufer (
       verkaeufernummer number(38,0) not null,
        provisionsfaktor number(15,3),
        staat_kurz varchar2(2 char),
        bereich number(38,0),
        vorname varchar2(20 char),
        name varchar2(20 char),
        primary key (verkaeufernummer)
    );
