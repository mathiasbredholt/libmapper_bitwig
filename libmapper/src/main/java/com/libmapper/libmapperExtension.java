package com.libmapper;

import com.bitwig.extension.controller.api.ControllerHost;
import com.bitwig.extension.controller.api.Transport;
import com.bitwig.extension.controller.ControllerExtension;
import mapper.*;

public class libmapperExtension extends ControllerExtension
{
   Device dev;

   protected libmapperExtension(final libmapperExtensionDefinition definition, final ControllerHost host)
   {
      super(definition, host);
   }

   @Override
   public void init()
   {
      final ControllerHost host = getHost();
      dev = new Device("Bitwig");

      host.scheduleTask(() -> this.poll(), 10);

      // TODO: Perform your driver initialization here.
      // For now just show a popup notification for verification that it is running.
      host.showPopupNotification("libmapper Initialized");
   }

   private void poll()
   {
      dev.poll(0);
      getHost().scheduleTask(() -> this.poll(), 10);
   }

   @Override
   public void exit()
   {
      // TODO: Perform any cleanup once the driver exits
      // For now just show a popup notification for verification that it is no longer running.
      getHost().showPopupNotification("libmapper Exited");
   }

   @Override
   public void flush()
   {
      // TODO Send any updates you need here.
   }


}
