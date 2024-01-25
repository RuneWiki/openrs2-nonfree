import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "[I")
	public static final int[] anIntArray74 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "[I")
	public static final int[] anIntArray75 = new int[1000];

	@OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
	public static int anInt1506 = -2;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	public static int anInt1507 = 0;

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "(I)Lclient!co;")
	public static Class5_Sub8 method1341() {
		if (Static629.aClass102_69 == null || Static589.aClass238_1 == null) {
			return null;
		}
		Static589.aClass238_1.method5465(Static629.aClass102_69);
		@Pc(28) Class5_Sub8 local28 = (Class5_Sub8) Static589.aClass238_1.method5463();
		if (local28 == null) {
			return null;
		} else {
			@Pc(39) Class315 local39 = Static629.aClass33_4.method657(local28.anInt1429);
			return local39 != null && local39.aBoolean671 && local39.method7598(Static629.anInterface7_2) ? local28 : Static11.method236();
		}
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)[Lclient!el;")
	public static Class109[] method1344() {
		return new Class109[] { Static568.aClass109_202, Static278.aClass109_108, Static256.aClass109_98, Static586.aClass109_208, Static520.aClass109_185, Static526.aClass109_187, Static115.aClass109_49, Static40.aClass109_19, Static312.aClass109_118, Static579.aClass109_206, Static232.aClass109_87, Static391.aClass109_140, Static46.aClass109_24, Static372.aClass109_173, Static284.aClass109_110, Static141.aClass109_107, Static516.aClass109_183, Static378.aClass109_132, Static578.aClass109_205, Static142.aClass109_59, Static425.aClass109_154, Static3.aClass109_6, Static294.aClass109_115, Static452.aClass109_160, Static16.aClass109_14, Static297.aClass109_116, Static426.aClass109_155, Static675.aClass109_225, Static42.aClass109_42, Static503.aClass109_177, Static386.aClass109_137, Static393.aClass109_157, Static634.aClass109_218, Static583.aClass109_207, Static119.aClass109_50, Static401.aClass109_147, Static509.aClass109_180, Static475.aClass109_169, Static667.aClass109_223, Static415.aClass109_204, Static601.aClass109_211, Static631.aClass109_217, Static256.aClass109_99, Static51.aClass109_26, Static35.aClass109_192, Static513.aClass109_182, Static270.aClass109_104, Static402.aClass109_149, Static91.aClass109_38, Static226.aClass109_81, Static74.aClass109_33, Static90.aClass109_37, Static502.aClass109_176, Static352.aClass109_123, Static80.aClass109_34, Static242.aClass109_91, Static72.aClass109_32, Static263.aClass109_100, Static256.aClass109_97, Static565.aClass109_219, Static273.aClass109_105, Static267.aClass109_103, Static378.aClass109_133, Static519.aClass109_184, Static358.aClass109_125, Static348.aClass109_122, Static143.aClass109_60, Static54.aClass109_27, Static110.aClass109_45, Static375.aClass109_131, Static112.aClass109_47, Static628.aClass109_214, Static245.aClass109_93, Static413.aClass109_153, Static93.aClass109_215, Static667.aClass109_224, Static296.aClass109_221, Static174.aClass109_65, Static129.aClass109_53, Static41.aClass109_20, Static677.aClass109_226, Static1.aClass109_197, Static367.aClass109_212, Static107.aClass109_43, Static66.aClass109_30, Static372.aClass109_172, Static533.aClass109_190, Static40.aClass109_18, Static153.aClass109_62, Static533.aClass109_189, Static416.aClass109_216, Static182.aClass109_66, Static561.aClass109_196, Static401.aClass109_148, Static563.aClass109_198, Static369.aClass109_128, Static600.aClass109_210, Static624.aClass109_213, Static223.aClass109_80, Static481.aClass109_171, Static57.aClass109_28, Static433.aClass109_158, Static537.aClass109_84, Static172.aClass109_64, Static212.aClass109_76, Static521.aClass109_186, Static217.aClass109_79, Static285.aClass109_113, Static84.aClass109_35, Static551.aClass109_193, Static206.aClass109_74, Static200.aClass109_71, Static240.aClass109_90, Static250.aClass109_95, Static68.aClass109_31, Static566.aClass109_200, Static190.aClass109_68, Static503.aClass109_178, Static132.aClass109_56, Static205.aClass109_73, Static60.aClass109_29, Static339.aClass109_121, Static443.aClass109_163, Static391.aClass109_141, Static448.aClass109_166, Static444.aClass109_164, Static275.aClass109_106, Static446.aClass109_165, Static366.aClass109_127, Static293.aClass109_114, Static637.aClass109_220, Static191.aClass109_69, Static659.aClass109_222, Static238.aClass109_88, Static402.aClass109_150 };
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V")
	public static void method1349() {
		if (!Static389.method5665()) {
			return;
		}
		if (Static117.aStringArray15 == null) {
			Static45.method8839();
		}
		Static258.anInt4452 = 0;
		Static563.aBoolean729 = true;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILclient!cn;I)V")
	public static void method1350(@OriginalArg(0) int arg0, @OriginalArg(2) Class73 arg1, @OriginalArg(3) int arg2) {
		Static618.aClass73_20 = arg1;
		Static319.anInt5702 = arg2;
		Static64.anInt1059 = arg0;
	}
}
