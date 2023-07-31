use rentbookdb;

-- 도서정보.csv import
select * from tbl_books;
select count(*) from tbl_books;
select * from tbl_books limit 10;

-- 회원정보.csv import
select * from tbl_members;
select count(*) from tbl_members;
select * from tbl_members limit 10;

select * from tbl_rent_book;

select * from tbl_rent_book R
left join tbl_members M
	on R.rent_mcode = M.m_code
left join tbl_books B
	on R.rent_bcode = B.b_code;
    
drop table tbl_rent_book;

create table tbl_rent_book(
		RENT_SEQ BIGINT PRIMARY KEY AUTO_INCREMENT,
		RENT_DATE VARCHAR(10) NOT NULL,
		RENT_RETURN_DATE VARCHAR(10) NOT NULL,
		RENT_BCODE VARCHAR(13) NOT NULL,
		RENT_MCODE VARCHAR(6) NOT NULL,
		RENT_RETURN_YN VARCHAR(1),
		RENT_POINT	INT,
		RENT_PRICE INT
		);
        
-- 전체 데이터 중에서 5페이지에서 10개를 보고 싶다
-- 전체 데이터 중에서 1페이지에서 10개 : 0 ~ 9
-- 1페이지 일 경우 시작 값 1이 될려면 (page - 1) * 10

-- 전체 데이터 중에서 2페이지에서 10개 : 10 ~ 19
-- 2페이지 일 경우 시작 값 1이 될려면 (page - 1) * 10

-- 전체 데이터 중에서 2페이지에서 10개 : 20 ~ 29
-- 3페이지 일 경우 시작 값 1이 될려면 (page - 1) * 10

-- 처음 시작에서 10개를 건너뛰고 : OFFSET 10
-- 그위치부터 10개를 select 하라
select * from tbl_books
order by b_code
limit 10  offset 50;

-- 다중검색
select count(*) from tbl_books
where b_name like concat('%', '부자', '%') or
b_name like concat('%', '행복', '%') or
b_name like concat('%', '부동산', '%');