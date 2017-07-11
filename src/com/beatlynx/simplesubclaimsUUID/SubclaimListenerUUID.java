//SimpleSubclaimsUUID v0.1.0 for FactionsUUID - Copyright 2017 Sam Elmer

package com.beatlynx.simplesubclaimsUUID;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.DoubleChest;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.massivecraft.factions.Board;
import com.massivecraft.factions.FLocation;
import com.massivecraft.factions.FPlayer;
import com.massivecraft.factions.FPlayers;
import com.massivecraft.factions.Faction;
import com.massivecraft.factions.struct.Role;

public class SubclaimListenerUUID implements Listener {
	
	public boolean canUseChest(Player p, FPlayer f, Sign s) {
		
		if(f.getRole().equals(Role.ADMIN)||f.getRole().equals(Role.MODERATOR)) return true;
		
		String IGN = p.getName();
		
		if(s.getLine(0).equals(color("&a[Subclaim]"))) {
			
			if(s.getLine(1).indexOf(IGN)!=-1||s.getLine(2).indexOf(IGN)!=-1||s.getLine(3).indexOf(IGN)!=-1) return true;
			
			return false;
			
		}
		
		return true;
		
	}
	
	@EventHandler
	public void onUseChest(PlayerInteractEvent e) {
		
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			
			if (e.getClickedBlock().getType().equals(Material.CHEST)) {
				
				Player player = e.getPlayer();
				
				FPlayer fplayer = FPlayers.getInstance().getByPlayer(player);
				
				Faction playerfaction = fplayer.getFaction();
				
				Block chest = e.getClickedBlock();
				
				Location bchestloc = chest.getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(playerfaction.equals(chestfaction)) {
					
					Block north = chest.getRelative(BlockFace.NORTH);
					
					Block south = chest.getRelative(BlockFace.SOUTH);
					
					Block west = chest.getRelative(BlockFace.WEST);
					
					Block east = chest.getRelative(BlockFace.EAST);
					
					Block nw = chest.getRelative(BlockFace.NORTH_WEST);
					
					Block ne = chest.getRelative(BlockFace.NORTH_EAST);
					
					Block sw = chest.getRelative(BlockFace.SOUTH_WEST);
					
					Block se = chest.getRelative(BlockFace.SOUTH_EAST);
					
					if(north.getType().equals(Material.WALL_SIGN)) {
						
						Sign sign = (Sign)north.getState();
						
						if(canUseChest(player, fplayer, sign)==false) {
							
							e.setCancelled(true);
							
							player.sendMessage(color("&cYou do not have access to this Subclaim!"));
							
						}
						
					}
					
					if(south.getType().equals(Material.WALL_SIGN)) {
						
						Sign sign = (Sign)south.getState();
						
						if(canUseChest(player, fplayer, sign)==false) {
							
							e.setCancelled(true);
							
							player.sendMessage(color("&cYou do not have access to this Subclaim!"));
							
						}
						
					}
					
					if(west.getType().equals(Material.WALL_SIGN)) {
						
						Sign sign = (Sign)west.getState();
						
						if(canUseChest(player, fplayer, sign)==false) {
							
							e.setCancelled(true);
							
							player.sendMessage(color("&cYou do not have access to this Subclaim!"));
							
						}
						
					}
					
					if(east.getType().equals(Material.WALL_SIGN)) {
						
						Sign sign = (Sign)east.getState();
						
						if(canUseChest(player, fplayer, sign)==false) {
							
							e.setCancelled(true);
							
							player.sendMessage(color("&cYou do not have access to this Subclaim!"));
							
						}
						
					}
					
					if(nw.getType().equals(Material.WALL_SIGN)) {
						
						Sign sign = (Sign)nw.getState();
						
						if(canUseChest(player, fplayer, sign)==false) {
							
							e.setCancelled(true);
							
							player.sendMessage(color("&cYou do not have access to this Subclaim!"));
							
						}
						
					}
					
					if(ne.getType().equals(Material.WALL_SIGN)) {
						
						Sign sign = (Sign)ne.getState();
						
						if(canUseChest(player, fplayer, sign)==false) {
							
							e.setCancelled(true);
							
							player.sendMessage(color("&cYou do not have access to this Subclaim!"));
							
						}
						
					}
					
					if(sw.getType().equals(Material.WALL_SIGN)) {
						
						Sign sign = (Sign)sw.getState();
						
						if(canUseChest(player, fplayer, sign)==false) {
							
							e.setCancelled(true);
							
							player.sendMessage(color("&cYou do not have access to this Subclaim!"));
							
						}
						
					}
					
					if(se.getType().equals(Material.WALL_SIGN)) {
						
						Sign sign = (Sign)se.getState();
						
						if(canUseChest(player, fplayer, sign)==false) {
							
							e.setCancelled(true);
							
							player.sendMessage(color("&cYou do not have access to this Subclaim!"));
							
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onBreakChest(BlockBreakEvent e) {
		
		if(e.getBlock().getType().equals(Material.CHEST)) {
			
			Player player = e.getPlayer();
			
			FPlayer fplayer = FPlayers.getInstance().getByPlayer(player);
			
			Faction playerfaction = fplayer.getFaction();
			
			Block chest = e.getBlock();
			
			Location bchestloc = chest.getLocation();
			
			FLocation fchestloc = new FLocation(bchestloc);
			
			Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
			
			if(playerfaction.equals(chestfaction)) {
				
				Block north = chest.getRelative(BlockFace.NORTH);
				
				Block south = chest.getRelative(BlockFace.SOUTH);
				
				Block west = chest.getRelative(BlockFace.WEST);
				
				Block east = chest.getRelative(BlockFace.EAST);
				
				Block nw = chest.getRelative(BlockFace.NORTH_WEST);
				
				Block ne = chest.getRelative(BlockFace.NORTH_EAST);
				
				Block sw = chest.getRelative(BlockFace.SOUTH_WEST);
				
				Block se = chest.getRelative(BlockFace.SOUTH_EAST);
				
				if(north.getType().equals(Material.WALL_SIGN)) {
					
					Sign sign = (Sign)north.getState();
					
					if(canUseChest(player, fplayer, sign)==false) {
						
						e.setCancelled(true);
						
						player.sendMessage(color("&cYou do not have access to this Subclaim!"));
						
					}
					
				}
				
				if(south.getType().equals(Material.WALL_SIGN)) {
					
					Sign sign = (Sign)south.getState();
					
					if(canUseChest(player, fplayer, sign)==false) {
						
						e.setCancelled(true);
						
						player.sendMessage(color("&cYou do not have access to this Subclaim!"));
						
					}
					
				}
				
				if(west.getType().equals(Material.WALL_SIGN)) {
					
					Sign sign = (Sign)west.getState();
					
					if(canUseChest(player, fplayer, sign)==false) {
						
						e.setCancelled(true);
						
						player.sendMessage(color("&cYou do not have access to this Subclaim!"));
						
					}
					
				}
				
				if(east.getType().equals(Material.WALL_SIGN)) {
					
					Sign sign = (Sign)east.getState();
					
					if(canUseChest(player, fplayer, sign)==false) {
						
						e.setCancelled(true);
						
						player.sendMessage(color("&cYou do not have access to this Subclaim!"));
						
					}
					
				}
				
				if(nw.getType().equals(Material.WALL_SIGN)) {
					
					Sign sign = (Sign)nw.getState();
					
					if(canUseChest(player, fplayer, sign)==false) {
						
						e.setCancelled(true);
						
						player.sendMessage(color("&cYou do not have access to this Subclaim!"));
						
					}
					
				}
				
				if(ne.getType().equals(Material.WALL_SIGN)) {
					
					Sign sign = (Sign)ne.getState();
					
					if(canUseChest(player, fplayer, sign)==false) {
						
						e.setCancelled(true);
						
						player.sendMessage(color("&cYou do not have access to this Subclaim!"));
						
					}
					
				}
				
				if(sw.getType().equals(Material.WALL_SIGN)) {
					
					Sign sign = (Sign)sw.getState();
					
					if(canUseChest(player, fplayer, sign)==false) {
						
						e.setCancelled(true);
						
						player.sendMessage(color("&cYou do not have access to this Subclaim!"));
						
					}
					
				}
				
				if(se.getType().equals(Material.WALL_SIGN)) {
					
					Sign sign = (Sign)se.getState();
					
					if(canUseChest(player, fplayer, sign)==false) {
						
						e.setCancelled(true);
						
						player.sendMessage(color("&cYou do not have access to this Subclaim!"));
						
					}
					
				}
			
			}
			
		}
		
		
	}						
	
	@EventHandler
	public void onPlaceSign(SignChangeEvent e) {
		
		Player player = e.getPlayer();
		
		FPlayer fplayer = FPlayers.getInstance().getByPlayer(player);
		
		Faction playerfaction = fplayer.getFaction();
		
		Block sign = e.getBlock();
		
		Location bsignloc = sign.getLocation();
		
		FLocation fsignloc = new FLocation(bsignloc);
		
		Faction signfaction = Board.getInstance().getFactionAt(fsignloc);
		
		if(playerfaction.equals(signfaction)) {
		
		if(e.getBlock().getType().equals(Material.WALL_SIGN)) {
			
			if(e.getBlock().getRelative(BlockFace.NORTH).getType().equals(Material.CHEST)) {
				
				Location bchestloc = e.getBlock().getRelative(BlockFace.NORTH).getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(chestfaction.equals(signfaction)) {
				
					if(e.getLine(0).equals("[Subclaim]")) {
					
						e.setLine(0, color("&a[Subclaim]"));
					
						player.sendMessage(color("&aSubclaim created!"));
					
					}
					
				}
				
			}
			
			if(e.getBlock().getRelative(BlockFace.SOUTH).getType().equals(Material.CHEST)) {
				
				Location bchestloc = e.getBlock().getRelative(BlockFace.SOUTH).getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(chestfaction.equals(signfaction)) {
				
					if(e.getLine(0).equals("[Subclaim]")) {
					
						e.setLine(0, color("&a[Subclaim]"));
					
						player.sendMessage(color("&aSubclaim created!"));
					
					}
					
				}
				
			}
			
			if(e.getBlock().getRelative(BlockFace.WEST).getType().equals(Material.CHEST)) {
				
				Location bchestloc = e.getBlock().getRelative(BlockFace.WEST).getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(chestfaction.equals(signfaction)) {
				
					if(e.getLine(0).equals("[Subclaim]")) {
					
						e.setLine(0, color("&a[Subclaim]"));
					
						player.sendMessage(color("&aSubclaim created!"));
					
					}
					
				}
				
			}
			
			if(e.getBlock().getRelative(BlockFace.EAST).getType().equals(Material.CHEST)) {
				
				Location bchestloc = e.getBlock().getRelative(BlockFace.EAST).getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(chestfaction.equals(signfaction)) {
				
					if(e.getLine(0).equals("[Subclaim]")) {
					
						e.setLine(0, color("&a[Subclaim]"));
					
						player.sendMessage(color("&aSubclaim created!"));
					
					}
					
				}
				
			}
			
			if(e.getBlock().getRelative(BlockFace.NORTH) instanceof DoubleChest) {
				
				Location bchestloc = e.getBlock().getRelative(BlockFace.NORTH).getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(chestfaction.equals(signfaction)) {
				
					if(e.getLine(0).equals("[Subclaim]")) {
					
						e.setLine(0, color("&a[Subclaim]"));
					
						player.sendMessage(color("&aSubclaim created!"));
					
					}
					
				}
				
			}
			
			if(e.getBlock().getRelative(BlockFace.SOUTH) instanceof DoubleChest) {
				
				Location bchestloc = e.getBlock().getRelative(BlockFace.SOUTH).getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(chestfaction.equals(signfaction)) {
				
					if(e.getLine(0).equals("[Subclaim]")) {
					
						e.setLine(0, color("&a[Subclaim]"));
					
						player.sendMessage(color("&aSubclaim created!"));
					
					}
					
				}
				
			}
			
			if(e.getBlock().getRelative(BlockFace.WEST) instanceof DoubleChest) {
				
				Location bchestloc = e.getBlock().getRelative(BlockFace.WEST).getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(chestfaction.equals(signfaction)) {
				
					if(e.getLine(0).equals("[Subclaim]")) {
					
						e.setLine(0, color("&a[Subclaim]"));
					
						player.sendMessage(color("&aSubclaim created!"));
					
					}
					
				}
				
			}
			
			if(e.getBlock().getRelative(BlockFace.EAST) instanceof DoubleChest) {
				
				Location bchestloc = e.getBlock().getRelative(BlockFace.EAST).getLocation();
				
				FLocation fchestloc = new FLocation(bchestloc);
				
				Faction chestfaction = Board.getInstance().getFactionAt(fchestloc);
				
				if(chestfaction.equals(signfaction)) {
				
					if(e.getLine(0).equals("[Subclaim]")) {
					
						e.setLine(0, color("&a[Subclaim]"));
					
						player.sendMessage(color("&aSubclaim created!"));
					
					}
					
				}
				
			}
			
		}
		
	}
		
}
	
	@EventHandler
	public void onBreakSign(BlockBreakEvent e) {
		
		if(e.getBlock().getType().equals(Material.WALL_SIGN)) {
			
			Player player = e.getPlayer();
			
			FPlayer fplayer = FPlayers.getInstance().getByPlayer(player);
			
			Faction playerfaction = fplayer.getFaction();
			
			Block sign = e.getBlock();
			
			Location bsignloc = sign.getLocation();
			
			FLocation fsignloc = new FLocation(bsignloc);
			
			Faction signfaction = Board.getInstance().getFactionAt(fsignloc);
			
			if(playerfaction.equals(signfaction)) {
				
				Sign s = (Sign) sign.getState();
				
				if(canUseChest(player, fplayer, s)==false) {
					
					e.setCancelled(true);
					
					player.sendMessage(color("&cYou do not have access to this Subclaim!"));
					
				}
				
			}
			
		}
		
	}
	
	public String color(String s) {
		
		return ChatColor.translateAlternateColorCodes('&', s);
		
	}
	
}