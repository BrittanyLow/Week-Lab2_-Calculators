import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 707114
 */
public class AgeCalculatorServlet extends HttpServlet 
{
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);  
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      String age = request.getParameter("age");
      request.setAttribute("nAge", age);
      
        try 
        {
            int intAge = Integer.parseInt(age);
            int nxAge = intAge +1;
            request.setAttribute("message", "Your age next birthday will be " + nxAge);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); 
        }
        catch (ExceptionInInitializerError e) 
        {
        request.setAttribute("message", "You must give your current age.");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    }

}
