class Graph:

	def __init__(self, v):
		self.v = v
		self.g = [[0 for column in range(v)] for row in range(v)]


	def find_min(self, keys, visited):

		min_value = float("inf")
		min_value_index = -1
		for index, val in enumerate(keys):
			if(visited[index] == False and val < min_value):
				min_value = val
				min_value_index = index

		return min_value_index


	def doPrismMst(self):
		keys = [float("inf")] * self.v
		parent = [None] * self.v
		visited = [False] * self.v

		keys[0] = 0
		parent[0] = -1

		for node in range(self.v):

			min_value_index = self.find_min(keys, visited)
			visited[min_value_index] = True
			for node, edge in enumerate(self.g[min_value_index]):
				if(edge != 0 and visited[node] == False and keys[node] > edge):
					keys[node] = edge
					parent[node] = min_value_index

		cost = 0
		for index in range(1, self.v):
			cost += self.g[parent[index]][index]			
		

		return cost
		



g = Graph(5) 
g.g = [ [0, 2, 0, 6, 0], 
            [2, 0, 3, 8, 5], 
            [0, 3, 0, 0, 7], 
            [6, 8, 0, 0, 9], 
            [0, 5, 7, 9, 0]] 

print("minimun cost of node ::",g.doPrismMst())