import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class FileEchoer extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        	InputStream ins = null; // raw byte-stream
			Reader r = null; // cooked reader
			BufferedReader br = null; // buffered for readLine()
			try {
    			String s;
            if (request.getParameter("filename") == null) {
        			System.out.println("No file name");
            } else {
        			String filename = request.getParameter("filename").toString();
               ins = new ByteArrayInputStream(filename.getBytes());
               r = new InputStreamReader(ins, "UTF-8"); // leave charset out for default
    				br = new BufferedReader(r);
    				while ((s = br.readLine()) != null) {
       				System.out.println(s);
    				}
    			}
         }
			catch (Exception e)
			{
    			System.err.println(e.getMessage()); // handle exception
			}
			finally {
    			if (br != null) 
            	{ try { br.close(); } 
         		catch(Throwable t) { /* ensure close happens */ } }
    			if (r != null) 
            	{ try { r.close(); } 
               catch(Throwable t) { /* ensure close happens */ } }
    			if (ins != null) 
            	{ try { ins.close(); } 
               catch(Throwable t) { /* ensure close happens */ } }
			}     
    }
  
}
