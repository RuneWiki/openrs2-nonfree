import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
	public static int anInt295;

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_105 = null;

	@OriginalMember(owner = "client!b", name = "ab", descriptor = "Lclient!ea;")
	public static Class18 aClass18_106 = null;

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
	public static int anInt293 = 0;

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_107 = Static8.method128("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "[I")
	public static int[] anIntArray12 = new int[32];

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_108 = Static8.method128("::fpsoff");

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public static void method173() {
		aClass18_106 = null;
		anIntArrayArrayArray1 = null;
		aBooleanArray1 = null;
		aClass18_107 = null;
		anIntArray12 = null;
		anIntArray13 = null;
		aClass18_105 = null;
		aClass18_108 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(18) Class1_Sub3 local18 = (Class1_Sub3) Static145.aClass59_53.method2417();
		@Pc(20) Class1_Sub3 local20 = null;
		while (local18 != null) {
			if (local18.anInt212 == arg4 && local18.anInt228 == arg7 && local18.anInt222 == arg5 && arg3 == local18.anInt214) {
				local20 = local18;
				break;
			}
			local18 = (Class1_Sub3) Static145.aClass59_53.method2424();
		}
		if (local20 == null) {
			local20 = new Class1_Sub3();
			local20.anInt222 = arg5;
			local20.anInt212 = arg4;
			local20.anInt228 = arg7;
			local20.anInt214 = arg3;
			Static47.method2892(local20);
			Static145.aClass59_53.method2411(local20);
		}
		local20.anInt225 = arg0;
		local20.anInt229 = arg1;
		local20.anInt215 = arg8;
		local20.anInt221 = arg6;
		local20.anInt217 = arg2;
	}
}
