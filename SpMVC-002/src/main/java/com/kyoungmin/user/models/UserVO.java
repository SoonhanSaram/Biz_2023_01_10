package com.kyoungmin.user.models;

/*
 * 객체 만들기 
 * 추상화 : 꼭 필요한 정보를 가지고 객체 만들기
 * 
 * 사용자 정보를 저장할 객체 생성하기 위한 
 * 클래스 작성
 * 
 * 작성된 클래스 소스를 class prototype 이라 함
 * 
 * 로그인과 회원가입을 하기 위해 필요한 사용자 정보
 * 
 * 로그인 Id, 비밀번호, 실명, 닉네임, 이메일, 전화번호
 * VO(Value Object) = DTO(Data Transfer Object)
 * 별도의 연산 없이 데이터만을 위한 클래스
 * 
 * UserVo 클래스의 각 요소(칼럼, property, 속성)들은
 * 기본 설정으로 private 으로 접근제한을 한다
 * private 설정된 각 요소는 다른 곳에서 직접 접근이 불가능 하다
 * 직접 접근이 불가능 하도록 하는 것은 혹시 모를 데이터의 변형 예방 목적
 */
public class UserVO {

	/*
	 * Java 변수 선언하기 변수의 type keyword가 항상 먼저 나옴 변수명은 첫글자 소문자, 이후 영문대소문자 숫자, _ 합성 가급적
	 * _ 보다는 두 개이상의 단어를 조합해 CamelCase로 작성
	 * 
	 * 이 설정은 객체지향에서 정보은닉이라고 함 은닉된 각 속성에 접근하기 위해 getter 와 setter 를 만들기 setter 는 데이터를
	 * 변수 할당(저장)하기위해 사용 getter 는 변수에 저장된 값을 외부에서 사용하기 위함
	 */

	private String username; // 문자열 변수
	private String password;
	private String realname;
	private String nickname;
	private String email;
	private String tel;
	private int age; // 정수형 숫자 변수

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	/*
	 * age 변수에 값을 저장하는 데 0세부터 100세 까지만 저장하도록 강제하고싶다면
	 * 
	 */
	public void setAge(int age) {
		if (age < 0 || age > 100) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	/*
	 * 기본형 변수를 선언하는 키워드 단순히 데이터를 저장하는 용도로만 사용 int : 정수형 float : 단정도 실수 double : 배정도
	 * 실수 long : 큰 정수형 boolean : 블린형(true/false)
	 * 
	 * wrapper class 형 변수를 선언하는 키워드 변수에 확장기능을 지원하는 용도 integer : 정수형 Float: 단정도 실수
	 * Double : 배정도 실수 Long : 큰 정수형 Boolean : 불린형(true/false)
	 */

}
