package widget;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
 public class Post {
	 
	PrintWriter out;
	public Post(PrintWriter out){
		this.out=out;
		
	}
	public void startPost(){
		out.println(" ");
	}
	
	public void endPosts(){
		out.println("</div>");
	}
	public void loadHTMLFrontPostString(){
		
		//loadHTMLPostString(out)+loadHTMLPostString(out)+loadHTMLPostString(out));
		
		
		//load posts
		
		
		//close post div
		
	}
	public void loadPost(long pid,String pMessage,String postImage,String userImage 
			,long pLikes,long pComments,long postTime,String userProfileLink,String userName ){
		System.out.println("username=>"+userName+" img=>"+userImage);
		Date date=new Date(postTime);
        DateFormat format=new SimpleDateFormat("dd MMM yyyy-HH:mm aaa",Locale.ENGLISH);
        //format.setTimeZone(TimeZone.getTimeZone("IN"));
         String dateAndTime[]= format.format(date).split("-");
		String post ="<div class='facebook-box'>\n" +
                "    <div class='content'>\n" +
                "      <div class='right-icon'>\n" +
                "            <i class='material-icons'>keyboard_arrow_down</i>\n" +
                "      </div>\n" +
                "      <div class='row header'>\n" +
                "        <div class='avatar'>\n" +
                "          <img src='"+userImage+"' alt='' />\n" +//user image
                "        </div>\n" +
                "        <div class='name'>\n" +
                "          <h5><a href='"+userProfileLink+"' target='_blank'>"+userName+"</a></h5>\n" +
                "          <span class='sub'>"+dateAndTime[0]+" at "+dateAndTime[1]+"</span>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div class='row text'>\n" +pMessage+//message
                		
                "      </div>\n" +
                "      <div class='row thumbnail'>\n" +//post image
                "        <img src='"+postImage+"' alt='' />\n" +
                "      </div>\n" +
                "      <hr />\n" +
                "  </div>\n" +
                "  <div class='footer'>\n" +//likes
                "    <a href='#'>"+pLikes+" people</a> like this.\n" +
                "    <div class='row'>\n" +
                "      <div class='small-avatar'>\n" +// my image
                "        <img src='"+"here"+"' alt='' />\n" +
                "      </div>\n" +
                "      <div class='write-comment'>\n" +
                "        <input type='text' placeholder='Write your comment...'>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n";
		
		out.println(post);
		
		
	}
	
}
