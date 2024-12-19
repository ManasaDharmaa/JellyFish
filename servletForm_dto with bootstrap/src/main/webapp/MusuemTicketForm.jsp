<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Museum Ticket Booking</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #eef2f3; /* Light grayish background */
        }

        .card {
            border-radius: 15px; /* More rounded corners for a softer look */
            border: none; /* No border for the card */
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.2); /* Enhanced shadow */
        }

        .form-label {
            font-weight: 500; /* Slightly lighter text weight */
            color: #333; /* Darker labels for better readability */
        }

        .btn-custom {
            background-color: #007bff; /* Primary blue */
            border: none; /* No border */
            transition: background-color 0.3s; /* Smooth transition */
        }

        .btn-custom:hover {
            background-color: #0056b3; /* Darker blue on hover */
        }

        .btn-secondary {
            background-color: #6c757d; /* Default secondary color */
            border: none; /* No border */
        }

        .btn-secondary:hover {
            background-color: #5a6268; /* Darker gray on hover */
        }

        .form-check-label {
            margin-left: 5px; /* Consistent spacing */
        }
    </style>
</head>

<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4 text-info">Museum Ticket Booking</h1>
        <form action="musuem" method="post" class="card p-4">
            <div class="mb-3">
                <label for="customerName" class="form-label">Customer Name</label>
                <input type="text" name="customer_name" class="form-control" id="customerName" placeholder="Enter your name" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Ticket Type</label>
                <div class="form-check form-check-inline">
                    <input type="radio" name="ticketType" id="special" class="form-check-input" value="special" required>
                    <label for="special" class="form-check-label">Special</label>
                </div>
                <div class="form-check form-check-inline">
                    <input type="radio" name="ticketType" id="normal" class="form-check-input" value="normal" required>
                    <label for="normal" class="form-check-label">Normal</label>
                </div>
            </div>

            <div class="mb-3">
                <label for="mobile" class="form-label">Mobile Number</label>
                <input type="tel" name="mobile" class="form-control" id="mobile" placeholder="123-456-7890" required>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">Email Address</label>
                <input type="text" name="email" class="form-control" id="email" placeholder="example@example.com" required>
            </div>

            <div class="mb-3">
                <label for="visitDate" class="form-label">Visit Date</label>
                <input type="date" name="visit_date" class="form-control" id="visitDate" required>
            </div>

            <button type="submit" class="btn btn-custom w-100 mb-2">Book Ticket</button>
            <button type="reset" class="btn btn-secondary w-100">Reset Form</button>
        </form>
    </div>
</body>

</html>
