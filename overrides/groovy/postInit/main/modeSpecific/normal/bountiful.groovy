package postInit.main.modeSpecific.normal

import gregtech.api.recipes.builders.AssemblyLineRecipeBuilder
import com.nomiceu.nomilabs.util.LabsModeHelper

import static gregtech.api.GTValues.*

// Bountiful recipes
if (!LabsModeHelper.normal) return

mods.gregtech.assembler.recipeBuilder()
	.inputs(item('enderio:item_material', 9),
		ore('slabWood') * 14,
	)
	.outputs(item('nomilabs:woodenwidget'))
	.duration(140).EUt(VA[MV])
	.buildAndRegister()

mods.gregtech.assembler.recipeBuilder()
	.inputs(item('enderio:item_material', 10),
		item('minecraft:stone_slab') * 14,
	)
	.outputs(item('nomilabs:stonewidget'))
	.duration(180).EUt(VA[MV])
	.buildAndRegister()
