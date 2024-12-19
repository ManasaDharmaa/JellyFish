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
            background-color: #f7f9fc; /* Soft light background */
        }

        .confirmation-card {
            background-color: #ffffff;
            border-radius: 15px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            padding: 30px;
            margin-top: 20px;
        }

        .confirmation-header {
            color: #4CAF50;
        }

        .details-label {
            font-weight: 500;
            color: #333;
        }

        .success-message {
            color: #28a745;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="confirmation-card">
            <h1 class="confirmation-header display-4 text-center">Order Confirmation</h1>
            <h2 class="details-label">Customer Name: <span class="fw-normal">${customerName}</span></h2>
            <h2 class="details-label">Ticket Type: <span class="fw-normal">${special} ${normal}</span></h2>
            <h2 class="details-label">Mobile: <span class="fw-normal">${mobile}</span></h2>
            <h2 class="details-label">Email: <span class="fw-normal">${email}</span></h2>
            <h3 class="success-message text-center mt-3">Ordered Successfully!</h3>
        </div>
    </div>
</body>
</html>
