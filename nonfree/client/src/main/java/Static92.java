import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "[Lclient!oc;")
	public static Class152[] aClass152Array1;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
	public static int anInt2063;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_75 = new Class217(80, -1);

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "[I")
	public static final int[] anIntArray162 = new int[100];

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
	public static int anInt2062 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)V")
	public static void method1927() {
		@Pc(5) Class21 local5 = Static21.aClass21_20;
		synchronized (Static21.aClass21_20) {
			Static21.aClass21_20.method844(5);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public static void method1928() {
		@Pc(1) Class21 local1 = Static244.aClass21_134;
		synchronized (Static244.aClass21_134) {
			Static244.aClass21_134.method857();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V")
	public static void method1929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg3 >= Static93.anInt5014 && Static122.anInt1360 >= arg2 + arg3 && arg1 - arg3 >= Static131.anInt2843 && Static38.anInt945 >= arg3 + arg1) {
			Static195.method3642(arg3, arg0, arg2, arg1);
		} else {
			Static176.method5659(arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILclient!ik;Lclient!ik;)V")
	public static void method1931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5 arg3, @OriginalArg(4) Class11_Sub5 arg4) {
		@Pc(4) Class155 local4 = Static94.method2043(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub5_2 = arg3;
			local4.aClass11_Sub5_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
	public static void method1933() {
		Static184.aClass21_104.method851();
		Static324.aClass21_164.method851();
		Static85.aClass21_58.method851();
		Static307.aClass21_156.method851();
		Static36.aClass21_37.method851();
	}
}
