import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "Lclient!de;")
	public static Class8_Sub3_Sub3_Sub1_Sub1 aClass8_Sub3_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_61 = new Class235(71, 17);

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_62 = new Class235(56, 2);

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Lclient!vg;")
	public static Class341 aClass341_8 = null;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1618(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(50) StringBuffer local50 = new StringBuffer(local10 + local8);
		for (@Pc(52) int local52 = 0; local52 < local8; local52++) {
			@Pc(58) char local58 = arg0.charAt(local52);
			if (local58 == '<') {
				local50.append("<lt>");
			} else if (local58 == '>') {
				local50.append("<gt>");
			} else {
				local50.append(local58);
			}
		}
		return local50.toString();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BILclient!r;)Lclient!uq;")
	public static Class334 method1619(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(9) Class110 local9 = Static410.method5649(arg1, true, arg0);
		return local9 == null ? null : local9.aClass334_5;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public static void method1620() {
		Static507.method7074(false);
		if (Static207.anInt4059 >= 0 && Static207.anInt4059 != 0) {
			Static523.method7235(Static207.anInt4059);
			Static207.anInt4059 = -1;
		}
	}
}
