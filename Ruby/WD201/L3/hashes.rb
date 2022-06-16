# library = {}
# library["austen"] = ["Pride and Prejudice", "Sense and Sensibility"]
# library["asimov"] = ["Robots of Dawn", "I, Robot"]

# authors = library.keys
# puts authors
# puts "These are the authors in my catalog: #{authors.join(', ')}"

# library.each do |author, books|
#     puts "#{author.upcase} wrote the books #{books.join(', ')}"
# end

# books = ["Design as Art", "Anathem", "Shogun"]
# authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
# new_hash = {}
# books.map.with_index do|book,author|
#     new_hash[book] = authors[author]
# end
# puts new_hash

puts salute("Nelson Rolihlahla Mandela", "hello")
puts salute("Sir Alan Turing", "welcome")