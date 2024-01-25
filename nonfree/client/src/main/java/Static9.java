import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_5 = new Class136(72, -2);

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
	public static int anInt145 = -1;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "[I")
	public static final int[] anIntArray13 = new int[4096];

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method174(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class357 local8 = Static318.method4971(arg2, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray24 != null) {
			@Pc(18) Class5_Sub9 local18 = new Class5_Sub9();
			local18.aClass357_2 = local8;
			local18.aString16 = arg0;
			local18.anObjectArray1 = local8.anObjectArray24;
			local18.anInt912 = arg3;
			Static82.method1317(local18);
		}
		if (Static469.anInt7883 != 10 || !Static74.method1225(local8).method8727(arg3 - 1)) {
			return;
		}
		@Pc(60) Class5_Sub40 local60;
		if (arg3 == 1) {
			local60 = Static25.method507(Static98.aClass208_2, Static235.aClass181_37);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 2) {
			local60 = Static25.method507(Static98.aClass208_2, Static562.aClass181_82);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 3) {
			local60 = Static25.method507(Static98.aClass208_2, Static318.aClass181_45);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 4) {
			local60 = Static25.method507(Static98.aClass208_2, Static442.aClass181_62);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 5) {
			local60 = Static25.method507(Static98.aClass208_2, Static407.aClass181_57);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 6) {
			local60 = Static25.method507(Static98.aClass208_2, Static260.aClass181_40);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 7) {
			local60 = Static25.method507(Static98.aClass208_2, Static127.aClass181_21);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 8) {
			local60 = Static25.method507(Static98.aClass208_2, Static358.aClass181_68);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 9) {
			local60 = Static25.method507(Static98.aClass208_2, Static53.aClass181_13);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
		if (arg3 == 10) {
			local60 = Static25.method507(Static98.aClass208_2, Static390.aClass181_55);
			Static329.method5129(local60, arg2, local8.anInt9871, arg1);
			Static612.method8496(local60);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIZ)I")
	public static int method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg0 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg1 : arg3;
		@Pc(38) int local38 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg1 : arg2) : arg3;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}
}
