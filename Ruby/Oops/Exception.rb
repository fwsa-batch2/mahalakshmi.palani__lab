begin   # try
    i = 5
    j = i/0
rescue  ZeroDivisionError => zde  #catch
    puts zde.message
    puts zde.backtrace.inspect
ensure      # final
    puts "I am called Finally!"
end
