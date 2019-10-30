var inputI = document.getElementById("input");
var div = document.getElementById("div");

inputI.addEventListener("keyup", function(event) {
	if (event.keyCode === 13) {
		event.preventDefault();
		var input = document.getElementById("input").value;
		if(input == "/help"){
			alert("Use: /download /help /contact");
		}else if(input == "/download"){
			div.innerHTML = "<a href=\"Programm/exported/JaknamClan.jar\" id=\"downloadL\"></a>";
			document.getElementById("downloadL").click();
			div.innerHTML = "";
		}else if(input == "/contact"){
			alert("Discord: JanJakJar#3161");
		}else{
			
		}
		inputI.value = "";
	}
});