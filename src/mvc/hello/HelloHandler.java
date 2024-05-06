package mvc.hello;

import mvc.command.CommandHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloHandler implements CommandHandler {
    @Override
    public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
        req.setAttribute("hello", "안녕하세요!");
        return "/WEB-INF/view/hello.jsp";
    }
}
