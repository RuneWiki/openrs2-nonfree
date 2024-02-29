package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaf")
public class Class7 {

	@OriginalMember(owner = "client!aaf", name = "ez", descriptor = "Lclient!pa;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!aaf", name = "fn", descriptor = "Lclient!pw;")
	public static Class478 aClass478_2;

	@OriginalMember(owner = "client!aaf", name = "p", descriptor = "I")
	public int anInt24;

	@OriginalMember(owner = "client!aaf", name = "c", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!aaf", name = "v", descriptor = "I")
	public int anInt26;

	@OriginalMember(owner = "client!aaf", name = "l", descriptor = "I")
	int anInt27;

	@OriginalMember(owner = "client!aaf", name = "<init>", descriptor = "()V", line = 10)
	Class7() {
	}

	@OriginalMember(owner = "client!aaf", name = "c", descriptor = "([BB)Z", line = 27)
	public static boolean method66(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		@Pc(8) int local8 = local4.method22478();
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method22478() == 1;
		if (local22) {
			Class683.method36095(local4);
		}
		Class680.method36067(local4);
		return true;
	}

	@OriginalMember(owner = "client!aaf", name = "hb", descriptor = "(Lclient!agh;I)V", line = 3864)
	static final void method67(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0) {
		@Pc(6) int local6 = arg0.anInt2888 * -1626386689 - client.anInt3414;
		@Pc(17) int local17 = arg0.anInt2879 * 1791130112 + arg0.method21095() * 256;
		@Pc(28) int local28 = arg0.anInt2881 * 660825600 + arg0.method21095() * 256;
		@Pc(37) int local37 = Class277.method26658(local17, local28, arg0.anInt2886 * -2033865703);
		@Pc(41) Class447 local41 = arg0.method24085().aClass447_61;
		arg0.method24106((float) ((int) local41.aFloat277 + (local17 - (int) local41.aFloat277) / local6), (float) ((local37 - (int) local41.aFloat276) / local6 + (int) local41.aFloat276), (float) ((local28 - (int) local41.aFloat278) / local6 + (int) local41.aFloat278));
		arg0.anInt2882 = 0;
		arg0.method21069(arg0.anInt2890 * -565919971);
	}

	@OriginalMember(owner = "client!aaf", name = "ko", descriptor = "(II)Ljava/lang/String;", line = 10806)
	static final String method68(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = Integer.toString(arg0);
		for (@Pc(7) int local7 = local2.length() - 3; local7 > 0; local7 -= 3) {
			local2 = local2.substring(0, local7) + Class184.aString133 + local2.substring(local7);
		}
		if (local2.length() > 9) {
			return " " + Class192.method25433(65408) + local2.substring(0, local2.length() - 8) + Class44.aClass44_30.method713(Class128.aClass667_3) + " (" + local2 + ")" + Class184.aString135;
		} else if (local2.length() > 6) {
			return " " + Class192.method25433(16777215) + local2.substring(0, local2.length() - 4) + Class44.aClass44_143.method713(Class128.aClass667_3) + " (" + local2 + ")" + Class184.aString135;
		} else {
			return " " + Class192.method25433(16776960) + local2 + Class184.aString135;
		}
	}
}
