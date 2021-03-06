package ljdp.minechem.common.polytool.types;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import ljdp.minechem.api.core.EnumElement;
import ljdp.minechem.common.polytool.PolytoolUpgradeType;

public class PolytoolTypeArgon extends PolytoolUpgradeType{

	public PolytoolTypeArgon() {
		super();
	}

	@Override
	public float getStrVsBlock(ItemStack itemStack, Block block) {
		
		return 0;
	}

	@Override
	public void hitEntity(ItemStack itemStack, EntityLivingBase target,
			EntityLivingBase player) {
		if(!target.worldObj.canBlockSeeTheSky(MathHelper.floor_double(target.posX), MathHelper.floor_double(target.posY), MathHelper.floor_double(target.posZ))){
			target.attackEntityFrom(DamageSource.inWall, power);
		}
	}

	@Override
	public void onBlockDestroyed(ItemStack itemStack, World world, int id,
			int x, int y, int z, EntityLivingBase entityLiving) {
	}

	@Override
	public EnumElement getElement() {
		
		return EnumElement.Ar;
	}

	@Override
	public void onTick() {
	}

	@Override
	public String getDescription() {
		
		return "Does extra suffocation damage when in a cave";
	}

}
