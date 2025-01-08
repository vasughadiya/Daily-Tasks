function allowDrop(ev) {
    ev.preventDefault();
}

function getRandomColor() {
    let color = `#${Math.floor(Math.random() * 16777215).toString(16)}`;
    while (color.length < 7) {
        color = `#${Math.floor(Math.random() * 16777215).toString(16)}`;
    }
    return color;
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}

var width = 290;
var height = 290;
var circleId = 1;

function drop(ev) {
    ev.preventDefault();

    let target = ev.target;
    while (target && target.id !== "div1") {
        target = target.parentElement;
    }

    if (target && width > 10 && height > 10) {
        const data = ev.dataTransfer.getData("text");
        const draggedCircle = document.getElementById(data);

        const bgColor = draggedCircle.style.backgroundColor;
        if (!bgColor || bgColor === "transparent" || bgColor === "") {
            console.error("Cannot drop a circle without a valid color.");
            return;
        }

        draggedCircle.draggable = false;
        document.getElementById("div1").appendChild(draggedCircle);

        draggedCircle.style.width = `${width}px`;
        draggedCircle.style.height = `${height}px`;

        draggedCircle.id = `droppedCircle${circleId++}`;

        width -= 30;
        height -= 30;

        const newCircle = document.createElement("div");
        newCircle.id = `circle${circleId}`;
        newCircle.className = "circle";
        newCircle.style.width = `${width}px`;
        newCircle.style.height = `${height}px`;
        newCircle.style.backgroundColor = getRandomColor();
        newCircle.draggable = true;
        newCircle.ondragstart = drag;

        document.getElementById("main").appendChild(newCircle);
    }
}

window.onload = function () {
    const firstCircle = document.createElement("div");
    firstCircle.id = "circle1";
    firstCircle.className = "circle";
    firstCircle.style.width = `${width}px`;
    firstCircle.style.height = `${height}px`;
    firstCircle.style.backgroundColor = getRandomColor();
    firstCircle.draggable = true;
    firstCircle.ondragstart = drag;

    document.getElementById("main").appendChild(firstCircle);
}