import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
	public static int anInt1781;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_3 = new Class342(9, 0, 4, 1);

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_35 = new Class73(84, -2);

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_32 = new Class47(0, 4);

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
	public static final int anInt1779 = 50;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
	public static final int[] anIntArray145 = new int[anInt1779];

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[anInt1779];

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	public static int anInt1780 = 2;

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "[I")
	public static final int[] anIntArray146 = new int[anInt1779];

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "[I")
	public static final int[] anIntArray147 = new int[anInt1779];

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "[I")
	public static final int[] anIntArray148 = new int[anInt1779];

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "[I")
	public static final int[] anIntArray149 = new int[anInt1779];

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "[I")
	public static final int[] anIntArray150 = new int[anInt1779];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI)V")
	public static void method1684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static300.anInt5542 == 1) {
			Static540.method3563(Static113.aClass6_Sub45_2, arg0, arg1);
		} else if (Static300.anInt5542 == 2) {
			Static273.method4515(arg1, arg0);
		}
		Static300.anInt5542 = 0;
		Static113.aClass6_Sub45_2 = null;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!pg;IIII)V")
	public static void method1685(@OriginalArg(0) Class252 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class6_Sub16 local10 = (Class6_Sub16) Static1.aClass361_67.method7838(); local10 != null; local10 = (Class6_Sub16) Static1.aClass361_67.method7845()) {
			if (local10.anInt2202 == arg1 && arg2 << 9 == local10.anInt2206 && arg3 << 9 == local10.anInt2213 && arg0.anInt6905 == local10.aClass252_1.anInt6905) {
				if (local10.aClass6_Sub18_Sub1_3 != null) {
					Static374.aClass6_Sub18_Sub4_2.method6380(local10.aClass6_Sub18_Sub1_3);
					local10.aClass6_Sub18_Sub1_3 = null;
				}
				if (local10.aClass6_Sub18_Sub1_2 != null) {
					Static374.aClass6_Sub18_Sub4_2.method6380(local10.aClass6_Sub18_Sub1_2);
					local10.aClass6_Sub18_Sub1_2 = null;
				}
				local10.method7804();
				return;
			}
		}
	}
}
