
<form action="admindashboard">
</form>
<html>
<body>
  <div id="wrapper" class="">

    <!-- Sidebar -->
    <div id="sidebar-wrapper" class="text-center hidden-xs">
      <br>
      <p>
        <a href="#">
          <i class="fa fa-lg fa-cloud fa-white"></i>
        </a>
      </p>
      <br>
      <p>
        <a href="#">
          <i class="fa fa-check-square-o fa-lg"></i>
        </a>
      </p>
      <div class="bottom">
        <p>
          <i class="fa fa-lg fa-cog"></i></p>

        <div class="profile-popover">
          <a href="#"><i class="fa fa-lg fa-server"></i></a>
          <br>
          <a href="#"><i class="fa fa-lg fa-sign-out"></i></a>
        </div>

        <p><a href="#" id="user-option"><i  class=" fa fa-lg fa-user"></i></a></p>
      </div>

    </div>
    <div id="m-sidebar-wrapper" class="text-center visible-xs">
      <br>
      <p class="text-center m-brand">
        <a href="#">
          <i class="fa fa-lg fa-cloud fa-white"></i>

        </a>
      </p>
      <br>
      <p>
        <a href="#">
          <i class="fa fa-check-square-o fa-lg"></i>
        </a>
      </p>
      <div class="bottom">
        <p>
          <i class="fa fa-lg fa-cog"></i>&nbsp;Settings</p>

        <div class="profile-popover">
          <a href="#"><i class="fa fa-lg fa-server"></i>&nbsp;Settings</a>
          <br>
          <a href="#"><i class="fa fa-lg fa-sign-out"></i>&nbsp;Log Out</a>
        </div>

        <p><i id="m-user-option"  class=" fa fa-lg fa-user pointer"></i>&nbsp;My Profile</p>
      </div>

    </div>

    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
      <section id="header" class="hidden-xs">
        <h1>DashBoard</h1>
      </section>
      <section id="m-header" class="visible-xs">
        <h3><i class="fa fa-bars pointer" id="hamburger"></i> &nbsp;&nbsp;DashBoard</h3>
      </section>
      <div class="container-fluid">
        <div class="row visible-xs">
          <div class="text-center  col-xs-6 ">
            <div class="card">
              <p><i class="fa fa-3x fa-users"></i></p>
              <p>
                <h3>Core HR</h3>
              </p>
            </div>
          </div>
          <div class="text-center col-xs-6 ">
            <div class="card">
              <p><i class="fa fa-3x fa-github"></i></p>
              <p>
                <h3>Onboard</h3>
              </p>
            </div>
          </div>
          <div class="text-center  col-xs-6 ">
            <div class="card">
              <p><i class="fa fa-3x fa-html5"></i></p>
              <p>
                <h3>Directory</h3>
              </p>
            </div>
          </div>
          <div class="text-center  col-xs-6 ">
            <div class="card">
              <p><i class="fa fa-3x fa-users"></i></p>
              <p>
                <h3>Social</h3>
              </p>
            </div>
          </div>
          <div class="text-center  col-xs-6 ">
            <div class="card">
              <p><i class="fa fa-3x fa-dropbox"></i></p>
              <p>
                <h3>Time Off</h3>
              </p>
            </div>
          </div>
          <div class="text-center col-xs-6 ">
            <div class="card">
              <p><i class="fa fa-3x fa-users"></i></p>
              <p>
                <h3>Offboard</h3>
              </p>
            </div>
          </div>
        </div>
        <div class="row hidden-xs">
          <div class="card">
            <p><i class="fa fa-3x fa-users"></i></p>
            <p>
              <h3>Core HR</h3>
            </p>
          </div>
          <div class="card">
            <p><i class="fa fa-3x fa-github"></i></p>
            <p>
              <h3>Onboard</h3>
            </p>
          </div>
          <div class="card">
            <p><i class="fa fa-3x fa-html5"></i></p>
            <p>
              <h3>Directory</h3>
            </p>
          </div>
          <div class="card">
            <p><i class="fa fa-3x fa-users"></i></p>
            <p>
              <h3>Social</h3>
            </p>
          </div>
          <div class="card">
            <p><i class="fa fa-3x fa-dropbox"></i></p>
            <p>
              <h3>Time Off</h3>
            </p>
          </div>
          <div class="card">
            <p><i class="fa fa-3x fa-users"></i></p>
            <p>
              <h3>Offboard</h3>
            </p>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
