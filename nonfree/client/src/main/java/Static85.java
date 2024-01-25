import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "Lclient!ts;")
	public static Class286 aClass286_1;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_44 = new Class133(111, 0);

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_25 = new Class67("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILclient!qn;)J")
	public static long method1755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface15 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class242 local16 = Static454.aClass298_3.method7185(arg2.method7758());
		@Pc(37) long local37 = (long) (arg0 | arg1 << 7 | arg2.method7761() << 14 | arg2.method7764() << 20 | 0x40000000);
		if (local16.anInt7164 == 0) {
			local37 |= local9;
		}
		if (local16.anInt7161 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean489) {
			local37 |= local7;
		}
		return local37 | (long) arg2.method7758() << 32;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z")
	public static boolean method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
