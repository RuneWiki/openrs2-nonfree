import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public static int anInt101;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public static int anInt110 = 0;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "[Lclient!ija;")
	public static final Class3_Sub6_Sub11[] aClass3_Sub6_Sub11Array1 = new Class3_Sub6_Sub11[14];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(16) String local16 = arg2[arg1];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(36) int local36 = arg0 + arg1;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = arg1; local40 < local36; local40++) {
				@Pc(46) String local46 = arg2[local40];
				if (local46 == null) {
					local38 += 4;
				} else {
					local38 += local46.length();
				}
			}
			@Pc(69) StringBuffer local69 = new StringBuffer(local38);
			for (@Pc(71) int local71 = arg1; local71 < local36; local71++) {
				@Pc(77) String local77 = arg2[local71];
				if (local77 == null) {
					local69.append("null");
				} else {
					local69.append(local77);
				}
			}
			return local69.toString();
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public static void method92() {
		Static250.aClass102Array11 = null;
		Static169.aClass102_11 = null;
		Static640.aClass102_39 = null;
		Static544.aClass102Array21 = null;
		Static583.aClass102Array22 = null;
		Static173.aClass102Array8 = null;
		Static13.aClass102Array1 = null;
		Static111.aClass102Array25 = null;
		Static194.aClass102Array16 = null;
		Static655.aClass102Array24 = null;
		Static491.aClass102Array23 = null;
		Static157.aClass69_2 = null;
		Static280.aClass102Array14 = null;
		Static269.aClass102Array12 = null;
		Static243.aClass69_5 = null;
		Static277.aClass69_9 = null;
		Static373.aClass102Array19 = null;
		Static55.aClass102Array4 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z")
	public static boolean method94(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
