<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <form action="sweet" method="post" class="p-4 border rounded bg-Warning shadow" onSubmit="return validation()">

        <h2 class="text-center mb-4">Sweet Order Form</h2>

        <div class="mb-3">
            <label for="shop-name"class="form-label">Shop Name</label>
            <select id="shop-name"   name="shop name" class="form-select">
                <option value="">Select the shop name</option>
                <option value="kanti">Kanti</option>
                <option value="vanti">Varior</option>
                <option value="haldirams">Haldirams Pak</option>
            </select>
        </div>
        <span id="shop" style = "color: red;"></span>

        <div class="mb-3">
            <label for="sweet-name"  class="form-label">Sweet Name</label>
            <select id="sweet-name"  name="sweet name" class="form-select">
                <option value="">Select the sweet name</option>
                <option value="jammun">Jammun</option>
                <option value="jilebi">Jilebi</option>
                <option value="laddu">Laddu</option>
                <option value="mysorepak">Mysore pak</option>
            </select>
        </div>
        <span id="sweetNameSpan" style = "color: red;"></span>

        <div class="mb-3">
            <label for="quantity"  class="form-label">Quantity</label>
            <input type="number" id="quantity" name="quantity" class="form-control" />
        </div>
        <span id="SweetQuantity" style = "color: red;"></span>

        <div class="d-flex justify-content-between">
            <button type="submit" class="btn btn-primary" onSubmit="validation()">Submit</button>
            <button type="reset" class="btn btn-secondary">Clear</button>
            <a href="sweet" class= "btn btn-info text-white">View All</a>
        </div>



    </form>

     <h5 class="mt-3 text-center">${message}</h5>
</div>

<script>
    function validation() {

    validate=true;
    const shopName = document.getElementById("shop-name").value;
    if(!shopName.trim() != ""){
       document.getElementById("shop").innerHTML="please select the Shop Name";
       validate= false;
    }else{
        document.getElementById("shop").innerHTML="";
    }

    const sweetName = document.getElementById("sweet-name").value;
    if(!sweetName.trim() != ""){
         document.getElementById("sweetNameSpan").innerHTML="please select the sweet name";
         validate = false;
    }else{
         document.getElementById("sweetNameSpan").innerHTML="";
    }

    const quantity = document.getElementById("quantity").value;
    if(quantity.trim() !="" || quantity < 0){
          document.getElementById("SweetQuantity").innerHTML="please enter the quantity";
          validate=false;
    }else{
          document.getElementById("SweetQuantity").innerHTML="";
    }

 return validate;
    }
</script>

</body>
</html>
