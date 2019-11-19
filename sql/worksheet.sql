select word from (
select count(*), word from torah_verse_word
WHERE num_value != 0
group by word
having count(*) > 5
) as TEST

select eng_book_name from torah_book order by id desc

update torah_book set id=56 where id=58;
update torah_book set id=57 where id=59;
update torah_book set id=58 where id=60;
update torah_book set id=59 where id=61;
update torah_book set id=60 where id=62;
update torah_book set id=61 where id=63;
update torah_book set id=62 where id=64;
update torah_book set id=63 where id=65;
update torah_book set id=64 where id=66;
update torah_book set id=65 where id=67;
update torah_book set id=66 where id=68;


select count(*) from torah_verse_word where verse_ID IN (
select id from torah_verse where book_id=51
)


update torah_book set book_name='דְּבָרִים' WHERE ID=5;
select count(*) from nanzopco_torah.torah_verse where book_id=46

SET SQL_SAFE_UPDATES = 0;
delete from nanzopco_torah.torah_verse_word where verse_id IN (
select id from nanzopco_torah.torah_verse where book_id = 63);
SET SQL_SAFE_UPDATES = 0;
delete from nanzopco_torah.torah_verse where book_id = 63;
SET SQL_SAFE_UPDATES = 0;
select count(*) from nanzopco_torah.torah_verse;
select count(*) from nanzopco_torah.torah_verse_word
select count(*) from nanzopco_torah.torah_verse where book_id=45 AND num_chapter=20 and num_verse between 4 and 9 order by num_verse

select * from nanzopco_torah.torah_verse where book_id=39 and verse like '%{%'
select * from nanzopco_torah.torah_verse_word where verse_ID=59805 IN (
select id from nanzopco_torah.torah_verse_word where length(word) = 0)

select * from nanzopco_torah.torah_verse where num_value=1751;
select * from nanzopco_torah.torah_verse_word where num_value=1751;

select book_id,book_name,eng_book_name,num_chapter,num_verse,verse,tran_verse,eng_verse from torah_verse a
inner join torah_book b on a.book_id=b.id
where num_value=640 or a.id in (
select verse_id from torah_verse_word where num_value=640)
order by book_id,num_chapter,num_verse

select count(*),word from nanzopco_torah.torah_verse_word where num_value=485;
group by word

select word,num_index,num_verse from torah_verse_word a
inner join torah_verse b on b.id=a.verse_id
where book_id=1 and num_chapter=1 and num_verse between 1 and 2
order by num_verse, num_index

select count(*),verse from torah_verse where num_value=485
group by verse

DROP INDEX torah_verse_ix1 ON torah_verse;
DROP INDEX torah_verse_word_ix1 ON torah_verse_word;
CREATE INDEX torah_verse_ix1 ON torah_verse(num_value);
CREATE INDEX torah_verse_ix2 ON torah_verse(book_id,num_chapter,num_verse);
CREATE INDEX torah_verse_word_ix1 ON torah_verse_word(num_value);




יְהוָה
select count(*),word,num_value from nanzopco_torah.torah_verse_word 
group by word,num_value
having count(*) > 40

desc nanzopco_torah.torah_verse_word;

alter table torah_verse_word add eng_translation varchar(300);
alter table torah_verse modify verse varchar(600);
alter table torah_verse modify eng_verse varchar(600);
alter table torah_verse modify tran_verse varchar(600);

select * from nanzopco_torah.torah_verse_word  where num_value=666

select * from torah_verse where id in (10620,
11158,
11286,
11622,
11716
);
verse_id,word,tran_word,num_value,created_by

select count(*) from nanzopco_torah.torah_verse where book_id=2

alter table torah_verse add num_value int;


alterr table nanzopco_torah.torah_book convert to character set utf8 collate utf8_general_ci;
alter table nanzopco_torah.torah_verse convert to character set utf8 collate utf8_general_ci;
alter table nanzopco_torah.torah_verse_word convert to character set utf8 collate utf8_general_ci;
delete from nanzopco_torah.torah_verse where book_id =1
delete from torah_verse_word where id > 0



ALTER TABLE nanzopco_torah.torah_book MODIFY COLUMN id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE nanzopco_torah.torah_verse MODIFY COLUMN id INT NOT NULL AUTO_INCREMENT;
ALTER TABLE nanzopco_torah.torah_verse_word MODIFY COLUMN id INT NOT NULL AUTO_INCREMENT;

ALTER TABLE `torah_verse`
	DROP FOREIGN KEY `torah_verse_fk1`;
ALTER TABLE `torah_verse_word`
	DROP FOREIGN KEY `torah_verse_word_fk1`;
    
ALTER TABLE torah_verse
ADD CONSTRAINT torah_verse_fk1
FOREIGN KEY (book_id) REFERENCES torah_book(id);

ALTER TABLE torah_verse_word
ADD CONSTRAINT torah_verse_word_fk1
FOREIGN KEY (verse_id) REFERENCES torah_verse(id); 

jps_tanakh
CREATE TABLE IF NOT EXISTS `nanzopco_torah`.`jps_tanakh` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `page` INT NOT NULL,
  `book_name` VARCHAR(50) NOT NULL,
  `chapter` INT NOT NULL,
  `verse_x` INT NOT NULL,
  `verse_y` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
alter table nanzopco_torah.jps_tanakh convert to character set utf8 collate utf8_general_ci;