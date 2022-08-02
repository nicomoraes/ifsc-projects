#include "func.h"

void euclidean(int n, int *arrayX, int part_size)
{
  int sum, k, j, i        = 0;
  int rem_parts           = part_size - 1;
  int aux_part            = n - rem_parts;
  double smaller, result;
  double distance_array[n - rem_parts];

  #pragma omp parallel for private(smaller, result, k, j)
  for (k = 0; k < aux_part; k++) {
    smaller = 10000.0;
    for (j = 0; j < aux_part; j++) {
      result = sqrt(getSum(n, arrayX, j,  k, part_size));
      if(smaller > result && k != j)
        smaller = result;
    }
      distance_array[k] = smaller;
  }
  saveResult(aux_part, distance_array);
}

int getSum(int n, int *arrayX, int j, int k, int part_size){
  int sum = 0; 
  int i = 0;

  #pragma omp parallel for private(i) reduction(+ : sum)
  for (i = 0; i < part_size; i++)
    sum += pow(arrayX[i + k] - arrayX[i + j], 2);

  return sum;
}