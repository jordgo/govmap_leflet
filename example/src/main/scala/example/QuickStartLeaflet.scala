package example

import com.felstar.scalajs.leaflet._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.Dynamic.global

@JSExport
object QuickStartLeaflet extends {

  @JSExport
  def main(el: String): LMap = {

    //https://cdn.govmap.gov.il/B0B2309BNTL/L00/R0000001e/C00000018.png
    //https://cdn.govmap.gov.il/B0B2309BNTL/L08/R00004b78/C0000407a.png

    val lmap = L.map(el).setView((31.768317, 35.213707), 7)

    val tileLayer = L.tileLayer("https://cdn.govmap.gov.il/B0B2309BNTL/L0{z}/R{x}/C{y}.png", //"https://cdn.govmap.gov.il/B0B2309BNTL/L00/R0000001e/C0000{y}.png",
//    val tileLayer = L.tileLayer("https://api.mapbox.com/v4/mapbox.mapbox-streets-v8/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibXQ4MDAiLCJhIjoiY2trNTc5YnRzMDhvbjJ4bzdxZWpjY3ZpdSJ9.G9-iYpE9MVS4fL-PDS-AZA", //"https://cdn.govmap.gov.il/B0B2309BNTL/L00/R0000001e/C0000{y}.png",
//val tileLayer = L.tileLayer("https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png",
  TileLayerOptions.id("mapbox.streets").maxZoom(19).attribution("""Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors,
                                                                      |<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>,
                                                                      |Imagery © <a href="http://mapbox.com">Mapbox</a>""".stripMargin))
    tileLayer.addTo(lmap)

//    L.marker((51.5, -0.09), MarkerOptions.title("I am a marker")).bindPopup("I am a popup").addTo(lmap)
//
//    val circle=L.circle((51.508, -0.11), CircleOptions.color("red").fillColor("#f03").fillOpacity(0.5).radius(500))
//      .bindPopup("I am a circle").addTo(lmap)
//
//    val circle2=L.circle((51.516, -0.11), CircleOptions.color("green").fillColor("#f03").fillOpacity(0.5).radius(200)).addTo(lmap)
//
//     val points=List((51.509, -0.08),(51.503, -0.06),(51.51, -0.047))
//     L.polygon(points).bindPopup("I am a polygon").addTo(lmap)
//
//    val popup = L.popup().setLatLng((51.5, -0.09)).setContent("I am a <b>standalone</b> popup.").openOn(lmap)

    lmap
  }
}