import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!di", name = "t", descriptor = "[J")
	public static long[] aLongArray14;

	@OriginalMember(owner = "client!di", name = "x", descriptor = "I")
	public static int anInt9216;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "Lclient!xa;")
	public static Class13 aClass13_35;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "I")
	public static int anInt9215 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)Z")
	public static boolean method7582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
	public static void method7584() {
		@Pc(11) int local11 = Static272.anInt5182;
		@Pc(13) int[] local13 = Static362.anIntArray519;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class10_Sub1_Sub2_Sub2 local23 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local13[local15]];
			if (local23 != null) {
				Static209.method7921(local23.method7021(), local23);
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7585(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(local8 + local15);
		for (@Pc(46) int local46 = 0; local46 < local8; local46++) {
			@Pc(52) char local52 = arg0.charAt(local46);
			if (local52 == '<') {
				local44.append("<lt>");
			} else if (local52 == '>') {
				local44.append("<gt>");
			} else {
				local44.append(local52);
			}
		}
		return local44.toString();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public static void method7586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class285 local14 = Static522.aClass285ArrayArray1[arg0][arg1];
		if (local14 != null) {
			Static358.anInt6226 = local14.anInt7598;
			Static572.anInt9516 = local14.anInt7595;
			Static41.anInt805 = local14.anInt7596;
		}
		Static501.method7140();
	}
}
