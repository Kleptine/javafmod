package com.asg;

import java.util.Random;

import com.fmod.Bank;
import com.fmod.EventDescription;
import com.fmod.EventInstance;
import com.fmod.FMOD_ADVANCEDSETTINGS;
import com.fmod.FMOD_RESULT;
import com.fmod.FMOD_STUDIO_STOP_MODE;
import com.fmod.FMOD_System;
import com.fmod.javafmod;

// Just an example of basic API usage
public abstract class JavaFmodExample {
	static {
		String resPath = JavaFmodExample.class.getResource("JavaFmodExample.class").toString();
		if (resPath.startsWith("jar")) {
			JavaFmodLoader.loadFmodNative();
		} else if (resPath.startsWith("file")) {
			// If we're just running this example file, we load the libs manually.
			// We need to load dependencies differently if this class was loaded through a jar.
			java.lang.System.loadLibrary("fmodL64");
			java.lang.System.loadLibrary("fmod64");
			java.lang.System.loadLibrary("fmodStudioL64");
			java.lang.System.loadLibrary("fmodstudio64");
			java.lang.System.loadLibrary("javafmod64");
		}	
	}
	public static void main(String[] args) {
		com.fmod.System s = new com.fmod.System();
		FMOD_RESULT r = com.fmod.System.create(s);
		System.out.println(javafmod.FMOD_ErrorString(r));
		
		FMOD_System lowlvl = new FMOD_System();
		r = s.getLowLevelSystem(lowlvl);
		
		FMOD_ADVANCEDSETTINGS settings = FMOD_ADVANCEDSETTINGS.create_and_init();
		Random rand = new Random();
		lowlvl.getAdvancedSettings(settings);
		settings.setRandomSeed(rand.nextLong());
		lowlvl.setAdvancedSettings(settings);
		
		System.out.println(settings.getRandomSeed());
		
		r = s.initialize(32, javafmod.FMOD_STUDIO_INIT_NORMAL, javafmod.FMOD_INIT_NORMAL, null);
		System.out.println(javafmod.FMOD_ErrorString(r));

		r = s.flushCommands();

		Bank masterBank = new Bank();
		r = s.loadBankFile("Master Bank.bank", javafmod.FMOD_STUDIO_LOAD_BANK_NORMAL, masterBank);
		System.out.println(javafmod.FMOD_ErrorString(r));

		Bank stringsBank = new Bank();
		r = s.loadBankFile("Master Bank.strings.bank", javafmod.FMOD_STUDIO_LOAD_BANK_NORMAL, masterBank);
		System.out.println(javafmod.FMOD_ErrorString(r));

		Bank weaponsBank = new Bank();
		r = s.loadBankFile("VO_Menu_English.bank", javafmod.FMOD_STUDIO_LOAD_BANK_NORMAL, weaponsBank);
		System.out.println(javafmod.FMOD_ErrorString(r));

		Bank ambienceBank = new Bank();
		r = s.loadBankFile("Surround_Ambience.bank", javafmod.FMOD_STUDIO_LOAD_BANK_NORMAL, ambienceBank);
		System.out.println(javafmod.FMOD_ErrorString(r));

		Bank characterBank = new Bank();
		r = s.loadBankFile("Character.bank", javafmod.FMOD_STUDIO_LOAD_BANK_NORMAL, characterBank);
		System.out.println(javafmod.FMOD_ErrorString(r));

		Bank uiBank = new Bank();
		r = s.loadBankFile("UI_Menu.bank", javafmod.FMOD_STUDIO_LOAD_BANK_NORMAL, uiBank);
		System.out.println(javafmod.FMOD_ErrorString(r));
		
		Bank musicBank = new Bank();
		r = s.loadBankFile("Music.bank", javafmod.FMOD_STUDIO_LOAD_BANK_NORMAL, musicBank);
		System.out.println(javafmod.FMOD_ErrorString(r));

		EventDescription d = new EventDescription();
		r = s.getEvent("event:/Character/Hand Foley/Doorknob", d);
		System.out.println(javafmod.FMOD_ErrorString(r));
		
		EventInstance e = new EventInstance();
		r = d.createInstance(e);
		System.out.println(javafmod.FMOD_ErrorString(r));
		
		e.start();
		
		long time = 0;
		do {
			s.update();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			time+= 50;
			
			if (time % 2000 == 0) {
				e.stop(FMOD_STUDIO_STOP_MODE.FMOD_STUDIO_STOP_IMMEDIATE);
				e.start();
			}
		} while (time < 20000);
		
		System.out.println(javafmod.FMOD_ErrorString(r));

		System.out.println("End");

		masterBank.unload();
		stringsBank.unload();
		weaponsBank.unload();
		
		s.release();
	}
}
