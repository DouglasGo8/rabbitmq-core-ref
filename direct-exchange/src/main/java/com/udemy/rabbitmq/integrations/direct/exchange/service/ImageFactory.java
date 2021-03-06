package com.udemy.rabbitmq.integrations.direct.exchange.service;

import com.udemy.rabbitmq.integrations.direct.exchange.model.Image;
import org.apache.camel.Handler;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dbatista
 */
public class ImageFactory {

  @Handler
  public Image madeAPic() {

    var sources = List.of("mobile", "web");
    var types = List.of("png", "jpg", "svg");
    var picType = types.get(ThreadLocalRandom.current().nextInt(0, 3));
    var picSource = sources.get(ThreadLocalRandom.current().nextInt(0, 2));
    var picSize = ThreadLocalRandom.current().nextInt(1000, 10000);
    var picName = "Image-" + ThreadLocalRandom.current().nextLong(1, 1000);

    return new Image(picName, picType, picSource, picSize);
  }
}
