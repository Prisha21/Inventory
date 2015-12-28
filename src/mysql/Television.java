/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysql;

/**
 *
 * @author Prisha
 */
public class Television extends Item{

    public Television() {
    }
    
    public Television(int quantity, String city, String modelNo) {
        super(quantity, city, modelNo,DBConstants.TELEVISION);
    }
}
