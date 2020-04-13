
    create table Kunde (
       kundennummer number(19,2) not null,
        ort varchar2(255 char),
        kundenname varchar2(255 char),
        bundesland_kurz varchar2(255 char),
        staat_kurz varchar2(255 char),
        strasse varchar2(255 char),
        PLZ number(10,0),
        primary key (kundennummer)
    );
