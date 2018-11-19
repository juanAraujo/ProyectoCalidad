package reclamaciones.libro.com.libroreclamaciones.data.repository.remote.request;

import reclamaciones.libro.com.libroreclamaciones.data.model.Sucursal;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface EnterpriseRequest {

    @FormUrlEncoded
    @POST("detalles-sucursal")
    Call<Sucursal> getSucursal(@Field("idSucursal") int idSucursal,
                               @Field("idUsuario") int idUsuario);
}
