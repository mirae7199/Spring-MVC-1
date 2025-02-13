package hello.re_servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // Servlet 자동 등록
@SpringBootApplication
public class ReServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReServletApplication.class, args);
	}

}
