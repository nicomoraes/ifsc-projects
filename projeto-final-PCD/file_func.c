#include "func.h"

void saveResult(int n, double *finalArray)
{
  FILE *file;
  file = fopen("rst.csv", "w");

  if(file == NULL) {
    printf("Error na abertura do arquivo de saida");
    exit(1);
  }

  fprintf(file, "Resultado\n");

  for(size_t i = 0; i < n; i++)
    fprintf(file, "%.1f\n", finalArray[i]);

  fclose(file);
}

void readFile(int n, int *x)
{
  char line[n];
  char *result;
  int i = 0;
  FILE *file;

  if(n < 4)
    return;

  file = fopen("src.txt", "rt");

  if(file == NULL) {
    printf("Error na abertura do arquivo de saida");
    exit(1);
  }

  while(i < n)
  {
    result = fgets(line, n, file);
    if (result)
      x[i] = atoi(line);
    i++;
  }

  fclose(file);
}