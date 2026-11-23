import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FeedbackServlet extends HttpServlet {

    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String type = request.getParameter("type");
        String comments = request.getParameter("comments");

        String date = LocalDateTime.now().format(
            DateTimeFormatter.ofPattern(
                "dd-MM-yyyy HH:mm:ss"
            )
        );

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Thank you, " +
            escape(name) + " for your feedback!</h2>");
        out.println("<p>Email: " +
            escape(email) + "</p>");
        out.println("<p>Feedback Type: " +
            escape(type) + "</p>");
        out.println("<p>Comments: " +
            escape(comments) + "</p>");
        out.println("<p>Date and Time: " +
            escape(date) + "</p>");
        out.println("</body></html>");
    }

    private String escape(String value) {
        if (value == null) return "";
        return value.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#39;");
    }
}
