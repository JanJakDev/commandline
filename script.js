var inputI = document.getElementById("input");
var div = document.getElementById("div");

inputI.addEventListener("keyup", function(event) {
	if (event.keyCode === 13) {
		event.preventDefault();
		var input = document.getElementById("input").value;
		if(input == "/help"){
			alert("Use: /download /help /contact");
		}else if(input == "/download"){
			var file = prompt("File:");
				if(file == "JaknamClan.jar"){
				div.innerHTML = "<a href=\"Programme/JaknamClan/exported/JaknamClan.jar\" id=\"downloadL\"></a>";
				document.getElementById("downloadL").click();
				div.innerHTML = "";
			}else{
				alert("\"" + file + "\" nicht gefunden!");
			}
		}else if(input == "/contact"){
			alert("Discord: JanJakJar#3161");
		}else{
			
		}
		inputI.value = "";
	}
});