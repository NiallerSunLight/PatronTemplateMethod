
package co.unicauca.restaurant.server.access;

import co.unicauca.restaurant.commons.domain.Dish;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de IDishRepository. Utilliza arreglos en memoria
 *
 * @author SoftwareTeam
 */
public final class DishRepositoryImplArrays implements IDishRepository {

    /**
     * Array List de platos
     */
    private static List<Dish> dishes;

    public DishRepositoryImplArrays() {
        if (dishes == null) {
            dishes = new ArrayList();
        }

        if (dishes.size() == 0) {
            inicializar();
        }
    }

    public void inicializar() {
        dishes.add(new Dish("001", "Arroz con pollo", "Arroz con pollo, alverja, avichuela y zanahoria.", "10000", "ALL"));
        dishes.add(new Dish("002", "Sopa", "Sopa con carne de res, papa y platano güineo.", "1000", "HALF"));
        dishes.add(new Dish("003", "Salvajada el rey", "Papas con salchichas, chorizo, carne de cerdo, carne de res y diferentes salsas.", "20000", "ALL"));
        dishes.add(new Dish("004", "Pizza familiar", "Pizza con alguno/s de los diferentes adiciones.", "24000", "ALL"));
    }

    /**
     * Busca un dish en el arreglo
     *
     * @param id identificador del plato
     * @return objeto Dish
     */
    @Override
    public Dish findDish(String id) {
        for (Dish dish : dishes) {
            if (dish.getId().equals(id)) {
                return dish;
            }
        }
        return null;
    }

    /**
     * Crea un plato en el arreglo
     *
     * @param dish el plato a agregar
     * @return el identificador del plato creado
     */
    @Override
    public String createDish(Dish dish) {
        dishes.add(dish);
        return dish.getId();
    }

    public List<Dish> getDishes() {
        return dishes;
    }
    
    
}
