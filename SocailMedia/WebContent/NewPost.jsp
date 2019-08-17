<div class="Cnt_Layout">
       
          <div class="Sections New_Post">
            <div class="Body">
              <div id="WritePost" class="cnt_write_post">
                <div class="cnt_new_written">
                  <div class="img_avatar post" style="background-image: url(http://themes.themewaves.com/nuzi/wp-content/uploads/sites/4/2013/05/Team-Member-3.jpg);"></div>
                  <textarea type="text" id="FieldTxtNewPost" class="txt_post" placeholder="Say something..." onkeyup="HeightContentTxt(this)"></textarea>    
                <button type="button" class="btn submit"><i class="fa fa-paper-plane"></i></button>              
                </div>
                <div class="cnt_more_files_post">
                  <div class="file_post palette_colors">
                    <button id="BtnOpenClose_PaletteColors" class="btn add_more palette" onclick="BtnOpenClose_PaletteColors(this)" value="hide">
                      <i class="fa fa-palette"></i>
                    </button>              
                    <ul id="ListColorsPalette" class="list_colors_palette">
                      <li id="ColorPaletteR1" class="option_color" onclick="SelectColorPalette(this)"></li>
                      <li id="ColorPaletteR2" class="option_color" onclick="SelectColorPalette(this)"></li>
                      <li id="ColorPaletteR3" class="option_color" onclick="SelectColorPalette(this)"></li>
                      <li id="ColorPaletteR4" class="option_color" onclick="SelectColorPalette(this)"></li>
                      <li id="ColorPaletteR5" class="option_color" onclick="SelectColorPalette(this)"></li>
                    </ul>                 
                  </div>
                  <div class="file_post tag_friend">              
                    <button class="btn add_more">
                    <i class="fa fa-user-plus"></i>
                    <span class="bubble title">
                      Tag Friends
                    </span> 
                  </button>
                  </div>
                  <div class="file_post emoji_fellings">                
                  <button class="btn add_more">
                    <i class="far fa-smile"></i>
                    <span class="bubble title">
                     Emoji
                    </span> 
                  </button>
                  </div>                
                  <div class="file_post image_video">                
                    <button class="btn add_more">
                    <i class="fa fa-image"></i>
                    <span class="bubble title">
                      Image / Video
                    </span>                 
                  </button>
                  </div>              
                  <div class="file_post live_transmition">                
                    <button class="btn add_more">
                    <i class="fa fa-video"></i>
                    <span class="bubble title">
                      Live
                    </span>                 
                  </button>
                  </div>                
                </div>
              </div>         
            </div>
          </div>
          <div class="Sections Feed">
            <div class="Feed_Body"></div>
          </div>        
        </div>
        <script>
        //Asignar altura a culquier textarea con altura dinamica
        function HeightContentTxt(e) {
          e.style.height = "1px";
          e.style.height = (e.scrollHeight)+"px";  
        }

        //Mostrar menu de opciones que se pueden publicar
        $("#FieldTxtNewPost").focus(function(){
          
          $(".cnt_more_files_post").fadeIn();    

        })

        //Boton para abrir y cerrar section de paleta de colores
        function BtnOpenClose_PaletteColors(e){
          
          if($(e).val() == "hide"){
            
            $("#ListColorsPalette").fadeIn();
            $(e).val("show")
            $(e).html('<i class="fa fa-times"></i>');
            
            $("#BtnOpenClose_PaletteColors").removeClass("applied_color");    
            CreateArrayGradients();

          }else if($(e).val() == "show"){
          
            $("#ListColorsPalette").fadeOut();    
            $(e).val("hide")
            $(e).html('<i class="fa fa-palette"></i>');  
            
            $("#WritePost").css({"background": "white"});
            $("#FieldTxtNewPost").removeClass("change_placeholder"); 

            $("#BtnOpenClose_PaletteColors").removeClass("applied_color");        
          }
        }

        //Creamos degradados
        function CreateGradients(){
          
          var rgb1 = Math.floor(Math.random() * 255) 
          var rgb2 = Math.floor(Math.random() * 255) 
          var rgb3 = Math.floor(Math.random() * 255) 

          color1 = "rgb(" + rgb1 + "," + rgb2 + "," + rgb3 + ")";
          color2 = "rgb(" + rgb1 + "," + rgb2 + "," + rgb2 + ")";
          
          gradient = "linear-gradient(120deg,"+color1+", "+color2+ " )";
          
          return gradient;
        }

        //Creamos array de degradados
        function CreateArrayGradients() {
          var ListColorsPalette = $("#ListColorsPalette li.option_color");  
          var array_gradients= [];  
                  
          for (var i = 0; i < ListColorsPalette.length; i++) {    
            
            var li_option_color_id = $(ListColorsPalette[i]).attr("id")      
            
            array_gradients.push(CreateGradients());      
            
            $("#"+li_option_color_id).css({"background": array_gradients[i]});
         
          }      
        }

        //Parseamos el color a elemento #WritePost
        function SelectColorPalette(e){ 
          $("#BtnOpenClose_PaletteColors").addClass("applied_color");  
          $("#WritePost").css({"background": $(e).css('background')});
          $("#FieldTxtNewPost").addClass("change_placeholder"); 
        }
        </script>

