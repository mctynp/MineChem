package ljdp.minechem.common.polytool.types;

import java.util.HashMap;
import java.util.Iterator;

import ljdp.minechem.api.core.EnumElement;
import ljdp.minechem.common.polytool.PolytoolUpgradeType;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class PolytoolTypeNeon extends PolytoolUpgradeType{

	public PolytoolTypeNeon() {
		super();
	}
	
	@Override
	public float getStrVsBlock(ItemStack itemStack, Block block) {

		return 0;
	}

	@Override
	public void hitEntity(ItemStack itemStack, EntityLivingBase target,
			EntityLivingBase player) {
		int toPlace=(int) (power+1);
		player.addPotionEffect(new PotionEffect(16,(int) (power*10)));
	}


	@Override
	public void onBlockDestroyed(ItemStack itemStack, World world, int id,
			int x, int y, int z, EntityLivingBase entityLiving) {
	}

	@Override
	public EnumElement getElement() {

		return EnumElement.Ne;
	}

	@Override
	public void onTick() {
	}

	@Override
	public String getDescription() {
		
		return "Gives players night vision during combat";
	}

}
