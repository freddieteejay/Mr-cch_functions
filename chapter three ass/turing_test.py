

user_input = input("What is your problem ? ")
bar = input("press enter to continue or no to quit:  ")
bar = bar.lower()

FIRST_CONDITION = "no"
SECOND_CONDITION = "enter"
THIRD_CONDITION = "yes"
FOURTH_CONDITION = "no"

if bar == (FIRST_CONDITION):
	print("ode why you come dey stress us")
elif bar == (SECOND_CONDITION):
	problem_detector = input("Have you encountered this problem before (yes or no)?")
problem_detector = problem_detector.lower()
if problem_detector == (THIRD_CONDITION):
		print("Well, you have it again")
elif problem_detector == (FOURTH_CONDITION):
		print("Well, you have it now")
	
