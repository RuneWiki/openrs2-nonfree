import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!kg", name = "W", descriptor = "[Lclient!p;")
	public static Class3_Sub17[] aClass3_Sub17Array1;

	@OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
	public static int anInt2117;

	@OriginalMember(owner = "client!kg", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_716 = Static65.method1172("scrollen:");

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
	public static int anInt2114 = 500;

	@OriginalMember(owner = "client!kg", name = "R", descriptor = "Lclient!kb;")
	public static Class46 aClass46_717 = Static65.method1172("Clientscript error in: ");

	@OriginalMember(owner = "client!kg", name = "S", descriptor = "Lclient!nd;")
	public static Class59 aClass59_6 = new Class59();

	@OriginalMember(owner = "client!kg", name = "V", descriptor = "Lclient!kb;")
	public static Class46 aClass46_718 = Static65.method1172("Hier wechseln");

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
	public static void method1429() {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = -1; local3 < Static180.anInt3971; local3++) {
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static127.anIntArray338[local3];
			}
			@Pc(21) Class3_Sub2_Sub1_Sub1_Sub1 local21 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local13];
			if (local21 != null && local21.anInt1730 > 0) {
				local21.anInt1730--;
				if (local21.anInt1730 == 0) {
					local21.aClass46_590 = null;
				}
			}
		}
		for (local13 = 0; local13 < Static174.anInt3804; local13++) {
			@Pc(50) int local50 = Static42.anIntArray106[local13];
			@Pc(54) Class3_Sub2_Sub1_Sub1_Sub2 local54 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local50];
			if (local54 != null && local54.anInt1730 > 0) {
				local54.anInt1730--;
				if (local54.anInt1730 == 0) {
					local54.aClass46_590 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
	public static void method1430() {
		Static89.aClass57_17.method1715();
		Static170.aClass57_29.method1715();
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
	public static void method1431() {
		aClass46_716 = null;
		aClass3_Sub17Array1 = null;
		aClass59_6 = null;
		aClass46_717 = null;
		aClass46_718 = null;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
	public static void method1432(@OriginalArg(1) int arg0) {
		Static79.anInt1981 = 1000 / arg0;
	}
}
