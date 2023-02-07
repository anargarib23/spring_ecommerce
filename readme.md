Category
```json
{
  "id" : Long,
  "name": "",
  "Subcategories" : List<Subcategory>
}
```
Subcategory
```json
{
  "id" : Long,
  "name" : "",
  "products": List<Product> 
}
```

Product
```json
{
  "id": Long,
  "name": "",
  "price": Double,
  "images": List<Image>,
  "specifications": List<Specification>
}
```

Image
```json
{
  "id": Long,
  "name": "",
  "source": "",
  "uploadDate": Date
}
```

ImageSlider
```json
{
  "id": Long,
  "images": List<Image>
}
```

Specification
```json
{
  "id": Long,
  "name": "",
  "content": ""
}
```