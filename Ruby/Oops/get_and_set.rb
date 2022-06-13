class Em_detail
    def initialize(name)
        @name = name
    end

    # Classical get method
    def getname
        @name
    end
    # Classical set method
    def setname= (name)
        @name = name
    end
end

obj1 = Em_detail.new "maha"
puts obj1.getname

obj1.setname= "lakshmi"
puts obj1.getname

