package br.com.digitalhouse.desafio3_webservices.comicsHQ
import com.google.gson.annotations.SerializedName

data class Prices (

	@SerializedName("type") val type : String,
	@SerializedName("price") val price : String
)