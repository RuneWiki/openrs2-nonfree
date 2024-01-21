import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1 aClass2_Sub1_Sub9_Sub1_6;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_52;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!wb;")
	public static Class2_Sub17 aClass2_Sub17_5;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Z")
	public static boolean aBoolean153;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_804 = Static2.method59("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public static int anInt2044 = 0;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	public static int anInt2047 = 0;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_805 = Static2.method59("Die Verbindung konnte");

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_806 = Static2.method59("(X100(U(Y");

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	public static int anInt2048 = 0;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_807 = Static2.method59("(Udns");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)I")
	public static int method1248(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class2_Sub18 local6 = (Class2_Sub18) Static104.aClass41_12.method1056((long) arg0);
		if (local6 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local6.anIntArray365.length) {
			return local6.anIntArray365[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILclient!wb;IIZI)V")
	public static void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(31) int local31;
		if (arg4 < 0 || arg4 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local31 = arg3.method1780();
				if (local31 == 0) {
					break;
				}
				if (local31 == 1) {
					arg3.method1780();
					break;
				}
				if (local31 <= 49) {
					arg3.method1780();
				}
			}
			return;
		}
		Static108.aByteArrayArrayArray7[arg1][arg4][arg6] = 0;
		while (true) {
			local31 = arg3.method1780();
			if (local31 == 0) {
				if (arg1 == 0) {
					Static100.anIntArrayArrayArray5[0][arg4][arg6] = -Static96.method1511(arg2 + arg4 + 932731, arg5 + 556238 + arg6) * 8;
				} else {
					Static100.anIntArrayArrayArray5[arg1][arg4][arg6] = Static100.anIntArrayArrayArray5[arg1 - 1][arg4][arg6] - 240;
				}
				break;
			}
			if (local31 == 1) {
				@Pc(88) int local88 = arg3.method1780();
				if (local88 == 1) {
					local88 = 0;
				}
				if (arg1 == 0) {
					Static100.anIntArrayArrayArray5[0][arg4][arg6] = -local88 * 8;
				} else {
					Static100.anIntArrayArrayArray5[arg1][arg4][arg6] = Static100.anIntArrayArrayArray5[arg1 - 1][arg4][arg6] - local88 * 8;
				}
				break;
			}
			if (local31 <= 49) {
				Static40.aByteArrayArrayArray3[arg1][arg4][arg6] = arg3.method1767();
				Static35.aByteArrayArrayArray2[arg1][arg4][arg6] = (byte) ((local31 - 2) / 4);
				Static93.aByteArrayArrayArray5[arg1][arg4][arg6] = (byte) (local31 + arg0 - 2 & 0x3);
			} else if (local31 <= 81) {
				Static108.aByteArrayArrayArray7[arg1][arg4][arg6] = (byte) (local31 - 49);
			} else {
				Static10.aByteArrayArrayArray1[arg1][arg4][arg6] = (byte) (local31 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method1250() {
		aClass80_804 = null;
		aClass2_Sub17_5 = null;
		aClass2_Sub1_Sub9_Sub1_6 = null;
		aClass80_806 = null;
		aClass2_Sub1_Sub9_Sub3_52 = null;
		aClass80_805 = null;
		aClass80_807 = null;
	}
}
