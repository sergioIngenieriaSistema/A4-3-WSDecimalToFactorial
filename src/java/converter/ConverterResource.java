/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author sergio
 */
@Stateless
@Path("/decimal")
public class ConverterResource {
    @GET
    @Produces("application/json")
    public String decimalToBinary(@QueryParam("num") int num){
        return Integer.toBinaryString(num);
    }
}
