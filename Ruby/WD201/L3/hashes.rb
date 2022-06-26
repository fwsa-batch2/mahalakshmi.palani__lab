# library = {}
# library["austen"] = ["Pride and Prejudice", "Sense and Sensibility"]
# library["asimov"] = ["Robots of Dawn", "I, Robot"]

# authors = library.keys
# puts authors
# puts "These are the authors in my catalog: #{authors.join(', ')}"

# library.each do |author, books|
#     puts "#{author.upcase} wrote the books #{books.join(', ')}"
# end
# Problem 1. Given a nested array of first names and last names, return a new array with the full names.
# books = ["Design as Art", "Anathem", "Shogun"]
# authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
# new_hash = {}
# authors.map.with_index.each do|a,b|
#     s = a.split(" ")[0].downcase.to_sym
   
#     new_hash[s] = books[b]

# end
# puts new_hash
#Problem 2. Given this list of todos, create a Hash keyed by category, whose value is an array containing all the todos in that category.
# The keys of the Hash must be a symbol.
todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]
   array1 = []
   array2 = []
   array3 = []
for i in 0...todos.length do
    for j in 0...todos[i].length do
        if todos[i][j]=="money"
            array1.push(todos[i][0])
        end
        if todos[i][j]=="organize"
            array2.push(todos[i][0])
        end
        if todos[i][j]=="food"
            array3.push(todos[i][0])
        end

    end
end
new_hash = {}

new_hash[":money"] = array1
new_hash[":organize"] = array2
new_hash[":food"] = array3

puts new_hash

