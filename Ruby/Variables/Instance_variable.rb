class Customer
    def initialize(name,id,address)
        @cus_name  = name 
        @cus_id   = id      #instance variable
        @cus_address = address
    end

    def dispaly()
        puts "#@cus_name"
        puts "#@cus_id"
        puts "#@cus_address"
    end
end

obj1 = Customer.new("maha","4","mamabakkam")
obj2 = Customer.new("lakshmi","5","medavakkam")

obj1.dispaly()
obj2.dispaly()

    

