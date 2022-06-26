#Problem 1. Given a nested array of first names and last names, 
#return a new array with the full names.
names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
new_name = []
 names.each do|i|
    a =  i.join(" ")
    new_name.push(a)

 end
 print new_name

#Problem 2. Given two arrays books and authors, merge them and print who wrote which book.

# books = ["Design as Art", "Anathem", "Shogun"]
# authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
# books.map.with_index.each do|book,i|
#     puts "#{book} is #{authors[i]}" 
    
# end
#Problem 3. Print the given list of todos by category. 
#(You haven't learned Hashes yet, so use only arrays.)



# todos = [["money :",["Send invoice","Pay rent","Pay taxes"]],
#         ["organize :",["Clean room","Arrange books"]],
#         ["food :",["Buy groceries"]]]

# puts todos

# nums = [1,2,3,78]
# large_number = nums.find {|i| i > 10}
# if large_number == nil
#   puts "No large numbers!"
# else
#   puts large_number
# end

