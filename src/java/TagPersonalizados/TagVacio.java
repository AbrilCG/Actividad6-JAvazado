/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TagPersonalizados;
/**
 *
 * @author LyrisseC
 */
import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagVacio extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException,IOException{
        JspWriter out = getJspContext().getOut();
        out.println("Lyrisse Abril Cavazos Gonzalez" + LocalDateTime.now());
    }
}
