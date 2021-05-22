firebase.auth().onAuthStateChanged(function (user) {
    if (user) {
        window.alert('user logged in')
        document.getElementById("user_loggedOut").style.display = "block";
        document.getElementById("user_loggedIn").style.display = "none";
    
        var user = firebase.auth().currentUser;
    } else {
        // No user is signed in.
        document.getElementById("user_loggedOut").style.display = "none";
        document.getElementById("user_loggedIn").style.display = "block";
    
    }
});

function login(){

    var userEmail = document.getElementById("email_field").value;
    var userPass = document.getElementById("password_field").value;
  
    firebase.auth().signInWithEmailAndPassword(userEmail, userPass)  .then((userCredential) => {
      // Signed in 
      var user = userCredential.user;
      location.href="/all";

      // ...
    }).catch(function(error) {
      // Handle Errors here.
      var errorCode = error.code;
      var errorMessage = error.message;
  
      window.alert("Error : " + errorMessage);
  
      // ...
    });
   
  }

  
function register() {

    var userEmail = document.getElementById('email_field').value;
    var userPass = document.getElementById('password_field').value;
    const auth = firebase.auth();
    auth.createUserWithEmailAndPassword(userEmail, 
        userPass).then(function(user) {
           var user = firebase.auth().currentUser;
           console.log(user); // Optional
        }, function(error) {
           // Handle Errors here.
           var errorCode = error.code;
           var errorMessage = error.message;
        });
}
function logout(){
    firebase.auth().signOut();
    window.alert('user logout')
  }
  