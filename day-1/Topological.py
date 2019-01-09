from collections import defaultdict

class Graph:
	def __init__(self, node):
		self.graph = defaultdict(list)
		self.no_of_node = node
	
	def addEdge(self, u, v):
		self.graph[u].append(v)

	def TOPOLOGICALUtil(self, node, degree, visited):
		visited[node] = True
		print(node, end=" ")

		for node in self.graph[node]:
			degree[node] -= 1

	def CalculateDegree(self):
		degree = [0] * self.no_of_node
		for key in self.graph.keys():
			for node in self.graph[key]:
				degree[node] += 1
		return degree

	def TOPOLOGICAL(self):
		visited = [False]*(self.no_of_node)
		degree = self.CalculateDegree()
		found = True
		while(found):
			found = False
			for i in range(self.no_of_node):
				if(degree[i] == 0 and visited[i] == False):
					found = True
					self.TOPOLOGICALUtil(i, degree, visited)
		print();
			

		


g = Graph(6);

g.addEdge(2,3)
g.addEdge(3,1)
g.addEdge(4,0)
g.addEdge(4,1)
g.addEdge(5,0)
g.addEdge(5,2)

g.TOPOLOGICAL()