<style>
body {
	background-color: rgb(220,220,220);
	padding: 0;
	margin: 0;
	font-size: 16px;
	font-family: sans-serif;
  position: relative;
  -webkit-transition: all 0.5s ease;
    -moz-transition: all 0.5s ease;
    -o-transition: all 0.5s ease;
    transition: all 0.5s ease;
}
.white{
  color: white;
}

#wrapper {
    padding-left: 50px;
    -webkit-transition: all 0.5s ease;
    -moz-transition: all 0.5s ease;
    -o-transition: all 0.5s ease;
    transition: all 0.5s ease;
}
@mixin side-style($left, $width) {
    z-index: 1000;
    position: fixed;
    left: $left;
    height: 100%;
    width: $width;
    overflow-y: auto;
    background: #000;
    -webkit-transition: all 0.5s ease;
    -moz-transition: all 0.5s ease;
    -o-transition: all 0.5s ease;
    transition: all 0.5s ease;
}
#sidebar-wrapper {
   @include side-style(0px, 50px);
  .bottom{
    position: absolute;
    bottom: 0px;
    width: 100%;
    display: block;
  }
  .profile-popover{
    background-color: #ddd;
    margin: 10px 2px 15px 2px;
    padding-top: 5px;
    padding-bottom : 5px;
    position: relative;
    display: none;
  }
  .profile-popover::after{
        content: '';
        width: 0;
        height: 0;
        border-style: solid;
        border-width: 14px 14px 14px 14px;
        border-color: #ddd transparent transparent transparent;
        position: absolute;
      left:50%;
    transform: translateX(-50%);
      bottom: -20px;
    
  }
}
#m-sidebar-wrapper{
   @include side-style(-200px, 200px);
   text-align:left;
  padding-left: 20px;
  .m-brand{
    padding-top: 10px;
    padding-bottom:10px;
    backgound-color: gray;
  }
  .bottom{
    position: absolute;
    bottom: 0px;
    width: 100%;
    display: block;
    left:0;
    padding-left:15px;
  }
  .profile-popover{
    background-color: #ddd;
    margin: 10px 3px 15px -12px;
    padding: 5px 10px 5px 5px;
    position: relative;
    display: none;
    
  }
  .profile-popover::after{
        content: '';
        width: 0;
        height: 0;
        border-style: solid;
        border-width: 14px 14px 14px 14px;
        border-color: #ddd transparent transparent transparent;
        position: absolute;
      left:20px;
    transform: translateX(-50%);
      bottom: -20px;
    
  }
}
#m-sidebar-wrapper.active{
  left: 0px;
}


#page-content-wrapper {
    width: 100%;
    position: relative;
  #header{
    background-color: #49bacb;
    padding: 30px 30px;
    margin-bottom: 20px;
    color: white;
  }
  #m-header{
    background-color: #49bacb;
    padding: 10px 10px;
    margin-bottom: 20px;
    color: white;
  }
  .card{
    text-align:center;
    border : 1px solid gray;
    background-color: white;
    padding: 20px;
    border-radius: 5px;
    width: 100%;
  }
  
}

.pointer{
    cursor: pointer;
  }

/*=================================================
============= Customize responsive =================
=================================================*/

@media (min-width: 480px) { 
  #page-content-wrapper{
    .card{
      width: 250px;
      margin-left: 20px;
      float: left;
      margin-bottom: 20px;
    }
  }
}

//extra small device
@media(max-width:768px) {
  #wrapper{
    padding-left: 0px;
  }
  body{
    left:0px;
  }
  body.active{
    left: 200px;
  }
}
</style>
<script>
$(function() {
	  $('#user-option,#m-user-option').click(function(){
	    $(this).parent().prev().toggle();
	  });
	  $('#hamburger').click(function(){
	    $('body, #m-sidebar-wrapper').toggleClass('active');
	  });
	});
</script>