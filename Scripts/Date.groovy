class GetTime{
    String Date(){
        def Date = new Date().format( 'yyyyMMdd' )
        return Date
    }
    
    String Date(Int days){
        def today = new Date()
        def newDate = today - days
        rturn newDate
    }
}