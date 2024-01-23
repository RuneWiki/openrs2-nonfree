import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "Lclient!nj;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!gg", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString112 = "Connection lost.";

	@OriginalMember(owner = "client!gg", name = "T", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString113 = "purple:";

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
	public static int anInt1946 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean method1513(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(14) int local14 = arg0.length();
		@Pc(17) int local17 = arg1.length();
		if (local17 > local14) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			@Pc(31) char local31 = arg0.charAt(local24);
			@Pc(35) char local35 = arg1.charAt(local24);
			if (local35 != local31 && Character.toLowerCase(local31) != Character.toLowerCase(local35) && Character.toUpperCase(local31) != Character.toUpperCase(local35)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!km;ILclient!km;)V")
	public static void method1514(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		Static123.aClass91_98 = arg1;
		Static282.aClass91_198 = arg0;
		Static63.anInt1345 = Static282.aClass91_198.method2510(3);
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)Z")
	public static boolean method1515() {
		if (Static55.aBoolean85) {
			try {
				return !((Boolean) Static309.method3982(Static253.aClass175_4.anApplet1, "showingVideoAd"));
			} catch (@Pc(30) Throwable local30) {
			}
		}
		return true;
	}
}
