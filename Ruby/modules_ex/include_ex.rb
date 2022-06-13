module Maths
    C = 10;
    def add
        puts "addition  #{6+9}"
    end
   
    def subtract
        puts "subtract #{9-5}"

    end
end


class Calculate
    # Include module in class
    # by using 'include' keyword
    include Maths
    def mymethod
        puts"hello world"
    end

    def add 
        p "sses"
    end
    
end

calobj = Calculate.new
calobj.add
calobj.subtract
calobj.mymethod