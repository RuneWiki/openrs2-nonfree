import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!uf;")
	public static Class237 aClass237_23;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "J")
	public static long aLong46 = 0L;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_6 = new Class225(14, 0, 4, 1);

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray32 = new byte[250][];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ss;I)V")
	public static void method1424(@OriginalArg(0) Class219 arg0) {
		if (!Static138.aBoolean128) {
			return;
		}
		if (arg0.anObjectArray8 != null) {
			@Pc(22) Class219 local22 = Static78.method1356(Static107.anInt1974, Static304.anInt5407);
			if (local22 != null) {
				@Pc(28) Class1_Sub6 local28 = new Class1_Sub6();
				local28.aClass219_4 = arg0;
				local28.aClass219_3 = local22;
				local28.anObjectArray3 = arg0.anObjectArray8;
				Static104.method1608(local28);
			}
		}
		Static55.method989(Static401.aClass131_189);
		Static232.aClass1_Sub1_Sub1_2.method4105(arg0.anInt6422);
		Static232.aClass1_Sub1_Sub1_2.method4103(Static14.anInt338);
		Static232.aClass1_Sub1_Sub1_2.method4103(arg0.anInt6345);
		Static232.aClass1_Sub1_Sub1_2.method4127(Static107.anInt1974);
		Static232.aClass1_Sub1_Sub1_2.method4103(Static304.anInt5407);
		Static232.aClass1_Sub1_Sub1_2.method4092(arg0.anInt6421);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)V")
	public static void method1426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class226 local3 = new Class226();
		local3.anInt6776 = arg1 >> Static139.anInt2355;
		local3.anInt6781 = arg2 >> Static139.anInt2355;
		local3.anInt6783 = arg3 >> Static139.anInt2355;
		local3.anInt6779 = arg4 >> Static139.anInt2355;
		local3.anInt6778 = arg0;
		local3.anInt6784 = arg1;
		local3.anInt6768 = arg2;
		local3.anInt6774 = arg3;
		local3.anInt6789 = arg4;
		local3.anInt6773 = arg5;
		local3.anInt6788 = arg6;
		Static179.aClass226Array1[Static361.anInt6131++] = local3;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I")
	public static int method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 <= arg1) {
			return arg0 >= arg1 ? arg1 : arg0;
		} else {
			return arg2;
		}
	}
}
