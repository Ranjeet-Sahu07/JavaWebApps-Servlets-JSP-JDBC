import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    
    // Hardcoded credentials for validation
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get parameters from request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // HTML response header
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Result</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
        out.println(".result-container { background-color: white; padding: 40px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); text-align: center; }");
        out.println(".success { color: #4CAF50; }");
        out.println(".error { color: #f44336; }");
        out.println("a { display: inline-block; margin-top: 20px; padding: 10px 20px; background-color: #2196F3; color: white; text-decoration: none; border-radius: 5px; }");
        out.println("a:hover { background-color: #0b7dda; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='result-container'>");
        
        // Validate credentials
        if (username != null && password != null) {
            if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                out.println("<h2 class='success'>Login Successful!</h2>");
                out.println("<p>Welcome, " + username + "!</p>");
                out.println("<p>You have been successfully authenticated.</p>");
            } else {
                out.println("<h2 class='error'>Login Failed!</h2>");
                out.println("<p>Invalid username or password.</p>");
                out.println("<p>Please try again.</p>");
            }
        } else {
            out.println("<h2 class='error'>Error!</h2>");
            out.println("<p>Username and password are required.</p>");
        }
        
        out.println("<a href='index.html'>Back to Login</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
