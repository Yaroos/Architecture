public abstract class ItemFabric {
    public void openRewgard() {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
