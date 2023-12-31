# Tiles Layout 설정(pom.xml)
- JSP를 위한 Layout 설정 도구
- tiles를 설정하기 위한 dependencies 설정
- spring 5.x 이상에서는 tiles-extras만 설정해도 기타 필요한 dependency를 모두 import 해준다
- 다만 tiles-extras를 설정한 후 Maven Dependencies에 tiles-core가 함께 import 되었는지 확인할 필요가 있다
- 만약 tiles-core가 import 되지 않았을 경우 tiles-extras와 같은 version의 tiles-core를 설정해 주어야 한다.
```xml
<properties>
		<tiles-version>3.0.8</tiles-version>
	</properties>

	<dependencies>

		<!-- https://mvnrepository.com/artifact/org.apache.tiles/tiles-core -->
		<dependency>
			<groupId>org.apache.tiles</groupId>
			<artifactId>tiles-core</artifactId>
			<version>${tiles-version}</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.apache.tiles/tiles-extras -->
		<dependency>
			<groupId>org.apache.tiles</groupId>
			<artifactId>tiles-extras</artifactId>
			<version>${tiles-version}</version>
		</dependency>

	</dependencies>
```

## InternalResourceViewResolver와 협력관계 설정(tiles-context.xml)
- tiles-context.xml 설정 파일을 appServlet 폴더에 생성한다
```xml
<bean id="iilesConfigurer"
		class="org.springframework.web.servlet.view.tiles3.TilesConfigurer">
		<property name="definitions">
			<list>
				<value>/WEB-INF/spring/tiles-layout/*-layout.xml</value>
			</list>
		</property>
	</bean>

	<bean
		class="org.springframework.web.servlet.view.UrlBasedViewResolver">
		<property name="viewClass"
			value="org.springframework.web.servlet.view.tiles3.TilesView" />
		<property name="order" value="1"></property>
	</bean>
```

- layout.xml 파일 생성(main-layout.xml)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE tiles-definitions PUBLIC
  "-//Apache Software Foundation//DTD Tiles Configuration 3.0//EN"
  "http://tiles.apache.org/dtds/tiles-config_3_0.dtd">

<tiles-definitions>
	<definition name="default"
		template="/WEB-INF/views/home.jsp">

	</definition>
	<definition name="home" extends="default">
		<put-attribute name="main-content" />
	</definition>
</tiles-definitions>
```