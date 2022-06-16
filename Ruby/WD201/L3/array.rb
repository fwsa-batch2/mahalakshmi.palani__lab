# books = ["Siddhartha", "Shogun", "Discworld"]
# puts books.length
# puts books[1]
# puts books[0]
# puts books[books.length - 1]
# books.push("Harry Potter")
# puts "new array #{books}"
# puts books.last

number = [4,56,76,100]

# number.each{|i|  "the number is #{i*2}"}
a = number.map do |i|
     i*2
end
print a

# difference between each and map method :
# map return a value but each not return any value 



