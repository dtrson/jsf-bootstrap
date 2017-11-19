function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
}

function dragStart(event) {
	  var linkref = event.target.firstElementChild.firstElementChild; // anchor
	  var type = linkref.href;
	  var name = linkref.textContent;

	  name.replace(/[\r\n]/g, " ");
	  	   
	  var dropzone = $("dropzone"); // h5:drop in dropZone.xhtml
	  dropzone.acceptDrop = true;	  	  
	  	  	  
	  var serverPayload = dropzone.serverPayload();
	  if (serverPayload.indexOf(name) != -1)
		dropzone.acceptDrop = false; // link already present
	  		  	  
	  event.dataTransfer.setData('text', name + " | " + type + " ");
 }

function dragenter(event) { /* Implement as desired */ }
function dragleave(event) { /* Implement as desired */ }
function dragover(event)  { /* Implement as desired */ }
function dropStart(event)      { /* Implement as desired */ }