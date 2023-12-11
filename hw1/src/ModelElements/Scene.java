package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;

        if (models.size() > 0) this.Models = models;
        else throw new Exception("Должна быть хотябы одна модель");

        this.Flashes = flashes;
        Cameras = cameras;

        if (cameras.size() > 0) this.Cameras = cameras;
        else throw new Exception("Должна быть хотябы одна камера");
    }

    public <T> T method1(T type) {
        return type;
    }

    public <T, E> T method2(T type, E type2) {
        return type;
    }
}
