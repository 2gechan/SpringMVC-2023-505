# Spring MVC + Spring Security 프로젝트
* 이 프로젝트에서는 dependencies의 version 관리를 BOM(Bill of Materials)를 사용하여 dependenciesManagement를 통해서 실행한다.

- pom.xml에 다음 항목을 설정한다.
```xml
<dependencyManagement>
	<dependencies>
		
	</dependencies>
</dependencyManagement>
```
- Management 항목에 Spring Framework BOM 과 Spring Security BOM을 추가한다.

- 완성된 dependencyManagement
```xml
	<dependencyManagement>
		<dependencies>
			<!-- https://mvnrepository.com/artifact/org.springframework/spring-framework-bom -->
			<dependency>
				<groupId>org.springframework</groupId>
				<artifactId>spring-framework-bom</artifactId>
				<version>${org.springframework-version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
			<dependency>
				<groupId>org.springframework.security</groupId>
				<artifactId>spring-security-bom</artifactId>
				<version>${org.springframework-version}</version>
			</dependency>
		</dependencies>
	</dependencyManagement>
```

## Spring Security Dependencies 설정
- `spring-security-config`, `spring-security-core`, `spring-security-web`, `spring-security-taglibs`

## Spring Security 현재 version을 원활하게 사용하기 위하여 Servlet 관련 dependencdies를 변경하자

## Spring Data-JPA 초기화 정책
- Spring-Data 프로젝트는 SQL을 가급적 사용하지 않고, Java의 DataClass(Dto, VO)와 연동하여 Object-Relation-Mapping 형태로 DMBS의 CRUD를 구현하는 프로젝트
- `<prop key="hibernate.hbm2ddl.auto">create</prop>`
- `create` : 프로젝트가 시작될 때 기존의 Table을 모두 DROP 하고 새로운 Table Create 하는 정책
- `create-drop` : 프로젝트가 시잘될 때 기존 Table을 모두 DROP 하고 Table을 Create, 그리고 프로젝트가 종료될 때 또 한번 Table을 DROP
- `Update` : Alter Table을 실행하여 기존 Table Schema 구조를 변경한다
- `none` : Table과 관련하여 아무런 정책도 수행하지 않기
- `validate` : 기존의 Table과 새로운 Data Class를 비교하여 차이가 있으면 프로젝트에서 Exception을 발생하고 진행 중단