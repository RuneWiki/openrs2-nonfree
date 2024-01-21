import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
	public static int anInt1976 = 0;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Lclient!bd;")
	public static Class10 aClass10_53 = new Class10();

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	public static final int anInt1979 = 50;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[J")
	public static final long[] aLongArray3 = new long[500];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_21 = new Class85(64);

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_971 = Static193.method3027("logo");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)I")
	public static int method1375(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static17.anInt363 = -1;
			Static8.anInt191 = -1;
			return;
		}
		@Pc(31) int local31 = Static107.method2399(arg1, arg0, Static137.anInt2795) - arg2;
		@Pc(35) int local35 = Class3_Sub3_Sub2_Sub5.anIntArray300[Static122.anInt2464];
		@Pc(39) int local39 = arg1 - Static54.anInt1158;
		@Pc(43) int local43 = local31 - Static118.anInt2400;
		@Pc(47) int local47 = arg0 - Static130.anInt2546;
		@Pc(51) int local51 = Class3_Sub3_Sub2_Sub5.anIntArray303[Static122.anInt2464];
		@Pc(55) int local55 = Class3_Sub3_Sub2_Sub5.anIntArray300[Static183.anInt2962];
		@Pc(59) int local59 = Class3_Sub3_Sub2_Sub5.anIntArray303[Static183.anInt2962];
		@Pc(70) int local70 = local39 * local55 + local47 * local59 >> 16;
		@Pc(81) int local81 = local59 * local39 - local47 * local55 >> 16;
		@Pc(88) int local88 = local70;
		@Pc(99) int local99 = local43 * local51 - local81 * local35 >> 16;
		@Pc(109) int local109 = local51 * local81 + local35 * local43 >> 16;
		if (local109 < 50) {
			Static8.anInt191 = -1;
			Static17.anInt363 = -1;
		} else {
			Static8.anInt191 = (local88 << 9) / local109 + arg3;
			Static17.anInt363 = arg4 + (local99 << 9) / local109;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)Lclient!le;")
	public static Class3_Sub3_Sub16 method1377(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub3_Sub16 local12 = (Class3_Sub3_Sub16) Static91.aClass85_17.method2558((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static170.aClass52_14.method1581(5, arg0);
		local12 = new Class3_Sub3_Sub16();
		if (local27 != null) {
			local12.method1711(new Class3_Sub4(local27));
		}
		Static91.aClass85_17.method2560(local12, (long) arg0);
		return local12;
	}
}
