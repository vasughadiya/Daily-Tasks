const form = document.getElementById('contactForm');

const firebaseConfig = {
    apiKey: "AIzaSyD3o6aoVRN9fTtd4cOty5bKk63inQunkRY",
    authDomain: "new-day-48973.firebaseapp.com",
    databaseURL: "https://new-day-48973-default-rtdb.firebaseio.com",
    projectId: "new-day-48973",
    storageBucket: "new-day-48973.firebasestorage.app",
    messagingSenderId: "449333562460",
    appId: "1:449333562460:web:dc8c1164e45275edaeaa99",
    measurementId: "G-C1FMXHXDE8"
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);
const database = firebase.database()
const ref = database.ref("messages")

form.addEventListener('submit', (e) => {
    e.preventDefault();

    ref.push({
        name: form.name.value,
        email: form.email.value,
        password: form.password.value,
        age: form.age.value,
        source: form.source.value,
        bio: form.bio.value
    })

    form.reset();
})