import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Lclient!pi;")
	public static Class155 aClass155_1;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!am;")
	public static Class11 aClass11_45;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
	public static int anInt2053;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	public static volatile int anInt2052 = 0;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "[S")
	public static final short[] aShortArray46 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
	public static String method1642(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(14) char local14 = '.';
		if (arg2 == 0) {
			local14 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local14 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local29 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg3 > 0) {
			for (local50 = 0; local50 < arg3; local50++) {
				local55 = (int) arg1;
				arg1 /= 10L;
				local43.append((char) (local55 + 48 - (int) arg1 * 10));
			}
			local43.append(local7);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg1;
			arg1 /= 10L;
			local43.append((char) (local55 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local29) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg0) {
				local50++;
				if (local50 % 3 == 0) {
					local43.append(local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V")
	public static void method1643() {
		Static86.aClass154_29.method4220(5);
		Static51.aClass154_16.method4220(5);
	}
}
