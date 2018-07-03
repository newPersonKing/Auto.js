package org.autojs.autojs.network.api;

import org.autojs.autojs.network.entity.VersionInfo;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Stardust on 2017/9/20.
 */

public interface UpdateCheckApi {

    @GET("/assets/autojs/version.json")
    Observable<VersionInfo> checkForUpdates();

}
