package me.pandera.ua.panderartp;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Command implements CommandExecutor {
    private final JavaPlugin plugin;
    public Command(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = new Runnable() {
            Player player = (Player)commandSender;
            int timeTP = 5;
            public void run() {
                if (timeTP == 0) {
                    player.sendTitle("PandEra RTP", "Teleporting...", 10, 70, 20);
                    rtp(Objects.requireNonNull(player));
                }else{
                    player.sendTitle("PandEra RTP", Integer.toString(timeTP), 10, 50, 10);
                }
                timeTP--;
            }
        };
        scheduler.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);
        return true;
    }
    private void rtp(Player player){
        World world = player.getWorld();
        int borderSize = (int)world.getWorldBorder().getSize();
        int centerX = (int)world.getWorldBorder().getCenter().getX();
        int centerZ = (int)world.getWorldBorder().getCenter().getZ();

        int minX = centerX - borderSize / 2;
        int maxX = centerX + borderSize / 2;
        int minZ = centerZ - borderSize / 2;
        int maxZ = centerZ + borderSize / 2;

        int x = new Random().nextInt(minX, maxX);
        int z = new Random().nextInt(minZ, maxZ);
        Block y = world.getHighestBlockAt(x, z);

        Location location = new Location(world, x, y.getY(), z);

        player.teleport(location);
    }
}
