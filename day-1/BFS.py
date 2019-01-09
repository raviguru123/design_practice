from collections import defaultdict

class Graph:

	def __init__(self, no_of_node):
		self.graph = defaultdict(list)
		self.no_of_node = no_of_node

	def addEdge(self, u ,v):
		self.graph[u].append(v)
		
	def BFSUtil(self, node, visited, queue):
		print(node, end=" ")
		visited[node] = True
		
		for i in self.graph[node]:
			queue.append(i)
		
	def BFS(self, start_node):
		visited = [False] * self.no_of_node
		nodes = [i for i in range(self.no_of_node)]
		queue = [start_node]

		while(len(queue) > 0):
			node = queue.pop(0)
			if(visited[node] == False):
				self.BFSUtil(node, visited, queue)
		print()

		


g = Graph(7)

g.addEdge(0,1)
g.addEdge(0,4)

g.addEdge(1,3)
g.addEdge(1,4)
g.addEdge(1,6)

g.addEdge(2,3)
g.addEdge(2,6)

g.addEdge(3,4)
g.addEdge(3,5)
g.addEdge(3,6)

g.addEdge(4,5)

g.addEdge(5,2)

g.BFS(0)