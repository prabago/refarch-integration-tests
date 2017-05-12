
package inventory.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the inventory.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateItemResponse_QNAME = new QName("http://ws.inventory/", "updateItemResponse");
    private final static QName _Items_QNAME = new QName("http://ws.inventory/", "items");
    private final static QName _DeleteItemResponse_QNAME = new QName("http://ws.inventory/", "deleteItemResponse");
    private final static QName _ItemByName_QNAME = new QName("http://ws.inventory/", "itemByName");
    private final static QName _ItemByNameResponse_QNAME = new QName("http://ws.inventory/", "itemByNameResponse");
    private final static QName _DeleteItem_QNAME = new QName("http://ws.inventory/", "deleteItem");
    private final static QName _NewItemResponse_QNAME = new QName("http://ws.inventory/", "newItemResponse");
    private final static QName _Item_QNAME = new QName("http://ws.inventory/", "Item");
    private final static QName _DALFault_QNAME = new QName("http://ws.inventory/", "DALFault");
    private final static QName _ItemByIdResponse_QNAME = new QName("http://ws.inventory/", "itemByIdResponse");
    private final static QName _SayHelloResponse_QNAME = new QName("http://ws.inventory/", "sayHelloResponse");
    private final static QName _UpdateItem_QNAME = new QName("http://ws.inventory/", "updateItem");
    private final static QName _ItemsResponse_QNAME = new QName("http://ws.inventory/", "itemsResponse");
    private final static QName _NewItem_QNAME = new QName("http://ws.inventory/", "newItem");
    private final static QName _SayHello_QNAME = new QName("http://ws.inventory/", "sayHello");
    private final static QName _ItemById_QNAME = new QName("http://ws.inventory/", "itemById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: inventory.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemById }
     * 
     */
    public ItemById createItemById() {
        return new ItemById();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link NewItem }
     * 
     */
    public NewItem createNewItem() {
        return new NewItem();
    }

    /**
     * Create an instance of {@link ItemsResponse }
     * 
     */
    public ItemsResponse createItemsResponse() {
        return new ItemsResponse();
    }

    /**
     * Create an instance of {@link ItemByIdResponse }
     * 
     */
    public ItemByIdResponse createItemByIdResponse() {
        return new ItemByIdResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link UpdateItem }
     * 
     */
    public UpdateItem createUpdateItem() {
        return new UpdateItem();
    }

    /**
     * Create an instance of {@link DalFault }
     * 
     */
    public DalFault createDalFault() {
        return new DalFault();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link NewItemResponse }
     * 
     */
    public NewItemResponse createNewItemResponse() {
        return new NewItemResponse();
    }

    /**
     * Create an instance of {@link DeleteItem }
     * 
     */
    public DeleteItem createDeleteItem() {
        return new DeleteItem();
    }

    /**
     * Create an instance of {@link ItemByNameResponse }
     * 
     */
    public ItemByNameResponse createItemByNameResponse() {
        return new ItemByNameResponse();
    }

    /**
     * Create an instance of {@link ItemByName }
     * 
     */
    public ItemByName createItemByName() {
        return new ItemByName();
    }

    /**
     * Create an instance of {@link DeleteItemResponse }
     * 
     */
    public DeleteItemResponse createDeleteItemResponse() {
        return new DeleteItemResponse();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link UpdateItemResponse }
     * 
     */
    public UpdateItemResponse createUpdateItemResponse() {
        return new UpdateItemResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "updateItemResponse")
    public JAXBElement<UpdateItemResponse> createUpdateItemResponse(UpdateItemResponse value) {
        return new JAXBElement<UpdateItemResponse>(_UpdateItemResponse_QNAME, UpdateItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Items }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "items")
    public JAXBElement<Items> createItems(Items value) {
        return new JAXBElement<Items>(_Items_QNAME, Items.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "deleteItemResponse")
    public JAXBElement<DeleteItemResponse> createDeleteItemResponse(DeleteItemResponse value) {
        return new JAXBElement<DeleteItemResponse>(_DeleteItemResponse_QNAME, DeleteItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "itemByName")
    public JAXBElement<ItemByName> createItemByName(ItemByName value) {
        return new JAXBElement<ItemByName>(_ItemByName_QNAME, ItemByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "itemByNameResponse")
    public JAXBElement<ItemByNameResponse> createItemByNameResponse(ItemByNameResponse value) {
        return new JAXBElement<ItemByNameResponse>(_ItemByNameResponse_QNAME, ItemByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "deleteItem")
    public JAXBElement<DeleteItem> createDeleteItem(DeleteItem value) {
        return new JAXBElement<DeleteItem>(_DeleteItem_QNAME, DeleteItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "newItemResponse")
    public JAXBElement<NewItemResponse> createNewItemResponse(NewItemResponse value) {
        return new JAXBElement<NewItemResponse>(_NewItemResponse_QNAME, NewItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "Item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DalFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "DALFault")
    public JAXBElement<DalFault> createDALFault(DalFault value) {
        return new JAXBElement<DalFault>(_DALFault_QNAME, DalFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "itemByIdResponse")
    public JAXBElement<ItemByIdResponse> createItemByIdResponse(ItemByIdResponse value) {
        return new JAXBElement<ItemByIdResponse>(_ItemByIdResponse_QNAME, ItemByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "updateItem")
    public JAXBElement<UpdateItem> createUpdateItem(UpdateItem value) {
        return new JAXBElement<UpdateItem>(_UpdateItem_QNAME, UpdateItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "itemsResponse")
    public JAXBElement<ItemsResponse> createItemsResponse(ItemsResponse value) {
        return new JAXBElement<ItemsResponse>(_ItemsResponse_QNAME, ItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "newItem")
    public JAXBElement<NewItem> createNewItem(NewItem value) {
        return new JAXBElement<NewItem>(_NewItem_QNAME, NewItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "itemById")
    public JAXBElement<ItemById> createItemById(ItemById value) {
        return new JAXBElement<ItemById>(_ItemById_QNAME, ItemById.class, null, value);
    }

}
