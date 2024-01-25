import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "Lclient!pc;")
	public static Class188 aClass188_30;

	@OriginalMember(owner = "client!ei", name = "Z", descriptor = "Lclient!rc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!js;)[Lclient!fg;")
	public static Class82[] method1554(@OriginalArg(1) Class131 arg0) {
		if (!arg0.method3051()) {
			return new Class82[0];
		}
		@Pc(16) Class128 local16 = arg0.method3052();
		while (local16.anInt3727 == 0) {
			Static443.method5991(10L);
		}
		if (local16.anInt3727 == 2) {
			return new Class82[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject4;
		@Pc(41) Class82[] local41 = new Class82[local35.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local41.length; local48++) {
			@Pc(54) Class82 local54 = new Class82();
			local41[local48] = local54;
			local54.anInt2298 = local35[local48 << 2];
			local54.anInt2301 = local35[(local48 << 2) + 1];
			local54.anInt2303 = local35[(local48 << 2) + 2];
			local54.anInt2300 = local35[(local48 << 2) + 3];
		}
		return local41;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method1556(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class41 local8 = Static85.method2627(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray25 != null) {
			@Pc(18) Class2_Sub14 local18 = new Class2_Sub14();
			local18.aString15 = arg1;
			local18.anInt1851 = arg0;
			local18.anObjectArray32 = local8.anObjectArray25;
			local18.aClass41_5 = local8;
			Static290.method4227(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt1632 != 0) {
			local35 = Static235.method3570(local8);
		}
		if (!local35 || !Static56.method1112(local8).method1588(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static448.method6059(Static163.aClass44_42);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 2) {
			Static448.method6059(Static321.aClass44_76);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 3) {
			Static448.method6059(Static104.aClass44_29);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 4) {
			Static448.method6059(Static297.aClass44_67);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 5) {
			Static448.method6059(Static1.aClass44_1);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 6) {
			Static448.method6059(Static215.aClass44_51);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 7) {
			Static448.method6059(Static118.aClass44_31);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 8) {
			Static448.method6059(Static218.aClass44_15);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 9) {
			Static448.method6059(Static31.aClass44_46);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
		if (arg0 == 10) {
			Static448.method6059(Static316.aClass44_73);
			Static410.method5552(arg2, arg3, local8.anInt1671);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)I")
	public static int method1557(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!pc;IIB)Lclient!wp;")
	public static Class266 method1558(@OriginalArg(0) Class188 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4283(arg1, 0);
		return local9 == null ? null : new Class266(local9);
	}
}
