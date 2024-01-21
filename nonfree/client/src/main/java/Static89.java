import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!fa;")
	public static Class23 aClass23_8;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_869 = Static51.method932("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!cd;")
	private static Class10 aClass10_870 = Static51.method932("Loading textures )2 ");

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	public static int anInt2095 = -1;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!cd;")
	private static Class10 aClass10_871 = Static51.method932("Checking for updates )2 ");

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!cd;")
	public static Class10 aClass10_872 = aClass10_871;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_873 = aClass10_870;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_874 = Static51.method932("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_875 = Static51.method932("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_876 = Static51.method932("null");

	@OriginalMember(owner = "client!l", name = "t", descriptor = "I")
	public static int anInt2101 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method1500() {
		aClass10_876 = null;
		aClass10_874 = null;
		aClass10_872 = null;
		aClass10_873 = null;
		aClass10_875 = null;
		aBooleanArray8 = null;
		aClass10_871 = null;
		aClass10_869 = null;
		aBigInteger1 = null;
		aClass23_8 = null;
		aClass10_870 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public static void method1501() {
		for (@Pc(7) int local7 = 0; local7 < Static48.anInt1160; local7++) {
			@Pc(15) int local15 = Static28.anIntArray62[local7]--;
			if (Static28.anIntArray62[local7] >= -10) {
				@Pc(84) Class57 local84 = Static26.aClass57Array1[local7];
				if (local84 == null) {
					local84 = Static184.method1761(Static102.aClass29_Sub1_50, Static59.anIntArray169[local7], 0);
					if (local84 == null) {
						continue;
					}
					Static28.anIntArray62[local7] += local84.method1760();
					Static26.aClass57Array1[local7] = local84;
				}
				if (Static28.anIntArray62[local7] < 0) {
					@Pc(214) int local214;
					if (Static106.anIntArray250[local7] == 0) {
						local214 = Static142.anInt3159;
					} else {
						@Pc(130) int local130 = (Static106.anIntArray250[local7] & 0xFF) * 128;
						@Pc(138) int local138 = Static106.anIntArray250[local7] >> 16 & 0xFF;
						@Pc(146) int local146 = Static106.anIntArray250[local7] >> 8 & 0xFF;
						@Pc(156) int local156 = local146 * 128 + 64 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499;
						if (local156 < 0) {
							local156 = -local156;
						}
						@Pc(170) int local170 = local138 * 128 + 64 - Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454;
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(185) int local185 = local170 + local156 - 128;
						if (local185 > local130) {
							Static28.anIntArray62[local7] = -100;
							continue;
						}
						if (local185 < 0) {
							local185 = 0;
						}
						local214 = Static180.anInt3818 * (local130 - local185) / local130;
					}
					if (local214 > 0) {
						@Pc(228) Class2_Sub10_Sub1 local228 = local84.method1758().method1269(Static52.aClass13_1);
						@Pc(233) Class2_Sub5_Sub2 local233 = Static186.method2326(local228, local214);
						local233.method2318(Static110.anIntArray256[local7] - 1);
						Static2.aClass2_Sub5_Sub3_1.method2612(local233);
					}
					Static28.anIntArray62[local7] = -100;
				}
			} else {
				Static48.anInt1160--;
				for (@Pc(31) int local31 = local7; local31 < Static48.anInt1160; local31++) {
					Static59.anIntArray169[local31] = Static59.anIntArray169[local31 + 1];
					Static26.aClass57Array1[local31] = Static26.aClass57Array1[local31 + 1];
					Static110.anIntArray256[local31] = Static110.anIntArray256[local31 + 1];
					Static28.anIntArray62[local31] = Static28.anIntArray62[local31 + 1];
					Static106.anIntArray250[local31] = Static106.anIntArray250[local31 + 1];
				}
				local7--;
			}
		}
		if (Static24.aBoolean22 && !Static128.method2073()) {
			if (Static37.anInt932 != 0 && Static27.anInt757 != -1) {
				Static63.method1124(0, Static170.aClass29_Sub1_51, Static37.anInt932, Static27.anInt757);
			}
			Static24.aBoolean22 = false;
		}
	}
}
