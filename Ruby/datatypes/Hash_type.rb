data = {"Akash" => "Physics", "Ankit" => "Chemistry", "Aman" => "Maths"}   
puts data["Physics"]   
puts data["Ankit"]   
puts data["Aman"] 
data["maha"] = "science"
puts data

# loop
data.each do|key,value|
    puts "#{key} subject is #{value}"
end
 