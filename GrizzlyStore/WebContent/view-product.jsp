<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

            <!-- jQuery library -->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            
            <!-- Latest compiled JavaScript -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
ul{
    list-style-type: none;
  margin: 0;
  padding: 0;
  position: relative;
  overflow: hidden;
  background-color: #e0ebeb
;
}
li{
    float: left;
    list-style-type: none;
  margin: 0;
  padding: 14px 50px;
  position: relative;
  overflow: hidden;
  background-color:#e0ebeb
;
}
li img{
    float: left;
    list-style-type: none;
  margin: 0;
  padding: 0px;
  position: relative;
  overflow: hidden;
  background-color: #e0ebeb
;
}
li input{
    float: left;
    list-style-type: none;
  margin: 0;
  padding: 14px 30px;
  position: relative;
  overflow: hidden;
  background-color: gray;
}
/* li:hover{
    background-color: #c2d6d6;
  color: black;   */
/* }
li span:hover{
    background-color: #c2d6d6;
  color: black;  
} */
li span{
    float: left;
    list-style-type: none;
  margin: 0;
  padding: 0;
  position: relative;
  overflow: hidden;
  background-color: white;
}
        </style>
    </head>
    <body style="background-color: white">
        <ul>
            <li><img src="./images/navlogo.PNG" alt="./images/logo.PNG" style="width: 200px; height: 33px;"></li>
            <li><input type="text" placeholder="search" style="width: 120px; height:0.5px  ; border-radius: 10px; background-color: ghostwhite"></li>
            <li style="float: right;"><a href="LogoutServlet" value="logout" style="border-radius: 20px; width: 120px; height: 33px;padding: 5px 5px;">Logout</a></li>
            <li style="float: right;"><font style="height: 50px;"> welcome ${username} </li>
            <li style=" float: right;"><img src="./images/bell.png" alt="" style="width: 20px; height: 33px;"></li>
           
        </ul>
        <div style="height: 400px; width: 100%">
        <div style="height: 400px; width: 300px; float: left; background-color: #e0ebeb ; text-align: center; padding: 0px; margin-top: 50px; margin-left: 30px;">
            <div style="background-color: #d1e0e0; height:40px;">
                <div style="float: left; color: white; padding: 5px 10px; font-size: 30px">PROFILE

            </div>
            <div style="float: right; color: white; padding: 8px 10px; font-size: 20px">EDIT

                </div>
        </div>
            <div style="background-color: #d1e0e0; height:100px; width: 100px; margin-top: 15px;margin-left: 100px;">

            </div>
           Helen Cho <br> <br>ID<br>GRZLY17234<br><br> Designation<br>Sr. Admin<br><br> Office<br> NYC,NY,USA 
        </div>
        <div style="float: right; width=500px; height: 400px; margin-top: 50px; margin-right:400px">
            <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#product"><font size="6">Product</font></a></li>
        <li><a data-toggle="tab" href="#vendor"><font size="6">Vendor</font></a></li>
        </ul>
        <div class="tab-content">
            <div id="product" class="tab-pane fade in active">
        <div style="background-color:#e6f2ff; padding: 0px; height: 400px; width: 500px;">
                <!-- <div style="background-color: #d1e0e0; height:40px;"><font size="6">--><!--</font></div> -->
                
                <!-- <div style="background-color:#d1e0e0; height:240px; width: 200px; margin-top: 45px; margin-left: 25px; border-style: dashed; border-color: white;"> -->
                    <div id="myCarousel" class="carousel slide" style="width: 250px; height: 400px;" data-ride="carousel">
                        <!-- Indicators -->
                        <!-- <ol class="carousel-indicators">
                          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                          <li data-target="#myCarousel" data-slide-to="1"></li>
                          <li data-target="#myCarousel" data-slide-to="2"></li>
                        </ol> -->
                      
                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">
                          <div class="item active">
                            <img src="./images/p1.jpg" style="width: 250px; height: 400px;" alt="Los Angeles">
                          </div>
                      
                          <div class="item">
                            <img src="./images/p2.jpg" style="width: 250px; height: 400px;" alt="Chicago">
                          </div>
                      
                          <div class="item">
                            <img src="./images/p3.jpg" style="width: 250px; height: 400px;" alt="New York">
                          </div>
                        </div>
                      
                        <!-- Left and right controls -->
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                          <span class="glyphicon glyphicon-chevron-left"></span>
                          <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                          <span class="glyphicon glyphicon-chevron-right"></span>
                          <span class="sr-only">Next</span>
                        </a>
                      </div>
                <!-- </div>
        -->
               
                </div>
                </div>
                <div id="vendor" class="tab-pane fade in active">
                <div style=" background-color:white; width: 500px; height: 400px; padding: 0px;">
                    <!-- <div style="background-color:#95b7b7; height:40px;"><font size="6" align="center" color="#d1e0e0">--><!--</font></div> -->
                   
                        Product Description<img src="./images/editicon.jpg" width="25px" height="25 px">
                        
                   

            </div>
            </div>
            </div>
        </div>
       
        </div>
        <div style="float: right; margin-top: 80px; margin-left: 400px; padding: 5px 50px;" >
                <input type="button" value="Finish" style="border-radius: 10px; float:right; width: 100px; background-color: grey"><br><br>
                <input type="button" value="Cancel" style="border-radius: 10px;float: right; width: 100px; background-color: silver;">
                </div>
    </body>
</html>