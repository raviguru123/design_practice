# https://www.geeksforgeeks.org/find-whether-it-is-possible-to-finish-all-tasks-or-not-from-given-dependencies/
class Graph:

	def __init__(self, v):
		self.v = v;
		self.graph = [[0 for column in range(v)] for row in range(v)]
		self.possible = True

	def addEdge(self, first, second):
		self.graph[first][second] = 1


	def checkUtil(self, node, cycleVisited, visited):
		if(cycleVisited[node] == True):
			self.possible = False
			return
		
		visited[node] = True
		cycleVisited[node] = True
		for i in range(v):
			if(self.graph[node][i] != 0):
				 self.checkUtil(i, cycleVisited, visited)

		

	def checkPossible(self):
		visited = [False] * self.v 
		cycleVisited = [False] * self.v 

		for i in range(self.v):
			if(visited[i] == False):
				self.checkUtil(i, cycleVisited, visited)
				if(self.possible == False):
					return False
				else:
					cycleVisited = [False] * self.v

				
		return True



print("Enter number of node=")
v = int(input())
print("enter number of edge=")
edge = int(input())
g = Graph(v)
for i in range(edge):
	arr = list(map(int , input().split()))
	g.addEdge(arr[0], arr[1])

print(g.graph)
if(g.checkPossible()):
	print("possible")
else:
	print("not possiible")








