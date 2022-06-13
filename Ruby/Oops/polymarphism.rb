class Animal
    def makeNoise
        puts "HurrDurr"
    end
end

class Cat < Animal
    def makeNoise
        puts "Meeaaowwww"
    end
end

class Dog < Animal
    def makeNoise
        puts "WoofWoof"
    end
end

animal = Animal.new
animal.makeNoise()

animal = Cat.new
animal.makeNoise()

animal = Dog.new
animal.makeNoise()