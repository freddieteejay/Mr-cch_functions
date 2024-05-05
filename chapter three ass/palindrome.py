user_input = int(input("Enter a number : "))
str_user_input = str(user_input)
if str_user_input == str_user_input[::-1]:
	print("The number is palindrome")
else:
	print("The number is not palindrome. ")