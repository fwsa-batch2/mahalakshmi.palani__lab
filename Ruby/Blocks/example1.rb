
["i'm","maha",5.5].each do|i|
    puts i
end
["Hello","world",20].each{|i| puts i}

numbers = [1,2,3].map do |i|
   # x = i + 2
   # x = x * 2
   # x
   puts i
  end

def run_thrice_with_index
	yield 0
	yield 1
	yield 2
end

run_thrice_with_index { |i| puts "#{i} Tada!" }