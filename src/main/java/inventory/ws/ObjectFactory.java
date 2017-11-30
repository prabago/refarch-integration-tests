
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

    private final static QName _UpdateInventoryEntry_QNAME = new QName("http://ws.inventory/", "updateInventoryEntry");
    private final static QName _DeleteItemResponse_QNAME = new QName("http://ws.inventory/", "deleteItemResponse");
    private final static QName _GetInventoryForSiteAndItemId_QNAME = new QName("http://ws.inventory/", "getInventoryForSiteAndItemId");
    private final static QName _UpdateInventoryEntryResponse_QNAME = new QName("http://ws.inventory/", "updateInventoryEntryResponse");
    private final static QName _UpdateInventory_QNAME = new QName("http://ws.inventory/", "updateInventory");
    private final static QName _NewInventoryEntryResponse_QNAME = new QName("http://ws.inventory/", "newInventoryEntryResponse");
    private final static QName _DeleteItem_QNAME = new QName("http://ws.inventory/", "deleteItem");
    private final static QName _GetItemsPerSite_QNAME = new QName("http://ws.inventory/", "getItemsPerSite");
    private final static QName _GetInventoryById_QNAME = new QName("http://ws.inventory/", "getInventoryById");
    private final static QName _GetInventoryByIdResponse_QNAME = new QName("http://ws.inventory/", "getInventoryByIdResponse");
    private final static QName _GetInventoryBySite_QNAME = new QName("http://ws.inventory/", "getInventoryBySite");
    private final static QName _GetInventoryCrossSiteResponse_QNAME = new QName("http://ws.inventory/", "getInventoryCrossSiteResponse");
    private final static QName _DeleteSupplier_QNAME = new QName("http://ws.inventory/", "deleteSupplier");
    private final static QName _SuppliersResponse_QNAME = new QName("http://ws.inventory/", "suppliersResponse");
    private final static QName _Supplier_QNAME = new QName("http://ws.inventory/", "Supplier");
    private final static QName _GetInventoryCrossSite_QNAME = new QName("http://ws.inventory/", "getInventoryCrossSite");
    private final static QName _ItemByNameResponse_QNAME = new QName("http://ws.inventory/", "itemByNameResponse");
    private final static QName _NewInventoryEntry_QNAME = new QName("http://ws.inventory/", "newInventoryEntry");
    private final static QName _SupplierByName_QNAME = new QName("http://ws.inventory/", "supplierByName");
    private final static QName _ItemByIdResponse_QNAME = new QName("http://ws.inventory/", "itemByIdResponse");
    private final static QName _DeleteInventoryEntryResponse_QNAME = new QName("http://ws.inventory/", "deleteInventoryEntryResponse");
    private final static QName _NewSupplier_QNAME = new QName("http://ws.inventory/", "newSupplier");
    private final static QName _SupplierByNameResponse_QNAME = new QName("http://ws.inventory/", "supplierByNameResponse");
    private final static QName _GetInventoryForSiteAndItemIdResponse_QNAME = new QName("http://ws.inventory/", "getInventoryForSiteAndItemIdResponse");
    private final static QName _GetInventoryBySiteResponse_QNAME = new QName("http://ws.inventory/", "getInventoryBySiteResponse");
    private final static QName _Items_QNAME = new QName("http://ws.inventory/", "items");
    private final static QName _SearchByNameResponse_QNAME = new QName("http://ws.inventory/", "searchByNameResponse");
    private final static QName _UpdateSupplierResponse_QNAME = new QName("http://ws.inventory/", "updateSupplierResponse");
    private final static QName _SupplierById_QNAME = new QName("http://ws.inventory/", "supplierById");
    private final static QName _SayHelloResponse_QNAME = new QName("http://ws.inventory/", "sayHelloResponse");
    private final static QName _UpdateItem_QNAME = new QName("http://ws.inventory/", "updateItem");
    private final static QName _ItemsResponse_QNAME = new QName("http://ws.inventory/", "itemsResponse");
    private final static QName _NewItem_QNAME = new QName("http://ws.inventory/", "newItem");
    private final static QName _SupplierByIdResponse_QNAME = new QName("http://ws.inventory/", "supplierByIdResponse");
    private final static QName _SayHello_QNAME = new QName("http://ws.inventory/", "sayHello");
    private final static QName _ItemById_QNAME = new QName("http://ws.inventory/", "itemById");
    private final static QName _UpdateInventoryResponse_QNAME = new QName("http://ws.inventory/", "updateInventoryResponse");
    private final static QName _UpdateItemResponse_QNAME = new QName("http://ws.inventory/", "updateItemResponse");
    private final static QName _DeleteSupplierResponse_QNAME = new QName("http://ws.inventory/", "deleteSupplierResponse");
    private final static QName _ItemByName_QNAME = new QName("http://ws.inventory/", "itemByName");
    private final static QName _SearchByName_QNAME = new QName("http://ws.inventory/", "searchByName");
    private final static QName _NewItemResponse_QNAME = new QName("http://ws.inventory/", "newItemResponse");
    private final static QName _Item_QNAME = new QName("http://ws.inventory/", "Item");
    private final static QName _DALFault_QNAME = new QName("http://ws.inventory/", "DALFault");
    private final static QName _UpdateSupplier_QNAME = new QName("http://ws.inventory/", "updateSupplier");
    private final static QName _GetItemsPerSiteResponse_QNAME = new QName("http://ws.inventory/", "getItemsPerSiteResponse");
    private final static QName _DeleteInventoryEntry_QNAME = new QName("http://ws.inventory/", "deleteInventoryEntry");
    private final static QName _NewSupplierResponse_QNAME = new QName("http://ws.inventory/", "newSupplierResponse");
    private final static QName _Suppliers_QNAME = new QName("http://ws.inventory/", "suppliers");
    private final static QName _SupplierId_QNAME = new QName("", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: inventory.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Suppliers }
     * 
     */
    public Suppliers createSuppliers() {
        return new Suppliers();
    }

    /**
     * Create an instance of {@link NewSupplierResponse }
     * 
     */
    public NewSupplierResponse createNewSupplierResponse() {
        return new NewSupplierResponse();
    }

    /**
     * Create an instance of {@link DeleteInventoryEntry }
     * 
     */
    public DeleteInventoryEntry createDeleteInventoryEntry() {
        return new DeleteInventoryEntry();
    }

    /**
     * Create an instance of {@link GetItemsPerSiteResponse }
     * 
     */
    public GetItemsPerSiteResponse createGetItemsPerSiteResponse() {
        return new GetItemsPerSiteResponse();
    }

    /**
     * Create an instance of {@link UpdateSupplier }
     * 
     */
    public UpdateSupplier createUpdateSupplier() {
        return new UpdateSupplier();
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
     * Create an instance of {@link SearchByName }
     * 
     */
    public SearchByName createSearchByName() {
        return new SearchByName();
    }

    /**
     * Create an instance of {@link ItemByName }
     * 
     */
    public ItemByName createItemByName() {
        return new ItemByName();
    }

    /**
     * Create an instance of {@link DeleteSupplierResponse }
     * 
     */
    public DeleteSupplierResponse createDeleteSupplierResponse() {
        return new DeleteSupplierResponse();
    }

    /**
     * Create an instance of {@link UpdateItemResponse }
     * 
     */
    public UpdateItemResponse createUpdateItemResponse() {
        return new UpdateItemResponse();
    }

    /**
     * Create an instance of {@link ItemById }
     * 
     */
    public ItemById createItemById() {
        return new ItemById();
    }

    /**
     * Create an instance of {@link UpdateInventoryResponse }
     * 
     */
    public UpdateInventoryResponse createUpdateInventoryResponse() {
        return new UpdateInventoryResponse();
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
     * Create an instance of {@link SupplierByIdResponse }
     * 
     */
    public SupplierByIdResponse createSupplierByIdResponse() {
        return new SupplierByIdResponse();
    }

    /**
     * Create an instance of {@link ItemsResponse }
     * 
     */
    public ItemsResponse createItemsResponse() {
        return new ItemsResponse();
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
     * Create an instance of {@link SupplierById }
     * 
     */
    public SupplierById createSupplierById() {
        return new SupplierById();
    }

    /**
     * Create an instance of {@link SearchByNameResponse }
     * 
     */
    public SearchByNameResponse createSearchByNameResponse() {
        return new SearchByNameResponse();
    }

    /**
     * Create an instance of {@link UpdateSupplierResponse }
     * 
     */
    public UpdateSupplierResponse createUpdateSupplierResponse() {
        return new UpdateSupplierResponse();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link GetInventoryBySiteResponse }
     * 
     */
    public GetInventoryBySiteResponse createGetInventoryBySiteResponse() {
        return new GetInventoryBySiteResponse();
    }

    /**
     * Create an instance of {@link GetInventoryForSiteAndItemIdResponse }
     * 
     */
    public GetInventoryForSiteAndItemIdResponse createGetInventoryForSiteAndItemIdResponse() {
        return new GetInventoryForSiteAndItemIdResponse();
    }

    /**
     * Create an instance of {@link NewSupplier }
     * 
     */
    public NewSupplier createNewSupplier() {
        return new NewSupplier();
    }

    /**
     * Create an instance of {@link SupplierByNameResponse }
     * 
     */
    public SupplierByNameResponse createSupplierByNameResponse() {
        return new SupplierByNameResponse();
    }

    /**
     * Create an instance of {@link DeleteInventoryEntryResponse }
     * 
     */
    public DeleteInventoryEntryResponse createDeleteInventoryEntryResponse() {
        return new DeleteInventoryEntryResponse();
    }

    /**
     * Create an instance of {@link ItemByIdResponse }
     * 
     */
    public ItemByIdResponse createItemByIdResponse() {
        return new ItemByIdResponse();
    }

    /**
     * Create an instance of {@link SupplierByName }
     * 
     */
    public SupplierByName createSupplierByName() {
        return new SupplierByName();
    }

    /**
     * Create an instance of {@link NewInventoryEntry }
     * 
     */
    public NewInventoryEntry createNewInventoryEntry() {
        return new NewInventoryEntry();
    }

    /**
     * Create an instance of {@link ItemByNameResponse }
     * 
     */
    public ItemByNameResponse createItemByNameResponse() {
        return new ItemByNameResponse();
    }

    /**
     * Create an instance of {@link GetInventoryCrossSite }
     * 
     */
    public GetInventoryCrossSite createGetInventoryCrossSite() {
        return new GetInventoryCrossSite();
    }

    /**
     * Create an instance of {@link Supplier }
     * 
     */
    public Supplier createSupplier() {
        return new Supplier();
    }

    /**
     * Create an instance of {@link DeleteSupplier }
     * 
     */
    public DeleteSupplier createDeleteSupplier() {
        return new DeleteSupplier();
    }

    /**
     * Create an instance of {@link SuppliersResponse }
     * 
     */
    public SuppliersResponse createSuppliersResponse() {
        return new SuppliersResponse();
    }

    /**
     * Create an instance of {@link GetInventoryCrossSiteResponse }
     * 
     */
    public GetInventoryCrossSiteResponse createGetInventoryCrossSiteResponse() {
        return new GetInventoryCrossSiteResponse();
    }

    /**
     * Create an instance of {@link GetInventoryBySite }
     * 
     */
    public GetInventoryBySite createGetInventoryBySite() {
        return new GetInventoryBySite();
    }

    /**
     * Create an instance of {@link GetInventoryByIdResponse }
     * 
     */
    public GetInventoryByIdResponse createGetInventoryByIdResponse() {
        return new GetInventoryByIdResponse();
    }

    /**
     * Create an instance of {@link GetInventoryById }
     * 
     */
    public GetInventoryById createGetInventoryById() {
        return new GetInventoryById();
    }

    /**
     * Create an instance of {@link GetItemsPerSite }
     * 
     */
    public GetItemsPerSite createGetItemsPerSite() {
        return new GetItemsPerSite();
    }

    /**
     * Create an instance of {@link DeleteItem }
     * 
     */
    public DeleteItem createDeleteItem() {
        return new DeleteItem();
    }

    /**
     * Create an instance of {@link NewInventoryEntryResponse }
     * 
     */
    public NewInventoryEntryResponse createNewInventoryEntryResponse() {
        return new NewInventoryEntryResponse();
    }

    /**
     * Create an instance of {@link UpdateInventory }
     * 
     */
    public UpdateInventory createUpdateInventory() {
        return new UpdateInventory();
    }

    /**
     * Create an instance of {@link UpdateInventoryEntryResponse }
     * 
     */
    public UpdateInventoryEntryResponse createUpdateInventoryEntryResponse() {
        return new UpdateInventoryEntryResponse();
    }

    /**
     * Create an instance of {@link GetInventoryForSiteAndItemId }
     * 
     */
    public GetInventoryForSiteAndItemId createGetInventoryForSiteAndItemId() {
        return new GetInventoryForSiteAndItemId();
    }

    /**
     * Create an instance of {@link DeleteItemResponse }
     * 
     */
    public DeleteItemResponse createDeleteItemResponse() {
        return new DeleteItemResponse();
    }

    /**
     * Create an instance of {@link UpdateInventoryEntry }
     * 
     */
    public UpdateInventoryEntry createUpdateInventoryEntry() {
        return new UpdateInventoryEntry();
    }

    /**
     * Create an instance of {@link Inventory }
     * 
     */
    public Inventory createInventory() {
        return new Inventory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInventoryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "updateInventoryEntry")
    public JAXBElement<UpdateInventoryEntry> createUpdateInventoryEntry(UpdateInventoryEntry value) {
        return new JAXBElement<UpdateInventoryEntry>(_UpdateInventoryEntry_QNAME, UpdateInventoryEntry.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryForSiteAndItemId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getInventoryForSiteAndItemId")
    public JAXBElement<GetInventoryForSiteAndItemId> createGetInventoryForSiteAndItemId(GetInventoryForSiteAndItemId value) {
        return new JAXBElement<GetInventoryForSiteAndItemId>(_GetInventoryForSiteAndItemId_QNAME, GetInventoryForSiteAndItemId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInventoryEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "updateInventoryEntryResponse")
    public JAXBElement<UpdateInventoryEntryResponse> createUpdateInventoryEntryResponse(UpdateInventoryEntryResponse value) {
        return new JAXBElement<UpdateInventoryEntryResponse>(_UpdateInventoryEntryResponse_QNAME, UpdateInventoryEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInventory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "updateInventory")
    public JAXBElement<UpdateInventory> createUpdateInventory(UpdateInventory value) {
        return new JAXBElement<UpdateInventory>(_UpdateInventory_QNAME, UpdateInventory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewInventoryEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "newInventoryEntryResponse")
    public JAXBElement<NewInventoryEntryResponse> createNewInventoryEntryResponse(NewInventoryEntryResponse value) {
        return new JAXBElement<NewInventoryEntryResponse>(_NewInventoryEntryResponse_QNAME, NewInventoryEntryResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsPerSite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getItemsPerSite")
    public JAXBElement<GetItemsPerSite> createGetItemsPerSite(GetItemsPerSite value) {
        return new JAXBElement<GetItemsPerSite>(_GetItemsPerSite_QNAME, GetItemsPerSite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getInventoryById")
    public JAXBElement<GetInventoryById> createGetInventoryById(GetInventoryById value) {
        return new JAXBElement<GetInventoryById>(_GetInventoryById_QNAME, GetInventoryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getInventoryByIdResponse")
    public JAXBElement<GetInventoryByIdResponse> createGetInventoryByIdResponse(GetInventoryByIdResponse value) {
        return new JAXBElement<GetInventoryByIdResponse>(_GetInventoryByIdResponse_QNAME, GetInventoryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryBySite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getInventoryBySite")
    public JAXBElement<GetInventoryBySite> createGetInventoryBySite(GetInventoryBySite value) {
        return new JAXBElement<GetInventoryBySite>(_GetInventoryBySite_QNAME, GetInventoryBySite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryCrossSiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getInventoryCrossSiteResponse")
    public JAXBElement<GetInventoryCrossSiteResponse> createGetInventoryCrossSiteResponse(GetInventoryCrossSiteResponse value) {
        return new JAXBElement<GetInventoryCrossSiteResponse>(_GetInventoryCrossSiteResponse_QNAME, GetInventoryCrossSiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "deleteSupplier")
    public JAXBElement<DeleteSupplier> createDeleteSupplier(DeleteSupplier value) {
        return new JAXBElement<DeleteSupplier>(_DeleteSupplier_QNAME, DeleteSupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuppliersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "suppliersResponse")
    public JAXBElement<SuppliersResponse> createSuppliersResponse(SuppliersResponse value) {
        return new JAXBElement<SuppliersResponse>(_SuppliersResponse_QNAME, SuppliersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Supplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "Supplier")
    public JAXBElement<Supplier> createSupplier(Supplier value) {
        return new JAXBElement<Supplier>(_Supplier_QNAME, Supplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryCrossSite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getInventoryCrossSite")
    public JAXBElement<GetInventoryCrossSite> createGetInventoryCrossSite(GetInventoryCrossSite value) {
        return new JAXBElement<GetInventoryCrossSite>(_GetInventoryCrossSite_QNAME, GetInventoryCrossSite.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NewInventoryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "newInventoryEntry")
    public JAXBElement<NewInventoryEntry> createNewInventoryEntry(NewInventoryEntry value) {
        return new JAXBElement<NewInventoryEntry>(_NewInventoryEntry_QNAME, NewInventoryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "supplierByName")
    public JAXBElement<SupplierByName> createSupplierByName(SupplierByName value) {
        return new JAXBElement<SupplierByName>(_SupplierByName_QNAME, SupplierByName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInventoryEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "deleteInventoryEntryResponse")
    public JAXBElement<DeleteInventoryEntryResponse> createDeleteInventoryEntryResponse(DeleteInventoryEntryResponse value) {
        return new JAXBElement<DeleteInventoryEntryResponse>(_DeleteInventoryEntryResponse_QNAME, DeleteInventoryEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewSupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "newSupplier")
    public JAXBElement<NewSupplier> createNewSupplier(NewSupplier value) {
        return new JAXBElement<NewSupplier>(_NewSupplier_QNAME, NewSupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "supplierByNameResponse")
    public JAXBElement<SupplierByNameResponse> createSupplierByNameResponse(SupplierByNameResponse value) {
        return new JAXBElement<SupplierByNameResponse>(_SupplierByNameResponse_QNAME, SupplierByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryForSiteAndItemIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getInventoryForSiteAndItemIdResponse")
    public JAXBElement<GetInventoryForSiteAndItemIdResponse> createGetInventoryForSiteAndItemIdResponse(GetInventoryForSiteAndItemIdResponse value) {
        return new JAXBElement<GetInventoryForSiteAndItemIdResponse>(_GetInventoryForSiteAndItemIdResponse_QNAME, GetInventoryForSiteAndItemIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryBySiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getInventoryBySiteResponse")
    public JAXBElement<GetInventoryBySiteResponse> createGetInventoryBySiteResponse(GetInventoryBySiteResponse value) {
        return new JAXBElement<GetInventoryBySiteResponse>(_GetInventoryBySiteResponse_QNAME, GetInventoryBySiteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "searchByNameResponse")
    public JAXBElement<SearchByNameResponse> createSearchByNameResponse(SearchByNameResponse value) {
        return new JAXBElement<SearchByNameResponse>(_SearchByNameResponse_QNAME, SearchByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSupplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "updateSupplierResponse")
    public JAXBElement<UpdateSupplierResponse> createUpdateSupplierResponse(UpdateSupplierResponse value) {
        return new JAXBElement<UpdateSupplierResponse>(_UpdateSupplierResponse_QNAME, UpdateSupplierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "supplierById")
    public JAXBElement<SupplierById> createSupplierById(SupplierById value) {
        return new JAXBElement<SupplierById>(_SupplierById_QNAME, SupplierById.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "supplierByIdResponse")
    public JAXBElement<SupplierByIdResponse> createSupplierByIdResponse(SupplierByIdResponse value) {
        return new JAXBElement<SupplierByIdResponse>(_SupplierByIdResponse_QNAME, SupplierByIdResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateInventoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "updateInventoryResponse")
    public JAXBElement<UpdateInventoryResponse> createUpdateInventoryResponse(UpdateInventoryResponse value) {
        return new JAXBElement<UpdateInventoryResponse>(_UpdateInventoryResponse_QNAME, UpdateInventoryResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSupplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "deleteSupplierResponse")
    public JAXBElement<DeleteSupplierResponse> createDeleteSupplierResponse(DeleteSupplierResponse value) {
        return new JAXBElement<DeleteSupplierResponse>(_DeleteSupplierResponse_QNAME, DeleteSupplierResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "searchByName")
    public JAXBElement<SearchByName> createSearchByName(SearchByName value) {
        return new JAXBElement<SearchByName>(_SearchByName_QNAME, SearchByName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "updateSupplier")
    public JAXBElement<UpdateSupplier> createUpdateSupplier(UpdateSupplier value) {
        return new JAXBElement<UpdateSupplier>(_UpdateSupplier_QNAME, UpdateSupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsPerSiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "getItemsPerSiteResponse")
    public JAXBElement<GetItemsPerSiteResponse> createGetItemsPerSiteResponse(GetItemsPerSiteResponse value) {
        return new JAXBElement<GetItemsPerSiteResponse>(_GetItemsPerSiteResponse_QNAME, GetItemsPerSiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteInventoryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "deleteInventoryEntry")
    public JAXBElement<DeleteInventoryEntry> createDeleteInventoryEntry(DeleteInventoryEntry value) {
        return new JAXBElement<DeleteInventoryEntry>(_DeleteInventoryEntry_QNAME, DeleteInventoryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewSupplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "newSupplierResponse")
    public JAXBElement<NewSupplierResponse> createNewSupplierResponse(NewSupplierResponse value) {
        return new JAXBElement<NewSupplierResponse>(_NewSupplierResponse_QNAME, NewSupplierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suppliers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.inventory/", name = "suppliers")
    public JAXBElement<Suppliers> createSuppliers(Suppliers value) {
        return new JAXBElement<Suppliers>(_Suppliers_QNAME, Suppliers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = Supplier.class)
    public JAXBElement<Long> createSupplierId(Long value) {
        return new JAXBElement<Long>(_SupplierId_QNAME, Long.class, Supplier.class, value);
    }

}
