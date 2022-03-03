/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TagPersonalizados;
    import java.io.IOException;
    import java.io.StringWriter;
    import java.time.LocalDateTime;
    import javax.servlet.jsp.JspException;
    import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 *
 * @author LyrisseC
 */
public class TagCuerpo extends SimpleTagSupport{
    StringWriter s = new StringWriter();
    @Override
    public void doTag() throws JspException, IOException{
        getJspBody().invoke(s);
        getJspContext().getOut().println("Hola! Mi nombre es: "+s.toString()+" y estamos a: "+LocalDateTime.now());
    }
}
