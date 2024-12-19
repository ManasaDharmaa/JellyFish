<%@ page isELIgnored = "false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>X-workz - Order Confirmation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #f2f4f7;
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
        <div class="confirmation-card">
            <h1 class="confirmation-header text-center display-4">Order Confirmation</h1>
            <h2 class="details-label">Shop Name: <span class="fw-normal">${shopName}</span></h2>
            <h2 class="details-label">Sweet Name: <span class="fw-normal">${sweetName}</span></h2>
            <h2 class="details-label">Type: <span class="fw-normal">${special} ${normal}</span></h2>
            <h2 class="details-label">Quantity: <span class="fw-normal">${quantity}</span></h2>
            <h3 class="success-message text-center mt-3">Ordered Successfully!</h3>
        </div>
    </div>
</body>
</html>
