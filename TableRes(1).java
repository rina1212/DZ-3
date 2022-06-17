package com.step.matiul.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/testTable3"})
public class TableRes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link rel=\"stylesheet\" href=\"/resource/Style.css\" type=\"text/css\"/>\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"parallaks\">\n" +
                "    <div class=\"gupovka\">\n" +
                "        <div id=\"background\" class=\"nasloyene\">\n" +
                "            <div class=\"img1\"><img src=\"https://phonoteka.org/uploads/posts/2021-04/1618489210_2-phonoteka_org-p-dlinnii-fon-dlya-saita-2.jpg\"></div>\n" +
                "        </div>\n" +
                "        <h2>Таблица умножения с </h2>\n" +

                "        <h2> "+  req.getSession().getAttribute("number") +"</h2>\n" +
                "\n" +
                MultiplicationTable.getMultiplicationTable(req,"number") +
                "<div class=\"citata\">\n" +
                "        <form action=\"/testTable3\" method=\"get\">\n" +
                "            <span class=\"class\">\n" +
                "        <p>  Программирование сегодня — это гонка разработчиков программ, стремящихся писать программы с большей и лучшей идиотоустойчивостью, и вселенной, которая пытается создать больше отборных идиотов. Пока вселенная побеждает.\n" +
                "\n" +
                "            Rick Cook </p>\n" +
                "                </span>\n" +
                "            <span class=\"class\">\n" +
                "        <p>Для меня долгое время было загадкой, как что-то очень дорогое и технологичное может быть столь бесполезным. И вскоре я осознал, что компьютер — это глупая машина, обладающая способностями выполнять невероятно умные вещи, тогда как программисты — это умные люди, у которых талант делать невероятные глупости. Короче, они нашли друг друга.\n" +
                "\n" +
                "            Bill Bryson</p>\n" +
                "                </span>\n" +
                "            <span class=\"class\">\n" +
                "        <p>\n" +
                "            Программы должны писаться для людей, которые будут их читать, а машины, которые будут эти программы исполнять — второстепенны.\n" +
                "\n" +
                "            Harold Abelson\n" +
                "        </p>\n" +
                "                </span>\n" +
                "    <span class=\"class\">\n" +
                        "        <p>\n" +
                        "            Если бы в Java действительно работала сборка мусора, большинство программ бы удаляли сами себя при первом же запуске.\n" +
                        "\n" +
                        "Robert Sewell\n" +
                        "        </p>\n" +
                        "                </span>\n"+
                "        </form>\n" +
                "        </div>\n"+

                "</div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}
