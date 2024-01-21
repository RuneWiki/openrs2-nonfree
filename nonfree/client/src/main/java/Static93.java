import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public static int anInt2670;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1161 = Static59.method1195("Moderator option: Mute player for 48 hours: <lt>ON<gt>");

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1162 = Static59.method1195("Ignorieren");

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1163 = aClass60_1161;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public static int anInt2677 = 0;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public static int anInt2678 = 0;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1164 = Static59.method1195(" <col=ffff00>");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method1730() {
		Static74.anInt2399 = 0;
		Static118.anInt3220 = 0;
		Static82.method1655();
		Static57.method2265();
		Static6.method124();
		Static26.method645();
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static118.anInt3220; local27++) {
			local33 = Static74.anIntArray239[local27];
			if (Static34.anInt1183 != Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33].anInt1531) {
				Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33] = null;
			}
		}
		if (Static79.aClass3_Sub12_Sub1_1.anInt2886 != Static58.anInt1794) {
			throw new RuntimeException("gpp1 pos:" + Static79.aClass3_Sub12_Sub1_1.anInt2886 + " psize:" + Static58.anInt1794);
		}
		for (local33 = 0; local33 < Static53.anInt1744; local33++) {
			if (Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[Static14.anIntArray56[local33]] == null) {
				throw new RuntimeException("gpp2 pos:" + local33 + " size:" + Static53.anInt1744);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public static void method1731() {
		aClass60_1164 = null;
		aClass60_1161 = null;
		aClass60_1163 = null;
		aClass60_1162 = null;
	}
}
