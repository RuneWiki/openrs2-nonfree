import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
	public static int anInt1949;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "Lclient!ga;")
	public static Class111 aClass111_18;

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "J")
	public static long aLong89;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)I")
	public static int method1715() {
		return Static443.anInt7711;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method1717(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(16) long local16 = 0L;
		for (@Pc(18) int local18 = 0; local18 < local6; local18++) {
			local16 = (long) arg0.charAt(local18) + (local16 << 5) - local16;
		}
		return local16;
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)Lclient!er;")
	public static Class91 method1718() {
		try {
			return (Class91) Class.forName("Class91_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}
