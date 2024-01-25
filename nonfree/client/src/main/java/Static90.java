import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
	public static int anInt1844;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "[S")
	public static short[] aShortArray26 = new short[256];

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	public static void method1504() throws Exception_Sub1 {
		if (Static471.anInt7481 == 1) {
			Static565.aClass95_13.method8010(Static117.anInt2122, Static212.anInt3685);
		} else {
			Static565.aClass95_13.method8010(0, 0);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!mw;ILclient!hda;)Lclient!pja;")
	public static Class3_Sub37 method1509(@OriginalArg(0) Class240 arg0, @OriginalArg(2) Class144 arg1) {
		@Pc(8) Class3_Sub37 local8 = Static577.method7590();
		local8.anInt7403 = arg0.anInt6436;
		local8.aClass240_78 = arg0;
		if (local8.anInt7403 == -1) {
			local8.aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(260);
		} else if (local8.anInt7403 == -2) {
			local8.aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(10000);
		} else if (local8.anInt7403 <= 18) {
			local8.aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(20);
		} else if (local8.anInt7403 <= 98) {
			local8.aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(100);
		} else {
			local8.aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(260);
		}
		local8.aClass3_Sub4_Sub1_2.method328(arg1);
		local8.aClass3_Sub4_Sub1_2.method335(local8.aClass240_78.method5402());
		local8.anInt7407 = 0;
		return local8;
	}
}
