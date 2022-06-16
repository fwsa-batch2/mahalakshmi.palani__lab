name = "maha"
name<< "lakshmi"
name<<"ragavi"
puts name

#Freezing Strings
name.freeze
name<< "palani"     #"And here modification will be failed after using freeze method"  
puts name