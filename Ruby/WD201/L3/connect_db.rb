require 'active_record'

def connect_db!
  ActiveRecord::Base.establish_connection(
    host: 'localhost', 
    port:3306,
    adapter: 'mysql2',
    database: 'ruby', 
    user: 'maha', 
    password: 'Freshworks@2022'
  )
  puts "Connected"
end
connect_db!