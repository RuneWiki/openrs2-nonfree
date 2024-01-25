import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
	public static int anInt2296;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt2288 = 999999;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[200];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method2093(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static200.method3366(arg1, arg0, -1, -1);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBLclient!rba;I)Lclient!jk;")
	public static Class3_Sub4_Sub14 method2095(@OriginalArg(0) int arg0, @OriginalArg(2) Class278 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 << 10 | arg1.anInt8445;
		@Pc(24) Class3_Sub4_Sub14 local24 = (Class3_Sub4_Sub14) Static459.aClass308_6.method7537((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static96.aClass254_29.method6420(Static96.aClass254_29.method6403(local15));
		if (local36 == null) {
			local15 = arg2 + 65536 << 10 | arg1.anInt8445;
			local24 = (Class3_Sub4_Sub14) Static459.aClass308_6.method7537((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static96.aClass254_29.method6420(Static96.aClass254_29.method6403(local15));
			if (local36 == null) {
				local15 = arg1.anInt8445 | 0x3FFFC00;
				local24 = (Class3_Sub4_Sub14) Static459.aClass308_6.method7537((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static96.aClass254_29.method6420(Static96.aClass254_29.method6403(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static118.method7553(local36);
					local24.aClass278_6 = arg1;
					Static459.aClass308_6.method7538((long) local15 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static118.method7553(local36);
				local24.aClass278_6 = arg1;
				Static459.aClass308_6.method7538((long) local15 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static118.method7553(local36);
			local24.aClass278_6 = arg1;
			Static459.aClass308_6.method7538((long) local15 << 16, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "([SBI)[S")
	public static short[] method2097(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static602.method4668(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
