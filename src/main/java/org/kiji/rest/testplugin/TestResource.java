package org.kiji.rest.testplugin;

import java.io.IOException;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kiji.annotations.ApiStability;

import com.google.common.collect.Maps;
import com.yammer.metrics.annotation.Timed;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {
  /**
   * GETs version information.
   *
   * @return A message containing version information.
   * @throws IOException when Kiji software version can not be determined.
   */
  @GET
  @Timed
  @ApiStability.Evolving
  public Map<String, Object> getVersion() throws IOException {
    Map<String, Object> message = Maps.newHashMap();
    message.put("key", "message");
    return message;
  }
}
