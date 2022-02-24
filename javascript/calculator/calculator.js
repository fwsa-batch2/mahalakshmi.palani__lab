let operator;
let first_number;
let second_number;
function calculator(num){
	console.log(num.value)
	if(num.value == "C"){
		document.getElementById("display").value = "";
	}
	else {
		if(num.value == "+" || num.value == "-" || num.value == "*" || num.value == "/" || num.value == "%" ){
			first_number = parseFloat(document.getElementById("display").value);
			operator = num.value;
			document.getElementById("display").value = "";
		}
		
		else if(num.value == "="){
			
			second_number = parseFloat(document.getElementById("display").value);
			if(operator == "+"){
				
				document.getElementById("display").value = first_number + second_number;
			}
			
			else if(operator == "-"){
				document.getElementById("display").value = first_number - second_number;
			}
			else if(operator == "*"){
				document.getElementById("display").value = first_number * second_number;
			}
			else if(operator == "/"){
				document.getElementById("display").value = first_number / second_number;
			}
			else if(operator == "%"){
				document.getElementById("display").value = first_number % second_number;
			}
			
				
			
		}
		else{
			document.getElementById("display").value  += num.value;
		}
	}
}
