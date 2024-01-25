import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
	public static int anInt2081;

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1738(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static612.aCharArray13[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(82) int local82 = local54.length() - 1;
					local72 = ' ';
					local54.setCharAt(local82, Character.toUpperCase(local54.charAt(local82)));
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIILclient!iq;)V")
	public static void method1739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20_Sub2_Sub4 arg4) {
		@Pc(4) Class97 local4 = Static635.method8388(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10725 = (arg1 << Static643.anInt10682) + Static557.anInt9470;
		arg4.anInt10724 = arg3;
		arg4.anInt10729 = (arg2 << Static643.anInt10682) + Static557.anInt9470;
		local4.aClass20_Sub2_Sub4_1 = arg4;
		@Pc(33) int local33 = Static195.aClass199Array1 == Static510.aClass199Array3 ? 1 : 0;
		if (arg4.method9021()) {
			if (arg4.method9023()) {
				arg4.aClass20_Sub2_23 = Static311.aClass20_Sub2Array11[local33];
				Static311.aClass20_Sub2Array11[local33] = arg4;
				return;
			}
			arg4.aClass20_Sub2_23 = Static158.aClass20_Sub2Array7[local33];
			Static158.aClass20_Sub2Array7[local33] = arg4;
			Static133.aBoolean183 = true;
			return;
		}
		arg4.aClass20_Sub2_23 = Static411.aClass20_Sub2Array12[local33];
		Static411.aClass20_Sub2Array12[local33] = arg4;
	}
}
