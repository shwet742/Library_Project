
<form action="adminlogout">
<input type="submit" value="Logout">
</form>
<%
out.println(request.getAttribute("msg"));
%>
<html>
<body>
  <div class="container">
    <div class="header-text">
      <img class="header-text-logo" src="https://seeklogo.com/images/E/educational-people-logo-66BC945BD1-seeklogo.com.png" alt="logo">
      
    </div>
    
   </div>
</body>
</html>
<style>
@import url("https://fonts.googleapis.com/css2?family=Fredericka+the+Great&display=swap");

*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100vh;
  font-family: sans-serif;
  font-weight: bold;
  background: url("https://image.freepik.com/free-vector/back-school-wallpaper_23-2148606153.jpg") no-repeat center center fixed;
  background-size: cover;
}

.container {
  background-color: #fff;
  width: 650px;
  border-radius: 50%;
  border: 4px solid #eaf4fb;
}

form {
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding: 0px 120px 100px 120px;
  
}

input {
  height: 45px;
  padding: 10px;
  border-radius: 4px;
  border: 1px solid #E6E6F0 ;
  background-color: #FAFAFC;
}

input + input {
  margin-top: 15px;
}

input::placeholder {
  color: #9C98A6;
}

button {
  margin-top: 20px;
  height: 45px;
  background: #f14e54;
  border: 0;
  border-radius: 4px;
  color: #ffffff;
  font-size: 16px;
  font-weight: 600;
  cursor: pointer;
  text-transform: uppercase;
  margin-bottom: 10px;
}

.header-text {
  display: flex;
  flex-direction: column;
  margin-top: 10px;
  width: 100%;
  z-index: 2;
  padding: 0px 90px 0px 90px;
}

.header-text-logo{
  color: #000;
  margin-bottom: 16px;
  opacity: 1;
  margin-top: 7%;
  margin-bottom: 3%;
  background-size: contain;
  background-repeat: no-repeat;
  background-position: center;
  text-align: center;
  width: 250px;
  margin-left: 23%;
}

.header-text-description{
  display: inherit;
  color: #242d34;
  font-size: 2rem;
  font-weight: 400;
  line-height: 24px;
  margin: 25px 0 40px 0;
  align-self: center;
  font-family: 'Fredericka the Great',cursive;
}

</style>
