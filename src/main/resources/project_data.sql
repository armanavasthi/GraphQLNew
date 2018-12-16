

INSERT INTO award (country, field, name) VALUES ("USA", "movies", "oscar");

INSERT INTO award (country, field, name) VALUES ("USA", "music", "grammy");

INSERT INTO award (country, field, name) VALUES ("USA", "movies", "Golden Globe");

INSERT INTO award (country, field, name) VALUES ('UK', 'writing', 'Man Booker Prize');

INSERT INTO award (country, field, name) VALUES ('India', 'peace', 'Gandhi Peace Prize');



INSERT INTO winner (country, field, first_name, last_name) VALUES ('USA', 'Movie', 'Marlon', 'Brando'); -- oscar

INSERT INTO winner (country, field, first_name, last_name) VALUES ('USA', 'Music', 'Ed', 'Sheeran'); -- Music

INSERT INTO winner (country, field, first_name, last_name) VALUES ('South Africa', 'Politics', 'Nelson', 'Mandela'); -- gandhi

INSERT INTO winner (country, field, first_name, last_name) VALUES ('UK', 'Music', 'Adele', ''); -- oscar, grammy

INSERT INTO winner (country, field, first_name, last_name) VALUES ('Germany', 'Writer', 'Ruth Prawer', 'Jhabvala'); -- booker, oscar

INSERT INTO winner (country, field, first_name, last_name) VALUES ('USA', 'Music', 'Al', 'Pacino'); -- oscar, golden globe

INSERT INTO winner (country, field, first_name, last_name) VALUES ('UK', 'Music', 'Ben', 'Kingsley'); -- oscar, golden globe 

INSERT INTO winner (country, field, first_name, last_name) VALUES ('Tanzania', 'Politics', 'Julius', 'Nyerere'); -- gandhi

INSERT INTO winner (country, field, first_name, last_name) VALUES ('Scotland', 'Music', 'Ewan', 'McGregor'); -- golden globe

INSERT INTO winner (country, field, first_name, last_name) VALUES ('Canada', 'Movie', 'James', 'Cameron'); -- Oscar



SET FOREIGN_KEY_CHECKS=0;
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('2', '2');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('3', '5');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('4', '1');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('4', '2');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('5', '4');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('5', '1');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('6', '1');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('6', '3');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('7', '1');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('7', '3');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('8', '5');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('9', '3');
INSERT INTO `winner_award` (`winner_id`, `award_id`) VALUES ('10', '1');
SET FOREIGN_KEY_CHECKS=1;
