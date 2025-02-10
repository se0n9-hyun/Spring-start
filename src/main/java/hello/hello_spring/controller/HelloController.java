package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // url에 '/hello'가 오면 아래 코드를 실행한다.
    public String hello(Model model) {
        model.addAttribute("data", "hello!!"); // key는 "data"이고, value는 "hello!"이다.
        return "hello"; // resources/templates/hello.html로 이동해서 html파일 실행
    }
}