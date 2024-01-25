import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dia", name = "k", descriptor = "I")
	public static int anInt2026;

	@OriginalMember(owner = "client!dia", name = "j", descriptor = "[I")
	public static final int[] anIntArray137 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	public static void method1980(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static155.method2704(local6.width, local6.height);
		if (Static106.anInt2134 == 1) {
			Static340.aClass33_9.method8144(arg0, Static235.anInt5516, Static118.anInt2257);
		} else {
			Static340.aClass33_9.method8144(arg0, Static445.anInt6953, Static461.anInt7413);
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIII)V")
	public static void method1981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static93.method1898(false, true, local35);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BI)Z")
	public static boolean method1982(@OriginalArg(1) int arg0) {
		if (arg0 == 18 || arg0 == 10 || arg0 == 47 || arg0 == 53 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 48 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!lc;IILclient!es;)V")
	public static void method1983(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub11 arg2) {
		@Pc(9) Class4_Sub26 local9 = new Class4_Sub26();
		local9.anInt4436 = arg2.method8865();
		local9.anInt4437 = arg2.method8850();
		local9.anIntArray316 = new int[local9.anInt4436];
		local9.anIntArray317 = new int[local9.anInt4436];
		local9.aClass281Array1 = new Class281[local9.anInt4436];
		local9.aByteArrayArrayArray16 = new byte[local9.anInt4436][][];
		local9.aClass281Array2 = new Class281[local9.anInt4436];
		local9.anIntArray315 = new int[local9.anInt4436];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt4436; local51++) {
			try {
				@Pc(57) int local57 = arg2.method8865();
				@Pc(71) String local71;
				@Pc(77) String local77;
				@Pc(79) int local79;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local71 = arg2.method8853();
					local77 = arg2.method8853();
					local79 = 0;
					if (local57 == 1) {
						local79 = arg2.method8850();
					}
					local9.anIntArray317[local51] = local57;
					local9.anIntArray316[local51] = local79;
					local9.aClass281Array1[local51] = arg0.method4579(Static526.method7102(local71), local77);
				} else if (local57 == 3 || local57 == 4) {
					local71 = arg2.method8853();
					local77 = arg2.method8853();
					local79 = arg2.method8865();
					@Pc(136) String[] local136 = new String[local79];
					for (@Pc(138) int local138 = 0; local138 < local79; local138++) {
						local136[local138] = arg2.method8853();
					}
					@Pc(157) byte[][] local157 = new byte[local79][];
					@Pc(170) int local170;
					if (local57 == 3) {
						for (@Pc(164) int local164 = 0; local164 < local79; local164++) {
							local170 = arg2.method8850();
							local157[local164] = new byte[local170];
							arg2.method8870(local157[local164], 0, local170);
						}
					}
					local9.anIntArray317[local51] = local57;
					@Pc(197) Class[] local197 = new Class[local79];
					for (local170 = 0; local170 < local79; local170++) {
						local197[local170] = Static526.method7102(local136[local170]);
					}
					local9.aClass281Array2[local51] = arg0.method4569(Static526.method7102(local71), local197, local77);
					local9.aByteArrayArrayArray16[local51] = local157;
				}
			} catch (@Pc(236) ClassNotFoundException local236) {
				local9.anIntArray315[local51] = -1;
			} catch (@Pc(243) SecurityException local243) {
				local9.anIntArray315[local51] = -2;
			} catch (@Pc(250) NullPointerException local250) {
				local9.anIntArray315[local51] = -3;
			} catch (@Pc(257) Exception local257) {
				local9.anIntArray315[local51] = -4;
			} catch (@Pc(264) Throwable local264) {
				local9.anIntArray315[local51] = -5;
			}
		}
		Static281.aClass163_25.method3646(local9);
	}
}
