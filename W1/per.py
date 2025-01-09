def generate_permutations(s):
    # Base case: if the string is empty or has one character, return it as a list
    if len(s) <= 1:
        return [s]
    
    # Initialize a list to store permutations
    permutations = []
    
    # Loop through each character in the string
    for i, char in enumerate(s):
        # Remove the current character and find permutations of the remaining substring
        remaining = s[:i] + s[i+1:]
        for perm in generate_permutations(remaining):
            # Append the current character to the front of each permutation of the remaining
            permutations.append(char + perm)
    
    return permutations

# Test the function
str_input = "abc"
print(generate_permutations(str_input))