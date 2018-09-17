import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 707114
 */
public class ArithmeticCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        request.setAttribute("result", "---"); 
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       String fNum = request.getParameter("nOne");
       String sNum = request.getParameter("nTwo");
       
       request.setAttribute("nOne", fNum);
       request.setAttribute("nTwo", sNum);
       
        try
        {
            int nOne = Integer.parseInt(fNum);
            int nTwo = Integer.parseInt(sNum);
            String result;
            
            switch(request.getParameter("submit"))
            {
                case "+":
                    result = "" + (nOne + nTwo);
                    break;
                case "-":
                    result = "" + (nOne - nTwo);
                    break;                   
                case "*":
                    result = "" + (nOne * nTwo);
                    break;
                case "%":
                    result = "" + (nOne % nTwo);
                    break;
                default:
                    result = "---";
                    break;
            }
        
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);         
        
        } 
        catch (ExceptionInInitializerError e) 
        {
            request.setAttribute("result", "Invalid");  
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 

        }
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);          
    }
        
    
}
