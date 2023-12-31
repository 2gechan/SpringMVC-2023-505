# Spring Server Application File Upload
- HTML에서 파일을 선택하여 Server로 업로드를 할 때, form에서 POSt 방식으로 업로드를 한다.
- 원래 form에서 Server로 보내는 데이터는 Text 데이터이다. 이 Text Data는 http 프로토콜의 body(payload)에 담겨서 encoding이 되어 전송된다.
- form에서 `type="file"` 형식의 input tag를 이용하여 binary 파일을 업로드하면 데이터가 body에 담기고 encoding이 되는데 이 과정에서 binary 파일이 깨져버린다.
- 그래서 HTML 에서는 form의 전송되는 데이터에 새로운 규격을 추가했다 Text type의 데이터와 None Text type 데이터를 같이 묶음으로 하여 Server로 전송할 수 있도록 form에 속성을 추가하였다.
- form에 `type="file"` 속성이 있는 input tag가 있으면 form tag에 `enctype="multipart/form-data"`라는 속성을 첨가해야 한다.
- form `enctype="multipart/form-data"`라는 속성이 첨가되어 있으면 HTML 데이터를 전송하는 http 프로토콜이 종전의 form 데이터를 전송하는 방법과 달리 작동한다.
- form의 `enctype="multipart/form-data"`는 text 데이터와 none text 데이터를 하나의 프로토콜 payload에 묶어서 보내는 html의 규격이다.

## Spring Controller에서 multipart/form-data 받기
- Spring Controller(Dispatcher Servlet)는 form에서 전달되는 모든 데이터를 Text로만 인식한다.
- form에서 아무리 `multipart/form-data` 형식으로 데이터를 보내도 Spring Controller에서는 그러한 데이터를 수신(인식)하지 못한다.
- Spring Project에서 파일 업로드 기능을 구현하기 위해서는 다음의 2가지 dependency를 설치해야 한다.
- 현재 `commons-fileupload` 최신버전인 1.5 버전을 사용할 경우는 `commons-io`를 같이 설치하지 않아도 된다.
- `commons-fileupload` `1.5`버전을 설치하면 `commons-io` 2.11.0 버전이 의존성 관계에 적합한 도구로 자동 설치된다.

```xml
<!-- https://mvnrepository.com/artifact/commons-fileupload/commons-fileupload -->
<!-- 2023.07.12 현재 -->
<dependency>
	<groupId>commons-fileupload</groupId>
	<artifactId>commons-fileupload</artifactId>
	<version>1.5</version>
</dependency>

<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
<dependency>
	<groupId>commons-io</groupId>
	<artifactId>commons-io</artifactId>
	<version>2.13.0</version>
</dependency>
```

## Spring Project에서 파일 업로드를 하기 위한 `context` 설정
- 파일의 업로드 허용 크기를 지정하여 bean을 하나 생성해 두면 된다.
- 생성한 bean을 직접 핸들링 하지 않고, 이 bean은 Dispatcher Servlet이 알아서 사용하는 bean
- `root-context.xml`을 사용하여 전역적(global public) 세팅을 수행한다.