package org.github.Elizaveta.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Hello extends HttpServlet {
    Connection connection = null;

    public Hello() {
        super();
        try {
            /* Заставляем ClassLoader подгрузить класс драйвера в память java. */
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection("jdbc:h2:~/git/hellow/src/main/java/org/github/Elizaveta/hello/helloh2db", "sa", "");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Statement statement = null;
        ResultSet resultSet;
        String resultName = "";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM USERS");
            while (resultSet.next()) {
                resultName += "USER Name: " + resultSet.getString("FirstName") + " " + resultSet.getString("LastName") + "<br>";

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        PrintWriter out = resp.getWriter();
        out.print("<h1>" + resultName + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
