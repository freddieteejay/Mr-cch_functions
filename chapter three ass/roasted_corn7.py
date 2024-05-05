def word(word):
	if  len(word) < 2:
		return" "
	return word[:2] + word[-2:] # slicing to extract the first and last two chararcters the plus sign is used to join both together

print(word("semicolon"))
