import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException, InvalidCatalogException {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() throws IOException {
        Catalog catalog =
                new Catalog("MyRefs");
        var book = new Item("article1", … );
        var article = new Item("book1", … );
        catalog.add(book);
        catalog.add(article);

        CatalogUtil.save(catalog, "d:/research/catalog.json");
    }

    private void testLoadView() throws InvalidCatalogException {
        Catalog catalog = CatalogUtil.load("d:/research/catalog.json");
        CatalogUtil.view(catalog.findById("article1"));
    }
}










