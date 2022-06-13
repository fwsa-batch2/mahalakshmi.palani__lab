cus_detail = ["maha",4,4.3]
puts cus_detail

#length method
puts cus_detail.length
puts cus_detail.size

#arrayName = Array.new(10)

alphabet = Array("a"..."z")
puts "#{alphabet}"

numbers = Array(1..10)
puts "#{numbers}"

days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]   
puts days[0]      
puts days[5]  
# fetch method
puts days.fetch(2)  
# fetch(),at() both are same
puts "first element #{days.first}"
puts "last element #{days.last}"

#take method
puts days.take(4)
puts days.drop(5)  

#sum method
puts [5,3,8,9].sum