fun main(){
    //object for playlist
var playlist: MyPlaylist = MyPlaylist("","","","","")
    playlist.setPlaylistSongs("cash app","going home","rocky","waves","Damn")
    println(playlist.getPlaylistSongs())

    //object for siblings
    var siblings: SiblingsAge = SiblingsAge(0,0,0,0,0)
    siblings.setSiblingsAgeDetails(31,27,25,23,19)
    println(siblings.getSiblingsAgeDetails())

    //object for currencies
    var currencies: Currency = Currency(0.0,0.0,0.0,0.0,0.0)
    currencies.setCurrencyDetails(500.0,1000.0,650.0,750.0,370.0)
    println(currencies.getCurrencyDetails())

    //object for nigeriaArtiste
    var nigeriaArtiste: TopNigeriaArtiste = TopNigeriaArtiste(0,"",0,"",0)
    nigeriaArtiste.setNigeriaArtisteName(1,"second",3,"fourth",5)
    println(nigeriaArtiste.getNigeriaArtisteName())

    //object for firstAid
    var firstAid: FirstAidBox = FirstAidBox(0,"",0,"",0)
    firstAid.setFirstAidBoxDetails(5,"menthol",3,"wood",1)
    println(firstAid.getFirstAidBoxDetails())



}
//Defining five classes with five instance variables and one constructor
class MyPlaylist {
    var hipHop: String = "cash app"
    var jazz: String = "going home"
    var rock: String = "rocky"
    var blues: String = "waves"
    var afroBeats: String = "Damn"


    constructor(hipHopName: String, jazzName: String, rockName: String, bluesName: String, afroBeatsName: String) {
        this.hipHop = hipHopName
        this.jazz = jazzName
        this.rock = rockName
        this.blues = bluesName
        this.afroBeats = afroBeatsName
    }
    fun getPlaylistSongs(): String{
        return "\nhipHopN: ${this.hipHop}\njazzN: ${this.jazz}\nrockN: ${this.rock}\nbluesN: ${this.blues}\nafroBeatsN: ${this.afroBeats}"
    }
    fun setPlaylistSongs(hipHopName: String, jazzName: String, rockName: String, bluesName: String, afroBeatsName: String){
        this.hipHop = hipHopName
        this.jazz = jazzName
        this.rock = rockName
        this.blues = bluesName
        this.afroBeats = afroBeatsName
    }
}

   class SiblingsAge{
       var firstBorn: Int = 31
       var secondBorn: Int = 27
       var thirdBorn: Int = 25
       var fourthBorn: Int = 23
       var fifthBorn: Int = 19


       constructor(firstBornAge: Int,secondBornAge: Int,thirdBornAge: Int,fourthBornAge: Int,fifthBornAge: Int){
           this.firstBorn = firstBornAge
           this.secondBorn = secondBornAge
           this.thirdBorn = thirdBornAge
           this.fourthBorn = fourthBornAge
           this.fifthBorn = fifthBornAge
       }
       fun getSiblingsAgeDetails(): String{
           return "\nfBornAge: ${this.firstBorn}\nsBornAge: ${this.secondBorn}\ntBornAge: ${this.thirdBorn}\nfoBornAge: ${this.fourthBorn}\nfiBornAge: ${this.fifthBorn}"
       }
       fun setSiblingsAgeDetails(firstBornAge: Int,secondBornAge: Int,thirdBornAge: Int,fourthBornAge: Int,fifthBornAge: Int){
           this.firstBorn = firstBornAge
           this.secondBorn = secondBornAge
           this.thirdBorn = thirdBornAge
           this.fourthBorn = fourthBornAge
           this.fifthBorn = fifthBornAge
       }
   }

    class Currency{
        var dollar: Double = 500.0
        var naira: Double = 1000.0
        var euro: Double = 650.0
        var pounds: Double = 750.0
        var chile: Double =  370.0


        constructor(dollarPrice: Double,nairaPrice: Double,euroPrice:Double,poundsPrice: Double,chilePrice:Double){
            this.dollar = dollarPrice
            this.naira = nairaPrice
            this.euro = euroPrice
            this.pounds = poundsPrice
            this.chile = chilePrice
        }
        fun getCurrencyDetails(): String{
            return "\ndPrice: ${this.dollar}\nnPrice: ${this.naira}\nePrice: ${this.euro}\npPrice: ${this.pounds}\ncPrice: ${this.chile}"
        }
        fun setCurrencyDetails(dollarPrice: Double,nairaPrice: Double,euroPrice:Double,poundsPrice: Double,chilePrice:Double){
            this.dollar = dollarPrice
            this.naira = nairaPrice
            this.euro = euroPrice
            this.pounds = poundsPrice
            this.chile = chilePrice
        }
    }
    class TopNigeriaArtiste{
        var davido: Int = 1
        var wizkid: String = "second"
        var burnaBoy: Int = 3
        var olamide:  String = "fourth"
        var omayLay: Int = 5


        constructor(davidoNum: Int,wizkidLevel: String,burnaBoyNum: Int,olamideLevel:String,omayLayNum:Int){
            this.davido = davidoNum
            this.wizkid = wizkidLevel
            this.burnaBoy = burnaBoyNum
            this.olamide = olamideLevel
            this.omayLay = omayLayNum
        }
        fun getNigeriaArtisteName(): String{
            return "\ndavidoName: ${this.davido}\nwizkidName: ${this.wizkid}\nburnaBoyName: ${this.burnaBoy}\nolamideName: ${this.olamide}\nomayLayNme: ${this.omayLay}"
        }
        fun setNigeriaArtisteName(davidoNum: Int,wizkidLevel: String,burnaBoyNum: Int,olamideLevel:String,omayLayNum: Int){
            this.davido = davidoNum
            this.wizkid = wizkidLevel
            this.burnaBoy = burnaBoyNum
            this.olamide = olamideLevel
            this.omayLay = omayLayNum
        }
    }
    class FirstAidBox{
        var noOfPlasters: Int = 5
        var spiritType: String = "menthol"
        var noOfBandage: Int = 3
        var cottonWood: String = "wood"
        var needle: Int = 1


        constructor(noOfPlastersNum: Int,spiritTypeName: String,noOfBandageNum: Int,cottonWoodName:String,needleNum: Int){
            this.noOfPlasters = noOfPlastersNum
            this.spiritType = spiritTypeName
            this.noOfBandage = noOfBandageNum
            this.cottonWood = cottonWoodName
            this.needle = needleNum
        }
        fun getFirstAidBoxDetails(): String{
            return "\nplastersDetails: ${this.noOfPlasters}\nspiritDetails: ${this.spiritType}\nbandageDetails: ${this.noOfBandage}\ncottonWoodDetails: ${this.cottonWood}\nneedleDetails: ${this.needle}"
        }
        fun setFirstAidBoxDetails(noOfPlastersNum: Int,spiritTypeName: String,noOfBandageNum: Int,cottonWoodName:String,needleNum:Int){
            this.noOfPlasters = noOfPlastersNum
            this.spiritType = spiritTypeName
            this.noOfBandage = noOfBandageNum
            this.cottonWood = cottonWoodName
            this.needle = needleNum
        }

    }



