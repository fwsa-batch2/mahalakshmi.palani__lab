class A
    def initialize(name)
        @name = name
    end 
    def printdetail
        puts "user name = #{@name}"
    end

    # inner class
    class B
        def initialize(roll_no,age)
            @roll_no = roll_no
            @age = age
        end

        def userdetail
            puts "roll_no = #{@roll_no} , age #{@age}"
        end
    end
end

parent_obj = A.new("pavithra")
parent_obj.printdetail

child_obj = A::B.new(2,20)
child_obj.userdetail

