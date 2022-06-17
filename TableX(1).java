package com.step.matiul.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/testTable"})
public class TableX extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");// для того, чтобы читал любую кодировку
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link rel=\"stylesheet\" href=\"/resource/Style.css\" type=\"text/css\"/>\n" +
                "    <style>\n" +
                "\n" +
                "</style>\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"parallaks\">\n" +
                "    <div class=\"gupovka\">\n" +
                "        <div id=\"background\" class=\"nasloyene\">\n" +
                "            <div class=\"img1\"><img src=\"https://phonoteka.org/uploads/posts/2021-04/1618489210_2-phonoteka_org-p-dlinnii-fon-dlya-saita-2.jpg\"></div>\n" +
                "        </div>\n" +
                "<h2 >Добро пожаловать в таблицу умножения</h2>\n" +
                "<form action=\"/testTable2\" method=\"get\">\n" +
                "    <p >\n" +
                "        <input type=\"text\" name=\"number\" placeholder=\"Введите число\">\n" +
                "    </p>\n" +
                "    <p>\n" +
                "         <button type=\"submit\" value=\"Подтвердить\">Подтвердить</button>\n" +
                "    </p>\n" +
                "</form>\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

}
