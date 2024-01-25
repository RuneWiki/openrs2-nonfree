import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "Lclient!pb;")
	public static Class275 aClass275_2;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	public static int anInt361 = 104;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IILjava/lang/Object;B)[B")
	public static byte[] method397(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static196.method3027(arg0, local18);
		} else if (arg1 instanceof Class13) {
			@Pc(30) Class13 local30 = (Class13) arg1;
			return local30.method401(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
	public static void method398() {
		Static667.aClass295_72.method6464();
		Static145.aClass295_11.method6464();
		Static427.aClass295_45.method6464();
		Static137.aClass295_10.method6464();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
	public static void method403() {
		@Pc(3) Class317[] local3 = Class3_Sub46.aClass317Array1;
		synchronized (Class3_Sub46.aClass317Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class3_Sub46.aClass317Array1.length; local7++) {
				Class3_Sub46.aClass317Array1[local7] = new Class317();
				Static38.anIntArray31[local7] = 0;
			}
		}
	}
}
