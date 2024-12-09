CREATE TABLE masini (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        nr_inmatriculare VARCHAR(50) UNIQUE NOT NULL,
                        marca VARCHAR(50),
                        an INT,
                        culoare VARCHAR(30),
                        nr_km INT
);
