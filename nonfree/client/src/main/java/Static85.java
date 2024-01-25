import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
	public static int anInt1683;

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "[I")
	public static final int[] anIntArray115 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!cw", name = "y", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)[Lclient!kr;")
	public static Class194[] method1427() {
		return new Class194[] { Static311.aClass194_177, Static179.aClass194_99, Static409.aClass194_232, Static290.aClass194_166, Static590.aClass194_290, Static131.aClass194_83, Static107.aClass194_73, Static305.aClass194_172, Static96.aClass194_70, Static33.aClass194_17, Static249.aClass194_141, Static22.aClass194_12, Static133.aClass194_306, Static338.aClass194_195, Static286.aClass194_163, Static333.aClass194_189, Static174.aClass194_98, Static298.aClass194_170, Static379.aClass194_207, Static43.aClass194_21, Static161.aClass194_87, Static457.aClass194_253, Class3_Sub41.lb, Static306.aClass194_173, Static44.aClass194_28, Static489.aClass194_267, Static337.aClass194_191, Static267.aClass194_152, Static395.aClass194_219, Static547.aClass194_281, Static280.aClass194_161, Static81.aClass194_61, Static126.aClass194_81, Static269.aClass194_154, Static525.aClass194_273, Static220.aClass194_122, Static117.aClass194_76, Static258.aClass194_146, Static142.aClass194_283, Static266.aClass194_151, Static329.aClass194_188, Static198.aClass194_214, Static610.aClass194_298, Static246.aClass194_135, Static253.aClass194_142, Static483.aClass194_264, Static32.aClass194_16, Static444.aClass194_250, Static223.aClass194_123, Static50.aClass194_36, Static537.aClass194_280, Static72.aClass194_54, Static204.aClass194_107, Static417.aClass194_235, Static55.aClass194_40, Static452.aClass194_251, Static24.aClass194_14, Static556.aClass194_282, Static131.aClass194_82, Static629.aClass194_303, Static76.aClass194_59, Static475.aClass194_262, Static631.aClass194_304, Static271.aClass194_158, Static290.aClass194_167, Static254.aClass194_53, Static233.aClass194_127, Static590.aClass194_289, Static333.aClass194_190, Static355.aClass194_302, Static533.aClass194_51, Static426.aClass194_239, Static255.aClass194_144, Static351.aClass194_202, Static4.aClass194_3, Static187.aClass194_104, Static607.aClass194_297, Static380.aClass194_209, Static573.aClass194_204, Static618.aClass194_300, Static583.aClass194_309, Static317.aClass194_183, Static465.aClass194_255, Static33.aClass194_18, Static148.aClass194_88, Static133.aClass194_308, Static13.aClass194_11, Static317.aClass194_182, Static248.aClass194_139, Static218.aClass194_117, Static527.aClass194_274, Static415.aClass194_234, Static373.aClass194_206, Static312.aClass194_178, Static133.aClass194_307, Static84.aClass194_278, Static59.aClass194_42, Static236.aClass194_128, Static68.aClass194_49, Static190.aClass194_105, Static84.aClass194_279, Static105.aClass194_72, Static95.aClass194_67, Static350.aClass194_198, Static220.aClass194_121, Static132.aClass194_84, Static462.aClass194_254, Static301.aClass194_171, Static289.aClass194_165, Static392.aClass194_215, Static45.aClass194_30, Static136.aClass194_85, Static5.aClass194_4, Static438.aClass194_246, Static471.aClass194_257, Static123.aClass194_80, Static193.aClass194_311, Static493.aClass194_268, Static221.aClass194_310, Static439.aClass194_284, Static23.aClass194_13, Static75.aClass194_58, Static398.aClass194_221, Static258.aClass194_147 };
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(FBFFI)F")
	public static float method1431(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(7) float[] local7 = Static571.aFloatArrayArray18[arg3];
		return arg2 * local7[1] + arg1 * local7[0] + local7[2] * arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method1433(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(3, arg0);
		local8.method1474();
		local8.aString9 = arg1;
	}
}
