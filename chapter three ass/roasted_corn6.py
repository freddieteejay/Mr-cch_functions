def maximum(number):
		maximum_num = number[4]
		for num in number:
			if num > maximum_num:
				maximum_num = num
			return maximum_num

print(maximum([2, 3, 4, 5, 7]))




