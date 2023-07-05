INSERT INTO client (name)
VALUES
  ('Oleg Lagosh'),
  ('Anton Skliar'),
  ('Olena Bobrovska'),
  ('Kate Bilenko'),
  ('Mary Calm'),
  ('Tetiana Holotiuk'),
  ('Svitlana Rybak'),
  ('Alex Pet'),
  ('Mark Lubart'),
  ('Roman Res');

INSERT INTO planet (id, name)
VALUES
  ('MARS', 'Mars'),
  ('VEN', 'Venus'),
  ('EAR', 'Earth'),
  ('JUP', 'Jupiter'),
  ('MER', 'Mercury');


INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id)
VALUES
  (CURRENT_TIMESTAMP, 1, 'MARS', 'VEN'),
  (CURRENT_TIMESTAMP, 2, 'VEN', 'JUP'),
  (CURRENT_TIMESTAMP, 3, 'EAR', 'JUP'),
  (CURRENT_TIMESTAMP, 4, 'JUP', 'MER'),
  (CURRENT_TIMESTAMP, 5, 'MARS', 'JUP'),
  (CURRENT_TIMESTAMP, 6, 'MER', 'MARS'),
  (CURRENT_TIMESTAMP, 7, 'VEN', 'MER'),
  (CURRENT_TIMESTAMP, 8, 'EAR', 'VEN'),
  (CURRENT_TIMESTAMP, 9, 'MARS', 'EAR'),
  (CURRENT_TIMESTAMP, 10, 'EAR', 'MER');