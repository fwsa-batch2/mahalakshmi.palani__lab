# names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
# new_name = []
#  names.each do|i|
#     a =  i.join(" ")
#     new_name.push(a)

#  end
#  print new_name

# books = ["Design as Art", "Anathem", "Shogun"]
# authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
# books.map.with_index.each do|book,i|
#     puts "#{book} is #{authors[i]}" 
    
# end

nums = [1,2,3,78]
large_number = nums.find {|i| i > 10}
if large_number == nil
  puts "No large numbers!"
else
  puts large_number
end

