# SpringMVC DB 연동 Project 
* SpringMVC 프로젝트에서 DB 연동하는 방법은 여러가지가 존재
	기초적인 SQL 을 통한 연동, 미들웨어를 통한 간접 SQL을 통한
	연동, JPA(JAVA Persistance Arch)를 이용한 방법

## SpringMVC + Mybatis 연동
* SpringMVC 프로젝트에서 DB 연동을 하는데 아직까지 가장
	많이 사용되는 방법
* 기본 설정과 DB 연결, SQL 부분을 작성하고 기타 데이터 변환등은
	Mybatis 를 통해 해결하는 방법

## JAVA 와 DB 연동하기
* java 내부에서 사용하는 데이터를 DB 용 데이터로 변환
* DB 에서 전달된 데이터를 Java 변수 type 의 데이터로 변환
* Java 와 DBMS 서버간의 통신 
* Java 와 DB 연동하는데 근본적인 로직이 어려움
* 네트워크, 파일 등등의 지식이 없으면 구현자체가 불가능했음
* JAVA는 DBMS 와 연동하기 위해 `JDBC(JAVA DATABASE CONNECTION)` 이라는
	표준 연결 도구를 선언하고, DBMS 소프트웨어를 만드는 회사들과 협조해
	DB 연동 개발 환경을 많이 개선시킴
* 그럼에도 JAVA 개발자들은 DB 연동에 많은 어려움을 겪음
* `MyBatis(iBatis)`라는 도구를 사용하게 됨으로 실질적인 DB 연동을 위한
	코드량이 1/3 이하로 줄어듦

## Project 에 MyBatis 적용하기
```xml
 spring-jdbc
 mybatis
 mybatis-spring
 commons-dbcp2
 mysql-connector-java // my sql 서버와 연결하는 도구
```