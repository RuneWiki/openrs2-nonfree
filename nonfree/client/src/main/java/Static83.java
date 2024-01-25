import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!l;")
	public static Class57 aClass57_10;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "J")
	public static volatile long aLong59 = 0L;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)Z")
	public static boolean method1510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!uu;ZLclient!uu;)V")
	public static void method1512(@OriginalArg(0) Class247 arg0, @OriginalArg(2) Class247 arg1) {
		Static429.method5476(Static261.aClass215_59);
		Static3.aClass4_Sub12_Sub1_5.method2531(arg0.anInt6809);
		Static3.aClass4_Sub12_Sub1_5.method2496(arg0.anInt6865);
		Static3.aClass4_Sub12_Sub1_5.method2532(arg1.anInt6809);
		Static3.aClass4_Sub12_Sub1_5.method2496(arg1.anInt6865);
		Static3.aClass4_Sub12_Sub1_5.method2494(arg1.anInt6779);
		Static3.aClass4_Sub12_Sub1_5.method2494(arg0.anInt6779);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILclient!pe;)Lclient!ag;")
	public static Class7 method1513(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1) {
		@Pc(7) Class7 local7;
		if (Static33.aClass7_2 == null) {
			local7 = new Class7();
		} else {
			local7 = Static33.aClass7_2;
			Static33.aClass7_2 = Static33.aClass7_2.aClass7_1;
			local7.aClass7_1 = null;
			Static153.anInt3086--;
		}
		local7.aClass16_Sub1_1 = arg1;
		local7.anInt118 = arg0;
		return local7;
	}
}
