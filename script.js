var inputI = document.getElementById("input");
var divD = document.getElementById("div");

inputI.addEventListener("keyup", function(event) {
	if (event.keyCode === 13) {
		event.preventDefault();
		divD.innerHTML = "";
		var input = document.getElementById("input").value;
		if(input == "/help"){
			divD.innerHTML = "<p>/download /help /contact</p>";
		}else if(input == "/download"){
			divD.innerHTML = "<a href=\"Programm/exported/CommandLine.jar\">Download</a>";
		}else if(input == "/contact"){
			divD.innerHTML = "<p>Discord: JanJakJar#3161</p>";
		}else{
			
		}
		inputI.value = "";
	}
});