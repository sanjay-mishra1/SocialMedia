package widget;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FriendRequest {
 		 
		PrintWriter out;
		public FriendRequest(PrintWriter out){
			this.out=out;
			
		}
		public void startWidget(){
			out.println("<div class='ExtraContent' id='extra'>"+
			"Friend Requests\n"+
		      "<input type='text'>\n"+
		      "<input type='submit' value='See All'>\n");
			}
		
		public void endWidget(){
			out.println("</div>\n");
		}
		 
		public void loadFriendRequest(String profileImage,String name,int mutualFriends,char response ){
			String data="";
			 
			 {
			data="<div class='profile' id='account'>\n"+
					 "       <div class='avatar'>\n"+
					  "        <img src='"+profileImage+"' alt='' />\n"+
					   "     </div>\n"+
					    "    <div class='profile-name'>\n"+
					     "     <h5><a href='"+"link"+"' target='_blank'>"+name+"</a></h5>\n"+
					      "    <span class='sub'>"+mutualFriends+" mutual friends</span>\n"+
					       " </div>\n"+
					      "</div>\n";	
			}
			 
			out.println(data);
				
	}

}
