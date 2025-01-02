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
                  background-color: pink;
                  border: 1px solid #ccc;
                  border-radius: 8px;
                  padding: 50px;
                  width: 600px;
                  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
              }


 </style>

<form action="cricket" method="post" onSubmit="return validation()">
Team Name : <input type="text" name="team_name" class="form-control" id="name"/>
<span id="spanname" style = "color: red;"></span><br>
Team Captain : <input type="text" name="Captain" class="form-control" id="captain"/>
<span id="spanCaptain" style = "color: red;"></span><br>
Team country : <input type="text" name="country" class="form-control" id="country"/>
<span id="spancountry" style = "color: red;"></span><br>
Team owner : <input type="text" name="owner" class="form-control" id="owner"/>
<span id="spanowner" style = "color: red;"></span><br>
Team ambassador : <input type="text" name="ambassador" class="form-control" id="ambassador"/>
<span id="spanambassador" style = "color: red;"></span><br>
Team budget : <input type="text" name="budget" class="form-control" id="budget"/>
<span id="spanbudget" style = "color: red;"></span><br>
Team total players : <input type="number" name="players" class="form-control" id="players"/>
<span id="spanplayers" style = "color: red;"></span><br>
Team extra players : <input type="number" name="extra_players" class="form-control" id="extra"/>
<span id="spanextra" style = "color: red;"></span><br>
<button type="submit" class="btn btn-Success" >Submit</button><spam></spam>
<button type="reset" class="btn btn-primary" >Clear</button><spam></spam>
<a href="cricket" class="btn btn-Warning" >View All</a>

</form>


<h5>${message}</h5>

<script>
 function validation(){
    validate = true;

     const name = document.getElementById("name").value;
     if(!name.trim()!=""){
     document.getElementById("spanname").innerHTML="Please Enter the name";
     validate = false;
     }else {
       document.getElementBy("spanname").innerHTML="";
     }

     const captain = document.getElementById("captain").value;
     if(!captain.trim() != ""){
     document.getElementById("spanCaptain").innerHTML="please Enter the captain name";
     validate=false;
     }else{
     document.getElementById("spanCaptain").innerHTML="";
     }

     const country = document.getElementById("country").value;
     if(!country.trim() != ""){
     document.getElementById("spancountry").innerHTML="please enter the country ";
     validate=false;
     }else{
     document.getElementById("spancountry").innerHTML="";
     }

     const owner = document.getElementById("owner").value;
     if(!owner.trim() != ""){
     document.getElementById("spanowner").innerHTML="please enter the owner name";
     validate=false;
     }else{
     document.getElementById("spanowner").innerHTML="";
     }

     const ambassador = document.getElementById("ambassador").value;
     if(!ambassador.trim() != ""){
     document.getElementById("spanambassador").innerHTML="please enter the ambassador";
     validate=false;
     }else{
     document.getElementById("spanambassador").innerHTML="";
      }

       const budget = document.getElementById("budget").value;
       if(!budget.trim() != ""){
       document.getElementById("spanbudget").innerHTML="please enter the budget";
       validate=false;
       }else{
       document.getElementById("spanbudget").innerHTML="";
       }

       const players = document.getElementById("players").value;
       if(!players.trim() != ""){
       document.getElementById("spanplayers").innerHTML="please enter the total players";
       validate=false;
       }else{
       document.getElementById("spanplayers").innerHTML="";
       }

       const extra = document.getElementById("extra").value;
       if(!extra.trim() != ""){
       document.getElementById("spanextra").innerHTML="please enter the  extra players";
       validate=false;
       }else{
       document.getElementById("spanextra").innerHTML="";
       }
  return validate;

}
</script>
</body>
</html>