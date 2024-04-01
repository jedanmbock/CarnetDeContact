/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  JD
 * Created: 31 mars 2024
 */
create database if not exists Contact;
use contact;
create table  if not exists Etudiant(
    code varchar(6)primary key,
    nom varchar(50),
    dateNaissance date,
    adresse varchar(30),
    email varchar(100),
    numTel varchar(15),
    cycleEtude varchar(30));
create table  if not exists Enseignant(
    code varchar(6)primary key,
    nom varchar(50),
    dateNaissance date,
    adresse varchar(30),
    email varchar(100),
    numTel varchar(15),
    statut varchar(30));
create table  if not exists Agent(
    code varchar(6)primary key,
    nom varchar(50),
    dateNaissance date,
    adresse varchar(30),
    email varchar(100),
    numTel varchar(15),
    salaire decimal,
    statut varchar(30),
    categorie varchar(10),
    indiceSalaire int,
    occupation varchar(30));
