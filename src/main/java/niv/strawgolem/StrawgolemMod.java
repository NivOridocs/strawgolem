package niv.strawgolem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.fabricmc.api.ModInitializer;

public class StrawgolemMod implements ModInitializer {

	public static final Logger log = LogManager.getLogger();

	public static final String MOD_ID = "blastrod";
	public static final String MOD_NAME = "Blast Rod";

	@Override
	public void onInitialize() {
		log.info("[{}] Initializing", MOD_NAME);
	}
	
}
