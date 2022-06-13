puts("Range operator")
range1 = (1...5).to_a
puts"#{range1}"
range2 =("a".."h").to_a
puts"#{range2}"

Myrange = 1...8
#checking the content
output1 = Myrange.include?(5)
puts"#{output1}"

#getting the maximum value
output2 = Myrange.max
puts"#{output2}"

#getting the minimum value
output3 = Myrange.min
puts"#{output3}"

#slicing the ranges
retval = Myrange.select {|i| i < 5 }
puts "MyRange selected: #{retval}"
retval = Myrange.reject {|i| i < 5 }
puts "MyRange rejected: #{retval}"

#iterating over the range
Myrange.each do|i|
    puts i
        
end

num = (1...5).to_a.reverse
puts "reverse #{num}"
#puts (1..5).to_a.reverse   