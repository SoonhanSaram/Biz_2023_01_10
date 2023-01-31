# simple WAS Project 

## simple maven project 생성
* sts 에서 maven project 를
선택해 project 생성
*`create a simple project` 를 체크 프로젝트 생성진행
*`group id`, 'artifact id' 를
설정 : project 를 base-package를 설정하는 부분
```
group id : com.kyoungmin
artifact id : contact
```
* artifact id 는 project 의
context 이름이 된다

## pom.xml 에 plugin 설정
* 프로젝트 빌드 할 때 어떤 compiler를 사용할지 결정
```xml plugin 설정
<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<!-- source 와 target 은 가장 중요한 부분 -->
					<source>15</source>
					<target>15</target>
					<!-- 문법검사를 모든 항목에서 수행 -->
					<compilerArgument>-Xlint:all</compilerArgument>
					<showWarnings></showWarnings>
					<showDeprecation></showDeprecation>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

## pom.xml 에 spring framework 설정
* spring framework dependencies 가져오기
* dependency 의 version 정보를 properties 로 설정하기 위해
	아래와 같이 코드 변경
```xml
<properties>
	<!-- 변수 선언 -->
	<org.springframework-version>5.2.22.RELEASE</org.springframework-version>
</properties>
<dependencies>
	<!-- context 와 webmvc는 항상 같이 가져와서 사용 -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${org.springframework-version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${org.springframework-version}</version>
		</dependency>
	</dependencies>
```

* spring framework version properties 설정하기
```xml
<properties>
	<!-- 변수 선언 -->
	<org.springframework-version>5.2.22.RELEASE</org.springframework-version>
</properties>
```


## JSON 데이터 Response
* Ajax(Async JavaScript ann XML) : 비동기 자바스크립트와 XML 의 연동
* VanilaJS 에선 `XMLHttpRequest` 통신이라고 함
* fetch 와 같은 JS 함수가 제공되지 않을 때, XMLHttpRequest를 사용해
	XML 데이터를 주고받는 api 코드를 작성
* 초기 API 코드에선 모든 데이터 type 이 XML 이였다. JS가 발전하면서
	JSON type의 데이터가 점점 늘어나 대세가 됨
* JAVA 를 사용하는 Web Application 에서는 초기에 XML만을 제공하다가
	JSON을 추가함
* JAVA 고유의 기능에선 JSON 지원하지 않음
* JAVA 사용자들로부터 JSON 요구가 많아져 도구가 남발함
* SpringMVC 에서 Client 에게 JSON type 의 데이터를 API형식으로
	Response 하기 위해 `jackson` library 가 탄생
* 초기에 `jackson-databind` 에서 XML을 기본으로 사용했으나,
	시간이 지남에 따라 XML 기능을 별도로 분리함
* XML 기능이 필요한 경우 `jackson-dataformat-xml`을 추가하면 XML Response
	구현할 수 있다
* 이경우 `data-bind`와 `dataformat-xml`을 같이 설치하면 Spring 객체 등을
	Response 할 때 XML type 으로 보낸다

* json 으로 Response 할 지 XML로 Response 할 지 선택해 보낼 수 있다.
```java
	// json으로 Response
	produces = "application/json;charset=UTF-8"

	// xml 로 Response
	produces = "application/xml;charset=UTF-8"
```

## JAVA(Spring)에서 인스턴스변수의 취급
* 인스턴스변수는 클래스영역(멤버영역)에 선언된 변수
* 이 변수는 클래스를 사용해 객체를 생성할 때 초기화된다.
* 객체가 작동되는 동안에 이 변수도 항상 살아있다
* 변수가 살아있다는 것은 그 만큼 메모리공간을 차지하고 있다는 것
	이 것을 리소스 소비라고 한다
* 전혀 사용하지 않는 변수도 객체와 함께 계속 리소스를 
	소비하고 있다는 것이다.
* 인스턴스변수는 특별한 경우가 아니면 `public`	 으로
	선언하지 않는다
* 접근제한자(public, private, protected 등)이 없는 상태로
	선언하지 않아야 한다, 접근제한자가 없으면 
	JAVA 엔진에서 알아서 접근제한자를 붙이는데 조금 특별하게
	변수에 접근하게 된다
* 변수에 접근제한자를 붙이지 않거나, public 으로 선언하면
	메모리 누수 발생이 생길 수 있다
* spring 처럼 다중 사용자에게 서비스 하는 경우 객체가 다수 생성이 될 수 있는데,
	이 때 인스턴스 변수도 객체 개수만큼 무리지어 생성된다
* 이러한 과정에서 많은 메모리 누수가 발생


### '인스턴스변수' 규칙
1. 인스턴스변수는 특별한 경우가 아니면 `private` 또는 `protected` 로
	제한
2.	인스턴스변수는 직접초기화하지 않는다
```java
private Random rnd = new Random()
```
3. 인스턴스변수는 `선언`과 `초기화`를 분리해야 한다.
```java
public class MyClass{
	private String myname; // 선언만
	// 생성자에서 변수 초기화
	public MyClass() {
		this.myname = "";
	}
	public MyClass() {
		this.myname = myname;
	}
}