package ken.entitis;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/15 5:40 下午
 */


public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
