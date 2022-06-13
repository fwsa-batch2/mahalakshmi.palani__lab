class Student_detail
    def initialize(name)
        @name = name
    end
    # accessor get method
    attr_reader :name

    # accessor set method
    attr_writer :name
end
# get
 obj = Student_detail.new("ragavi")
 puts obj.name
 # set
 obj.name = "pavi"
 puts obj.name

