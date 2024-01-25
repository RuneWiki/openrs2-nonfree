import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
	public static int anInt1589;

	@OriginalMember(owner = "client!dca", name = "u", descriptor = "Lclient!ed;")
	public static Class77 aClass77_5;

	@OriginalMember(owner = "client!dca", name = "v", descriptor = "I")
	public static int anInt1593;

	@OriginalMember(owner = "client!dca", name = "w", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array4;

	@OriginalMember(owner = "client!dca", name = "n", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_23 = new Class40("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!dca", name = "t", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(CB)I")
	public static int method1457(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class46.anIntArray156.length ? Class46.anIntArray156[arg0] : -1;
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)V")
	public static void method1458() {
		Static206.aClass62_24.E(Static174.anInt3441, Static300.aClass5_Sub28_Sub1_1.aBoolean339 ? Static122.anInt2577 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIII)V")
	public static void method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class5_Sub2_Sub7 local13 = Static144.method2728(arg1, 8);
		local13.method1327();
		local13.anInt1433 = arg3;
		local13.anInt1434 = arg2;
		local13.anInt1437 = arg0;
	}
}
