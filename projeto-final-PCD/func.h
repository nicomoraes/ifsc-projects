#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <omp.h>

#ifndef FUNC_H_INCLUDED
#define FUNC_H_INCLUDED

void readFile(int n, int *x);
void saveResult(int n, double *finalArray);
void euclidean(int n, int *arrayX, int part_size);
int getSum(int n, int *arrayX, int j, int k, int part_size);

#endif // FUNC_H_INCLUDED