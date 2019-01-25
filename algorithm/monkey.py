import math

def checkValid(trees):
	count = 0
	for tree in trees:
		if(tree[2] > tree[3]):
			count += 1
	return count <= 1

def find_ecludian_distance(x1, y1, x2, y2):
	return math.sqrt( ((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)))

def check_if_tree_is_possible_for_meeting(power, index, trees):

	for i in range(0, index, 1):
		distance = find_ecludian_distance(trees[i][0], trees[i][1], trees[index][0], trees[index][1])
		if(power < distance):
			return False

	for i in range(index+1, len(trees), 1):
		distance = find_ecludian_distance(trees[i][0], trees[i][1], trees[index][0], trees[index][1])
		if(power < distance):
			return False

	return True

arr = list(map(int, input().split()));
power = arr[1]
no_of_trees = arr[0]
trees = []
for i in range(no_of_trees):
	arr1 = list(map(int, input().split()))
	trees.append(arr1)

valid = checkValid(trees)
if(valid):
	print("need to calculate number of tree by using ecludian distance")
	for index in range(len(trees)):
		if(check_if_tree_is_possible_for_meeting(power, index, trees)):
			print(index, end =" ")
	print()
else:
	print(-1)

