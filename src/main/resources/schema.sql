drop table if exists Mobile;

CREATE TABLE Mobile (
    id   INTEGER NOT NULL AUTO_INCREMENT,
    model_name VARCHAR(400) NOT NULL,
    price INTEGER NOT NULL,
    PRIMARY KEY (id)
);