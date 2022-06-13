class A
    def initialize
       puts "This is Superclass"
    end
    def sum
        puts 10+5
    end

end

class B < A
    def initialize
        puts "This is Subclass"
    end
end

obj1 = B.new
obj1.sum
obj2 = A.new