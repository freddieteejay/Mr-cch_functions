def minimum(number):
	minimum_num = number[0]
	for num in number:
		if num < minimum_num:
			minimum_num = num
		return minimum_num
	

print(minimum([2, 3, 4, 5, 7]))