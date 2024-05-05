mpg = 0
gallon_used = 1
while gallon_used != -1:
	gallon_used  =  float(input("Enter the gallons used (-1 to end) : "))	
	if gallon_used == -1:
		print(f"The overall average miles per gallon was {mpg / gallon_used}")
		break


	elif gallon_used != -1:
		miles_driven = float(input("Enter the miles driven : "))
		mpg = miles_driven / gallon_used
		print(f"The miles per gallons for this tank was : {mpg}")