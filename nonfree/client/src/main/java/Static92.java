import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
	public static int anInt2167;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "Lclient!mo;")
	public static Class143 aClass143_51;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!mo;")
	public static Class143 aClass143_52;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "[S")
	public static final short[] aShortArray43 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!mj;")
	public static final Class139 aClass139_1 = new Class139(100);

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "[I")
	public static final int[] anIntArray197 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!mo;ILclient!e;)V")
	public static void method2160(@OriginalArg(0) Class143 arg0, @OriginalArg(2) Class46 arg1) {
		if (Static290.aBoolean370) {
			return;
		}
		arg1.method5100(0);
		Static110.aClass2_12 = arg1.method5157(Static368.method5810(arg0, Static22.anInt452));
		Static110.aClass2_12.method2642((Static294.anInt5659 - Static110.aClass2_12.method2630()) / 2, (Static46.anInt1173 - Static110.aClass2_12.method2627()) / 2);
		Static209.aClass2_17 = arg1.method5157(Static368.method5810(arg0, Static164.anInt3460));
		Static209.aClass2_17.method2642((Static294.anInt5659 - Static209.aClass2_17.method2630()) / 2, 18);
		Static290.aBoolean370 = true;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method2161() {
		@Pc(5) Class11 local5 = Static94.aClass11_51;
		synchronized (Static94.aClass11_51) {
			Static94.aClass11_51.method214();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
	public static void method2162() {
		@Pc(1) Class11 local1 = Static93.aClass11_50;
		synchronized (Static93.aClass11_50) {
			Static93.aClass11_50.method213();
		}
		local1 = Static259.aClass11_113;
		synchronized (Static259.aClass11_113) {
			Static259.aClass11_113.method213();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
	public static void method2164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(7, arg0);
		local8.method3540();
		local8.anInt3805 = arg1;
	}
}
