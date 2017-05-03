package beer.model;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Beer {
	@Id
	private final String id;
	@Field
	private double abv;
	@Field
	private String name;
	@Field
	private int upc;
	@Field
	private String description;
	@Field
	private String style;
	@Field
	private String breweryId;
	@Field
	private String type;
	@Field
	private String category;
	@Field
	private int ibu;
	@Field
	private String updated;
	@Field
	private int srm;

	public Beer(String id, double abv, String name, int upc, String description, String style, String breweryId,
		String type, String category, int ibu, String updated, int srm) {
		this.id = id;
		this.abv = abv;
		this.name = name;
		this.upc = upc;
		this.description = description;
		this.style = style;
		this.breweryId = breweryId;
		this.type = type;
		this.category = category;
		this.ibu = ibu;
		this.updated = updated;
		this.srm = srm;
	}

	public void setAbv(double abv){
		this.abv = abv;
	}

	public double getAbv(){
		return abv;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUpc(int upc){
		this.upc = upc;
	}

	public int getUpc(){
		return upc;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setStyle(String style){
		this.style = style;
	}

	public String getStyle(){
		return style;
	}

	public void setBreweryId(String breweryId){
		this.breweryId = breweryId;
	}

	public String getBreweryId(){
		return breweryId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setIbu(int ibu){
		this.ibu = ibu;
	}

	public int getIbu(){
		return ibu;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	public void setSrm(int srm){
		this.srm = srm;
	}

	public int getSrm(){
		return srm;
	}

	@Override
 	public String toString(){
		return 
			"beer.model.Beer{" +
			"abv = '" + abv + '\'' + 
			",name = '" + name + '\'' + 
			",upc = '" + upc + '\'' + 
			",description = '" + description + '\'' + 
			",style = '" + style + '\'' + 
			",brewery_id = '" + breweryId + '\'' + 
			",type = '" + type + '\'' + 
			",category = '" + category + '\'' + 
			",ibu = '" + ibu + '\'' + 
			",updated = '" + updated + '\'' + 
			",srm = '" + srm + '\'' + 
			"}";
		}
}
