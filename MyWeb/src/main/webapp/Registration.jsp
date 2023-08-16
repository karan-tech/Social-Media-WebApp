<form action="karanhacker" method="post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

    <label for="psw_repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw_repeat" id="psw_repeat" required>
    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</a></button>
       
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="http://localhost:8080/MyWeb/indexpage?">Sign in</a>.</p>
  </div>
  <style>/* Style the container */
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    background-color: #f0f0f0;
}
.container {
  width: 500px;
  padding: 16px;
  background-color: white;
  border-radius: 5px;
  box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.2);
}

/* Style the input fields */
input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 5px;
}

/* Style the register button */
.registerbtn {
  background-color: #0074d9; /* Blue color */
  color: white;
  padding: 12px 20px;
  margin: 10px 0;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  width: 100%;
}

.registerbtn:hover {
  background-color: #0056b3; /* Darker blue color on hover */
}

/* Style the signin container */
.signin {
  text-align: center;
}

.signin a {
  color: #0074d9;
  text-decoration: none;
}

.signin a:hover {
  text-decoration: underline;
}
 
</style>
</form>