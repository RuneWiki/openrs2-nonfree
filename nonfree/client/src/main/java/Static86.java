import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	public static int anInt1783;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	public static int anInt1786;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_704 = Static120.method1824("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
	public static final int[] anIntArray219 = new int[5];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!rd;Lclient!rd;ILclient!rd;Z)V")
	public static void method1249(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class80 arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static173.anIntArray469[local3] = Static173.anIntArray469[local3 - 1];
			Static118.aClass80Array18[local3] = Static118.aClass80Array18[local3 - 1];
			Static100.aClass80Array14[local3] = Static100.aClass80Array14[local3 - 1];
			Static160.aClass80Array27[local3] = Static160.aClass80Array27[local3 - 1];
		}
		Static173.anIntArray469[0] = arg2;
		Static85.anInt1781++;
		Static118.aClass80Array18[0] = arg3;
		Static100.aClass80Array14[0] = arg0;
		Static160.aClass80Array27[0] = arg1;
		Static175.anInt3953 = Static31.anInt747;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)J")
	public static synchronized long method1251() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static130.aLong94) {
			Static194.aLong152 += Static130.aLong94 - local5;
		}
		Static130.aLong94 = local5;
		return local5 + Static194.aLong152;
	}
}
