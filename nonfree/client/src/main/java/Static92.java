import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
	public static int anInt2092;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Lclient!gq;", line = 16)
	public static Class11_Sub1 method2145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_2;
	}

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "(I)V", line = 24)
	public static void method2146() {
		if (Static312.aClass111_4 != null) {
			Static312.aClass111_4.method2801();
			Static312.aClass111_4 = null;
		}
		Static197.method3722();
		Static233.method4367();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Class2_Sub3_Sub18.aClass46Array1[local17].method1628();
		}
		Static224.method4193(false);
		System.gc();
		Static163.method1509();
		Class252.aBoolean486 = false;
		Class2_Sub3_Sub18.anInt3264 = -1;
		Static222.method4153(true);
		Static154.anInt3136 = 0;
		Static9.anInt212 = 0;
		Class154.aBoolean252 = false;
		Static98.anInt2184 = 0;
		Static139.anInt2716 = 0;
		for (@Pc(56) int local56 = 0; local56 < Class41.aClass84Array1.length; local56++) {
			Class41.aClass84Array1[local56] = null;
		}
		Static333.method5889();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Class9.aClass11_Sub5_Sub2_Sub1Array1[local75] = null;
		}
		Class117.anInt3183 = 0;
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local91] = null;
		}
		Class87.aClass4_49.method81();
		Static110.method2371();
		Class49_Sub3.anInt5498 = 0;
		Static199.aClass226_1.method5782();
		Static107.method2364();
		Static335.method5647();
		Static47.method1527(true);
		try {
			Static391.method4629(Static305.aClass152_5.anApplet1, "loggedout");
		} catch (@Pc(128) Throwable local128) {
		}
		Static350.aLong222 = 0L;
		Static359.aClass2_Sub16_2 = null;
	}

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V", line = 223)
	public static void method2148() {
		Static61.aClass19_3.method2840(((float) Static203.aClass177_Sub1_2.anInt4869 * 0.1F + 0.7F) * 1.1523438F);
		Static61.aClass19_3.method2834(Class25_Sub1.anInt686, 0.69921875F, 1.2F, -50.0F, (float) -60, -50.0F);
		Static61.aClass19_3.method2881(Canvas_Sub1.anInt5151, -1);
		Static61.aClass19_3.method2872(Static58.aClass42_5);
	}
}
