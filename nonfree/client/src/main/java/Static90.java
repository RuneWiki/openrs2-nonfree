import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
	public static int anInt6146;

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_192 = new Class214(99, -2);

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
	public static void method5069(@OriginalArg(1) int arg0) {
		if (Static77.anInt1863 == arg0) {
			return;
		}
		Static193.anInt3853 = Static301.anInt5585 = Static334.anIntArray477[arg0];
		Static418.method2686();
		Static352.anIntArrayArray44 = new int[Static193.anInt3853][Static301.anInt5585];
		Static47.anIntArrayArrayArray1 = new int[4][Static193.anInt3853 >> 3][Static301.anInt5585 >> 3];
		Static224.anIntArrayArray30 = new int[Static193.anInt3853][Static301.anInt5585];
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			Static335.aClass253Array1[local45] = Static272.method4369(Static193.anInt3853, Static301.anInt5585);
		}
		Static180.aByteArrayArrayArray3 = new byte[4][Static193.anInt3853][Static301.anInt5585];
		Static194.method3458(Static193.anInt3853, Static301.anInt5585);
		Static124.method2328(Static193.anInt3853 >> 3, Static30.aClass30_3, Static301.anInt5585 >> 3);
		Static77.anInt1863 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Lclient!vr;")
	public static Class266 method5070(@OriginalArg(1) int arg0) {
		@Pc(8) Class266[] local8 = Static245.method4062();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt7574 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)Z")
	public static boolean method5072(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static244.method4059(arg1, arg0) | Static24.method366(arg1, arg0)) & Static322.method4802(arg1, arg0);
	}
}
