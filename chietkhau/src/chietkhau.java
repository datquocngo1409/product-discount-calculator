import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "chietkhau", urlPatterns = "/display-discount")
public class chietkhau extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String productDecription = request.getParameter("productdecription");
        String listPrice = request.getParameter("listprice");
        String discountPercent = request.getParameter("discountpercent");
        double result = Double.parseDouble(listPrice) * Double.parseDouble(discountPercent) * 0.1;

        writer.println(
                "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Product Discount Calculator</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "  <form action=\"/display-discount\" method=\"post\">\n" +
                        "    Product Decription: <br>\n" +
                        "    <input height=\"30\" width=\"400\" name=\"productdecription\" value=\"" + productDecription + "\" placeholder=\"productdecription\">\n" +
                        "    <br>List Price: <br>\n" +
                        "    <input height=\"30\" width=\"400\" name=\"listprice\" value=\"" + listPrice + "\" placeholder=\"listprice\">\n" +
                        "    <br>Discount Percent: <br>\n" +
                        "    <input height=\"30\" width=\"400\" name=\"discountpercent\" value=\"" + discountPercent + "\" placeholder=\"discountpercent\">\n" +
                        "    <br>\n" +
                        "    <input type=\"submit\" name=\"Submit\" height=\"30\" width=\"60\" value=\"Submit\">\n" +
                        "    <input height=\"30\" width=\"400\" name=\"result\" value=\"" + result + "\" placeholder=\"result\">\n" +
                        "  </form>\n" +
                        "</body>\n" +
                        "</html>"
        );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println(
                "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Product Discount Calculator</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "  <form action=\"/display-discount\" method=\"post\">\n" +
                        "    Product Decription: <br>\n" +
                        "    <input height=\"30\" width=\"400\" name=\"productdecription\" value=\"\" placeholder=\"productdecription\">\n" +
                        "    <br>List Price: <br>\n" +
                        "    <input height=\"30\" width=\"400\" name=\"listprice\" value=\"\" placeholder=\"listprice\">\n" +
                        "    <br>Discount Percent: <br>\n" +
                        "    <input height=\"30\" width=\"400\" name=\"discountpercent\" value=\"\" placeholder=\"discountpercent\">\n" +
                        "    <br>\n" +
                        "    <input type=\"submit\" name=\"Submit\" height=\"30\" width=\"60\" value=\"Submit\">\n" +
                        "  </form>\n" +
                        "</body>\n" +
                        "</html>"
        );
    }
}
