classDiagram
direction BT
class CATEGORY {
   character varying(255) NAME
   bigint PARENT_ID
   bigint CATEGORY_ID
}
class CATEGORY_ITEM {
   bigint CATEGORY_ID
   bigint ITEM_ID
}
class DELIVERY {
   character varying(255) CITY
   character varying(255) STREET
   character varying(255) ZIPCODE
   character varying(255) STATUS
   bigint DELIVERY_ID
}
class ITEM {
   character varying(31) DTYPE
   character varying(255) NAME
   integer PRICE
   integer STOCK_QUANTITY
   character varying(255) ARTIST
   character varying(255) ETC
   character varying(255) AUTHOR
   character varying(255) ISBN
   character varying(255) ACTOR
   character varying(255) DIRECTOR
   bigint ITEM_ID
}
class MEMBER {
   character varying(255) CITY
   character varying(255) STREET
   character varying(255) ZIPCODE
   character varying(255) NAME
   bigint MEMBER_ID
}
class ORDERS {
   timestamp ORDER_DATE
   character varying(255) STATUS
   bigint DELIVERY_ID
   bigint MEMBER_ID
   bigint ORDER_ID
}
class ORDER_ITEM {
   integer COUNT
   integer ORDER_PRICE
   bigint ITEM_ID
   bigint ORDER_ID
   bigint ORDER_ITEM_ID
}

CATEGORY  -->  CATEGORY : PARENT_ID:CATEGORY_ID
CATEGORY_ITEM  -->  CATEGORY : CATEGORY_ID
CATEGORY_ITEM  -->  ITEM : ITEM_ID
ORDERS  -->  DELIVERY : DELIVERY_ID
ORDERS  -->  MEMBER : MEMBER_ID
ORDER_ITEM  -->  ITEM : ITEM_ID
ORDER_ITEM  -->  ORDERS : ORDER_ID
