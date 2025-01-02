<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Milk Form</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

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
                  width: 300px;
                  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
              }

              pre {
                  font-family: inherit;
                  margin: 0;
              }

              select, input[type="number"], input[type="submit"], input[type="reset"] {
                  width: 90%;
                  padding: 8px 12px;
                  margin-bottom: 10px;
                  border: 1px solid #ccc;
                  border-radius: 4px;
                  font-size: 14px;
              }

              input[type="submit"], input[type="reset"] {
                  width: 48%;
                  margin-right: 2%;
                  background-color: #007bff;
                  color: #fff;
                  border: none;
                  cursor: pointer;
                  transition: background-color 0.3s ease;
              }

              input[type="submit"]:hover, input[type="reset"]:hover,  {
                  background-color: #0056b3;
              }

              input[type="reset"],  {
                  background-color: #dc3545;
                  margin-left: 2%;
              }


              input[type="reset"]:hover {
                  background-color: #b02a37;
              }

              h1 {
                  text-align: center;
                  color: #333;
              }


</style>





<script>
         function updateField(){
            const brand = document.getElementById("brand").value;
            const options = {
                nandini : ["Select The Type","special", "ordinary", "good life", "good life lite", "family", "buffalo"],
                ammul : ["Select The Type","normal", "gold full cream", "lactose free", "taaza"]
            };

            const secondField = document.getElementById("type");
            secondField.innerHTML = "";

            if(options [brand]){
               options[brand].forEach(item => {
                   const option = document.createElement("option");
                   option.value = item.toLowerCase();
                   option.textContent = item;
                   secondField.appendChild(option);
               });
            }
         }

</script>




<form action="Milk" method="post" onSubmit="return validation()">

Brand :
       <select id="brand" name="brand" onchange="updateField()">
          <option value="">Select The Brand</option>
          <option value="nandini">Nandini</option>
          <option value="ammul">Ammul</option>
       </select>
       <span id="brandName" style = "color: red;"></span>
Type  :
        <select id="type" name="type">
            <option value=""></option>
        </select>
          <span id="brandType" style = "color: red;"></span>

Quantity :
         <input id="quantity" type="number" name="quantity" />
           <span id="brandQuantity"style = "color: red;"></span>

<input type="submit" value="Submit" onSubmit="validation()"/><input type="reset" value="Clear"/>
<a href = "Milk" >View All</a>



<div>
<h5>${message}</h5>
</div>

</form>





<script>

function validation(){

    validate=true;
    const brand = document.getElementById("brand").value;
    if(!brand.trim() != ""){
     document.getElementById("brandName").innerHTML="Please select the brand";
     validate=false;
    }else{
    document.getElementById("brandName").innerHTML="";
    }

         const type = document.getElementById("type").value;
         if(!type.trim() != ""){
         document.getElementById("brandType").innerHTML="Please select the type";
             validate=false;
             }else{
             document.getElementById("brandType").innerHTML="";
             }
         const quantity = document.getElementById("quantity").value;
         if(quantity <= 0){
         document.getElementById("brandQuantity").innerHTML="Please enter the quantity";
             validate=false;
             }else{
             document.getElementById("brandQuantity").innerHTML="";
             }
return validate;
}


  </script>
</body>
</html>