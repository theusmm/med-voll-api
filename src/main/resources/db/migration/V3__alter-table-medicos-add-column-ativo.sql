ALTER TABLE medicos ADD COLUMN ativo SMALLINT;
UPDATE medicos set ativo = 1;