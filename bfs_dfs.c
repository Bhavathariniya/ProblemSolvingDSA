//Graph BFS & DFS using sequential representation
#include<stdio.h>
#define MAX 10
#define TRUE 1
#define FALSE 0
int graph[MAX][MAX]={0};
void insertEdge(int u, int v)
{
    graph[u][v] = 1;
    graph[v][u] = 1;		    // Set the edge from v to u (undirected graph)
}
void BFS(int start)
{	int i;
    int visited[MAX] = { 0 };
    int queue[MAX], front = 0, rear = 0;
    visited[start] = TRUE;					// Mark the start node as visited and enqueue it
    queue[rear++] = start;
    while (front < rear) 
	{
        int current = queue[front++];
        printf("%d ", current);
        for (i = 0; i < MAX; i++) 			// Visit all the adjacent nodes
		{
            if (graph[current][i] == 1 && !visited[i]) 
			{
                visited[i] = TRUE;
                queue[rear++] = i;
            }
        }
    }
    printf("\n");
}
void DFS(int start)
{
    int visited[MAX] = { 0 };
    DFSUtil(start, visited);
    printf("\n");
}
void DFSUtil(int start,int visited[])
{	int i;
    visited[start] = TRUE;				// Mark the current node as visited and print it
    printf("%d ", start);
    for ( i = 0; i < MAX; i++) 			// Visit all the adjacent nodes
	{
        if (graph[start][i] == 1 && !visited[i]) 
		{
            DFSUtil(i, visited);
        }
    }
}

int main()
{	int V,E,s,d,i,j;
	scanf("%d%d",&V,&E);
	for(i=0;i<V;i++)
	{	for(j=0;j<V;j++)
		{	printf("%d ",graph[i][j]);
		}
		printf("\n");
	}
	for(i=0; i<E; i++)
	{	printf("Enter p1 & p2: ");
		scanf("%d%d",&s,&d);
		insertEdge(s,d);
	}
	for(i=0;i<V;i++)
	{	for(j=0;j<V;j++)
		{	printf("%d ",graph[i][j]);
		}
		printf("\n");
	}
    printf("BFS starting from node 2:\n");
    BFS(0);
    printf("DFS starting from node 1:\n");
    DFS(0);
}