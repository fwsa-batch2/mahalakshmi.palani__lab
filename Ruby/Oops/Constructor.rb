class Parent
    
    def initialize 
        puts "Super class"
    end
end
class Child < Parent
    def initialize
       
        puts "Sub class"
        super
    end
end
Child.new

 