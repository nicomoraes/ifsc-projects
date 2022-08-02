#include <stdio.h>
#include "func.h"

void main(int argc, char *argv[])
{
  int def_size = 3001;
  int def_part = 4;

  if(argv[1])
    def_part = atoi(argv[1]);

  if(argv[2])
    def_size = atoi(argv[2]);

  int x[def_size];

  readFile(def_size, x);
  euclidean(def_size, x, def_part);
}