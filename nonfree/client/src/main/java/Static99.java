import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_721 = Static64.method1101("<col=ffffff>");

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
	public static int anInt2154 = 0;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Lclient!ia;")
	public static Class51 aClass51_722 = Static64.method1101(")1j");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
	public static void method1646(@OriginalArg(1) int arg0) {
		Static46.method825();
		Static44.method791();
		@Pc(12) int local12 = Static203.method3265(arg0).anInt230;
		if (local12 == 0) {
			return;
		}
		@Pc(22) int local22 = Static86.anIntArray125[arg0];
		if (local12 == 9) {
			Static11.anInt236 = local22;
		}
		if (local12 == 5) {
			Static179.anInt3918 = local22;
		}
		if (local12 == 6) {
			Static180.anInt3928 = local22;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!mb;Lclient!mb;)V")
	public static void method1648(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class70 arg1) {
		Static192.aClass70_40 = arg0;
		Static112.aClass70_27 = arg1;
	}
}
