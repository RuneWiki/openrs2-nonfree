import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
	public static int[] anIntArray12;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public static int anInt165 = 0;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!lf;")
	private static Class49 aClass49_86 = Static32.method683("Welcome to RuneScape");

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public static int anInt167 = 127;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Z")
	public static final boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Lclient!lf;")
	public static Class49 aClass49_87 = Static32.method683("<img=1>");

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "Lclient!lf;")
	public static Class49 aClass49_88 = aClass49_86;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method129() {
		aByteArrayArray1 = null;
		aClass49_86 = null;
		aClass49_87 = null;
		anIntArrayArrayArray1 = null;
		aClass49_88 = null;
		anIntArray12 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZLclient!u;)V")
	public static void method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub3_Sub7_Sub2 arg2) {
		if (arg2.anInt3568 == arg1 && arg1 != -1) {
			@Pc(61) int local61 = Static29.method543(arg1).anInt406;
			if (local61 == 1) {
				arg2.anInt3566 = 0;
				arg2.anInt3538 = 0;
				arg2.anInt3548 = arg0;
				arg2.anInt3565 = 0;
			}
			if (local61 == 2) {
				arg2.anInt3565 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt3568 == -1 || Static29.method543(arg1).anInt411 >= Static29.method543(arg2.anInt3568).anInt411) {
			arg2.anInt3568 = arg1;
			arg2.anInt3538 = 0;
			arg2.anInt3548 = arg0;
			arg2.anInt3566 = 0;
			arg2.anInt3565 = 0;
			arg2.anInt3540 = arg2.anInt3543;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!lf;B)V")
	public static void method131(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class49 arg1) {
		@Pc(5) Class49 local5 = arg1.method1643();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static134.anInt2913; local16++) {
			@Pc(22) Class2_Sub2_Sub10 local22 = Static113.method1913(local16);
			if ((!arg0 || local22.aBoolean70) && local22.aClass49_834.method1643().method1666(local5) != -1) {
				if (local14 >= 250) {
					Static35.aShortArray2 = null;
					Static12.anInt226 = -1;
					return;
				}
				if (local14 >= local12.length) {
					@Pc(58) short[] local58 = new short[local12.length * 2];
					for (@Pc(60) int local60 = 0; local60 < local14; local60++) {
						local58[local60] = local12[local60];
					}
					local12 = local58;
				}
				local12[local14++] = (short) local16;
			}
		}
		Static12.anInt226 = local14;
		Static35.aShortArray2 = local12;
		@Pc(99) Class49[] local99 = new Class49[Static12.anInt226];
		Static143.anInt3040 = 0;
		for (@Pc(103) int local103 = 0; local103 < Static12.anInt226; local103++) {
			local99[local103] = Static113.method1913(local12[local103]).aClass49_834;
		}
		Static136.method2267(Static35.aShortArray2, local99);
	}
}
