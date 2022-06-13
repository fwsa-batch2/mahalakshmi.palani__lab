class Hello

    def multiply(a,b)
        num1 = a
        num2 = b
        puts "multiplay#{num1*num2}"
    end
end
class World <Hello
    def multiply(a,b)     #overriding
        num1=a
        num2 =b
        puts"Add #{num1+num2}"
    end
end

obj1 = World.new
obj1.multiply(5,8)
obj2 = Hello.new
obj2.multiply(4,3)