<%@ page isELIgnored = "false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>X-workz Team Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #e3f2fd;
            color: #333;
        }
        .team-info {
            background: #ffffff;
            color: #333;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.1);
            margin: 20px;
        }
        h1 {
            font-weight: bold;
            color: #007bff;
        }
        h2 {
            font-weight: normal;
            border-bottom: 2px solid #007bff;
            padding-bottom: 5px;
        }
        p {
            margin-bottom: 10px;
            font-size: 16px;
        }
        .success-message {
            font-size: 18px;
            font-weight: bold;
            color: #28a745;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="team-info">
            <h1 class="text-center">Team Information</h1>
            <p>Team Name: <span class="fw-normal">${team}</span></p>
            <p>Total Members: <span class="fw-normal">${member}</span></p>
            <p>Captains Name: <span class="fw-normal">${name}</span></p>
            <p>Extra Players: <span class="fw-normal">${extra}</span></p>
            <p>Left Handed Batsmen: <span class="fw-normal">${left}</span></p>
            <p>Right Handed Batsmen: <span class="fw-normal">${right}</span></p>
            <p>Total Bowlers: <span class="fw-normal">${bowlers}</span></p>
            <p>Total Batsmen: <span class="fw-normal">${batman}</span></p>
            <h3 class="text-center success-message mt-4">Ordered Successfully!</h3>
        </div>
    </div>
</body>
</html>
