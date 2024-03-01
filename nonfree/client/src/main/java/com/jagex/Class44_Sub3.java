package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aep")
public class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!aep", name = "hg", descriptor = "Lclient!yc;")
	public static Class596 aClass596_1;

	@OriginalMember(owner = "client!aep", name = "b", descriptor = "I")
	public final int anInt1009;

	@OriginalMember(owner = "client!aep", name = "c", descriptor = "I")
	public final int anInt1010;

	@OriginalMember(owner = "client!aep", name = "<init>", descriptor = "(Lclient!kh;Lclient!kg;IIIIIIIII)V", line = 10)
	Class44_Sub3(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1009 = arg9 * 542887579;
		this.anInt1010 = arg10 * -251729305;
	}

	@OriginalMember(owner = "client!aep", name = "s", descriptor = "(Lclient!ahb;)Lclient!kv;", line = 16)
	public static Class44 method9217(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class44 local3 = Class269.method25286(arg0);
		@Pc(7) int local7 = arg0.method20275();
		@Pc(11) int local11 = arg0.method20275();
		return new Class44_Sub3(local3.aClass277_8, local3.aClass276_7, local3.anInt2200 * 55371565, local3.anInt2195 * 2009354057, local3.anInt2198 * 338285097, local3.anInt2199 * -1628722519, local3.anInt2196 * -1540009787, local3.anInt2197 * 1924731995, local3.anInt2201 * 328557495, local7, local11);
	}

	@OriginalMember(owner = "client!aep", name = "u", descriptor = "(Lclient!ahb;)Lclient!kv;", line = 16)
	public static Class44 method9218(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class44 local3 = Class269.method25286(arg0);
		@Pc(7) int local7 = arg0.method20275();
		@Pc(11) int local11 = arg0.method20275();
		return new Class44_Sub3(local3.aClass277_8, local3.aClass276_7, local3.anInt2200 * 55371565, local3.anInt2195 * 2009354057, local3.anInt2198 * 338285097, local3.anInt2199 * -1628722519, local3.anInt2196 * -1540009787, local3.anInt2197 * 1924731995, local3.anInt2201 * 328557495, local7, local11);
	}

	@OriginalMember(owner = "client!aep", name = "x", descriptor = "(Lclient!ahb;)Lclient!kv;", line = 16)
	public static Class44 method9219(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class44 local3 = Class269.method25286(arg0);
		@Pc(7) int local7 = arg0.method20275();
		@Pc(11) int local11 = arg0.method20275();
		return new Class44_Sub3(local3.aClass277_8, local3.aClass276_7, local3.anInt2200 * 55371565, local3.anInt2195 * 2009354057, local3.anInt2198 * 338285097, local3.anInt2199 * -1628722519, local3.anInt2196 * -1540009787, local3.anInt2197 * 1924731995, local3.anInt2201 * 328557495, local7, local11);
	}

	@OriginalMember(owner = "client!aep", name = "a", descriptor = "(I)Lclient!ke;", line = 23)
	@Override
	public Class274 method25540() {
		return Class274.aClass274_1;
	}

	@OriginalMember(owner = "client!aep", name = "g", descriptor = "()Lclient!ke;", line = 23)
	@Override
	public Class274 method25539() {
		return Class274.aClass274_1;
	}

	@OriginalMember(owner = "client!aep", name = "z", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 33)
	static String method9220(@OriginalArg(0) String arg0) {
		if (Class377.aString211.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class377.aString211.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class377.aString211.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
