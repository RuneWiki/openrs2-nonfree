import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public static int anInt2015;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	public static int anInt2017;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_640 = null;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_641 = null;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!w;")
	public static Class123 aClass123_6 = new Class123(16);

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_642 = Static64.method1101("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_643 = Static64.method1101("hitmarks");

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIBI)I")
	public static int method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class94.anIntArray277[arg0 * 1024 / arg2] >> 1;
		return (arg3 * local21 >> 16) + ((65536 - local21) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Z")
	public static boolean method1503() {
		try {
			return Static44.method785();
		} catch (@Pc(14) IOException local14) {
			Static127.method2209();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static216.anInt4583 + "," + Static105.anInt2334 + "," + Static80.anInt1797 + " - " + Static142.anInt3128 + "," + (Static73.aClass5_Sub1_Sub1_1.anIntArray238[0] + Static198.anInt4217) + "," + (Static118.anInt2541 + Static73.aClass5_Sub1_Sub1_1.anIntArray233[0]) + " - ";
			for (@Pc(61) int local61 = 0; local61 < Static142.anInt3128 && local61 < 50; local61++) {
				local59 = local59 + Static225.aClass1_Sub16_Sub1_4.aByteArray62[local61] + ",";
			}
			Static34.method595(local59, local19);
			Static59.method1033();
			return true;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
	public static void method1505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static160.anInt3454 && arg1 <= Static149.anInt3252) {
			@Pc(17) int local17 = Static28.method525(Static122.anInt2710, arg3, Static225.anInt4729);
			@Pc(23) int local23 = Static28.method525(Static122.anInt2710, arg0, Static225.anInt4729);
			Static3.method64(arg1, local17, arg2, local23);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg6) {
			Static37.method655(arg6, arg3, arg2, arg1, arg0, arg4);
		} else if (arg4 - arg6 >= Static160.anInt3454 && arg4 + arg6 <= Static149.anInt3252 && Static225.anInt4729 <= arg2 - arg5 && arg5 + arg2 <= Static122.anInt2710) {
			Static70.method1254(arg5, arg4, arg3, arg2, arg1, arg6, arg0);
		} else {
			Static135.method2413(arg4, arg5, arg1, arg3, arg0, arg2, arg6);
		}
	}
}
