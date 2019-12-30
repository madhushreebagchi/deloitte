for(i=0;i<2;i++)
	{
	document.write("<h2>java script</h2>");
	}
function display()
{
var num1 = prompt("enter 1st no.","12");
var num2 = prompt("enter 2nd no.","20");
var result = parseInt(num1)+parseInt(num2);
alert("The sum of two numbers is : "+result);
}
function demo(){
	var res = confirm("Do u wanna continue?");
	if(res == true)
		{
		alert("ok clicked");
		}
	else{
		alert("Cancel clicked");
	}
}
function mohan(num){
	alert("You have given :"+num);
}
function displaygreetings(msg){
	if(msg == null)
		msg="Good Night"
		alert(msg);
}