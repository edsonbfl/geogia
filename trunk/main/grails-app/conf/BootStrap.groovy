
class BootStrap {

     def init = { servletContext ->     
     	new Product(name:"A", price:20).save()
     	new Product(name:"B", price:30).save()
     }
     
     def destroy = {
     }
     
} 