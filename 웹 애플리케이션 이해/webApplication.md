<h1>웹 서버와 웹 애플리케이션 서버</h1><blockquote></blockquote>
모두 HTTP기반으로 동작하며 웹 서버는 정적 리소스를 제공하고 앱 애플리케이션은 애플리케이션 로직을 수행한다.

<h2>웹 서버(Web Server)</h2>
<ul>          
    <li>정적 리소스와 기타 부가기능을 제공한다.</li>
    <li>HTML, CSS, JS, 이미지, 영상</li>
    <li>예) NGINX, APACHE</li>
</ul>

<h2>웹 애플리케이션 서버(WAS - Web Application Server)</h2>
<ul>
    <li>웹 서버 기능을 포함한다.</li>
    <li>프로그램 코드를 실행해서 애플리케이션 로직을 수행을 한다.</li>
        <ul>
            <li>동적 HTML, HTTP API(JSON)</li>
            <li>서블릿, JSP, 스프링 MVC</li>
        </ul>
    <li>예) 톰캣(Tomcat) Jetty, Undertow</li>
</ul>

<h2>웹 서버와 웹 애플리케이션 서버(WAS) 차이</h2>
<ul>
    <li>주로 웹 서버는 정적 리소스(파일), WAS는 애플리케이션 로직을 담당한다.</li>
    <li>웹 서버와 WAS 둘다 정적 리소스와 프로그램을 실행하는 기능이 있지만<br> WAS는 애플리케이션 코드를 실행하는데 더 특화 되있다.</li>
</ul>

<h2>웹 시스템 구성 - WAS, DB</h2>
<ul>
    <li>WAS가 너무 많은 기능을 담당하고 있어 서버 과부화가 우려된다.</li>
    <li>WAS 장애시 오류 화면도 노출이 불가능하다.</li>
</ul>

<blockquote>이러한 문제 때문에 일반적으로 WEB, WAS, DB 구성을 쓴다.</blockquote>

<h2>웹 시스템 구성 - WEB, WAS, DB</h2>
<ul>
    <li>정적 리소스는 WEB 서버가 처리한다.</li>
        <blockquote>WAS, DB 장애시 WEB 서버가 오류화면 HTML을 제공한다.</blockquote>
    <li>애플리케이션 로직은 WAS가 처리한다.</li>
</ul>
<blockquote>효율적인 리소스 관리를 위해서 정적 리소스가 많이 쓰이면 WEB 서버 증설, 애플리케이션 리소스가 많이 쓰이면 WAS 증설</blockquote>







