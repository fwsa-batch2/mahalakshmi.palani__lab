class Employee
    def initialize(exp)
        @experience = exp
    end

    private
        def setSalary(salary)
            @salary = salary
        end

    public
        def setData
            if @experience == "Fresher"
                setSalary("1000 Rupees")
            elsif @experience == "One"
                setSalary("100000 Dollars")
            elsif @experience == "Ten"
                setSalary("700000000 Dollars")
            end
        end

        def getSalary
            return @salary
        end
end
fresher = Employee.new("Fresher")
fresher.setData()
puts "Fresher Salary is #{fresher.getSalary()}"

oneYearExperience = Employee.new("One")
oneYearExperience.setData()
puts "One Year Experience Salary is #{oneYearExperience.getSalary()}"

tenYearExperience = Employee.new("Ten")
tenYearExperience.setData()
puts "Ten Year Experience Salary is #{tenYearExperience.getSalary()}"
