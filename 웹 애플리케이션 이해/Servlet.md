<h2>서버에서 처리해야 하는 업무</h2>
<h3>웹 애플리케이션 서버 직접 구현</h3>
<ul>
  <li>서버 TCP/IP 연결 대기, 소켓 연결</li>
  <li>HTTP 요청 메시지를 파싱해서 읽기</li>
  <li>POST방식, /save URL 인지</li>
  <li>Content-Type 확인</li>
  <li>HTTP 메시지 바디 내용 피싱</li>
  <ul><li>username, age 데이터를 사용할 수 있게 파싱</li></ul>
  <li>저장 프로세스 실행</li>
  <li>비즈니스 로직 실행</li>
  <ul><li>데이터베이스에 저장 요청</li></ul>
  <li>HTTP 응답 메시지 생성 시작</li>
  <ul>
    <li>HTTP 시작 라인 생성</li>
    <li>Header 생성</li>
    <li>메시지 바디에 HTML 생성에서 입력</li>
  </ul>
  <li>TCP/IP에 응답 전달, 소켓 종료</li>
  
</ul>

기존에는 많은 기능들을 직접 구현해왔다.<br>
하지만 너무 비효율적이라서 서블릿이란게 나왔다.

<h3>서블릿을 지원하는 WAS사용</h3>
<ul>
  <li>비즈니스 로직 실행</li>
  <ul><li>데이터베이스에 저장 요청</li></ul>
</ul>

서블릿을 사용하게 되면 비즈니스 로직만 실행하면 된다. 나머지는 서블릿이 모두 구현해준다.


