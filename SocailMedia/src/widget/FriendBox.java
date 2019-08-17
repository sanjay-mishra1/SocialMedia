package widget;


 
 
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class FriendBox {

  		 
		PrintWriter out;
		public FriendBox(PrintWriter out){
			this.out=out;
			
		}
		public void startWidget(){
			out.println(" <div class='chat' id='content-scroll1'>\n");
			}
		
		public void endWidget(){
			out.println("</div>\n");
		}
		 
		public void createFriendWidget(String profilename,String userimage,char response){
			String data="";
			
			 {	
			  data="<div class='profile' id='account'>\n"+
        "<div class='circular-avatar'>\n"+
        "  <img src='"+userimage+"' alt='' />\n"+
       " </div>\n"+
       " <div class='circularprofile-name'>\n"+
       "   <h5><a href='link' target='_blank'>"+profilename+"</a></h5>\n"+
      "      </div>\n"+
      "</div>\n";
		}
			   
			out.println(data);
				
	}

}
