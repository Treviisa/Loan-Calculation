import numpy as np
from scipy.stats import skew

# Given age data
ages = [3, 5, 4, 7, 2, 4, 6, 7, 4, 2]

# Calculate skewness
skewness_value = skew(ages)

print("Skewness:", skewness_value)