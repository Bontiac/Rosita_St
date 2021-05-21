
firebase.auth().onAuthStateChanged(function (user) {
    if (user) {
        window.alert('user logged in')
    } else {
        // No user is signed in.
    }
});

function login() {
    var userEmail = document.getElementById('email_field').value;
    var userPass = document.getElementById('password_field').value;
    const auth = firebase.auth();
    auth.signInWithEmailAndPassword(email, password)
        .then((userCredetential)=>{
            var user=userCredetential.user;

        }).catch((error) => {
            var errorCode = error.code;
            var errorMessage = error.message;
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