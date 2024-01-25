import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "Lclient!oj;")
	public static Class243 aClass243_3;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
	public static int anInt1840;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_32 = new Class286(18, 7);

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "[I")
	public static final int[] anIntArray97 = new int[1000];

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1359(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local10 + local8);
		for (@Pc(45) int local45 = 0; local45 < local8; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local43.append("<lt>");
			} else if (local51 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local51);
			}
		}
		return local43.toString();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)Z")
	public static boolean method1360(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
