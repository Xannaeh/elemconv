package com.xannaeh.elemconv.data.recipe;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import com.xannaeh.elemconv.elements.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;


import java.util.List;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // Items
        // Darkness
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DARKNESS_INGOT.get(), 9)
                .requires(ModBlocks.DARKNESS_INGOT_BLOCK.get())
                .unlockedBy("has_darkness_ingot_block", has(ModBlocks.DARKNESS_INGOT_BLOCK.get()))
                .save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DARKNESS_RAW.get(), 9)
                .requires(ModBlocks.DARKNESS_RAW_BLOCK.get())
                .unlockedBy("has_darkness_raw_block", has(ModBlocks.DARKNESS_RAW_BLOCK.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DARKNESS_ESSENCE.get())
                .define('F', ModItems.DARKNESS_FRUIT_DRIED)
                .define('I', ModItems.DARKNESS_INGOT)
                .pattern(" I ")
                .pattern("IFI")
                .pattern(" I ")
                .unlockedBy("has_darkness_ingot", has(ModItems.DARKNESS_INGOT.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DARKNESS_IN_A_BOTTLE.get())
                .define('E', ModItems.DARKNESS_ESSENCE)
                .define('G', Items.GLASS_BOTTLE)
                .pattern(" E ")
                .pattern("EGE")
                .pattern(" E ")
                .unlockedBy("has_darkness_essence", has(ModItems.DARKNESS_ESSENCE.get()))
                .save(pRecipeOutput);
        // Light
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIGHT_ESSENCE.get())
                .define('F', ModItems.LIGHT_FRUIT_DRIED)
                .define('I', ModItems.LIGHT_INGOT)
                .pattern(" I ")
                .pattern("IFI")
                .pattern(" I ")
                .unlockedBy("has_light_ingot", has(ModItems.LIGHT_INGOT.get()))
                .save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LIGHT_INGOT.get(), 9)
                .requires(ModBlocks.LIGHT_INGOT_BLOCK.get())
                .unlockedBy("has_light_ingot_block", has(ModBlocks.LIGHT_INGOT_BLOCK.get()))
                .save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LIGHT_RAW.get(), 9)
                .requires(ModBlocks.LIGHT_RAW_BLOCK.get())
                .unlockedBy("has_light_raw_block", has(ModBlocks.LIGHT_RAW_BLOCK.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIGHT_IN_A_BOTTLE.get())
                .define('E', ModItems.LIGHT_ESSENCE)
                .define('G', Items.GLASS_BOTTLE)
                .pattern(" E ")
                .pattern("EGE")
                .pattern(" E ")
                .unlockedBy("has_darkness_essence", has(ModItems.DARKNESS_ESSENCE.get()))
                .save(pRecipeOutput);

        // Blocks
        // Darkness
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARKNESS_RAW_BLOCK.get(), 1)
                .define('R', ModItems.DARKNESS_RAW)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_darkness_raw", has(ModItems.DARKNESS_RAW.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARKNESS_INGOT_BLOCK.get(), 1)
                .define('I', ModItems.DARKNESS_INGOT)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .unlockedBy("has_darkness_ingot", has(ModItems.DARKNESS_INGOT.get()))
                .save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKNESS_TREE_PLANKS.get(), 4)
                .requires(ModBlocks.DARKNESS_TREE_LOG.get())
                .unlockedBy("has_darkness_tree_log", has(ModBlocks.DARKNESS_TREE_LOG.get()))
                .save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKNESS_TREE_PLANKS.get(), 4)
                .requires(ModBlocks.DARKNESS_TREE_WOOD.get())
                .unlockedBy("has_darkness_tree_wood", has(ModBlocks.DARKNESS_TREE_WOOD.get()))
                .save(pRecipeOutput, MODID + ":darkness_tree_planks_2");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKNESS_TREE_WOOD.get(), 3)
                .define('L', ModBlocks.DARKNESS_TREE_LOG)
                .pattern("LL")
                .pattern("LL")
                .unlockedBy("has_darkness_tree_log", has(ModBlocks.DARKNESS_TREE_LOG.get()))
                .save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKNESS_TREE_SLAB.get(), ModBlocks.DARKNESS_TREE_PLANKS.get());
        stairBuilder(ModBlocks.DARKNESS_TREE_STAIRS.get(), Ingredient.of(ModBlocks.DARKNESS_TREE_PLANKS.get()))
                .group("darkness_tree")
                .unlockedBy("has_darkness_tree_planks", has(ModBlocks.DARKNESS_TREE_PLANKS.get()))
                .save(pRecipeOutput);
        // Light
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_RAW_BLOCK.get(), 1)
                .define('R', ModItems.LIGHT_RAW)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .unlockedBy("has_light_raw", has(ModItems.LIGHT_RAW.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_INGOT_BLOCK.get(), 1)
                .define('I', ModItems.LIGHT_INGOT)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .unlockedBy("has_light_ingot", has(ModItems.LIGHT_INGOT.get()))
                .save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_TREE_PLANKS.get(), 4)
                .requires(ModBlocks.LIGHT_TREE_LOG.get())
                .unlockedBy("has_light_tree_log", has(ModBlocks.LIGHT_TREE_LOG.get()))
                .save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_TREE_PLANKS.get(), 4)
                .requires(ModBlocks.LIGHT_TREE_WOOD.get())
                .unlockedBy("has_light_tree_wood", has(ModBlocks.LIGHT_TREE_WOOD.get()))
                .save(pRecipeOutput, MODID + ":light_tree_planks_2");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_TREE_WOOD.get(), 3)
                .define('L', ModBlocks.LIGHT_TREE_LOG)
                .pattern("LL")
                .pattern("LL")
                .unlockedBy("has_light_tree_log", has(ModBlocks.LIGHT_TREE_LOG.get()))
                .save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_TREE_SLAB.get(), ModBlocks.LIGHT_TREE_PLANKS.get());
        stairBuilder(ModBlocks.LIGHT_TREE_STAIRS.get(), Ingredient.of(ModBlocks.LIGHT_TREE_PLANKS.get()))
                .group("light_tree")
                .unlockedBy("has_light_tree_planks", has(ModBlocks.LIGHT_TREE_PLANKS.get()))
                .save(pRecipeOutput);

        //Smeltables
        // Darkness
        List<ItemLike> DARKNESS_RAW_SMELTABLES = List.of(ModItems.DARKNESS_RAW, ModBlocks.DARKNESS_ORE, ModBlocks.DARKNESS_ORE_DEEPSLATE, ModBlocks.DARKNESS_ORE_ENDSTONE);
        oreSmelting(pRecipeOutput, DARKNESS_RAW_SMELTABLES, RecipeCategory.MISC, ModItems.DARKNESS_INGOT.get(), 0.25f, 200, "darkness_ingot");
        oreBlasting(pRecipeOutput, DARKNESS_RAW_SMELTABLES, RecipeCategory.MISC, ModItems.DARKNESS_INGOT.get(), 0.25f, 100, "darkness_ingot");
        //Light
        List<ItemLike> LIGHT_RAW_SMELTABLES = List.of(ModItems.LIGHT_RAW, ModBlocks.LIGHT_ORE, ModBlocks.LIGHT_ORE_DEEPSLATE, ModBlocks.LIGHT_ORE_NETHERRACK);
        oreSmelting(pRecipeOutput, LIGHT_RAW_SMELTABLES, RecipeCategory.MISC, ModItems.LIGHT_INGOT.get(), 0.25f, 200, "light_ingot");
        oreBlasting(pRecipeOutput, LIGHT_RAW_SMELTABLES, RecipeCategory.MISC, ModItems.LIGHT_INGOT.get(), 0.25f, 200, "light_ingot");


    }

    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
