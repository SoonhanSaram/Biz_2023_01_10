package com.kyoungmin.contact.config;

/*
 * 이 클래스는 Qualifier 를 설정할 때
 * 매직문자열을 사용했을 때 발생하는 오타에 의한 오류를
 * 최소한으로 줄이기 위한 초기값 변수를 설정하는 곳
 * 
 * 클래스와 변수에 static 키워드가 있다
 * static 키워드가 부착된 클래스와 변수는
 * 프로젝트가 start 될 때 만들어져서
 * 별도의 객체를 생성하지 않고
 * 어디든 값을 참조할 수 있다.
 * 
 * 이러한 변수들은 static, final 을 부착한다
 * 
 * 프로젝트 전체에서 사용할 변수를 미리 선언해 놓는 것
 */
public class QualifierConfig {
	public static class ADDR {
		public static final String SERVICE_V1 = "addrservicev1";
		public static final String SERVICE_V2 = "addrservicev2";
	}

	public static class USER {
		public static final String SERVICE_v1 = "uerServiceV1";
		public static final String SERVICE_v2 = "uerServiceV2";
	}
}
