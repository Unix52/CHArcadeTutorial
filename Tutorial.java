/**
 * 
 */
import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

import me.acf.MiniGames.MiniGamesMananger;
import me.acf.MiniGames.MiniGamesMananger.Time;
import me.hub.MiniPlugin;



/**
 * @author adriancf
 *
 */
public class Arcade  {

	/**
	 * @param plugin this da onEnable
	 */
	
	public void Arcade(JavaPlugin plugin) {
	       //120 tempo para iniciar o game
	 MiniGamesMananger mine = new MiniGamesMananger(plugin,120, _moduleName);
         mine.CriarTime(Time.Vermelho); // Criar os Times
         mine.CriarTime(Time.Amarelo);
         mine.CriarTime(Time.Verder);
         mine.CriarTime(Time.Azul);
         mine.teamselection = Bukkit.getWorld("world").getSpawnLocation();  // setar os locais de escolher os times
         
	}
}
