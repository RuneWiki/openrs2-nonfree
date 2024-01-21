import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!pg;[BI)V")
	public static void method1621(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(3) Class2_Sub6 local3 = new Class2_Sub6();
		local3.aByteArray11 = arg2;
		local3.aLong134 = arg0;
		local3.anInt1169 = 0;
		local3.aClass64_1 = arg1;
		@Pc(22) Class10 local22 = Static2.aClass10_4;
		synchronized (Static2.aClass10_4) {
			Static2.aClass10_4.method448(local3);
		}
		Static8.method129();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lclient!df;")
	public static Class2_Sub2_Sub6 method1622(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub2_Sub6 local14 = (Class2_Sub2_Sub6) Static99.aClass82_40.method2699((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static100.aClass43_9.method2205(arg0, 1);
		local14 = new Class2_Sub2_Sub6();
		if (local28 != null) {
			local14.method672(new Class2_Sub18(local28), arg0);
		}
		local14.method673();
		Static99.aClass82_40.method2701((long) arg0, local14);
		return local14;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lclient!ph;")
	public static Class23 method1623() {
		try {
			return (Class23) Class.forName("Class23_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class23_Sub1();
		}
	}
}
