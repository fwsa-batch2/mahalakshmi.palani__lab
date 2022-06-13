class Movement
    def step
        puts "stepping"
    end
    def crawl
        puts "crawling"
    end
end

class Human
    def initialize
        @Movement = Movement.new
    end

    def Move
        @Movement.step
    end
end
class Raccoon
    def initialize
        @Movement = Movement.new
    end
    def Move
        @Movement.crawl
    end
end  

human = Human.new
human.Move
raccoon = Raccoon.new
raccoon.Move

