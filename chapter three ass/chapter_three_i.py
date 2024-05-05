passes = 0  
failures = 0 
while True:
	user_input = int(input("Enter number between (1 / 2) : "))

	if user_input == 2 or user_input == 1:
		break 
	else:
		print("Invalid number Enter 1 or 2") 
print(f"Thanks your input is {user_input}")