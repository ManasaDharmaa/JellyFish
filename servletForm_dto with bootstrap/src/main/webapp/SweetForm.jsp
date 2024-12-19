<%@ page isELIgnored = "false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sweets Order Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #f9f9f9;
        }

        .card {
            border-radius: 20px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);
        }

        .form-label {
            font-weight: bold;
            color: #4a4a4a;
        }

        .btn-primary {
            background-color: #ff6f61;
            border: none;
        }

        .btn-primary:hover {
            background-color: #e05a4e;
        }

         .confirmation-card {
                    background-color: #ffffff;
                    border-radius: 15px;
                    box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
                    padding: 30px;
                    margin-top: 20px;
                }

                .confirmation-header {
                    color: #28a745;

                .details-label {
                    font-weight: bold;
                }

                .success-message {
                    color: #007bff;
                    font-weight: bold;
                }

    </style>
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center mb-4 text-primary">Order Your Sweets</h2>
        <form action="sweet" method="post" class="card p-4">
            <div class="mb-4">
                <label for="shopName" class="form-label">Select a Shop</label>
                <select name="shop_name" id="shopName" class="form-select" required>
                    <option value="" disabled selected>Select the shop name</option>
                    <option>Sri Ram Bakery</option>
                    <option>Aiangar Bakery</option>
                    <option>Warriar</option>
                    <option>Ammas</option>
                </select>
            </div>

            <div class="mb-4">
                <label for="sweetName" class="form-label">Choose Your Sweet</label>
                <select name="sweet_name" id="sweetName" class="form-select" required>
                    <option value="" disabled selected>Select the sweet name</option>
                    <option>Mysore Pak</option>
                    <option>Jalebi</option>
                    <option>Gulab Jamun</option>
                    <option>Rasgulla</option>
                </select>
            </div>

            <fieldset class="mb-4">
                <legend class="form-label">Select Your Preference</legend>
                <div class="form-check">
                    <input type="radio" name="order_type" id="special" class="form-check-input" value="special" required>
                    <label for="special" class="form-check-label">Special</label>
                </div>
                <div class="form-check">
                    <input type="radio" name="order_type" id="normal" class="form-check-input" value="normal" required>
                    <label for="normal" class="form-check-label">Normal</label>
                </div>
            </fieldset>

            <div class="mb-4">
                <label for="quantity" class="form-label">Enter Quantity</label>
                <input type="number" name="quantity" id="quantity" class="form-control" required min="1">
            </div>


            <button type="submit" class="btn btn-primary w-100">Place Order</button>
            <button type="reset" class="btn btn-primary w-100"> Order Cancel</button>
        </form>


        <h1>${message}</h1>
    </div>



</body>
</html>
