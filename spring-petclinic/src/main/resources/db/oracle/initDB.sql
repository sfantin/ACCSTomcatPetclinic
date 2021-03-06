DROP TABLE vet_specialties;

DROP INDEX vets_last_name;
DROP SEQUENCE id_vets_sequence;
DROP TABLE vets;

DROP INDEX specialties_name;
DROP SEQUENCE id_specialties_sequence;
DROP TABLE specialties;

DROP INDEX visits_pet_id;
DROP SEQUENCE id_visits_sequence;
DROP TABLE visits;

DROP INDEX pets_name;
DROP SEQUENCE id_pets_sequence;
DROP TABLE pets;

DROP INDEX types_name;
DROP SEQUENCE id_types_sequence;
DROP TABLE types;

DROP INDEX owners_last_name;
DROP SEQUENCE id_owners_sequence;
DROP TABLE owners;

CREATE TABLE vets (
  id         INTEGER GENERATED BY DEFAULT ON NULL AS IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(30)
);
CREATE INDEX vets_last_name ON vets (last_name);
CREATE SEQUENCE id_vets_sequence START WITH 7 INCREMENT BY 1;

CREATE TABLE specialties (
  id   INTEGER GENERATED BY DEFAULT ON NULL AS IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX specialties_name ON specialties (name);
CREATE SEQUENCE id_specialties_sequence START WITH 4 INCREMENT BY 1;

CREATE TABLE vet_specialties (
  vet_id       INTEGER NOT NULL,
  specialty_id INTEGER NOT NULL
);
ALTER TABLE vet_specialties ADD CONSTRAINT fk_vet_specialties_vets FOREIGN KEY (vet_id) REFERENCES vets (id);
ALTER TABLE vet_specialties ADD CONSTRAINT fk_vet_specialties_specialties FOREIGN KEY (specialty_id) REFERENCES specialties (id);

CREATE TABLE types (
  id   INTEGER GENERATED BY DEFAULT ON NULL AS IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX types_name ON types (name);
CREATE SEQUENCE id_types_sequence START WITH 7 INCREMENT BY 1;

CREATE TABLE owners (
  id         INTEGER GENERATED BY DEFAULT ON NULL AS IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(30),
  address    VARCHAR(255),
  city       VARCHAR(80),
  telephone  VARCHAR(20)
);
CREATE INDEX owners_last_name ON owners (last_name);
CREATE SEQUENCE id_owners_sequence START WITH 11 INCREMENT BY 1;

CREATE TABLE pets (
  id         INTEGER GENERATED BY DEFAULT ON NULL AS IDENTITY PRIMARY KEY,
  name       VARCHAR(30),
  birth_date DATE,
  type_id    INTEGER NOT NULL,
  owner_id   INTEGER NOT NULL
);
ALTER TABLE pets ADD CONSTRAINT fk_pets_owners FOREIGN KEY (owner_id) REFERENCES owners (id);
ALTER TABLE pets ADD CONSTRAINT fk_pets_types FOREIGN KEY (type_id) REFERENCES types (id);
CREATE INDEX pets_name ON pets (name);
CREATE SEQUENCE id_pets_sequence START WITH 14 INCREMENT BY 1;

CREATE TABLE visits (
  id          INTEGER GENERATED BY DEFAULT ON NULL AS IDENTITY PRIMARY KEY,
  pet_id      INTEGER NOT NULL,
  visit_date  DATE,
  description VARCHAR(255)
);
ALTER TABLE visits ADD CONSTRAINT fk_visits_pets FOREIGN KEY (pet_id) REFERENCES pets (id);
CREATE INDEX visits_pet_id ON visits (pet_id);
CREATE SEQUENCE id_visits_sequence START WITH 5 INCREMENT BY 1;