<%@ page isELIgnored = "false" %>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>

<style>
body {
                  font-family: Arial, sans-serif;
                  background-color: #f4f4f4;
                  margin: 0;
                  padding: 0;
                  display: flex;
                  justify-content: center;
                  align-items: center;
                  height: 100vh;
              }
form {
                  background-color: #0dcaf0;
                  border: 1px solid #ccc;
                  border-radius: 8px;
                  padding: 30px;
                  width: 300px;
                  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
              }
</style>

<script>



</script>


<form action="musuem" method="post" class=" needs-validation" onSubmit="return validation()">

Customer Name : <input type="text" name="name" class="form-control" id="name"/>
<span id = "spamName"  style="color: red;" ></span><br>
Adult or child :  <select id="adultchild"  name="adultchild" class="form-select">
                  <option value="">Select the option</option>
                  <option value="adult">adult</option>
                   <option value="child">child</option>
                   </select>
                   <span id = "spamAorC" style="color: red;"></span><br>
Mobile Number : <input type="number" name="mobile"  class="form-control" id="mobile"/>
<span id = "spamMobile"  style="color: red;"></span><br>
Email : <input type="text" name="email"  class="form-control" id="email"/><span></span>
<span id = "spamEmail"  style="color: red;"></span><br>
<button type="submit" class="btn btn-Success" onSubmit="validation()">Submit</button><span></span>
<button type="reset" class="btn btn-primary" >Clear</button><span></span>
<a href="musuem" class="btn btn-Warning" >View All</a>
 <h5>${message}</h5


</form>

<script>
function validation() {

   validate=true;


     const name = document.getElementById("name").value;
     if(!name.trim()!=""){
       document.getElementById("spamName").innerHTML="Please enter the Customer Name";
       validate=false;
     }else{
       document.getElementById("spamName").innerHTML="";
     }

     const adultchild = document.getElementById("adultchild").value;
       if(!adultchild.trim()!=""){
            document.getElementById("spamAorC").innerHTML="Please select the option";
             validate=false;
          }else{
            document.getElementById("spamAorC").innerHTML="";
          }

        const mobile = document.getElementById("mobile").value;
       if(mobile==10 || !mobile.trim()!=""){
             document.getElementById("spamMobile").innerHTML="Please enter the  valid numbers";
              validate=false;
           }else{
             document.getElementById("spamMobile").innerHTML="";
           }

           const email = document.getElementById("email").value;
            if(!email.trim()!=""){
              document.getElementById("spamEmail").innerHTML="Please enter the email";
               validate=false;
            }else{
              document.getElementById("spamEmail").innerHTML="";
            }
 return  validate;
}
</script>
</body>
</html>
