#upcase & downcase
myStr = String.new("THIS IS TEST")
foo = myStr.downcase
upper = "hello World".upcase
puts "#{upper}"

puts "#{foo}"

#String split() Method 
str = "hello world , hi i am maha".split
#puts str
print str

name = "geeks geeks".split('s', -1)
puts name

# String length method
puts "length of the string = #{str.length}"

#String index Method
puts "Sample".index('m')           
puts "Program".index('gr') 
