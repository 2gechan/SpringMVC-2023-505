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

- `<prop key="hibernate.hbm2ddl.auto">create</prop>`