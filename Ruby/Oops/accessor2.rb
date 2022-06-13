class Student_detail
    def initialize(name)
        @name = name
    end
    # accessor get and set method
    attr_accessor :name
end
# get
 obj = Student_detail.new("maha")
 puts obj.name
 # set
 obj.name = "lakshmi"
 puts obj.name