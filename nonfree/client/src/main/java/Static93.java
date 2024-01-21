import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
	public static int[] anIntArray260;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!aa;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	public static int anInt2392 = 0;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "J")
	public static long aLong65 = 0L;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!ob;")
	public static Class55 aClass55_75 = new Class55(64);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)I")
	public static int method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local3 < 0 || local11 < 0 || local3 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(29) int local29 = arg1;
		if (arg1 < 3 && (Static66.aByteArrayArrayArray10[1][local3][local11] & 0x2) == 2) {
			local29 = arg1 + 1;
		}
		@Pc(52) int local52 = arg0 & 0x7F;
		@Pc(61) int local61 = arg2 & 0x7F;
		@Pc(87) int local87 = (128 - local52) * Static118.anIntArrayArrayArray6[local29][local3][local11] + local52 * Static118.anIntArrayArrayArray6[local29][local3 + 1][local11] >> 7;
		@Pc(117) int local117 = local52 * Static118.anIntArrayArrayArray6[local29][local3 + 1][local11 + 1] + Static118.anIntArrayArrayArray6[local29][local3][local11 + 1] * (128 - local52) >> 7;
		return local87 * (128 - local61) + local61 * local117 >> 7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZI)Lclient!je;")
	public static Class40 method1731(@OriginalArg(2) int arg0) {
		return Static30.method464(arg0, true);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLjava/awt/Component;I)Lclient!bf;")
	public static Class7 method1732(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class7_Sub1");
			@Pc(18) Class7 local18 = (Class7) local6.getDeclaredConstructor().newInstance();
			local18.method2130(arg2, arg0, arg1);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class7_Sub2 local31 = new Class7_Sub2();
			local31.method2130(arg2, arg0, arg1);
			return local31;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method1733() {
		aClass2_Sub1_Sub2_Sub4_3 = null;
		anIntArray260 = null;
		aClass55_75 = null;
		aClass1_1 = null;
	}
}
