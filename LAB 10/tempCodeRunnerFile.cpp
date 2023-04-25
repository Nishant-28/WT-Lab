int maxIndex = 0;
    int j = 1;
    for (int i = 0; i < steps; i++) {
        if (maxIndex + j == badIndex) {
            j++;
        }
        maxIndex += j;
        j++;
    }
    return maxIndex;