package com.kyoungmin.contact.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyoungmin.contact.models.BookDto;

/**
 * Dao : Data Access Object DB 와 연결해 SQL 을 만들고,
 * DB에 전송하고
 * 결과를 받아서 Dto(VO) 객체에 담는 일을 수행하는
 * 클래스
 * 
 * interface : 일반 class 와 다른 특징 
 * 		method 의 정의(prototype, 모양, 구조)는 있으나
 * 		실제 코드가 없음
 * interface 를 기반으로 작성된 클래스(implement) 를 
 * 		interface의 구현체 클래스라고 하기도 한다.
 * 
 * 실질적으로 BookDaoImpl 클래스를 생성해
 * 	구체적으로 CRUD를 구현하겠다 라는 예정
 */

public interface BookDao {
	
	
	/**
	 * 전체 데이터를 Select 해 
	 * 그 결과(table)을 List<BookDto> 형태로 변환해
	 * return 
	 * @return
	 */
//	@Select("SELECT * FROM tbl_books")
	public List<BookDto> selectAll();
	
	/**
	 * isbn 값을 parameter 로 전달해
	 * 한개의 도서정보를 Select 하고
	 * 그 결과를 BookDto 형태로 변환해
	 * return 하겠다.
	 * @param isbn
	 * @return
	 */
	@Select("SELECT * FROM tbl_books WHERE isbn = #{isbn}")
	public BookDto findByIsbn(String isbn);
	
	/**
	 *  BookDto 형태로 저장된 데이터를 parameter로 전달해
	 *  DB table 에 insert 를 수행하고 그 결과를 int 형으로 return
	 *  결과는 몇 개의 데이터가 insert 되었는가를 return 
	 * @param bookDto
	 * @return
	 */
	
	public int insert(BookDto bookDto);
	
	/**
	 * Insert, Update 는 Select, Delete 에 비해 코드가 복잡함
	 * SQL 코드가 복잡해 지면 Annotation 기반으로 Query를 작성하기 불편함
	 * 
	 * 이럴때는 mybatis mapper 를 연동해 sql 을 처리할 수 있다.
	 * 
	 * 이 때 정의한 method 의 이름은 mapper 에서 id 로 사용한다
	 * 즉 method 이름과 id가 일치해야 한다
	 * @param bookDto
	 * @return
	 */
	public int update(BookDto bookDto);
	
	@Delete("DELETE FROM tbl_books WHERE isbn = #{isbn}")
	public int delete(String isbn);
	
}
