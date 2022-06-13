module Maths
    C = 10;
    def Maths.add
        puts "addition  #{6+9}"
    end
    # module method
    def Maths.subtract
        puts "subtract #{9-5}"

    end
    
end
Maths.add
Maths.subtract
puts Maths::C

