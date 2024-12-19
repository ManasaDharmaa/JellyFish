<%@ page isELIgnored = "false" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Milk Order Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #e0f7fa;
        }
        .container {
            border-radius: 15px;
            background-color: #ffffff;
            box-shadow: 0 4px 15px rgba(0,0,0,0.1);
            padding: 30px;
        }
        .alert {
            border-radius: 10px;
        }
        .form-label {
            color: #00796b;
            font-weight: bold;
        }
        .btn-primary {
            background-color: #00796b;
            border: none;
        }
        .btn-primary:hover {
            background-color: #004d40;
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <div class="alert alert-success text-center" role="alert">
        <h4>Order Summary</h4>
        <p>Brand: ${brand}</p>
        <p>Type: ${type}</p>
        <p>Quality: ${quality}</p>
        <p>Total Cost: ${cost}</p>
        <p>Ordered successfully!</p>
    </div>

    <form action="milk" class="mt-4">
        <div class="mb-3">
            <label for="brand" class="form-label">Brand</label>
            <select name="brand" id="brand" class="form-select" required>
                <option selected disabled>Select the brand</option>
                <option value="Nandini">Nandini</option>
                <option value="Ammul">Ammul</option>
                <option value="Mother Dairy">Mother Dairy</option>
                <option value="Hatsun">Hatsun</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="type" class="form-label">Type</label>
            <select name="type" id="type" class="form-select" required>
                <option selected disabled>Select type</option>
                <option value="Special">Special</option>
                <option value="Ordinary">Ordinary</option>
                <option value="Good Life">Good Life</option>
                <option value="Family">Family</option>
                <option value="Buffalo">Buffalo</option>
                <option value="Good Life lite">Good Life lite</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="quantity" class="form-label">Quantity</label>
            <input type="number" name="quantity" id="quantity" class="form-control" required />
        </div>

        <div class="d-flex justify-content-between">
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="reset" class="btn btn-secondary">Clear</button>
        </div>
    </form>
</div>
</body>
</html>
