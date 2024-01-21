import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray94;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_205;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray95;

	@OriginalMember(owner = "client!je", name = "B", descriptor = "I")
	public static int anInt4290;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "I")
	public static int anInt4289 = 0;

	@OriginalMember(owner = "client!je", name = "C", descriptor = "I")
	public static int anInt4291 = 127;

	@OriginalMember(owner = "client!je", name = "E", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1229 = Static181.method2795("::autoshadow on");

	@OriginalMember(owner = "client!je", name = "K", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1230 = Static181.method2795("Mitglieder)2Welt");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIZII)Lclient!nb;")
	public static Class2_Sub2_Sub17 method3258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(28) long local28 = (long) arg1 + ((long) arg2 << 16) + (arg3 ? 137438953472L : 0L) + ((long) arg0 << 38) + ((long) arg4 << 40);
		@Pc(40) Class2_Sub2_Sub17 local40 = (Class2_Sub2_Sub17) Static15.aClass86_8.method2643(local28);
		if (local40 != null) {
			return local40;
		}
		local40 = Static34.method716(arg3, arg4, false, arg1, arg2, arg0);
		if (local40 != null) {
			Static15.aClass86_8.method2647(local40, local28);
		}
		return local40;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!bh;)V")
	public static void method3267(@OriginalArg(1) Class2_Sub4 arg0) {
		Static11.method290(arg0, 200000);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILclient!rb;JZ)V")
	public static void method3269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class24 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class26 local6 = new Class26();
		local6.aClass24_1 = arg4;
		local6.anInt1035 = arg1 * 128 + 64;
		local6.anInt1036 = arg2 * 128 + 64;
		local6.anInt1037 = arg3;
		local6.aLong32 = arg5;
		if (Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub23(arg0, arg1, arg2);
		}
		Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local6;
	}
}
