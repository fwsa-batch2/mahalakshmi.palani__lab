class Maths
    # class variable
    @@no_of_customers

    def add( a,  b,cus_no)
        @@no_of_customers = cus_no
        
        num1 =  a
        num2 = b  # local varible
         num1+num2
       #puts "sum:#{sum}"
       
    end

end
obj1 = Maths.new()
obj2 = Maths.new()

# obj1.add(5,6,9)
# obj2.add(2,5,6)
puts "#{obj1.add(5,6,9)}"
puts Maths.class_variable_get(:@@no_of_customers)



