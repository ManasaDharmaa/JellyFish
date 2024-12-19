<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Select The Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #f8f9fa;
        }
        .list-group-item {
            transition: background-color 0.3s;
        }
        .list-group-item:hover {
            background-color: #e2e6ea;
        }
        .list-group-item-action {
            color: #007bff;
            font-weight: bold;
        }
        .list-group-item-action:focus,
        .list-group-item-action:active {
            outline: none;
            box-shadow: none;
        }
        h2 {
            color: #343a40;
        }
    </style>
</head>
<body>
<div class="container mt-5 d-flex flex-column align-items-center">
    <h2 class="text-center mb-3">Select The Form</h2>
    <div class="list-group">
        <a href="MusuemTicketForm.jsp" class="list-group-item list-group-item-action">Museum Ticket Form</a>
        <a href="CricketTournamentForm.jsp" class="list-group-item list-group-item-action">Cricket Tournament Form</a>
        <a href="MilkForm.jsp" class="list-group-item list-group-item-action">Milk Form</a>
        <a href="SweetForm.jsp" class="list-group-item list-group-item-action">Sweet Form</a>
    </div>
</div>
</body>
</html>
