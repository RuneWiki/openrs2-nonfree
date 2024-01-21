import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
	public static int anInt2505;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
	public static int anInt2511;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] aClass1_Sub2_Sub1_Sub4Array10;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "[S")
	public static short[] aShortArray20 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	public static int anInt2502 = 0;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!fd;")
	public static Class20 aClass20_7 = null;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	public static final int anInt2504 = 0;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
	public static int anInt2506 = 0;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_831 = Static161.method2971("(U");

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
	public static int anInt2508 = 0;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
	public static int anInt2510 = 1;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "Lclient!dd;")
	public static Class13 aClass13_832 = Static161.method2971("::autoshadow off");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!be;III)V")
	public static void method1862(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub10 local12;
		@Pc(27) Class1_Sub2_Sub2_Sub1 local27;
		if (arg2 < Static101.anInt2832) {
			local12 = Static170.aClass1_Sub10ArrayArrayArray35[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass56_1 != null && local12.aClass56_1.aClass1_Sub2_Sub2_6 instanceof Class1_Sub2_Sub2_Sub1) {
				local27 = (Class1_Sub2_Sub2_Sub1) local12.aClass56_1.aClass1_Sub2_Sub2_6;
				Static13.method495(arg0, local27, 128, 0, 0, true);
			}
		}
		if (arg3 < Static101.anInt2832) {
			local12 = Static170.aClass1_Sub10ArrayArrayArray35[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass56_1 != null && local12.aClass56_1.aClass1_Sub2_Sub2_6 instanceof Class1_Sub2_Sub2_Sub1) {
				local27 = (Class1_Sub2_Sub2_Sub1) local12.aClass56_1.aClass1_Sub2_Sub2_6;
				Static13.method495(arg0, local27, 0, 0, 128, true);
			}
		}
		if (arg2 < Static101.anInt2832 && arg3 < Static90.anInt2623) {
			local12 = Static170.aClass1_Sub10ArrayArrayArray35[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass56_1 != null && local12.aClass56_1.aClass1_Sub2_Sub2_6 instanceof Class1_Sub2_Sub2_Sub1) {
				local27 = (Class1_Sub2_Sub2_Sub1) local12.aClass56_1.aClass1_Sub2_Sub2_6;
				Static13.method495(arg0, local27, 128, 0, 128, true);
			}
		}
		if (arg2 >= Static101.anInt2832 || arg3 <= 0) {
			return;
		}
		local12 = Static170.aClass1_Sub10ArrayArrayArray35[arg1][arg2 + 1][arg3 - 1];
		if (local12 != null && local12.aClass56_1 != null && local12.aClass56_1.aClass1_Sub2_Sub2_6 instanceof Class1_Sub2_Sub2_Sub1) {
			local27 = (Class1_Sub2_Sub2_Sub1) local12.aClass56_1.aClass1_Sub2_Sub2_6;
			Static13.method495(arg0, local27, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	public static void method1863() {
		aShortArray20 = null;
		aClass20_7 = null;
		aClass13_832 = null;
		aClass13_831 = null;
		aClass1_Sub2_Sub1_Sub4Array10 = null;
		aBooleanArrayArray1 = null;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method1865() {
		Static30.aBoolean72 = false;
		Static137.aBoolean262 = false;
	}
}
