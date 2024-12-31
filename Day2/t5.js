// // Import the functions you need from the SDKs you need
// import { initializeApp } from "firebase/app";
// import { getAnalytics } from "firebase/analytics";
// // TODO: Add SDKs for Firebase products that you want to use
// // https://firebase.google.com/docs/web/setup#available-libraries

// // Your web app's Firebase configuration
// // For Firebase JS SDK v7.20.0 and later, measurementId is optional
// let firebaseConfig = {
//     apiKey: "AIzaSyBAWufmRb09WaohesKGUxCYyRE1tRhiGgM",
//     authDomain: "task-5-f9c5f.firebaseapp.com",
//     databaseURL: "https://task-5-f9c5f-default-rtdb.firebaseio.com",
//     projectId: "task-5-f9c5f",
//     storageBucket: "task-5-f9c5f.firebasestorage.app",
//     messagingSenderId: "629220530471",
//     appId: "1:629220530471:web:02e2c823271a71d9663102",
//     measurementId: "G-ER1EW3D8NT"
// };

// // Initialize Firebase
// const app = initializeApp(firebaseConfig);
// // firebase.initializeApp(firebaseConfig);

// // let messagesRef = firebase.database().ref('Collected Data');

// document.getElementById('formdata').addEventListener('submit', submitForm);

// function submitForm(e) {
//     e.preventDefault();
//     let first_name = document.querySelector('#first_name').value;
//     let email = document.querySelector('#email').value;
//     saveMessage(first_name, email);
//     document.getElementById('formdata').reset();
// }

// function getInputVal(id) {
//     return document.getElementById(id).value;
// }

// function saveMessage(first_name, email) {
//     let newMessageRef = messagesRef.push();
//     newMessageRef.set({
//         first_name: first_name,
//         email: email,
//     });
// }

// var database = firebase.database();

// // database.ref('data').set({
// //   name: 'Aisha khan',
// //   age: 19
// // });

// Import the functions you need from the SDKs you need
