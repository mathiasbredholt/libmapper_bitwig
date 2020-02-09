package com.libmapper;
import java.util.UUID;

import com.bitwig.extension.api.PlatformType;
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList;
import com.bitwig.extension.controller.ControllerExtensionDefinition;
import com.bitwig.extension.controller.api.ControllerHost;

public class libmapperExtensionDefinition extends ControllerExtensionDefinition
{
   private static final UUID DRIVER_ID = UUID.fromString("5d770d0d-2b57-4126-949f-83a42b91e589");
   
   public libmapperExtensionDefinition()
   {
   }

   @Override
   public String getName()
   {
      return "libmapper";
   }
   
   @Override
   public String getAuthor()
   {
      return "mathiasbredholt";
   }

   @Override
   public String getVersion()
   {
      return "0.1";
   }

   @Override
   public UUID getId()
   {
      return DRIVER_ID;
   }
   
   @Override
   public String getHardwareVendor()
   {
      return "libmapper";
   }
   
   @Override
   public String getHardwareModel()
   {
      return "libmapper";
   }

   @Override
   public int getRequiredAPIVersion()
   {
      return 10;
   }

   @Override
   public int getNumMidiInPorts()
   {
      return 0;
   }

   @Override
   public int getNumMidiOutPorts()
   {
      return 0;
   }

   @Override
   public void listAutoDetectionMidiPortNames(final AutoDetectionMidiPortNamesList list, final PlatformType platformType)
   {
   }

   @Override
   public libmapperExtension createInstance(final ControllerHost host)
   {
      return new libmapperExtension(this, host);
   }
}
