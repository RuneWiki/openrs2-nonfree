import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "Lclient!fa;")
	public static Interface7 anInterface7_4;

	@OriginalMember(owner = "client!dn", name = "K", descriptor = "Z")
	public static final boolean aBoolean192 = false;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(IB)Lclient!uea;")
	public static Class326 method1923(@OriginalArg(0) int arg0) {
		@Pc(16) Class326[] local16 = Static517.method8196();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class326 local24 = local16[local18];
			if (arg0 == local24.anInt9686) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(JZIZIILclient!vo;I)V")
	public static void method1927(@OriginalArg(0) long arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class348 arg2, @OriginalArg(7) int arg3) {
		Static563.anInt10263 = 0;
		Static491.anInt9287 = 1;
		Static419.anInt7992 = arg3;
		Static132.aClass4_Sub21_Sub4_1 = null;
		Static139.aBoolean230 = false;
		Static301.aLong158 = arg0;
		Static221.aClass348_16 = arg2;
		Static364.anInt7019 = 0;
		Static480.anInt10343 = 10000;
		Static575.anInt10386 = arg1;
	}
}
