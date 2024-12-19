<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cricket Team Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #e9f5ff;
        }
        .card {
            background-color: #ffe6cc;
            border: none;
            border-radius: 15px;
        }
        .card-body {
            transition: all 0.3s ease;
        }
        .card:hover {
            transform: translateY(-10px);
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.4);
        }
        .btn-primary {
            background-color: #ff9800;
            border: none;
        }
        .btn-primary:hover {
            background-color: #e68a00;
        }
        .form-label {
            color: #663399;
            font-weight: bold;
        }
        .mb-3 input {
            border-radius: 10px;
        }
        .button-group {
            display: flex;
            justify-content: space-between;
        }
        .btn-secondary {
            background-color: #6c757d;
        }
        .btn-secondary:hover {
            background-color: #5a6268;
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center mb-4 text-primary">Cricket Team Registration</h1>
    <div class="card shadow">
        <div class="card-body">
            <form action="cricket" method="post">
                <div class="mb-3">
                    <label for="teamName" class="form-label">Team Name</label>
                    <input type="text" class="form-control" name="team" id="teamName" required>
                </div>
                <div class="mb-3">
                    <label for="totalPlayers" class="form-label">Team Total Players</label>
                    <input type="number" class="form-control" name="member" id="totalPlayers" required>
                </div>
                <div class="mb-3">
                    <label for="captainName" class="form-label">Team Captain</label>
                    <input type="text" class="form-control" name="name" id="captainName" required>
                </div>
                <div class="mb-3">
                    <label for="extraPlayers" class="form-label">Extra Players</label>
                    <input type="number" class="form-control" name="extra" id="extraPlayers" required>
                </div>
                <div class="mb-3">
                    <label for="leftBatmans" class="form-label">Total Left Batmans</label>
                    <input type="number" class="form-control" name="left" id="leftBatmans" required>
                </div>
                <div class="mb-3">
                    <label for="rightBatmans" class="form-label">Total Right Batmans</label>
                    <input type="number" class="form-control" name="right" id="rightBatmans" required>
                </div>
                <div class="mb-3">
                    <label for="bowlers" class="form-label">Total Bowlers</label>
                    <input type="number" class="form-control" name="bowlers" id="bowlers" required>
                </div>
                <div class="mb-3">
                    <label for="batmans" class="form-label">Total Batmans</label>
                    <input type="number" class="form-control" name="batman" id="batmans" required>
                </div>
                <div class="button-group mb-3">
                    <button type="submit" class="btn btn-primary w-48">Submit</button>
                    <button type="reset" class="btn btn-secondary w-48">Clear</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
