import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	public static int anInt2352;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!sg;")
	private static Class77 aClass77_909 = Static146.method2172("cyan:");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_908 = aClass77_909;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public static int anInt2345 = 0;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_910 = aClass77_909;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
	public static int anInt2357 = 0;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Lclient!sg;")
	public static Class77 aClass77_911 = Static146.method2172("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1662() {
		aClass77_908 = null;
		aClass77_911 = null;
		aClass77_910 = null;
		aClass77_909 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!qd;Lclient!pg;IB)V")
	public static void method1663(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(9) Class10 local9 = Static2.aClass10_4;
		synchronized (Static2.aClass10_4) {
			for (@Pc(24) Class2_Sub6 local24 = (Class2_Sub6) Static2.aClass10_4.method444(); local24 != null; local24 = (Class2_Sub6) Static2.aClass10_4.method451()) {
				if (local24.aLong134 == (long) arg2 && local24.aClass64_1 == arg1 && local24.anInt1169 == 0) {
					local3 = local24.aByteArray11;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(75) byte[] local75 = arg1.method2164(arg2);
			arg0.method2230(arg1, arg2, local75, true);
		} else {
			arg0.method2230(arg1, arg2, local3, true);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lclient!sg;")
	public static Class77 method1664(@OriginalArg(1) int arg0) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aByteArray46 = new byte[arg0];
		local3.anInt3606 = 0;
		return local3;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(IB)Z")
	public static boolean method1668(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
